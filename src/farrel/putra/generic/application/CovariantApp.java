package farrel.putra.generic.application;

import farrel.putra.generic.MyData;

public class CovariantApp {

    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Farrel");
        process(stringMyData); //covariant

        //MyData<? extends Object> myData = stringMyData; //covariant
        MyData<?> myData = stringMyData; //covariant

    }

    //public static void process(MyData<? extends Object> myData) { //covariant
    public static void process(MyData<?> myData) { //covariant
        System.out.println(myData.getData());
        //myData.setData("Putra"); // NOT ALLOWED
    }
}
