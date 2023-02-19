package farrel.putra.generic.application;

import farrel.putra.generic.MyData;

public class WildcardApp {
    public static void main(String[] args) {

        /*
        * Wildcard concept actually following the covariant concept. It's the same
         */

        print(new MyData<Integer>(200));
        print(new MyData<>(200));

        print(new MyData<String>("Farrel"));
        print(new MyData<>("Farrel"));

        print(new MyData<MultipleConstraintApp.Manager>(new MultipleConstraintApp.Manager()));
        print(new MyData<>(new MultipleConstraintApp.Manager()));

    }

    public static void print(MyData<?> myData) {
        Object data = myData.getData();
        System.out.println(data);
    }
}
