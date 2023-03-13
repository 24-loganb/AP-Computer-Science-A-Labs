public class Compact {

    //Takes an array of ints and returns a new array of ints with the zeroes removed.
    //Precondition: Array a is filled with ints.
    //Postcondition: The returned array is identical to a but has all the zeroes removed.
    public static int[] removeZeroes(int[] a)
    {
        int size = a.length;
        int count = 0;
        int index = 0;
        for (int i = 0; i < size; i++)
        {
            if (a[i] == 0)
            {
                count++;
            }
        }
        int[] b = new int[size - count];
        for (int i = 0; i < size; i++)
        {
                if (a[i] != 0)
                {
                    b[index] = a[i];
                    index++;
            }
        }
        return b;
    }
}