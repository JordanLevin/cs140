package assignment07;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PancakeMenu pancakeMenu = new PancakeMenu();
		DinerMenu dinerMenu = new DinerMenu();
		Server server = new Server(pancakeMenu, dinerMenu);
		server.printMenu();
		server.printVegetarianMenu();
		changePrices(dinerMenu);

		System.out.println("\nCustomer asks, is the Item 3 vegetarian?"); 
		// use the name of a lunch item that is not vegetarian in place of Item 3
		System.out.print("Server says: ");
		System.out.println(server.isEntryVegetarian("Item 3")?"Yes":"No");
		System.out.println("\nCustomer asks, are the Item 7 vegetarian?");
		// use the name of a pancake item that is vegetarian in place of Item 7
		System.out.print("Server says: ");
		System.out.println(server.isEntryVegetarian("Item 7")?"Yes":"No");
		
		
		server.printMenu();
	
		
	}
	public static void changePrices(Menu menu){
		for(MenuEntry i : menu.createIterator().toIterable()){
			if(i.getVegetarian())
				i.changeDown(5);
			else
				i.changeUp(10);
		}
	}

}
