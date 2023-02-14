package farrel.putra.generic.application;

import farrel.putra.generic.MyData;

public class ContravariantApp {

    public static void main(String[] args) {

        MyData<Object> objectMyData = new MyData<>("Farrel");
        //objectMyData.setData(1000); //bakal memunculkan error saat runtime

        MyData<? super String> myData = objectMyData; // contravariant

        process(objectMyData); // contravariant

        System.out.println(objectMyData.getData());
    }

    public static void process(MyData<? super String> myData) {
        Object objectValue = myData.getData();
        String stringValue = (String) myData.getData();
        System.out.println("Process parameter " + stringValue);
        myData.setData("Putra");
    }
}
