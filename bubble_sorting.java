import java.util.*;

public class bubble_sort
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("\t\t~~~Welcome toBingo_learnings!~~~\n\tThis is Bubble_sort in both fashion--by Ghosal_tuts ");
		Scanner sc = new Scanner(System.in);char ch;
		do
		{
			System.out.print("Enter the no of elements you want to sort: ");
			int n = sc.nextInt();
			System.out.println("Enter the elements-----");
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
			{
				System.out.printf("Element[%d]= ",i+1);
				arr[i]=sc.nextInt();
			}
			do
			{
				System.out.print("Enter in which type you want Ascending or Decending...?");
				Scanner sp = new Scanner(System.in);
				String c = sp.nextLine();
				switch(c)
				{
				case "Ascending":
					System.out.print("Ascending order output is: [ ");
					for (int i = 0; i < n-1; i++)
		            			for (int j = 0; j < n-i-1; j++)
		                			if (arr[j] > arr[j+1])
		                			{
		                    			// swap temp and arr[i]
		                    			int temp = arr[j];
		                    			arr[j] = arr[j+1];
		                    			arr[j+1] = temp;
		                			}
					 for (int i=0; i<n; ++i)
		            		{	System.out.print(arr[i] + ", "); Thread.sleep(500);} //application of thread to stop function
					System.out.println("]");
					break;
				case "Decending": 
					System.out.print("decending order output is: [ ");
					for (int i = 0; i < n-1; i++)
		                                for (int j = 0; j < n-i-1; j++)
		                                        if (arr[j] < arr[j+1])
		                                        {
		                                        // swap temp and arr[i]
		                                        int temp = arr[j];
		                                        arr[j] = arr[j+1];
		                                        arr[j+1] = temp;
		                                        }
		                         for (int i=0; i<n; ++i)
		                         {        System.out.print(arr[i] + ", "); Thread.sleep(500);}
					System.out.println("]");
					break;
				default:
					System.out.println("OoOw !you entered something another. Try again"); 
				}
				System.out.print("\nDo you want to continue with these elements(Type y or n) : ");

	               ch = sc.next().charAt(0); 
			}while (ch == 'Y'|| ch == 'y');
			System.out.print("\nType A for sort with new elements or D for whole exit(Type A or D) : ");
			ch = sc.next().charAt(0);
		}while(ch == 'A' || ch == 'a');
	}
}
