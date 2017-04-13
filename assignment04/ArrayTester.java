package assignment04;

import java.lang.*;
import java.util.*;
import static assignment04.ArrayPractice.*;

public class ArrayTester{
 public static void main(String[] args){
   //int[] test1 = null;
   //int[] test2 = {};
   Integer[] test3 = {7};
   Integer[] test4 = {1,2,3,4,5,6,7,8};
   Integer[] test5 = {1,2,3,3,4,5,6,7,8};
   Integer[] test6 = {1,2,3,4,6,5,7,8};
   Integer[] test7 = {8,6,3,2,6,8,9};
   Integer[] test8 = {9,8,6,2,3,6,8};


   ArrayList<Integer> list1 = null;
   ArrayList<Integer> list2 = new ArrayList<>();
   ArrayList<Integer> list3 = new ArrayList<Integer>(Arrays.asList(test3));
   ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList(test4));
   ArrayList<Integer> list5 = new ArrayList<Integer>(Arrays.asList(test5));
   ArrayList<Integer> list6 = new ArrayList<Integer>(Arrays.asList(test6));
   ArrayList<Integer> list7 = new ArrayList<Integer>(Arrays.asList(test7));
   ArrayList<Integer> list8 = new ArrayList<Integer>(Arrays.asList(test8));


   System.out.println("Testing isNonDecreasing");
   System.out.println("");
   test(true, isNonDecreasing(list1));
   test(true, isNonDecreasing(list2));
   test(true, isNonDecreasing(list3));
   test(true, isNonDecreasing(list4));
   test(true, isNonDecreasing(list5));
   test(false, isNonDecreasing(list6));
   test(false, isNonDecreasing(list7));
   test(false, isNonDecreasing(list8));

   System.out.println("");
   System.out.println("Testing isIncreasing");
   System.out.println("");
   test(true, isIncreasing(list1));
   test(true, isIncreasing(list2));
   test(true, isIncreasing(list3));
   test(true, isIncreasing(list4));
   test(false, isIncreasing(list5));
   test(false, isIncreasing(list6));
   test(false, isIncreasing(list7));
   test(false, isIncreasing(list8));

   System.out.println("");
   System.out.println("Testing reverse");
   System.out.println("");
   test("null", reverse(list1));
   test("[]", reverse(list2));
   test("7", reverse(list3));
   test("8,7,6,5,4,3,2,1", reverse(list4));
   test("8,7,6,5,4,3,3,2,1", reverse(list5));

   System.out.println("");
   System.out.println("concatenate");
   try {
       concatenate(list1, list1);
       System.out.println("test failed - exception not thrown");
   } catch(IllegalArgumentException e) {
       System.out.println("caught the expected illegal argument exception");
   }
   try {
       concatenate(list1, list5);
       System.out.println("test failed - exception not thrown");
   } catch(IllegalArgumentException e) {
       System.out.println("caught the expected illegal argument exception");
   }
   try {
       concatenate(list5, list1);
       System.out.println("test failed - exception not thrown");
   } catch(IllegalArgumentException e) {
       System.out.println("caught the expected illegal argument exception");
   }

       test("1,2,3,4,5,6,7,8,1,2,3,3,4,5,6,7,8", concatenate(list4, list5));
       test("1,2,3,3,4,5,6,7,8,1,2,3,4,5,6,7,8",concatenate(list5, list4));

   System.out.println("");
   System.out.println("testing end to end");
   try {
       endToEnd(list1, list1);
       System.out.println("test failed - exception not thrown");
   } catch(IllegalArgumentException e) {
       System.out.println("caught the expected illegal argument exception");
   }
   try {
       endToEnd(list1, list5);
       System.out.println("test failed - exception not thrown");
   } catch(IllegalArgumentException e) {
       System.out.println("caught the expected illegal argument exception");
   }
   try {
       endToEnd(list5, list1);
       System.out.println("test failed - exception not thrown");
   } catch(IllegalArgumentException e) {
       System.out.println("caught the expected illegal argument exception");
   }
   test("1,2,3,4,5,6,7,8,8,7,6,5,4,3,3,2,1", endToEnd(list4, list5));
   test("1,2,3,3,4,5,6,7,8,8,7,6,5,4,3,2,1",endToEnd(list5, list4));

   System.out.println("");
   System.out.println("Testing reverseInPlace");
   System.out.println("");
   reverseInPlace(list1);
   test("null", list1);
   reverseInPlace(list2);
   test("[]", list2);
   reverseInPlace(list3);
   test("7", list3);
   reverseInPlace(list4);
   test("8,7,6,5,4,3,2,1", list4);
   reverseInPlace(list5);
   test("8,7,6,5,4,3,3,2,1", list5);












 }

   public static void test(String expected, ArrayList<Integer> actual) {
   System.out.println("Expected: " + expected +
                      ", received: " + actual);
   }

   public static void test(ArrayList<Integer>  expected,ArrayList<Integer> actual) {
       System.out.println("Expected: " + expected +
                          ", received: " + actual);
   }

   public static void test(boolean expected, boolean actual) {
       System.out.println("Expected: " + expected + ", received: " + actual);
   }



}
