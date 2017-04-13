package assignment03;

public class Test1{
    public static void main(String[] args){
        double[] first = {};
        double[] second = {1.23, 5.57, -2.72, 74437.5};
        double[] third = {32472.237, 237248.38, 1829837.823};
        double[] fourth = null;

        System.out.println(Assig3.hasNegative(first));
        System.out.println(Assig3.hasNegative(second));
        System.out.println(Assig3.hasNegative(third));
        System.out.println(Assig3.hasNegative(fourth));

    }
}
