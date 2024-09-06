package test;

import test.dto.Marin;
import test.dto.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[10];
        for (int i = 0; i < people.length; i++) {
            people[i] = new Person("김" + i, 3 + i);
        }
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
        String string = Arrays.toString(people);
        System.out.println(string);
        Marin marin = new Marin();
//         only setDefense
        marin.setDefense(2);

        List<Person> list = new ArrayList<>();
        for (int i = 0; i < people.length; i++) {
            list.add(new Person("김" + i, 3 + i));
        }
        System.out.println(list);
        list.sort(Comparator.comparing(Person::getAge).reversed());
        System.out.println(list);
    }
}
