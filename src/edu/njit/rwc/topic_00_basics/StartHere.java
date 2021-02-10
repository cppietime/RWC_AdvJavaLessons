package edu.njit.rwc.topic_00_basics;
/*  This is a comment, which is ignored by the compiler.
    The package statement identifies the package the class represented by this file belongs to.
    This package, edu.njit.rwc.lesson_00_basics, is the file path relative to the base source directory where this file
    is located.
 */

/**
 * This is a javadoc comment, which is a special type of comment, which starts with two *'s instead of one.
 * Use these to document what you write. Explain what your classes and functions do and how to use them.
 * This is a class, named StartHere. In java, the public class in a file must match the name of the file.
 * Classes represent a type of thing, and contain variables and functions.
 * The public identifier means that this class can be accessed by any other class.
 */
public class StartHere {

    /**
     * This is a function named main. Executable Java always starts with whatever is contained in the
     * public static void main function.
     * The static identifier means that only the class name is needed to reference
     * this function, rather than an instance of the class. Examples explaining this in greater detail will come later.
     * The word String here refers to the data type String, which holds text data, and the presence of square brackets
     * after it makes it an array. The name of this array of Strings is args. This is a variable name, and could be any
     * valid variable name. When a variable is specified inside the parentheses of a function declaration like this,
     * it is a parameter, meaning that whenever that function is called, something matching that variable is provided
     * as an input.
     * The line below this is a special Javadoc type of line that provides documentation on a function parameter
     * @param args The command line arguments provided to this program
     */
    public static void main(String[] args){
        /*
        This line prints the message "Hello, world!". System is a class. By putting a period after the class name,
        we access a static member of that class: something that class holds or contains that we can do things with.
        In this case, we access the member named out. Then, with another period, we access a member of System.out.
        The function println prints the String it's given and a new line.
        Inside the parentheses following println, there's text inside of quotation marks. Quotation marks indicate
        a String literal, i.e. text data. Whatever is inside them is what will be printed by println.
         */
        System.out.println("Hello, world!");
        // Then the program ends.
        // By the way, this type of comment contains whatever follows the double-slash until the end of the line
    }

}
