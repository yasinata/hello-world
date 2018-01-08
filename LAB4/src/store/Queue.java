package store;
public class Queue { 
	private Node top; 
	
	public Queue() { 
		top = null;
	} 
	public void enqueue(Person p){ 
		Node newNode = new Node(p); 
		Node cur = top; 
		
		if (top == null) 
			top = newNode; 
		
		else { while(cur.getNext() != null) 
			cur = cur.getNext(); cur.setNext(newNode); 
			} 
		} 
	
	public Person dequeue() { 
			Person p = top.getPerson(); 
			top = top.getNext(); 
			return p; } 
	public Person top() { 
			return top.getPerson(); 
			} 
	public boolean isEmpty() { 
			return top == null; 
			}
		} 