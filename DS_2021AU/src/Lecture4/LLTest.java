package Lecture4;
/**
 * DS 2021 lecture codes v 0.1
 *  Single Linked List Test
 * @author asalysaed, Ariel University
 *
 */
public class LLTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList lst=new LinkedList();
		System.out.println(lst);
		lst.Add(50);
		System.out.println(lst);
		lst.Add(14);
		lst.Add(-9);
		lst.Add(0);
		lst.Add(0);
		lst.Add(0);

		
		System.out.println(lst);
		lst.Append(10);
		lst.Append(12);
		lst.Append(7);
		lst.Append(8);
		System.out.println(lst);
		lst.Remove(10);
		System.out.println(lst);
		lst.Remove(0);
		System.out.println(lst);
		lst.RemoveAllOccurences(0);
		System.out.println(lst);
	}

}
