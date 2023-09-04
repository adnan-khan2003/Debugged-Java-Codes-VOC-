/*
Objective: To identify and fix errors in a Java program that demonstrates exception handling.

Explanation of error: There was an error in the code regarding exception handling. Specifically, there is a
zero division error in the divide method, and we should handle it with an appropriate exception handler.
*/
public class ExceptionHandling {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds.");
        }
/*
Here, I have added a try-catch block around the division operation in the main method to catch the
ArithmeticException that occurs when dividing by zero.
 */
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Zero Division error.");
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
