/**
 * 
 * 
 * @author Morteza return
 * @param <E>
 *            >>>>>>> Stashed changes
 */

public class MyArrayList<E> implements MyList<E> {

	private int size = 10;
	Object[] elementData = new Object[size];
	private int count = 0;

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return count == 0;
	}

	@Override
	public boolean contain(E e) {
		return indexOf(e) >= 0;
		// TODO Auto-generated method stub
	}

	@Override
	public boolean add(E e) {
		if (count <= size) {
			elementData[count++] = e;
			return true;
		}
		return false;
		// TODO Auto-generated method stub
	}

	@Override
	public boolean remove(E e) {
		// TODO Auto-generated method stub
		if (this.contain(e)) {
			int index = this.indexOf(e);
			for (int i = index; i < count; i++) {
				elementData[i] = elementData[++i];
			}
			return true;
		}
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		for (int i = 0; i < count; i++)
			elementData[i] = null;
	}

	@Override
	public int indexOf(E e) {
		// TODO Auto-generated method stub
		for (int i = 0; i < count; i++)
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