import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class LinkedListApplication {

	public static void main(String[] args) 
	{
        //Question 1
		System.out.println("----------------------------------------");
        System.out.println("----------------Question 1--------------");
		LinkedList<Integer> sortedList = new LinkedList<Integer>(Arrays.asList(1,3,5,7,9,11)); 
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter a number to be added into the linked list: ");
	    int value = input.nextInt();
	    System.out.println("The list before adding is " + sortedList);
	    addAndSort(sortedList, value);
	    System.out.println("The list after adding is " + sortedList);

	    
	    
	    System.out.println("----------------------------------------");
        System.out.println("----------------Question 2--------------");
	    LinkedList<Integer> swapList = new LinkedList<Integer>(Arrays.asList(1,3,5,7,9,11));
	    // Elements to swap
	    Scanner input2 = new Scanner(System.in);
	    Scanner input3 = new Scanner(System.in);
        System.out.println("Enter 2 number seperated by spaces to swap values: ");

	    int element1 = input2.nextInt(); 
	    int element2 = input3.nextInt();
	    System.out.println("The list before swapping is : " + swapList);
	    swap(swapList, element1, element2);
        System.out.println("The list after swapping is : " + swapList);
        
        System.out.println("----------------------------------------");
        System.out.println("----------------Question 3--------------");
        LinkedList<Integer> randomList = new LinkedList<Integer>();
        Random random = new Random();
        for(int i =0; i < 500 ; i++)
        {
            randomList.add(random.nextInt(1000, 9999));
        }
        System.out.print("Enter a value to be searched: ");
        int searchVal = input.nextInt();
        System.out.println("The value is "+ findValue(randomList, searchVal));
        



        input.close();

        
        
	}
	
	//Add and Sort Function
    public static void addAndSort(LinkedList<Integer> list, int value)
    {
    	// Compare the index with the added value
    	// if the added value is smaller, add the value to the current positions
    	// Else, add behind
        for(int i = 0; i < list.size(); i++){
            if(value < list.get(i)){
                list.add(i, value);
                return;
            }
        }
        list.add(value);
    }
	
	// Swap Function
    public static void swap(LinkedList<Integer> list,
                            int ele1, int ele2)
    {
 
        // Getting the positions of the elements
        int index1 = list.indexOf(ele1);
        int index2 = list.indexOf(ele2);
 
        // Check if the element is  present in the LinkedList
        if (index1 == -1 || index2 == -1) 
        {
            return;
        }
 
        // Swapping the elements
        list.set(index1, ele2);
        list.set(index2, ele1);
    }
    
    
  public static int findValue (LinkedList<Integer> list, int searchVal)
  {
        
        return list.indexOf(searchVal);
   }


}
