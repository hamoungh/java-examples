
public class ObjectsTest {

	public static void main(String[] args) {
		// classname reference_name; --> declaring references
		Integer i;
		// new classname(...) --> creating objects
		i=new Integer(4);  
		//  obj_ref.method_name(); -->  invoke object methods
		boolean p=i.equals(new Integer(16));
		System.out.print(p);
	}

}
