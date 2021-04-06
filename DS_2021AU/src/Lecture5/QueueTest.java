package Lecture5;
/**
 * DS 2021 lecture codes v 0.1
 *  Simple Queue test
 * @author asalysaed, Ariel University
 *
 */
public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueArr q=new QueueArr(10);
		System.out.println(q);

		q.enqueue(2);
		System.out.println(q);
		q.enqueue(40);
		q.enqueue(-9);
		q.enqueue(13);
		System.out.println(q);
		System.out.println(q.dequeue());
		System.out.println(q);
		for(int i=0;i<7;i++) {
			q.enqueue(i);
		}
		System.out.println(q);
		System.out.println("front: "+q.getFront());
		System.out.println("rear: "+q.getRear());
	}

}
