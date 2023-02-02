package LabTest1;

public class ArrayOperationMain 
{
	public static void main(String[] args) 
	{
	    int[]iarr1 = {11,22,33,44,55,66,77,88,99,111};
	    int[]iarr2 = new int[iarr1.length/2];

	    ArrayOperation operations= new ArrayOperation();
	    int[]res= operations.add(iarr1,iarr2);

	    System.out.println("First array: ");
	    for(int n=0;n<iarr1.length;n++) 
	    {
	    System.out.print(iarr1[n]+" ");
	    }
	    System.out.println();
	    System.out.println("Second array: ");
	    for(int n=0;n<res.length;n++) 
	    {
	    System.out.print(res[n]+" ");
	    }
	}
}
