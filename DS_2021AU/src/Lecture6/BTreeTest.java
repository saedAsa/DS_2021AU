package Lecture6;
/**
 * DS 2021 lecture codes v 0.1
 *  Binary Tree simple test 
 * @author asalysaed, Ariel University
 *
 */
public class BTreeTest {
	public static void main(String[]args) {
		BinaryTree<Integer> t=new BinaryTree<>();
		t.inOrder();
		System.out.println();
		t.addIterative(7);
		t.inOrder();
		System.out.println();
		t.addIterative(-9);
		t.addIterative(17);
		t.addIterative(17);
		t.addRecursive(10);
		t.addRecursive(-8);
		t.addRecursive(1);
		t.addRecursive(4);
		t.addRecursive(55);
		t.addRecursive(3);
		System.out.println("inOrder traversal:");
		t.inOrder();
		System.out.println("\npostOrder traversal:");
		t.postOrder();
		System.out.println("\npreOrder traversal:");
		t.preOrder();
		System.out.println("\nBFS traversal:");
		t.BFS();
	}
}
