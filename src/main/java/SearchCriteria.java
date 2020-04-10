package main.java;

public class SearchCriteria {
    public static void printPersonsYoungerThan(SocialNetwork<Person> roster, Integer age){
        for (Person p: roster){
        if (p.getAge()<=age){
        p.printPerson();}
    }
}
public static void printPersonsWithinAgeRange(
        SocialNetwork<Person> roster, Integer low, Integer high){
for (Person p: roster){
if (low<=p.getAge() && p.getAge() <high)
p.printPerson();}
}




    public static void printPersons(
            SocialNetwork<Person> roster, CheckPerson tester){
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();

            }

        }}}