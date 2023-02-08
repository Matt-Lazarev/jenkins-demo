package com.example.jenkinsdemo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class JenkinsDemoApplicationTests {

    @Test
    void contextLoads() {
        log.info("Tests are running...");
        Assertions.assertTrue(true);
    }

    @Test
    void secondTest() {
        log.info("Tests are running...");
        Assertions.assertTrue(true);
    }
}
