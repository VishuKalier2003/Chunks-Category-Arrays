/* You are given an integer array arr of length n that represents a permutation of the integers in the range [0, n - 1]...
We split arr into some number of chunks (i.e., partitions), and individually sort each chunk. After concatenating them, the
result should equal the sorted array... Return the largest number of chunks we can make to sort the array...
* Eg 1 : Array = [4,3,2,1,0]                           Chunks = 1
* Eg 2 : Array = [1,0,2,3,4]                           Chunks = 4
*/
import java.util.*;
public class Chunks
{
      public int MaxChunksForArray(int[] nums)
      {
            if(nums.length == 1)    // If array has only one element (base condition)...
                  return 1;
            int chunks = 1;     // Declaring the chunk variable... //* Variable => O(1)
            for(int i = 0, j = 1; i < nums.length - 1; i++, j++)      //! Linear Search => O(N)
            {     // Two adjacent pointers for comparison...
                  if(nums[i] < nums[j])    // If the current element is lesser, we can make a separate chunk...
                        chunks++;
            }
            return chunks;    // Returning the number of Chunks...
      }
      public static void main(String args[])
      {
            Scanner sc = new Scanner(System.in);
            int x;
            System.out.print("Enter the number of elements : ");
            x = sc.nextInt();
            int nums[] = new int[x];
            for(int i = 0; i < nums.length; i++)
            {
                  System.out.print("Enter data : ");
                  nums[i] = sc.nextInt();
            }
            Chunks chunks = new Chunks();     // Object creation...
            int ch = chunks.MaxChunksForArray(nums);     // Function calling...
            System.out.println("The number of Maximum Chunks to make array sorted : "+ch);
            sc.close();
      }
}


//! Time Complexity - O(N)
//* Space Complexity - O(1)

/** //? DEDUCTIONS :-
 * ? Since every element is unique, there will be one point where the order is disrupted...
 * ? Before that point, the dsecendingly sorted can be considered as one chunk and the ascendingly sorted data as n chunks...
 * ? We can compare adjacent elements to check for order...
 */