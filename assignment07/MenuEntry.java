package assignment07;

public class MenuEntry{
    private String name;
    private String description;
    private boolean vegetarian;
    private Price price;

    public MenuEntry(String n, String d, boolean v, Price p){
        name = n;
        description = d;
        vegetarian = v;
        price = p;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public boolean getVegetarian(){
        return vegetarian;
    }
    public Price getPrice(){
        return price;
    }
    public void setName(String n){
        name = n;
    }
    public void setDescription(String d){
        description = d;
    }
    public void setVegetarian(boolean v){
        vegetarian = v;
    }
    public void setPrice(Price p){
        price = p;
    }
    public String toString(){
        return name + ", " + price.toString() + " -- " +description;
    }
    public void changeUp(double percent) {
    	price.changeUp(percent);
    }
    public void changeDown(double percent) {
    	price.changeDown(percent);
    }
}
