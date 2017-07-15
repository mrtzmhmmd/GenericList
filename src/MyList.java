public interface MyList<E> {
	int size();
	boolean isEmpty();
	boolean contain(E e);
	boolean add(E e);
	boolean remove(E e);
	void clear();
	boolean equals(Object o);
	int indexOf(E e);
}