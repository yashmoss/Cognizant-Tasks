package org.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LoggingExample {
    public static final Logger logger=LoggerFactory.getLogger(LoggingExample.class);
    public static void main(String[] args) {
        logger.warn("This is a warning message");
        logger.error("This is an error message");
    }
}