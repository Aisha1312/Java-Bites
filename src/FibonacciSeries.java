import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Take input from user
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the position you want to fetch");
				int n = sc.nextInt();
				
				Integer[] array = new Integer[n];
				
				int a=0;
				int b=1;
				
				array[0]=a;
				array[1]=b;
				
				for(int i=2;i<n;i++)
				{
					array[i]=array[i-1]+array[i-2];
				}
				
				System.out.println("The array is ");
				
				for(int i=0; i<=array.length-1;i++)
				{
					System.out.println(array[i]);
				}
				
				System.out.println("the element at position  " + n + "is" + array[n-1]);
				
				for(int i :array)
				{
					System.out.println(i);
				}
				System.out.println("the element at position  " + n + "is" + array[n-1]);
			}

	}

