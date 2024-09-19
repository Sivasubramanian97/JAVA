package com.index;

public class InstanceVariable {
	public int  mul(int a,int b)
	{
		int multiple=a*b;
		return multiple;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=12;
		int num2=5;
		InstanceVariable obj=new InstanceVariable();
		int total=obj.mul(num1, num2);
		System.out.println("The value is : "+total);
		

}
}
