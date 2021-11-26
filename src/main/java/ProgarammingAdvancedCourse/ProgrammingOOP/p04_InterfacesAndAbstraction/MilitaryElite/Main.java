package p04_InterfacesAndAbstraction.MilitaryElite;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, Private> privates = new LinkedHashMap<>();

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] commandArray = command.split("\\s+");
            String soldierType = commandArray[0];
            int id = Integer.parseInt(commandArray[1]);
            String firstName = commandArray[2];
            String lastName = commandArray[3];
            double salary = Double.parseDouble(commandArray[4]);
            switch (soldierType) {
                case "Private":
                    PrivateImpl privateImpl = new PrivateImpl(id, firstName, lastName, salary);
                    privates.put(id, privateImpl);

                    System.out.println(privateImpl);
                    break;
                case "LieutenantGeneral":
                    LieutenantGeneralImpl lieutenantGeneral = new LieutenantGeneralImpl(id, firstName, lastName, salary);
                    privates.put(id, lieutenantGeneral);

                    for (int i = 5; i < commandArray.length; i++) {
                        lieutenantGeneral.addPrivate(privates.get(Integer.parseInt(commandArray[i])));
                    }

                    System.out.println(lieutenantGeneral);
                    break;
                case "Engineer":
                    String engineerCorpsString = commandArray[5];
                    Corps engineerCorps = null;
                    if (engineerCorpsString.equals("Airforces")) {
                        engineerCorps = Corps.AIRFORCES;
                    } else if (engineerCorpsString.equals("Marines")) {
                        engineerCorps = Corps.MARINES;
                    }

                    EngineerImpl engineer = new EngineerImpl(id, firstName, lastName, salary, engineerCorps);
                    privates.put(id, engineer);

                    for (int i = 6; i < commandArray.length; i += 2) {
                        String partName = commandArray[i];
                        int hoursWorked = Integer.parseInt(commandArray[i + 1]);
                        Repair repair = new Repair(partName, hoursWorked);
                        engineer.addRepair(repair);
                    }

                    System.out.println(engineer);
                    break;
                case "Commando":
                    String commandoCorpsString = commandArray[5];
                    Corps commandoCorps = null;
                    if (commandoCorpsString.equals("Airforces")) {
                        commandoCorps = Corps.AIRFORCES;
                    } else if (commandoCorpsString.equals("Marines")) {
                        commandoCorps = Corps.MARINES;
                    }

                    CommandoImpl commando = new CommandoImpl(id, firstName, lastName, salary, commandoCorps);
                    privates.put(id, commando);

                    for (int i = 6; i < commandArray.length; i += 2) {
                        String codeName = commandArray[i];
                        State state = null;
                        if (commandArray[i+1].equals("inProgress")) {
                            state = State.IN_PROGRESS;
                        } else if (commandArray[i+1].equals("finished")) {
                            state = State.FINISHED;
                        }
                        Mission mission = new Mission(codeName, state);
                        commando.addMission(mission);
                    }
                    System.out.println(commando);
                    break;
                case "Spy":
                    String codeNumber = commandArray[4];
                    SpyImpl spy = new SpyImpl(id, firstName, lastName, codeNumber);
                    System.out.println(spy);
                    break;
            }
            command = scanner.nextLine();
        }
    }
}

