package com.example.jenkins_test;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinsTestApplicationTests {
    public static Logger logger = LoggerFactory.getLogger(JenkinsTestApplicationTests.class);

    @Test
     contextLoads() {
        logger.info("Test case executing ...");
        logger.info("Test case executing second log statement ...");
        assertEquals(true,true);
    }

}
