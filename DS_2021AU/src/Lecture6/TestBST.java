package Lecture6;

public class TestBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree t = new BinarySearchTree();
		t.inOrder();
		System.out.println();
		t.Add(7);
		t.inOrder();
		System.out.println();
		t.Remove(7);
		t.inOrder();
		System.out.println();
		int n = 20;
		int min=11111;
		int max=Integer.MIN_VALUE;
		
		for (int i = 0; i < n; i++) {
			int x=(Math.random()>0.5)?(int)(Math.random()*n):(int)(-1*Math.random()*n);
			if(x>max) {
				max=x;
				
			}
			if(min>x) {
				min=x;
			}
			t.Add(x);
		}
		t.inOrder();
		System.out.println();
		t.Remove(max);
		t.Remove(min);
		t.inOrder();
		System.out.println();
	}

}
