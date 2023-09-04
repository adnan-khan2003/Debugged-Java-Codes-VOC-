/*
Objective: To identify and fix errors in a Java program that manipulates arrays.

Explanation of error: The loop condition was incorrect, and was causing an ArrayIndexOutOfBoundsException
because you were trying to access an element beyond the array's length.
The loop should iterate from 0 to numbers.length - 1 to stay
within the bounds of the array.
*/
public class ArrayManipulation {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};
            //I have changed the condition of For loop from (i <= numbers.length) to (i < numbers.length)
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        }
    }
