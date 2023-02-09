package LabTest2;

interface Shape {
	  public void RecArea(int l,int b);
	  public void SqArea(int s);
	  public void CirArea(int r);
	  }
      public class ShapeArea implements Shape {
	  @Override
	  public void RecArea(int l,int b) 
	  {
	    System.out.println("Area of rectangle: "+(l*b));
	  }
	  @Override
	  public void SqArea(int s) 
	  {
	    System.out.println("Area of square: "+(s*s));
	  }
	  @Override
	  public void CirArea(int r) 
	  {
	    System.out.println("Area of circle: "+(Math.PI*r*r));
	  }
	}
      