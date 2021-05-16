package generic.application;

import generic.MyData;

public class WildCardApp {
    public static void main(String[] args) {
        print(new MyData<Integer>(1));
        print(new MyData<String>("Edho"));
        print(new MyData<MultipleConstraintApp.Manager>(new MultipleConstraintApp.Manager()));
    }

    public static void print(MyData<?> data) {
        Object o = data.getData();
        System.out.println(o);
    }
}
