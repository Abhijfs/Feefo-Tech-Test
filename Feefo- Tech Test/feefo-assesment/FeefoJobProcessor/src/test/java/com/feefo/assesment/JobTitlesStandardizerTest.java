package com.feefo.assesment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JobTitlesStandardizerTest {

    @Test
    void standardize() {
        JobTitlesStandardizer js = new JobTitlesStandardizer();
        assertEquals("Software engineer", js.standardize("Java engineer"));
        assertEquals("Software engineer", js.standardize("C# engineer"));
        assertEquals("Accountant", js.standardize("Accountant"));
        assertEquals("Accountant", js.standardize("Chief Accountant"));
    }
}