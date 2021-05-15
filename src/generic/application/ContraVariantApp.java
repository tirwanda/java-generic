package generic.application;

import generic.MyData;

public class ContraVariantApp {
    public static void main(String[] args) {
        MyData<Object> myData = new MyData<>("Edho");
        myData.setData(1000);
        MyData<? super String> stringMydata = myData;

        process(myData);
    }

    public static void process(MyData<? super String > myData) {
//        myData.setData("Dwi");
        Object value = myData.getData();
        System.out.println(value);
    }
}
