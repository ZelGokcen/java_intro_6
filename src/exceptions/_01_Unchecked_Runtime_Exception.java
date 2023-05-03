package exceptions;
import utilities.ScannerHelper;
import java.util.NoSuchElementException;

public class _01_Unchecked_Runtime_Exception {
    public static void main(String[] args) {


        String name = ScannerHelper.getFirstName();

        try { // using try-catch to handle the exception
            System.out.println(name.charAt(5)); // StringIndexOutOfBoundsException

            String s = null;
            System.out.println(s.toUpperCase()); // NullPointerException

            Thread.sleep(1000);

        } catch (Exception e) {
            e.printStackTrace();
            //System.out.println(e.getMessage());
        } finally {
            System.out.println("I AM HERE TO RUN ALL THE TIME!!!");
        }


        System.out.println("The rest of the program");

        throw new NoSuchElementException("JUST FOR FUN!!!!");

/*
        try { // using try-catch to handle the exception
            System.out.println(name.charAt(5)); // StringIndexOutOfBoundsException
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("I could not print char at 5 as it does not exist!");
        }


        System.out.println("The rest of the program");
        */
    }

}
      /*  String name = "John"; // 0 1 2 3

        int[] numbers = {10, 15, 20};

        // System.out.println(name.charAt(5)); // StringIndexOutOfBoundsException

        // System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException

        String address = null;

        System.out.println(address.toUpperCase()); // NullPointerException

        System.out.println("End of the program");
    }

   */