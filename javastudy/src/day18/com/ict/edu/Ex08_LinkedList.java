package day18.com.ict.edu;

import java.util.LinkedList;

public class Ex08_LinkedList {
//	Queue(규) 인터페이스	: FIFO(First in First out)
//							먼저 들어온 정보가 먼저 나감
//	Queue를 구현한 클래스 	: LinkedList
	
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		
		//추가, 삽입 : add, addFirst, addLast, offer, offerFirst, offerLast
		linkedList.add("고길동");
		linkedList.add("고길동2");
		linkedList.offer("도우너");
		linkedList.addFirst("둘리");
		linkedList.offerFirst("또치");
		linkedList.addLast("희동이");
		linkedList.offerLast("둘리");
		
		System.out.println(linkedList);
		
		if(linkedList.contains("둘리")) {
			System.out.println(linkedList.indexOf("둘리"));
			System.out.println(linkedList.getFirst());
			System.out.println(linkedList.getLast());
			
			//치환
			linkedList.set(linkedList.lastIndexOf("둘리"), "공실이");
			
		}
		System.out.println(linkedList);
		linkedList.remove();
		System.out.println(linkedList+ "S");
		linkedList.pop();
		System.out.println(linkedList);
		linkedList.removeLast();
		System.out.println(linkedList);
	}
	
}
