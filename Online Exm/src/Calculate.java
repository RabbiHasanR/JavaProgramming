
public class Calculate {
	String name;
	int selary;
	
	Calculate(String name,int selary){
		this.name=name;
		this.selary=selary;
	}
	
	double enualSelary(){
		return selary*12;
	}

}
