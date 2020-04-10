package java;

import main.java.CheckPerson;
import main.java.Person;
import main.java.SearchCriteria;
import main.java.SocialNetwork;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class SocialNetworkTest {
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

    public class SearchCriteriaTest {
        SocialNetwork<Person> network;
        Person Jeff;
        Person Sundar;
        Person Satya;
        Person Virginia;

        @Before
        public void init(){
            Jeff = new Person("Jeff",
                    Person.Gender.MALE,
                    LocalDate.of(1980, 12, 12);
            Satya = new Person("Satya",
                    Person.Gender.MALE,
                    LocalDate.of(1967, 8, 19);
            Sundar = new Person("Sundar",
                    Person.Gender.MALE,
                    LocalDate.of(1972, 6, 10);
            Virginia = new Person("Virginia",
                    Person.Gender.FEMALE,
                    LocalDate.of(1957, 7, 29);
            network = new SocialNetwork<>(new Person[]{Jeff, Satya, Sundar, Virginia});
        }

        @Test
        public void olderThanTest(){
            SearchCriteria.printPersonsYoungerThan(network, 50);
        }

        @Test
        public void withAgeRange(){
            SearchCriteria.printPersonsWithinAgeRange(network, 35, 50);
        }

        @Test
        public void printPerson(){
            Person test = new Person();
            SearchCriteria.printPersons(network, test);
        }

        @Test
        public void anonymousTest(){
            SearchCriteria.printPersons(network, new Person(){
                @Override
                public boolean test(Person p) {
                    if(p.getAge() > 40 && p.getGender().equals(Gender.FEMALE))
                        return true;
                    else
                        return false;
                }
            });
        }

        @Test
        public void lambdaTest(){
            CheckPerson test = p -> p.getAge() > 25;
            SearchCriteria.printPersons(network, test);
        }
    }
