package linkedlist;

public class Main {

	public static void main(String[] args) {
		LinkedList numbers = new LinkedList();
		numbers.addFirst(30);
		numbers.addFirst(20);
		numbers.addFirst(10);

/*		numbers.add(1,15);	
		numbers.addLast(103);
		numbers.addLast(203);
		numbers.addLast(302);
		System.out.println(numbers);
		System.out.println(numbers.removeFirst());		
		System.out.println(numbers);	
		System.out.println(numbers.remove(1));
		System.out.println(numbers.size());
		System.out.println(numbers.get(1));
		System.out.println(numbers);
		System.out.println(numbers.indexOf(10));

		LinkedList.ListIterator i = numbers.listIterator();
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.hasNext());
		i.add(5);
		i.next();
		i.add(15);
		
*/
		LinkedList.ListIterator i = numbers.listIterator();
		while(i.hasNext()) {
			if((int)i.next() == 20) {
				i.remove();
			}
		}
		System.out.println(numbers);
		
	}

}
