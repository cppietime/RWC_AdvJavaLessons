package edu.njit.rwc.topic_03_arrays;

public class Main {

    public static void main(String[] args){
        /*
        We use square brackets to create an array. An array is a fixed size group of items of the same type.
         */
        int[] iArray = new int[4];
        System.out.println(iArray.length);

        /*
        We also use brackets to index into an array. Indexing starts at 0, and goes up to length - 1.
         */
        iArray[0] = 3;
        iArray[1] = 1;
        iArray[2] = 4;
        iArray[3] = 5; // iArray[4] would fail, because it's out of bounds.
        for(int i = 0; i < iArray.length; i++) {
            System.out.println(i + ": " + iArray[i]);
        }

        int[] sequence = count(6); // We can also assign to an array like this.
        for(int i = sequence.length - 1; i >= 0; i --){ // -- decrements, like how ++ increments.
            System.out.println(sequence[i]);
        }
        System.out.println(sum(sequence));
    }

    /**
     * private functions can only be accessed from within its own class
     * @return An array of ints of size len, counting up from 0
     */
    private static int[] count(int len){
        int[] count = new int[len]; // We can use a variable for an array length
        for(int i = 0; i < len; i++) {
            count[i] = i;
        }
        return count;
    }

    /**
     * We can pass an array to a function, too.
     * @return The sum of all elements of nums
     */
    private static int sum(int[] nums){
        int sum = 0;
        /*
        This is a foreach loop. It loops over every member of nums, assigning it to num.
        It would be similar to using
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            ...
        }
         */
        for(int num : nums){
            System.out.println("Adding " + num + " to " + sum);
            sum += num; // This is a compound assignment, the same as sum = sum + num.
            System.out.println("Now sum is " + sum);
        }
        return sum;
    }

}
