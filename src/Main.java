
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println('a' + 'b');



    }

    public static int countVowels(String str) {
        String vowels = "aeiou";
        int count = 0;
        for (char letter : str.toCharArray()) {
            if (vowels.contains(String.valueOf(letter))) {
                count++;
            }
        }
        return count;
    }

    public static void redouble(String str) {
        for(char letter : str.toCharArray()) {
            System.out.print("" + letter + letter);
        }
    }

    public static int count(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num !=0) {
                count++;
            }
        }
        return count;
    }

    public static void printUniqueElements(int[] array) {
        //1.
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            //2.
            int countOfNInArray = 0;
            for (int j = 0; j < array.length; j++) {
                int m = array[j];
                if (n == m) {
                    countOfNInArray++;
                }
            }
            if (countOfNInArray == 1) {
                System.out.print(n + " ");
            }
            //2
        }
        //1
    }

    public static void printMinAndMax(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }

        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println(min);
        System.out.println(max);
    }

    public static double operate(int a, int b, char c) {
        double result = 0;

        if (c == '+') {
            result = a + b;
        }

        if (c == '-') {
            result = a - b;
        }
        if (c == '*') {
            result = a * b;
        }
        if (c == '/') {
            result = (double) a / b;
        }
        return result;
    }

    public static void printMax(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            int[] ar = array[i];
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < ar.length; j++) {
                if (ar[j] > max) {
                    max = ar[j];
                }
            }
            System.out.println(max);
        }
    }

    public static void check(int[] array){
        for (int num : array) {
            if(num < 50 && num % 5 == 0) {
                System.out.println(num);
            }
        }
    }

    public static String getSeason(int m){
        //Winter, Spring, Summer, Autumn
        if (m == 1 || m == 2 || m == 12) {
            return "Winter";
        } else if (m == 3 || m == 4 || m == 5) {
            return "Spring";
        } else if (m == 6 || m == 7 || m == 8) {
            return "Summer";
        } else if (m == 9 || m == 10 || m == 11) {
            return "Summer";
        } else return null;
    }
}
