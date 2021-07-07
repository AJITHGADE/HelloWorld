import java.util.*;

class GenericClass<T>{
	private T data;

	public GenericClass(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}
	
	
}

class TestData{
	
	private Object obj;

	public TestData(Object obj) {
		super();
		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}
	
	
}
public class Generic_Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		
GenericClass<String> gener=new GenericClass<String>("Soe Info");
		
		System.out.println(gener.getData());
		
		TestData td=new TestData(1);
		String str1=(String) td.getObj();
		System.out.println(str1);
		*/
		List<GenericClass<String>> elements=new LinkedList<GenericClass<String>>();
		
		elements.add(new GenericClass("ASDF"));
		
		elements.add(new GenericClass("SADF"));
	
		elements.add(new GenericClass("WERT"));
		printList(elements);
	}

	private static void printList(List<GenericClass<String>> elements) {
		// TODO Auto-generated method stub
		
		ListIterator<GenericClass<String>> ls=elements.listIterator();
		
		while(ls.hasNext()) {
			System.out.println("Printing elemts..."+ls.next().getData());
		}
		
		
		for(GenericClass str:elements) {
			System.out.println(str.getData());
		}
		
	}

}
