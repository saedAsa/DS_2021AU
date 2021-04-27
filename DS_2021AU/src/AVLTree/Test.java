package AVLTree;

import java.util.Scanner;

/**
 * AVL Tree class simple tester - Ariel University, Data structures course,
 * 2021.
 * 
 * @author Asaly Saed, saed.asaly@gmail.com.
 */
public class Test {

	public static double getAvg(int iterNum) {
		double avg = 0;
		for (int i = 1; i <= iterNum; i++) {
			AVLTree t = new AVLTree();
			int n = 100;
			for (int j = 0; j < n; j++) {
				int x = (int) (Math.random() * (5 * n));
				if (Math.random() > 0.5) {
					t.Add(x);

				} else {
					t.Add(-x);
				}
			}
			avg += AVLTree.height(t.root) / (Math.log(n) / Math.log(2));
		}
		return avg / iterNum;
	}

	public static boolean isBalancedTree(Node r) {
		if(r!=null) {
			return isBalancedTree(r.left)
					&&(Math.abs(AVLTree.height(r.left)-AVLTree.height(r.right))<=1)
					&&isBalancedTree(r.right);
		}
		return true;

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AVLTree t = new AVLTree();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of random elements to be added: ");
		int n = 10;// sc.nextInt();
		for (int i = 0; i < n; i++) {
			int x = (int) (Math.random() * (5 * n));
			if (Math.random() > 0.5) {
				t.Add(x);
				System.out.println((i + 1) + ": " + x + " has been added");
			} else {
				t.Add(-x);
				System.out.println((i + 1) + ": " + (-x) + " has been added");
			}
		}
		System.out.println("In-order:");
		t.inOrder();
		System.out.println("\nBFS:");
		t.BFS();
		System.out.println("\nPlot of the tree:");
		t.plotTree();
		boolean bal=isBalancedTree(t.root);
		System.out.println("the tree is " +((bal==false)?"not ":"")+"balaced");
		System.out.println("The average ratio: height/log(n): " + getAvg(100000));
	}
}
