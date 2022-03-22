public class FindMaxValue {
    //main method
    public static void main(String args[]) {
        Integer[] intVal = {12, 13, 9, 5};
        Float[] floatVal = {12.55f, 13.65f, 19.22f};
        String[] strVal = {"Orange", "Mango", "Gauva"};

        //call generic method
        toprint(intVal);
        toprint(floatVal);
        toprint(strVal);
    }

    //generic method
    private static <E extends Comparable<E>> void toprint(E[] arrValue) {

        //assign value to max
        E max = arrValue[0];

        //check value is greater of not
        for (int i = 1; i < arrValue.length; i++) {

            int result = max.compareTo(arrValue[i]);

            if(result < 0) {
                max = arrValue[i];
            }
        }
        printMax(max);
    }

    public static <E> void printMax(E max) {
        System.out.println("Amongst the three the maximum is " + max);
    }


}
