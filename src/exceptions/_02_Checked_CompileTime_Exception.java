package exceptions;

public class _02_Checked_CompileTime_Exception {
        public static void main (String[]args) throws InterruptedException {
            // adding Exception to the method signature

          for (int i = 0; i < 10; i++) {
          System.out.println(i);
          try { // using try-catch to handle the exception
              Thread.sleep(5000);
          } catch (InterruptedException e) {
              System.out.println("I caught an exception here!!!");
        }
        }
        }
    }


    /*

    What are final, finalize and finally?

    -final is a non-access modifier
	-final attributes: they cannot be changed
	-final classes: cannot be inherited
	-final method: cannot be overridden

    -finalize() is a method
	-it is related to garbage collection
	-it comes from Object class
	-Any custom class can override this to provide better garbage collection process

    -finally is a block
	-it is related to exception handling
	-can be used together with try block or try-catch blocks
    -this block will execute regardless of having an exception or not in the try block

    throw vs throws?
    -throws keyword can be used to handle checked exceptions by adding them to the method signature
    -throw is used to throw an exception intentionally
     */