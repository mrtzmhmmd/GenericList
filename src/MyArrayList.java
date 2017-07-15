import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/**
 * 
 * 
 * @author Morteza return
 * @param <E>
 *            >>>>>>> Stashed changes
 */

public class MyArrayList<E> implements MyList<E> {
	Object[] elementData;
	private int size = 0;

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}

	@Override
	public boolean contain(E e) {
		return indexOf(e) >= 0;
		// TODO Auto-generated method stub
	}

	@Override
	public boolean add(E e) {
		elementData[size++] = e;
		return true;
		// TODO Auto-generated method stub
	}

	@Override
	public boolean remove(E e) {
		// TODO Auto-generated method stub
		if (this.contain(e))
			return true;
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		for (int i = 0; i < elementData.length; i++)
			elementData[i] = null;

	}

	@Override
	public int indexOf(E e) {
		// TODO Auto-generated method stub
		for (int i = 0; i < size; i++)
			if (elementData[i].equals(e))
				return i;
		return 0;
	}

	@Override
	public boolean equals(Object o) {
		int i = 0;
		if (o instanceof MyArrayList<?>) {
			MyArrayList<Object> c = (MyArrayList<Object>) o;
			while (i < size) {
				if (c.contain(this.elementData[i]))
					i++;
				else
					return false;
			}
		}
		return true;
	}
}