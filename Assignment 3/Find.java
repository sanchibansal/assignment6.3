import java.util.*;
class Find
{
	public static void main( String args[])
{
	int n,i,j,z=0;
	System.out.println("enter number of array elements:");
	Scanner g=new Scanner(System.in); 		//scanner object is created
	n=g.nextInt();					//user input for number of array elements
	int arr[]= new int[n];	
	System.out.println("enter array elements:");
	for(i=0;i<n;i++)
{
	arr[i]=g.nextInt();				//assigning values in an array using for loop
}
	System.out.println("enter number:");
	j=g.nextInt();					//number to be found is entered
	for(i=0;i<n;i++)
{
	if(j==arr[i])
	{System.out.println("match found in "+(i+1)+" position");		//prints the position if the match is found
	z++;}
}
if(z==0)
System.out.println("no match.");			//else no match is printed


} 
}