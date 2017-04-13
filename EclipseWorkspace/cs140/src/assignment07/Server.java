package assignment07;

public class Server{
    private Menu pancakeMenu;
    private Menu dinerMenu;

    public Server(Menu a, Menu b){
        pancakeMenu = a;
        dinerMenu = b;
    }
    private void printMenu(MenuEntryIterator iterator){
        for(MenuEntry menuEntry: iterator.toIterable()){
            System.out.println(menuEntry);
        }
    }
    public void printMenu(){
        System.out.print("MENU\n----\nBREAKFAST\n");
        MenuEntryIterator p = pancakeMenu.createIterator();
        printMenu(p);
        System.out.print("\nLUNCH\n");
        MenuEntryIterator d = dinerMenu.createIterator();
        printMenu(d);
    }
    private boolean isVegetarian(String name, MenuEntryIterator iterator){
        for(MenuEntry menuEntry: iterator.toIterable()){
            if(name.equals(menuEntry.getName()) && menuEntry.getVegetarian())
                return true;
        }
        return false;
    }
    private void printVegetarianMenu(MenuEntryIterator iterator){
        for(MenuEntry menuEntry: iterator.toIterable()){
        	if(menuEntry.getVegetarian()){
        		System.out.println(menuEntry);
        	}
        }
    }
    public void printVegetarianMenu(){
        System.out.print("\nVEGETARIAN MENU\n----\nBREAKFAST\n");
        MenuEntryIterator p = pancakeMenu.createIterator();
        printVegetarianMenu(p);
        System.out.print("\nLUNCH\n");
        MenuEntryIterator d = dinerMenu.createIterator();
        printVegetarianMenu(d);
    }
    public boolean isEntryVegetarian(String name){
        if(isVegetarian(name, dinerMenu.createIterator()))
            return isVegetarian(name, dinerMenu.createIterator());
        return isVegetarian(name, pancakeMenu.createIterator());
    }
}
