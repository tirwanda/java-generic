package generic.application;

import generic.MyData;

public class GenericClassApp {
    public static void main(String[] args) {
        MyData<String> myDataString = new MyData<String>("Edho");
        MyData<Integer> myDataInteger = new MyData<Integer>(23);

        String stringValue = myDataString.getData();
        Integer integerValue = myDataInteger.getData();

        System.out.println(stringValue);
        System.out.println(integerValue);
    }
}
