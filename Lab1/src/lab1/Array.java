package lab1;

public class Array 
{
    public static void main(String[] args) 
    {
        int [] array = new int[] {1,2,3,4,5};
        int sum = 0 , smallest = array[0], largest = array[0];

        for(int i = 0; i<array.length; i++)
        {
            // Sum of all numbers in array
            sum = sum + array[i];

            // Largest number in array
            if(array[i]>largest)
                largest = array[i];
            
            // Smallest number in array
            else if(array[i] < smallest)
                smallest = array[i];      
        }

        System.out.println("Sum of all numbers in array is " + sum);

        System.out.println("Largest number in array is " + largest );
        
        System.out.println("Smallest number in array is " + smallest);
    }
}
