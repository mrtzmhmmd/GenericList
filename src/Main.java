import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		MyArrayList<String> ls = new MyArrayList<>();
		ls.add("z");
		ls.add("L");
		ls.add("A");
		ls.add("B");
		
		ls.fill("rb", 1);
ls.toPrint();
	/*	MyArrayList<String> ls2 = new MyArrayList<>();
		ls2.add("C");
		ls2.add("Bjkjhbk");
		ls2.add("jjgkh");

		ls2.sort(new Comparator<String>() {

			@Override
			public int compare(String A, String B) {
				// TODO Auto-generated method stub
				if (A.length() > B.length())
					return 1;
				else if (A.length() == B.length())
					return 0;
				else
					return -1;
			}
		});
		ls2.toPrint();
	
	*/}
}
