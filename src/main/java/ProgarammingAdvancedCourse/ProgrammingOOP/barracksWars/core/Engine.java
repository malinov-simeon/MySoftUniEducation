package ProgarammingAdvancedCourse.ProgrammingOOP.barracksWars.core;

import barracksWars.models.commands.Command;
import jdk.jshell.spi.ExecutionControl;
import barracksWars.interfaces.Repository;
import barracksWars.interfaces.Runnable;
import barracksWars.interfaces.Unit;
import barracksWars.interfaces.UnitFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Engine implements Runnable {

    private Repository repository;
    private UnitFactory unitFactory;

    public Engine(Repository repository, UnitFactory unitFactory) {
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    @Override
    public void run() {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        while (true) {
            try {
                String input = reader.readLine();
                String[] data = input.split("\\s+");
                String commandName = data[0];
                String result = interpretCommand(data, commandName);
                if (result.equals("fight")) {
                    break;
                }
                System.out.println(result);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            } catch (IOException | ExecutionControl.NotImplementedException | ClassNotFoundException | InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    private String interpretCommand(String[] data, String commandName) throws ExecutionControl.NotImplementedException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        commandName = Character.toUpperCase(commandName.charAt(0)) + commandName.substring(1);
        String className = "barracksWars.models.commands." + commandName;

        Class<?> commandClass = Class.forName(className);

        Constructor<?> classConstructor = commandClass.getDeclaredConstructor(String[].class, Repository.class, UnitFactory.class);
        classConstructor.setAccessible(true);

        Command command = (Command) classConstructor.newInstance(data, this.repository, this.unitFactory);

        return command.execute();
    }
}
