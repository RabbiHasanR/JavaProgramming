package me.practise.stat;


public class Block {
	  static int num;
	   static String mystr;
	   static{
		   System.out.println("1");
	      num = 97;
	      mystr = "Static block 1";
	   }
	   static{
		   System.out.println("2");
		   num=98;
		   mystr="Static block 2";
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Value of num="+num);
	      System.out.println("Value of mystr="+mystr);

	}

}
