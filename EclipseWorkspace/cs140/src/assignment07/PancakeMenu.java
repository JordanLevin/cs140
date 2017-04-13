package assignment07;
import java.util.*;

public class PancakeMenu implements Menu {
    
    private ArrayList<MenuEntry> menuEntries = new ArrayList<MenuEntry>();

    public PancakeMenu(){
        addItem("Item 1", "description1", false, new Price(2, 99));
        addItem("Item 2", "description2", true, new Price(3, 10));
        addItem("Item 3", "description3", false, new Price(4, 0));
        addItem("Item 4", "description4", true, new Price(5, 5));
    }
    
    public void addItem(String n, String d, boolean v, Price p){
        menuEntries.add(new MenuEntry(n,d,v,p));
    }
    public MenuEntryIterator createIterator(){
        return MenuEntryIterator.adapt(menuEntries.iterator());
    }

}
