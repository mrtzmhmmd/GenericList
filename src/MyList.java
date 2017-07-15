import java.util.Comparator;

public interface MyList<E> {
	int size();
	boolean isEmpty();
	boolean contain(E e);
	boolean add(E e);
	boolean remove(E e);
	void clear();
	boolean equals(Object o);
	int indexOf(E e);
	void sort();
	void fill(E e);
	void sort(Comparator<E> c);
	void fill(E e, int count);
	void replace(E e);
}