
public class VariablesJava {

	public static void main(String[] args) {
		
		//Primitives types, Variables declaration is necessary
		byte b; //minimum -128 max 127, 8 bit signed two's complement integer
		short s; // min -32,768 max 32767, 16 bit signed two's complement integer
		int i; // min -2^31 max 2^31-1, 32 bit signed two's complement integer
		long l; // min -2^63 max 2^63-1, 64 bit two's complement integer
		float f; // Represents real numbers, fractions or decimal, requires 32 bit storage
		double d; //Represents real numbers, fractions or decimal, requires 64 bit storage
		char c; // Single 16 bit Unicode character
		boolean bo; //true or false
		
		//String is non-primitive
		String st = "I am String";
		
		//initializing variables
		b = 126; 
		s = 32000;
		i = 32132132;
		l = 454654657;
		f = (float) 5.2;
		d = 2.5;
		c = 'A';
		bo = true;
		
		System.out.println ("Primitives values are : " + b + " " + s + " " + i + " " + l + " " + f + " " + d);
		System.out.println ("More Primitive values: " + c + " " + bo);
		System.out.println ("Non-Primitives : " + st);
		
		// Objects can be created from Final class but it cannot be extended (Inherited) 
		FinalTypes f1 = new FinalTypes();
		f1.methodFinal();
		
		MethodTypes m1 = new MethodTypes();
		m1.methodProtected();
		m1.methodPublic();
		
		// m1.methodPrivate(); Cannot access privatemethod	
	}
}
	
	class MethodTypes{
		
		//Static variable saves memory as only single copy is created
		static final int staticInt = 6;
		
		//Public, Private, Protected methods - similar approach to variables and classes
		public void methodPublic() {
			
			System.out.println("I am Public Method and Accessible from everywhere");
		}
		
		protected void methodProtected() {
			
			System.out.println("I am Protected Method and Accessible by clasess of the same package and subclassess residing in the package");
		}
		
		private void methodPrivate() {
			
			System.out.println("I am Private Method and Accessible within in the same class only");
		}
	}
	
	//Final class which cannot be inherited.
	 final class FinalTypes{
		
		final int iAmFinalInt = 100; //Constant (Final) variable which cannot be modified and must be initialized
		
		//Final method cannot be overridden
		final void methodFinal() {
			
			System.out.println ("I am Final Method and cannot be overridden");
		}	
	}
