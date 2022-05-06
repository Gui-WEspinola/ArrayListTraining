package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){

        List<Person> people = new ArrayList<>();

        people.add(new Person("Warren Buffet", 120));
        people.add(new Person("Bill Gates", 100));
        people.add(new Person("Elon Musk", 270));
        people.add(new Person("Jeff Bezos", 150));
        people.add(new Person("Mark Zuckerberg", 50));



        List<Person> hundredBillionClub = people.stream()
                .filter(person -> person.billions >= 100)
                .toList();

        for (Person p : people){
            if (p.billions > 100){
                hundredBillionClub.add(p);
           }
       }

        hundredBillionClub.forEach(person -> System.out.println(person.name));
    }

    static class Person {
        String name;
        int billions;

        public Person (String name, int billions){
            this.name = name;
            this.billions = billions;
        }
    }
}
