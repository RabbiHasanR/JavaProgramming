package com.practise.method;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Method1 m=new Method1();
		int number=90;
		System.out.println("Before passing value in mathod number is:"+number);
		m.display(number);
		System.out.println("After passing value in mathod number is:"+number);*/
		
		//Operation op=new Operation();
		//System.out.println("befor number is:"+op.num);
		//op.change(op);
		//System.out.println("after number is:"+op.num);
		
		Box b1=new Box(10,20);
		Box b2=new Box(20,30);
		Box b3=new Box(b1);
		Box b4=b3.duplicate();
		b1.display();
		b3.display();
		b2.display();
		b4.display();
		
		
		if(b1.isEqual(b2))
			System.out.println("Object are equal");
		else
			System.out.println("Object are not equal");
		
		if(Box.isTwoObject(b1, b3))
			System.out.println("Object are equal");
		else
			System.out.println("Object are not equal");

	}

}
