package lab04;

import java.util.Arrays;
import static lab04.ArrayPractice.*;

public class ArrayTester{
  public static void main(String[] args){
    int[] test1 = null;
    int[] test2 = {};
    int[] test3 = {7};
    int[] test4 = {1,2,3,4,5,6,7,8};
    int[] test5 = {1,2,3,3,4,5,6,7,8};
    int[] test6 = {1,2,3,4,6,5,7,8};
    int[] test7 = {8,6,3,2,6,8,9};
    int[] test8 = {9,8,6,2,3,6,8};

    System.out.println("Testing isNonDecreasing");
    System.out.println("");
    test(true, isNonDecreasing(test1));
    test(true, isNonDecreasing(test2));
    test(true, isNonDecreasing(test3));
    test(true, isNonDecreasing(test4));
    test(true, isNonDecreasing(test5));
    test(false, isNonDecreasing(test6));
    test(false, isNonDecreasing(test7));
    test(false, isNonDecreasing(test8));

    System.out.println("");
    System.out.println("Testing isIncreasing");
    System.out.println("");
    test(true, isIncreasing(test1));
    test(true, isIncreasing(test2));
    test(true, isIncreasing(test3));
    test(true, isIncreasing(test4));
    test(false, isIncreasing(test5));
    test(false, isIncreasing(test6));
    test(false, isIncreasing(test7));
    test(false, isIncreasing(test8));

    System.out.println("");
    System.out.println("Testing reverse");
    System.out.println("");
    test("null", reverse(test1));
    test("[]", reverse(test2));
    test("7", reverse(test3));
    test("8,7,6,5,4,3,2,1", reverse(test4));
    test("8,7,6,5,4,3,3,2,1", reverse(test5));

    System.out.println("");
    System.out.println("concatenate");
    try {
        concatenate(test1, test1);
        System.out.println("test failed - exception not thrown");
    } catch(IllegalArgumentException e) {
        System.out.println("caught the expected illegal argument exception");
    }
    try {
        concatenate(test1, test5);
        System.out.println("test failed - exception not thrown");
    } catch(IllegalArgumentException e) {
        System.out.println("caught the expected illegal argument exception");
    }
    try {
        concatenate(test5, test1);
        System.out.println("test failed - exception not thrown");
    } catch(IllegalArgumentException e) {
        System.out.println("caught the expected illegal argument exception");
    }

        test("1,2,3,4,5,6,7,8,1,2,3,3,4,5,6,7,8", concatenate(test4, test5));
        test("1,2,3,3,4,5,6,7,8,1,2,3,4,5,6,7,8",concatenate(test5, test4));

    System.out.println("");
    System.out.println("testing end to end");
    try {
        endToEnd(test1, test1);
        System.out.println("test failed - exception not thrown");
    } catch(IllegalArgumentException e) {
        System.out.println("caught the expected illegal argument exception");
    }
    try {
        endToEnd(test1, test5);
        System.out.println("test failed - exception not thrown");
    } catch(IllegalArgumentException e) {
        System.out.println("caught the expected illegal argument exception");
    }
    try {
        endToEnd(test5, test1);
        System.out.println("test failed - exception not thrown");
    } catch(IllegalArgumentException e) {
        System.out.println("caught the expected illegal argument exception");
    }
    test("1,2,3,4,5,6,7,8,8,7,6,5,4,3,3,2,1", endToEnd(test4, test5));
    test("1,2,3,3,4,5,6,7,8,8,7,6,5,4,3,2,1",endToEnd(test5, test4));

    System.out.println("");
    System.out.println("Testing reverseInPlace");
    System.out.println("");
    reverseInPlace(test1);
    test("null", test1);
    reverseInPlace(test2);
    test("[]", test2);
    reverseInPlace(test3);
    test("7", test3);
    reverseInPlace(test4);
    test("8,7,6,5,4,3,2,1", test4);
    reverseInPlace(test5);
    test("8,7,6,5,4,3,3,2,1", test5);
  }

    public static void test(String expected, int[] actual) {
    System.out.println("Expected: " + expected +
                       ", received: " + Arrays.toString(actual));
    }

    public static void test(int[] expected, int[] actual) {
        System.out.println("Expected: " + Arrays.toString(expected) +
                           ", received: " + Arrays.toString(actual));
    }

    public static void test(boolean expected, boolean actual) {
        System.out.println("Expected: " + expected + ", received: " + actual);
    }



}
