package lab10;

import java.util.Comparator;

public class Bonus {

	public static void main(String[] args) {
		Comparator<String> intComp = (i, j) -> i.length() - j.length(); // lambda expression
        BinarySearchTree<String> tree = new BinarySearchTree<String>(intComp);
        tree.insert("test4444");
        tree.insert("test22");
        tree.insert("test1");
        tree.insert("test7777777");
        tree.insert("test333");
        tree.insert("test55555");
        tree.insert("test666666");
        
        tree.prettyPrint();

	}

}
