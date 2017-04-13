package assignment04;

import java.util.*;

public class ArrayPractice{
	/**
	 * Determines if an array's elements are in non-decreasing order.
	 * The arraylist [1, 2, 2, 3, 4] is in non-decreasing order while
	 * the arraylist [1, 3, 4, 2, 5] is not in non-decreasing order as 2 < 4.
	 * A null or empty arraylist is by default in non-decreasing order.
	 * @param array the arraylist to inspect
	 * @return true  if the arraylist's elements are in non-decreasing order,
	 *               or the arraylist is null or empty
	 *         false otherwise
	 */
  public static boolean isNonDecreasing(ArrayList<Integer> array) {
    boolean answer = false;
    if(array == null)
      return true;
    if(array.size() == 0)
      return true;
    if(array.size() == 1)
      return true;
    for(int i =0;i<array.size()-1;i++){
      if(array.get(i)>array.get(i+1))
        return false;
    }
    return true;
  }

  /**
   * Determines if an arraylist's elements are in strictly increasing order.
   * The arraylist [1, 2, 3, 4, 5] is in increasing order while
   * the arraylist [1, 2, 2, 4, 5] is not in increasing order as 2 == 2.
   * A null or empty arraylist is by default in increasing order.
   * @param array the arraylist to inspect
   * @return true  if the arraylist's elements are in increasing order,
   *               or the arraylist is null or empty
   *         false otherwise
   */
  public static boolean isIncreasing(ArrayList<Integer> array) {
    boolean answer = false;
    if(array == null)
      return true;
    if(array.size() == 0)
      return true;
    if(array.size() == 1)
      return true;
    for(int i =0;i<array.size()-1;i++){
      if(array.get(i)>=array.get(i+1))
        return false;
    }
    return true;
  }
  /**
   * Computes the reverse an arraylist.
   * The reverse of a null array is null.
   * The reverse of an empty array is the empty arraylist.
   * Do NOT use reverseInPlace in the implementation of reverse
   * @param array the arraylist whose elements are to be reversed
   * @return an arraylist holding the contents of array in reverse order
   */
  public static ArrayList<Integer> reverse(ArrayList<Integer> array) {

    if(array == null)
      return null;
    if(array.size() == 0 || array.size()==1)
      return array;
    ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(new Integer[array.size()]));
    //ArrayList<Integer> arr = new ArrayList<Integer>(10);
    for(int i = 0;i<array.size();i++){
      arr.set(i, array.get(array.size()-1-i));
    }
    return arr;

  }
  /**
   * Computes an array that is all the elements of arr1 in the order they appear,
   * followed by the elements of arr2 in the order they appear.
   * An empty arraylist should contribute no elements to the concatenated
   * array.
   * e.g. concatenate([6, 3, 8], [10, 1, 7]) should return [6, 3, 8, 10, 1, 7]
   * @param arr1 the first arraylist
   * @param arr2 the second arraylist
   * @return an arraylist that is all the elements of arr1 in order,
   *         followed by the elements of arr2 in order.
   * @throws IllegalArgumentException if arr1 or arr2 is null
   */
  public static ArrayList<Integer> concatenate(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
    //int length = arr1.size()+arr2.size();
    if(arr1==null || arr2==null)
      throw new IllegalArgumentException();
    ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(new Integer[arr1.size()+arr2.size()]));
    for(int i = 0;i<arr1.size()+arr2.size();i++){
      if(i<arr1.size())
        arr.set(i, arr1.get(i));
      else
        arr.set(i, arr2.get(i-arr1.size()));
    }
    return arr;

  }

  /**
   * Computes an arraylist that is all the elements of arr1 in the order they appear,
   * followed by the elements of arr2 in the reverse order they appear
   * An empty arraylist should contribute no elements to the resulting
   * array.
   * e.g. endToEnd([6, 3, 8], [10, 1, 7]) should return [6, 3, 8, 7, 1, 10]
   * HINT: this method can use other methods in this class to assist it.
   *       ideally, this method is one short line of code.
   * @param arr1 the first arraylist
   * @param arr2 the second arraylist
   * @return an arraylist that is all the elements of arr1 in order,
   * followed by the elements of arr2 in reverse order
   * @throws IllegalArgumentException if arr1 or arr2 is null
   */
  public static ArrayList<Integer> endToEnd(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
    if(arr1==null || arr2==null)
      throw new IllegalArgumentException();
    return concatenate(arr1, reverse(arr2));
  }

  /**
   * Reverses the given arraylist in-place.
   * Zero credit if another arraylist is made.
   * The reverse of a null arraylist is null.
   * The reverse of an empty array is the empty arraylist.
   * Do NOT use reverse in the implementation of reverseInPlace
   * HINT: since we cannot make another arraylist, we will have to swap certain
   *       elements one-by-one.
   * @param array the arraylist to reverse
   */
  public static void reverseInPlace(ArrayList<Integer> array) {
    if(array == null)
      return;
    if(array.size() == 0 || array.size() == 1)
      return;
    for(int i = 0;i<array.size()/2;i++){
      int temp = array.get(i);
      array.set(i, array.get(array.size()-1-i));
      array.set(array.size()-1-i, temp);
    }
  }

}
