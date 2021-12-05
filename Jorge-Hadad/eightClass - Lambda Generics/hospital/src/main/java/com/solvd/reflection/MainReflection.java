package com.solvd.reflection;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import java.lang.reflect.InvocationTargetException;

import java.util.Arrays;

import java.lang.reflect.Constructor;


public class MainReflection {

    private static final Logger logger = Logger.getLogger(MainReflection.class);

    public static void main(String[] args) throws ClassNotFoundException {
        PropertyConfigurator.configure("hospital/src/main/java/resources/log4j.properties");

        Class<?> example = Class.forName("java.util.ArrayList");

        logger.info("### Get implemented Interfaces ###");
        Arrays.stream(example.getInterfaces()).forEach(logger::info);

        logger.info("### Get Methods ###");
        Arrays.stream(example.getMethods()).forEach(logger::info);

        logger.info("### Get Constructors ###");
        Arrays.stream(example.getConstructors()).forEach(logger::info);

        Constructor<?> constructor = null;
        try {
            constructor = example.getConstructor();
        } catch (NoSuchMethodException exception) {
            logger.error(exception.getMessage());
        }
        Object stack = null;
        try {
            stack = constructor != null ? constructor.newInstance() : null;
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException exception) {
            logger.error(exception);
        }
        logger.info("ArrayList class: " + stack.getClass());
    }

}
