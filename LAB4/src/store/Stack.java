package store;

import javax.swing.DefaultListModel;
import javax.swing.JList;

public class Stack<Person> extends JList implements StackADT<Person> 
{
	private DefaultListModel<Person> list;
	public Stack()
	{
		list = new DefaultListModel<Person>();
	}
	public void push(Person element)
	{
		list.addElement(element);
	}
	public Person pop()
	{
		Person retur = (Person) list.lastElement(); 
		list.remove(list.size()-1);
		return retur;
	}
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	public DefaultListModel<Person> getList()
	{
		return list;
	}
}