package generic.application;

import generic.util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {
        String[] name = {"Edho", "Dwi", "Tirwanda"};
        Integer[] numbers = {1, 2, 3, 4, 5};

        System.out.println(
                ArrayHelper.<String>count(name)
        );
        System.out.println(
                ArrayHelper.count(numbers)
        );
    }
}
