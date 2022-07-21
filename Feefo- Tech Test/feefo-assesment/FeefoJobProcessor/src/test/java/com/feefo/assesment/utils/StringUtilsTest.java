package com.feefo.assesment.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringUtilsTest {

    @Test
    void stringFromCapitalizedSnakeCase() {
        assertEquals("Hello world", StringUtils.stringFromCapitalizedSnakeCase("Hello_world"));
        assertEquals("Hello world", StringUtils.stringFromCapitalizedSnakeCase("HELLO_WORLD"));
        assertEquals("Software engineer", StringUtils.stringFromCapitalizedSnakeCase("SOFTWARE_ENGINEER"));
    }

}