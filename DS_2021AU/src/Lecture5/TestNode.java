package Lecture5;
/**
 * DS 2021 lecture codes v 0.1
 *  simple node test 
 * @author asalysaed, Ariel University
 *
 */
public class TestNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> p=new Node<Integer>(5,null);
		Node<Boolean> p2=new Node<Boolean>(false,p);
		Node<Character> p3=new Node<Character>('*',p2);
		System.out.println(""+p3+", "+p3.next+", "+p3.next.next);
	}

}
