package lab04;

public class ArrayPractice{

  public static boolean isNonDecreasing(int[] array) {
    boolean answer = false;
    if(array == null)
      return true;
    if(array.length == 0)
      return true;
    if(array.length == 1)
      return true;
    for(int i =0;i<array.length-1;i++){
      if(array[i]>array[i+1])
        return false;
    }
    return true;
  }

  public static boolean isIncreasing(int[] array) {
    boolean answer = false;
    if(array == null)
      return true;
    if(array.length == 0)
      return true;
    if(array.length == 1)
      return true;
    for(int i =0;i<array.length-1;i++){
      if(array[i]>=array[i+1])
        return false;
    }
    return true;
  }

  public static int[] reverse(int[] array) {
    if(array == null)
      return null;
    if(array.length == 0)
      return array;
    int[] arr = new int[array.length];
    for(int i = 0;i<array.length;i++){
      arr[i] = array[array.length-1-i];
    }
    return arr;

  }


  public static int[] concatenate(int[] arr1, int[] arr2) {
    if(arr1==null || arr2==null)
      throw new IllegalArgumentException();
    int[] arr = new int[arr1.length+arr2.length];
    for(int i = 0;i<arr1.length+arr2.length;i++){
      if(i<arr1.length)
        arr[i] = arr1[i];
      else
        arr[i] = arr2[i-arr1.length];
    }
    return arr;

  }


  public static int[] endToEnd(int[] arr1, int[] arr2) {
    if(arr1==null || arr2==null)
      throw new IllegalArgumentException();
    return concatenate(arr1, reverse(arr2));
  }


  public static void reverseInPlace(int[] array) {
    if(array == null)
      return;
    if(array.length == 0 || array.length == 1)
      return;
    for(int i = 0;i<array.length/2;i++){
      int temp = array[i];
      array[i] = array[array.length-1-i];
      array[array.length-1-i] = temp;
    }
  }

}
