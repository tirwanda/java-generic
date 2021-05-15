package generic.application;

import generic.MyData;

public class CovariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Edho");
        proccess(stringMyData);

        MyData<? extends Object> data = stringMyData;
        System.out.println(data.getData());
    }

    public static void proccess(MyData<? extends Object> myData) {
        System.out.println(myData.getData());
//        myData.setData(2); Error karena berbahaya
    }
}
