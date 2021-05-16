package generic.application;

import generic.Person;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Edho", "Bekasi"),
                new Person("Dwi", "Bekasi"),
                new Person("Tirwanda", "Bekasi")
        };
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
    }
}
