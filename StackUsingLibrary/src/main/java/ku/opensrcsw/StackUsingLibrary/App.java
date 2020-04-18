package ku.opensrcsw.StackUsingLibrary;
import java.util.Scanner;
import ku.opensrcsw.StackLibrary.Stack;

public class App 
{
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int n;
		int[] arr;
		
		Stack peopleStack = new Stack(80000);
		
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = scan.nextInt();
		
		for(int i = 0; i < n-1; i++) {
			for(int j = i+1; j < n; j++) {
				if(arr[i] > arr[j])
					peopleStack.doPush(j);
			}
		}
			
		System.out.println(peopleStack.getTop() - 1);
		long end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");
		
		scan.close();
	}
}
