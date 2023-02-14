package farrel.putra.generic.application;

import farrel.putra.generic.MyData;

public class CovariantApp {

    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Farrel");
        process(stringMyData);

        //MyData<? extends Object> myData = stringMyData;
        MyData<?> myData = stringMyData;

    }

    //public static void process(MyData<? extends Object> myData) {
    public static void process(MyData<?> myData) {
        System.out.println(myData.getData());
        //myData.setData("Putra"); // NOT ALLOWED
    }
}
