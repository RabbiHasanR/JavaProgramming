package riaz;

class Box {
	void volume ( int a,int b,int c){
	System.out.println("volume is"+a*b*c);
	}
	int volume1 (int a,int b,int c){
		return a*b*c;
	}
	
}

public class Main{
	  public static void main(String args[]){
	    
	    Box myBox=new Box();
	    myBox.volume(3,4,5);
	   myBox.volume1(2,3,5);
	    System.out.println( myBox.volume1(2,3,5));
	   
	  }
	}