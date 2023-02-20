package farrel.putra.generic.application;

import farrel.putra.generic.Person;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Farrel", "Indonesia"),
                new Person("Athaillah", "Indonesia"),
                new Person("Putra", "Indonesia")
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));
    }
}
