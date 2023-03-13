public class CompactClient {
    public static void main(String[] args)
    {
        //Original array
        int original[] = {0, 1, 3, 0, 4, 6, 0, 0, 13, 25, 0};
        //Save the resulting array from calling the removeZeroes method.
        int[] newArray = Compact.removeZeroes(original);
        System.out.print("Original Array: ");
        //Print the original array
        for (int i = 0; i < original.length; i++)
        System.out.print(original[i] + " ");
        System.out.println();
        System.out.print("New Array: ");
        //Print the new array
        for (int i = 0; i < newArray.length; i++)
        System.out.print(newArray[i] + " ");

    }
}
