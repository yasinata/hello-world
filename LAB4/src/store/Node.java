package store;

public class Node { 
	private Person person; 
	private Node _next; 
	public Node (Person p) { 
		person = p; 
		_next = null; 
		
		} 
	public void setNext(Node nod) { 
			_next = nod; 
			}
		public Node getNext() { 
			return _next; 
			}
		public Person getPerson() { 
			return person; 
			} 
		} 