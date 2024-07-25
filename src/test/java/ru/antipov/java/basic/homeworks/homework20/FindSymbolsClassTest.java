package ru.antipov.java.basic.homeworks.homework20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class FindSymbolsClassTest {
    private FindSymbolsClass findSymbolsClass;

    @BeforeEach
    public void setUp() {
        findSymbolsClass = new FindSymbolsClass();
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Должен найти символы в строке - позитивный")
    public void shouldFindSymbolsInStringPositive() throws IOException {
        int expectedResult = 7;
        int actualResult = findSymbolsClass.countingByCharactersOfASequence("AA", new File("Text.txt"));
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Должен найти символы в строке - негативный")
    public void shouldFindSymbolsInStringNegative() {
        int expectedResult = 5;
        int actualResult = findSymbolsClass.countingByCharactersOfASequence("AA", new File("Text.txt"));
        Assertions.assertNotEquals(expectedResult, actualResult);
    }
}
