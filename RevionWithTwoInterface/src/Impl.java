
public class Impl implements A,B {
	
	public static void main(String[] args) {
	   Impl impl=new Impl();
	   impl.funA();
	   
	   impl.funB();
	   
	   
	   
	   
	    
	}
	

	@Override
	public void funA() {
	     System.out.println("I am in A or B ?");	
	}


	@Override
	public void funB() {
		System.out.println("I am B class and in funB()...");
	}

}
