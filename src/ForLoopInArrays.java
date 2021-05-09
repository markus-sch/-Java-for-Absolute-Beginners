public class ForLoopInArrays {
    public static void main(String[] args) {
        double[] numlist = {121.9, 200.9, 304.4, 312.5};

        // Print all the array elements
        for (int i = 0; i < numlist.length; i++){
            System.out.println(numlist[i]);
        }

        // Sum all the elements of the array
        double sum = 0;  // Init der Variable
        for (int i = 0; i < numlist.length; i++){
            sum += numlist[i];
        }
        System.out.println("Sum is: " +sum);

        // Find the largest element of an array
        double max = 0;
        int position = 0;   // Position des Elements im Array
        for (int i = 0; i < numlist.length; i++){
            if (numlist[i] >= max){
                max = numlist[i];
                position = i + 1;
            }
        }
        System.out.println("Largest Element is " + max + " at position " + position);
    }
}
