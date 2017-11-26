
public class Employe {
	String name;
	int age;
	String position;
	double selary;
	
	Employe(){
		name="Delowar";
		age=25;
		position="Algorithm specalist";
		selary=30000.000;
	}
	Employe(String n,int a,String p,double s){
		name=n;
		age=a;
		position=p;
		selary=s;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public double getSelary() {
		return selary;
	}
	public void setSelary(double selary) {
		this.selary = selary;
	}
	
	public void printemploye(){
		System.out.println("Name"+":"+name);
		System.out.println("Age"+":"+age);
		System.out.println("Position"+":"+position);
		System.out.println("Selary"+":"+selary);
	}

}
