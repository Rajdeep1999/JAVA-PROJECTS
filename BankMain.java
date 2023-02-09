package LabTest2;

public class BankMain {
     
	public static void main(String[] args) 
	{
	    BankA A = new BankA();
	    BankB B = new BankB();
	    BankC C = new BankC();
        System.out.println("Bank Balance A: " +A.getbalance());
	    System.out.println("Bank Balance B: " +B.getbalance());
	    System.out.println("Bank Balance C: " +C.getbalance());
	}
}
