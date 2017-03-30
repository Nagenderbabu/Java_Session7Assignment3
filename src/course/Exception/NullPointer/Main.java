package course.Exception.NullPointer;

public class Main {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// try block 
		// logic executed in try block
	try{
		NullException ne=null;
		System.out.println(ne.name);
	}	
	// exception is handled in catch block
	// Null pointer Exception is handled
	catch(Exception e){
	System.out.println("cannot access variable with uninitialized(Null) object");
	}
	}

}
