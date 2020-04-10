package main.java;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Person implements CheckPerson{

public enum Gender { FEMALE, MALE}

private String name;
private Integer age;
private String gender;
private LocalDate birthDate;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setBirthDate() {
        this.birthDate = birthDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

//        public Person(String name, Integer age, String gender, LocalDate birthday){
//    this.name = name;
//    this.age = age;
//    this.gender = gender;
//    this.birthDate = birthDate;
//}

    public void setGender() {
        this.gender = gender;
    }

    public String getGender() {
        return this.gender;
    }


public Integer getAge(){
    return Period.between(birthDate, LocalDate.now()).getYears();
}
public static void printRoster(List<Person> roster, String gender) {
    for (Person p : roster) {

        System.out.printf("Name:" + p.getName() + " " + p.getGender());
    }
}
public void printPerson(){
        System.out.printf("Name: %1s\n Gender:%2s\nBirthday: %3s\n", name, gender.toString(),
                birthDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
}
    @Override
    public boolean test(Person p) {
       if (p.getAge() > 25 && p.gender.equals(Gender.MALE))
           return true;
    else return false;
    }}
