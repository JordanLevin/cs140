package assignment07;

import java.util.*;

public class DinerMenu implements Menu{
    private ArrayList<MenuEntry> menuEntries = new ArrayList<MenuEntry>();

    public DinerMenu(){
        addItem("Item 5", "description1", false, new Price(2, 99));
        addItem("Item 6", "description2", true, new Price(3, 10));
        addItem("Item 7", "description3", true, new Price(4, 57));
        addItem("Item 8", "description4", false, new Price(5, 86));
        addItem("Item 9", "description5", false, new Price(6, 27));
        addItem("Item 10", "description6", true, new Price(7, 50));
    }
    
    public void addItem(String n, String d, boolean v, Price p){
        menuEntries.add(new MenuEntry(n,d,v,p));
    }
    public MenuEntryIterator createIterator(){
        return new DinerMenuIterator(menuEntries.toArray(new MenuEntry[]{}));
    }

}
