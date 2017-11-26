package com.method.practise;

import com.constructor.practise.CopyContructor;

public class MainOverloading {

	public static void main(String[] args) {
		/*ConstructorAndMathod t=new ConstructorAndMathod(6);
		t.info();
		t.info("method overloaded");
		new ConstructorAndMathod();*/
		CopyContructor cc=new CopyContructor(5,"Rabbi");
		//CopyContructor cc2=new CopyContructor(cc);
		CopyContructor cc2=new CopyContructor();
		cc2.id=cc.id;
		cc2.name=cc.name;
		cc.display();
		cc2.display();

	}

}
