
public class Student8 {
	String name;
	int id;
	static String university="DIU";
	
	static void change(){
		university="Daffodil international university";
	}
	Student8(String n,int i){
		name=n;
		id=i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static String getUniversity() {
		return university;
	}
	public static void setUniversity(String university) {
		Student8.university = university;
	}
	public void display(){
		System.out.println(name+" "+id+" "+university);
	}

}
