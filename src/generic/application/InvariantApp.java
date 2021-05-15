package generic.application;

import generic.MyData;

public class InvariantApp {
    public static void main(String[] args) {
        MyData<String> myData = new MyData<>("Edho");
//        doIt(myData); // ERROR
//        MyData<Object> stringMyData = myData; // ERROR

        MyData<Object> objectMyData = new MyData<>("Dwi");
//        MyData<String> stringMyData = objectMyData; // ERROR
//        doItObject(objectMyData);
    }

    public static void doIt(MyData<Object> objectMyData) {

    }

    public static void doItObject(MyData<String> stringMyData) {

    }
}
