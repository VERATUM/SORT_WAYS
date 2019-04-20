package com.git.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(LogTest.class);
        logger.info("info");
        logger.error("error1232");
        logger.info("********************** LogTest start ****************************\n");
    }
}
