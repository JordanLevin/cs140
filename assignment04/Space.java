package assignment04;

public class Space{
    private String name;
    private double area;

    public Space(String name, double area){
        this.name = name;
        this.area = area;
    }

    public String getName(){
        return name;
    }
    public double getArea(){
        return area;
    }

    public String toString(){
        return name + " of area " + area;
    }

}
