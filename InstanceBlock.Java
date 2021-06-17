class SuperClass {

	/* Static Block */
	static{
		System.out.println("SuperClass ----------> static block");  // 01
	}
		
	/* Non-Static block (Instance block) */
    {
		System.out.println("SuperClass ----------> Instance/non-static block"); // 03
 	}

	/* Constructor*/
    SuperClass() {
		System.out.println("SuperClass ----------> constructor");  // 04
 	}
}

class SubClass extends SuperClass {

	/* Static block */
    static {
		System.out.println("SubClass > static block");	// 02
 	}

	/* Non-Static block (Instance block) */
    {
		System.out.println("SubClass > Instance/non-static block");  // 05
 	}

	/* Constructor*/
    SubClass() {
		System.out.println("SubClass > constructor");  // 06
 	}
}

public class InstanceBlock {

	public static void main(String[] args) {
		//Create instance of SubClass.
		new SubClass();
	}
}