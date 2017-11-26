package me.mystudio.statickeyword;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstStatic fs=new FirstStatic();
		FirstStatic.age=10;
		System.out.println(FirstStatic.age);
		FirstStatic.doSomething("Hi JAS");
		fs.doSomethingElse("Rabbi hasan");
		FirstStatic fs1=new FirstStatic();
		FirstStatic.age=20;
		System.out.println(FirstStatic.age);
		
		/*FirstStatic fs1=new FirstStatic();
		FirstStatic fs2=new FirstStatic();*/

		

	}

}
