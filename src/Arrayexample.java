//public class Arrayexample {
//    public static void main(String[] args) {
//
//
//        int[] numbers = {10, 20, 30, 40};
//
//        for (int i = 0; i < numbers.length; i++) {
//           System.out.println("Element: " + numbers[i]);
//        }

//  //      for each loop
//        for(int num :numbers ){
//            System.out.println("Elements : " + num);
//        }

//    }
//}

//
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class Arrayexample {
//    public static void main(String[] args) {
//        Integer[] arr = {1, 2, 3, 4, 5};
//
//        List<Integer> list = Arrays.asList(arr);
//        Collections.reverse(list);
//
//        System.out.println("Reversed Array: " + list);
//    }
//}

public class Arrayexample {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {10, 20, 5, 40, 50, 2};

        // Calculate the sum of all elements
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        // Print the results
//        System.out.println("Array elements:");
//        for (int number : numbers) {
//            System.out.println(number);
//        }
        System.out.println("Sum of all elements: " + sum);
    }
}


