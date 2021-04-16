package ru.geekbrains;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ProgramTest {
    private Program program;

    @BeforeAll
    public void init() {
        program = new Program();
    }


    @Test()
    void testArrayNoFourException() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            program.subArray(new ArrayList<Integer>(Arrays.asList(1,2)));
        });
    }


    @Test()
    void testFourInMiddle() {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,4,5,6));
        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(4,5,6));
        Assertions.assertArrayEquals(list2, program.subArray(list));
    }

    @Test()
    void testFourInEnd() {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,1,5,4));
        List<Integer> list2 = new ArrayList<>();
        Assertions.assertArrayEquals(list2, program.subArray(list));
    }


    @Test()
    void testNoFour() {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,1,1,1,1));
        Assertions.assertFalse(program.checkArray(list));
    }

    @Test()
    void testExcessNumber() {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,4,1,3,4));
        Assertions.assertFalse(program.checkArray(list));
    }

    @Test()
    void testAllGood() {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,1,1,4,4));
        Assertions.assertTrue(program.checkArray(list));
    }
}