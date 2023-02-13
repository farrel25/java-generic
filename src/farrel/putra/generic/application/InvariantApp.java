package farrel.putra.generic.application;

import farrel.putra.generic.MyData;

public class InvariantApp {

    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Farrel");
//        doIt(stringMyData); // ERROR
//        MyData<Object> objectMyData = stringMyData; // ERROR

        MyData<Object> objectMyData = new MyData<>(1000);
//        MyData<Integer> integerMyData = objectMyData; // ERROR
//        doItInteger(objectMyData); // ERROR

    }

    public static void doIt(MyData<Object> objectMyData) {
        // do something
    }

    public static void doItInteger(MyData<Integer> objectMyData) {
        // do something
    }
}
