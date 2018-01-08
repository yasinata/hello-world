package store;

import javax.swing.DefaultListModel;

public interface StackADT<E> {
	
		public void push(E element);
		public E pop();
		public boolean isEmpty();
		public DefaultListModel<E> getList();
	
}
