package edu.njit.rwc.topic_01_types;

/**
 * This class will demonstrate some of the basic types in Java, as well as operations on them.
 * We will also be looking at some simple function calls.
 */
public class Main {

    public static void main(String[] args){
        /*
        This is a variable named iVal. It has the type int, which represents an integer value of 32 bits.
        Here, we are assigning the value 10 to it.
         */
        int iVal = 10;
        System.out.println(iVal); // Now we print the value held in iVal - 10 - to the console.

        /*
        A char is a single character. Char literals are surrounded by apostrophes/single quotes.
         */
        char cVal = 'd';
        System.out.println(cVal); // Print the d to the console on a new line.

        /*
        Booleans hold a value of either true or false.
        The double equals sign is used for checking equality. That means this statement checks whether the value held by
        iVal is equal to the number 10, and, if it is equal (which it is in this case), bVal is set to true.
        Otherwise, bVal is set to false;
         */
        boolean bVal = (iVal == 10);
        System.out.println(bVal);

        /*
        We can change the value of a variable that already exists after creating it like this.
         */
        iVal = 5;
        bVal = (iVal == 10);
        System.out.println(bVal);

        /*
        Floats also hold numeric values, except they do not need to be integers like an int. Putting an f after the
        literal value 0.25 tells the compiler that it is a float.
         */
        float fVal = 0.25f;
        System.out.println(fVal);

        /*
        Double are like floats, but have greater precision and range. You do not need to put an f after the literal.
         */
        double dVal = 0.75;
        System.out.println(dVal);

        /*
        Like we saw before, Strings are text. They are not technically primitives, and so the name of its data type
        starts with a capital letter.
         */
        String string = "Text data";
        System.out.println(string);

        /*
        Here, we call the doSomething function.
         */
        doSomething();

        /*
        Now, we pass iVal, fVal, and dVal to the evenOrOdd function. Notice that we can provide a float - fval - where
        a double is expected.
         */
        evenOrOdd(iVal, fVal, dVal);

        /*
        We call the average function and do something with its return value.
         */
        System.out.println(average(2.5, 2.75));

        System.out.println(concat("One string", 7));

        logic();
    }

    /**
     * This is a function other than the main function. Functions do things and can be called from elsewhere in code.
     * Once a function is done, execution returns to where it was called from.
     * This function is static because we want to be able to call it given only the class that contains it, rather than
     * needing an instance of that class.
     * The word void indicates that it does not return anything. The empty parentheses indicate that it takes no
     * parameters;
     */
    static void doSomething(){
        System.out.println("I am a simple function");
    }

    /**
     * This function takes three parameters.
     * @param i An integer that we will check if even or odd
     * @param even A double that will be printed if i is even
     * @param odd A double that will be printed if i is odd
     */
    static void evenOrOdd(int i, double even, double odd){
        /*
        We use an if statement to run code only when a condition is met.
        The % symbol means modulus. It is the result of performing division then taking the remainder.
        If an integer is even, its modulus 2 will be equal to zero.
         */
        if(i % 2 == 0){
            System.out.println(even);
        }
        /*
        After an if statement, we can have an else statement, which runs when none of the previous if/if else
        blocks fired. That means this one will run when i is odd.
         */
        else{
            System.out.println(odd);
        }
    }

    /**
     * This is an example of a function that returns something. The value of it can be used by the caller.
     * This returns a value of type double.
     * @return The average of d1 and d2
     */
    static double average(double d1, double d2){
        return (d1 + d2) / 2.0; // The return statement returns the value following it to the caller.
    }

    /**
     * This function demonstrates String concatenation
     * @return What you get from concatenating a String and an int
     */
    static String concat(String label, int i){
        /* + can also be used to concatenate Strings together
        The backslash is used to escape characters within a String.
        Here it is used to put quotation marks inside a String without ending the String.
         */
        return "\"" + label + "\" is a String. Also, we had an int: " + i;
    }

    /**
     * This demonstrates comparison operators and logical operators
     */
    static void logic(){
        int lo = 5, middle = 6, hi = 7; // We can declare multiple ints at once like this.
        System.out.println(lo == 5); // == Tests for equality
        System.out.println(lo < hi); // Less than
        System.out.println(lo > hi); // Greater than
        System.out.println(lo <= lo); // Less than or equal to
        System.out.println(lo >= hi); // Greater than or equal to
        System.out.println(lo != middle); // Not equal to
        boolean isTrue = middle <= hi, isFalse = hi < lo;
        System.out.println(isTrue || isFalse); // Logical OR, true when either side is true
        System.out.println(isTrue && isFalse); // Logical AND, true when both sides are true
        System.out.println(!isFalse); // Logical NOT, true when the NOT-ed value is false, and vice versa
    }

}
