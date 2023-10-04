public class LinearSearchExample
{
	public static int linearSearch(int[]arr,int key) {
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]==key){
	            return i;
	        }
	    }
	    return -1;
	}
	public static void main (Stringa[]){
	    nt a[] a1={10,20,30,50,70,90};
	    int key=50;
	    LinearSearchExample ob=new LinearSearchExample();
	    int i=ob.linearSearch(a1,key);
	    if(i==-1)
	    System.out.println("key not found");
	    else
	    System.out.println(key+" is found at index:"+i);
	    
	    }
}
	