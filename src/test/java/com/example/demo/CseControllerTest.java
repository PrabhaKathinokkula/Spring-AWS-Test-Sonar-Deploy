package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CseControllerTest {

    @Autowired
    CseController c;

    @Test
    void testAddCSE() {

        String result = c.addCSE(2, 3);

        assertEquals(
            "After performing addition, the output is 5. My roll number is 23MH1A0524.",
            result
        );
    }
}