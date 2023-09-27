
/* wap a program to initialize the array */

public class Main
{
	public static void main(String[] args) {
	    int a[]= new int [10];
	    Scanner sc = new Scanner (System.in);
	    for (int i=0; i<a.length;i++)
	    {
		System.out.println("enter no");
		a[i]=sc.nextInt();
	    }
	}
}
