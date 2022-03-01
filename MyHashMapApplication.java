import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class MyHashMapApplication 
{

	public static void main(String[] args) 
	{
		  HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
	        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1, 3, 5, 7, 9, 11));
	        Scanner input = new Scanner(System.in);

	        for (int i = 0; i < list.size(); i++) 
	        {
	            hashMap.put(i, list.get(i));
	        }

	        System.out.println("----------------------------------------");
	        System.out.println("----------------Question 1--------------");
	        System.out.print("Enter a number to be inserted: ");
	        int value = input.nextInt();

	        System.out.println("\nThe HashMap before: " + hashMap);
	        
	        System.out.println("\nThe HashMap after: ");
	        
	        System.out.println(addAndSort(hashMap, value));


	     
	        System.out.println("----------------------------------------");
	        System.out.println("----------------Question 3--------------");

	        HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
	        Random random = new Random();
	        for(int i =0; i < 500 ; i++){
	            hashMap1.put(i,random.nextInt(1000, 9999));
	        }
	        System.out.print("Enter a value to be searched: ");
	        int searchVal = input.nextInt();
	        System.out.println("The value is "+ findValue(hashMap1, searchVal));


	        input.close();

	}
	
	
	
	
    public static HashMap<Integer, Integer> addAndSort(HashMap<Integer, Integer> hashMap, int value) 
    {
    	// Add the value to the hashmap and sort
    	// Since insertion order is not maintained in hashmap, need to maintained the order.
        // Use bubble sort to achieve sorting

        hashMap.put(hashMap.size(), value);
        boolean sorted = false;
        
        while(!sorted)
        {
            sorted = true;
            for(int i = 1; i < hashMap.size(); i++)
            {
                if(hashMap.get(i) < hashMap.get(i - 1)){
                    hashMap = swap(hashMap, i, i - 1);
                    sorted = false;
                }
            }
        }
        
        return hashMap;
    }

    public static HashMap<Integer, Integer> swap (HashMap<Integer, Integer> hashMap, int element1, int element2) 
    {
    	// Create a temporary holder for element 2
    	// Swap the value of element 2 to element 1
    	// Swap the value of element 1 with element 2
        int tempHolder = hashMap.get(element2);
        hashMap.put(element2, hashMap.get(element1));
        hashMap.put(element1, tempHolder);
        return hashMap;
    }

    public static int findValue (HashMap<Integer, Integer> hashMap, int searchVal) 
    {
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) 
        {
            if (entry.getValue() == searchVal)
            {
                return entry.getKey();
            };
        }
        return -1;
    }

}
