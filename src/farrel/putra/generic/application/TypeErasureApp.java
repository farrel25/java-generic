package farrel.putra.generic.application;

import farrel.putra.generic.MyData;

public class TypeErasureApp {
    public static void main(String[] args) {

        MyData myData = new MyData<>("Farrel");

        MyData<Integer> integerMyData = (MyData<Integer>) myData; // ERROR
        //integerMyData.setData(1000);
        Integer integer = integerMyData.getData();
    }
}
