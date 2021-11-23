package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {
    private static Logger logger;

    @Test
    void getLastLog() {
        //Give
        logger = new Logger();
        logger.log("testowy log");
        //When
        String log = logger.getLastLog();
        //Then
        Assertions.assertEquals("testowy log", log);

    }
}
