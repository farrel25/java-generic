package farrel.putra.generic.application;

import farrel.putra.generic.util.ArrayHelper;

public class ArrayHelperApp {

    public static void main(String[] args) {

        String[] names = {"Farrel", "Athaillah", "Putra"};
        Integer[] numbers = {1,2,3,4,5};

        System.out.println(ArrayHelper.<String>count(names));
        System.out.println(ArrayHelper.count(names));

        System.out.println(ArrayHelper.<Integer>count(numbers));
        System.out.println(ArrayHelper.count(numbers));
    }
}
