package barracksWars.core.factories;

import barracksWars.interfaces.Unit;
import barracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class UnitFactoryImpl implements UnitFactory {

    private static final String UNITS_PACKAGE_NAME =
            "barracksWars.models.units.";

    @Override
    public Unit createUnit(String unitType) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        String path = UNITS_PACKAGE_NAME + unitType;

        Class<?> unitClass = Class.forName(path);

        Constructor<?> unitConstructor = unitClass.getDeclaredConstructor();
        unitConstructor.setAccessible(true);

        return (Unit) unitConstructor.newInstance();
    }
}
