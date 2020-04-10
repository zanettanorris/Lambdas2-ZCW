package java;

import main.java.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


import java.time.LocalDate;

public class PersonTest {


    String expectedName;
    Integer expectedAge;
    String expectedGender;
    Person test;
    LocalDate expectedBirthDate;

    @Before
    public void init() {
        expectedName = "Jeff";
        expectedAge = 39;
        expectedGender = "MALE";
        expectedBirthDate = LocalDate.of(1980, 12, 12);

        test = new Person(expectedName, expectedAge, expectedGender);
    }

    @Test
    public void getAgeTest() {
        Integer expectedAge = 39;

        Integer actualAge = test.getAge();

        assertEquals(expectedAge, actualAge);
    }

    @Test
    public void printTest(){
        test.printPerson();
    }

    @Test
    public void testTest(){
        assertFalse(test.test(test));
    }
}
}
