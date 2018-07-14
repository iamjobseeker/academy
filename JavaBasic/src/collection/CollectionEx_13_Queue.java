package collection;

import java.util.LinkedList;
import java.util.Queue;

public class CollectionEx_13_Queue {

	public static void main(String[] args) {
		
		// ť�� implemet�ϰ��ִ� linkedlist�� ���
		Queue queue = new LinkedList();
		
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		System.out.println(queue);
		System.out.println("ũ��: " + queue.size());
		
		System.out.println("-------");
		System.out.println("poll " + queue.poll());
		System.out.println("poll " + queue.poll());
		System.out.println(queue);
		System.out.println("ũ��: " + queue.size());
		
		System.out.println("-------");
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println("ũ��: " + queue.size());
		
	}
}
