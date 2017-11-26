
public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student rabbi=new Student();
		rabbi.setId(1);
		rabbi.setName("rabbi");
		rabbi.setAge(21);
		
		Student mahfus=new Student();
		mahfus.setId(2);
		mahfus.setName("mahfus");
		mahfus.setAge(40);
		
		System.out.println(rabbi.getName()+" "+"is"+" "+rabbi.getAge()+" "+"years old.");
		System.out.println(mahfus.getName()+" "+"is"+" "+mahfus.getAge()+" "+"years old.");

	}

}
