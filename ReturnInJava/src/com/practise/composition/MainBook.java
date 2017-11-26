package com.practise.composition;

public class MainBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Author ath=new Author("Rabbi","jasrabbi50@gmail.com","Male");
		System.out.println(ath);
		Book dummybook=new Book("Java for beginner",ath,9.99,99);
		System.out.println(dummybook);
		dummybook.setPrice(8.88);
		dummybook.setQty(88);
		System.out.println(dummybook);
		System.out.println("Name is : "+dummybook.getName());
		System.out.println("Price is : "+dummybook.getPrice());
		System.out.println("Qty is : "+dummybook.getQty());
		System.out.println("Author is : "+dummybook.getAuthor());
		System.out.println("Author name is : "+dummybook.getAuthor().getName());
		System.out.println("Author email is : "+dummybook.getAuthor().getEmail());
		System.out.println("Author gender is : "+dummybook.getAuthor().getGender());
		
		Book moreNewDummy=new Book("Java for expert",new Author("Rony","rony40@gmail.com","Female"),7.77,77);
		System.out.println(moreNewDummy);

	}

}
