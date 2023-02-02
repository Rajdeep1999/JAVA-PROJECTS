package LabTest1;

public class ArrayOperation 
{
	public int[]add(int[]iarr1,int[]iarr2)
	{
	   int k= 0;
	   for(int n=0;n<iarr1.length;n+=2)
	   {
	   iarr2[k++]=iarr1[n];
	   }
	   return iarr2;
	}
}