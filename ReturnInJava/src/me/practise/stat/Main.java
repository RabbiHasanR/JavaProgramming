package me.practise.stat;

import me.practise.stat.Student.X;

public class Main {

	public static void main(String[] args) {
		//System.out.println(n+num);
		// TODO Auto-generated method stub
		/*Hello hello=new Hello();
		hello.age=10;
		System.out.println(Hello.DoSomething("Hi i am Rabbi")+hello.age);
		System.out.println(hello.DoSomethingElse("Hi i am Mahfuz"));*/
		Student s1=new Student();
		s1.setName("Rabbi");
		s1.setAge(20);
		System.out.println(s1.getNmae()+s1.getAge()+"  "+Student.NoOfStudent);
		Student s2=new Student();
		s2.setName("Rajon");
		s2.setAge(19);
		System.out.println(s2.getNmae()+s2.getAge()+"  "+Student.NoOfStudent);
		
		System.out.println(X.str);
		
		

	}

}
