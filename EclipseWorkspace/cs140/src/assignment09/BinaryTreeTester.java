package assignment09;

public class BinaryTreeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree questionTree = new BinaryTree("Is it a mammal?",
				new BinaryTree("Does it have stripes?",
						new BinaryTree("Is it a carnivore?",
								new BinaryTree("It is a tiger."),
								new BinaryTree("It is a zebra.")),
						new BinaryTree("It is a pig.")),
				new BinaryTree("Does it fly?",
						new BinaryTree("It is an eagle."),
						new BinaryTree("Does it swim?",
								new BinaryTree("It is a penguin."),
								new BinaryTree("It is an ostrich."))));
		
		System.out.println(questionTree.numLeaves());
		System.out.println(questionTree.numNodesWithOneChild());
		questionTree.printInOrder();
	}

}
