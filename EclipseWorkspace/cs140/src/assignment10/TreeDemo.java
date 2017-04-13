package assignment10;
/**
   This class demonstrates the tree class.
*/
public class TreeDemo
{
   public static void main(String[] args)
   {
      Tree t1 = new Tree(56);
      Tree t2 = new Tree(76);
      Tree t3 = new Tree(25);
      Tree t4 = new Tree(91);
      Tree t5 = new Tree(42);
      Tree t6 = new Tree(12);
      Tree t7 = new Tree(73);
      Tree t8 = new Tree(86);
      Tree t9 = new Tree(45);
      Tree t10 = new Tree(32);
      Tree t11 = new Tree(16);
      Tree t12 = new Tree(5);
      
      t2.addSubtree(t5);
      t2.addSubtree(t6);
      t2.addSubtree(t7);
      
      t3.addSubtree(t8);
      t3.addSubtree(t9);
      t3.addSubtree(t10);
      
      t4.addSubtree(t11);
      t4.addSubtree(t12);
      
      t1.addSubtree(t2);
      t1.addSubtree(t3);
      t1.addSubtree(t4);
      System.out.println(t1.bftravers());
   }
}
