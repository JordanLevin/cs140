package lab06;

import java.util.Arrays;
import java.util.ArrayList;

public class Tester {

    public static void main(String[] args) {
        testInts();
        testPartitioner();
        testZipper();
    }

    public static void testInts() {
        OneInt a = new OneInt(5);
        OneInt b = new OneInt(3);
        TwoInts c = new TwoInts(29, 5);
        TwoInts d = new TwoInts(2, 4);
        ArrayList<OneInt> ints = new ArrayList<>();
        ints.add(a);
        ints.add(b);
        ints.add(c);
        ints.add(d);
        System.out.println("expected 48, got " + OneInt.sumAll(ints));
    }

    public static void testPartitioner() {
        Partitioner p = new Partitioner();
        Parent[] array = new Parent[5];
        array[0] = new Parent();
        array[1] = new Parent();
        array[2] = new Child();
        array[3] = new Parent();
        array[4] = new Child();
        p.partition(array);
        Parent[] pa = p.getParents();
        Child[] ca = p.getChildren();
        System.out.println("Parents: " + Arrays.toString(pa));
        System.out.println("Children: " + Arrays.toString(ca));
    }

    public static void testZipper() {
        int ret[] = Zipper.zip(new int[]{1, 3, 5, 7}, new int[]{2, 4, 6, 8});
        System.out.println("Expecting {1, 2, 3, 4, 5, 6, 7, 8}");
        System.out.println("Received " + Arrays.toString(ret));
    }
}