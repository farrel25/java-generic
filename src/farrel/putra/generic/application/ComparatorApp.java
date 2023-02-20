package farrel.putra.generic.application;

import farrel.putra.generic.Person;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Farrel", "Indonesia"),
                new Person("Athaillah", "Indonesia"),
                new Person("Putra", "Indonesia")
        };

        // V1
        Comparator<Person> personComparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        // V2 - lambda
        Comparator<Person> personComparator2 = (o1, o2) -> o1.getName().compareTo(o2.getName());

        // V3
        Comparator<Person> personComparator3 = Comparator.comparing(Person::getName);

        Arrays.sort(people, personComparator);
        System.out.println(Arrays.toString(people));

        Arrays.sort(people, personComparator2);
        System.out.println(Arrays.toString(people));

        Arrays.sort(people, personComparator3);
        System.out.println(Arrays.toString(people));
    }
}
