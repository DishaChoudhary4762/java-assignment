public class ex1
{
  public < E > void printArray (E[]s)
  {
    for (int i = 0; i < s.length; i++)
      {
	System.out.println (s[i]);
      }
  }
  public static void main (String args[])
  {
    ex1 e = new ex1 ();
    String[]s1 =
    {
    "john", "john"};
    e. < String > printArray (s1);
    Integer[]i =
    {
    1, 2, 3, 4};
    e. < Integer > printArray (i);
  }
}

