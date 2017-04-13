package assignment10;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

/**
 * A class to implement the Binary Search Tree data structure.
 * The structure is generic in the type of Objects it contains.
 * @param <T> the type of the contained elements this structure is to hold
 */
public class BinarySearchTree<T> {
    private Comparator<T> comparator;
    private T data;
    private BinarySearchTree<T> left;
    private BinarySearchTree<T> right;

    /**
     * Constructs an empty BST with a Comparator
     * @param comp the Comparator to use to impose an ordering on instances of T
     */
    public BinarySearchTree(Comparator<T> comp) {
        this.comparator = comp;
    }

    /**
     * Constructs a BST with data and a Comparator
     * @param data the data this BST should hold
     * @param comp the Comparator to use to impose an ordering on instances of T
     */
    public BinarySearchTree(T data, Comparator<T> comp) {
        this.data = data;
        this.comparator = comp;
    }

    /**
     * Inserts an element into this BST
     * @param element the element to insert into this BST
     */
    public void insert(T element) {
    	if(data == null)
    		data = element;
    	if(comparator.compare(element, data)>0){
    		if(right == null)
    			right = new BinarySearchTree<T>(element, comparator);
    		else
    			right.insert(element);
    	}
    	else if(comparator.compare(element, data)<0){
    		if(left == null)
    			left = new BinarySearchTree<T>(element, comparator);
    		else
    			left.insert(element);
    	}
    	else{
    		return;
    	}
    }

    /**
     * Searchs for a given element in this BST
     * @param element the element to search this BST for
     * @return the element in this BST matching the given element, if found,
     *         otherwise null if the given element is not in this BST
     */
    public T find(T element) {
    	if(comparator.compare(element, data)>0){
    		if(right == null)
    			return null;
    		return right.find(element);
    	}
    	else if(comparator.compare(element, data)<0){
    		if(left==null)
    			return null;
    		return left.find(element);
    	}
    	else{
    		return data;
    	}
    }

    /**
     * Gathers all the elements of this BST in order
     * @return a List holding the elements in this BST in order
     */
    public List<T> getElements() {
        List<T> list = new ArrayList<>();
        inOrder(list);
        return list;
    }
    public void inOrder(List<T> list){
        if(data != null){
        	if(left!=null) left.inOrder(list);
        	list.add(data);
        	if(right!=null) right.inOrder(list);
        }
    }
    

    /**
     * Pretty prints the contents of this BST in a horizontal tree-like fashion
     */
    public void prettyPrint() {
        prettyPrint(0);
    }

    private void prettyPrint(int indentLevel) {

    	if(left!=null){
    		left.prettyPrint(indentLevel+1);
    	}
    	if(data!=null){
        	for(int i = 0;i<indentLevel;i++){
        		System.out.print(" ");
        	}
        	System.out.println(data);
    	}
    		
    	if(right!=null)
    		right.prettyPrint(indentLevel+1);
    	
        // TODO
        // similar to printInOrder from assignment09,
        // but print `indentLevel` amount of spaces before printing data on its own line
        // you may use a for loop to print `indentLevel` amount of spaces
        // each time you recurse, you add to indentLevel
    }

    
	public ArrayList<T> bftravers(){
		ArrayList<BinarySearchTree<T>> list= new ArrayList<BinarySearchTree<T>>();
		list.add(this);
		return bftravers(list);
		
	}
	private ArrayList<T> bftravers(ArrayList<BinarySearchTree<T>> nodeQueue){
		ArrayList<T> retval = new ArrayList<T>();
		if(nodeQueue.size()>0){
			retval.add(nodeQueue.get(0).data);
			BinarySearchTree<T> temp = nodeQueue.get(0);
			nodeQueue.remove(0);
			if(temp.left != null)
				nodeQueue.add(temp.left);
			if(temp.right != null)
				nodeQueue.add(temp.right);
			retval.addAll(bftravers(nodeQueue));
		}
		return retval;
	}
    
    /**
     * A main method supplied for any debugging needs
     */
    public static void main(String[] args) {
        // Up to you how you use this main method, feel free to change it
        Comparator<Integer> intComp = (i, j) -> i - j; // lambda expression
        BinarySearchTree<Integer> tree = new BinarySearchTree<>(intComp);
        tree.insert(3);//       3
        tree.insert(8);//      2 8
        tree.insert(2);//     1   9
        tree.insert(1);//    0
        tree.insert(9);
        tree.insert(0);
        tree.insert(4);
        System.out.println(tree);
        System.out.println(tree.bftravers());
    }
}