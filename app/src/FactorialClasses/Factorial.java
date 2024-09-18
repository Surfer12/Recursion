package FactorialClasses;
// use only for loop

public class Factorial {
    private int number;

    public Factorial(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public int calculateFactorial() {
        int result = 1; // Initialize initial value to 1
        for (int i = 1; i <= number; i++) { // loop from 1 to the number
            result *= i; // Multiply result by i to calculate the factorial. 
        }
        return result; // Return the factorial
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial(5);
        System.out.println(factorial.calculateFactorial());
    }
}
