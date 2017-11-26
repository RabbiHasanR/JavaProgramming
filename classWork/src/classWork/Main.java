package classWork;
class Circle
{
int radius;
double area;
void setRadius(int r)
{
radius = r;
}



double calculateArea ( )
{

area = 3.14*radius*radius;
return area;
}

}


public class Main{
	
	  public static void main(String args[])
	  {
		  Circle myCircle = new Circle ( );
		  myCircle.setRadius(5);
		  myCircle.calculateArea ( );
		  System.out.println("Area is:"+myCircle.calculateArea ( ));
	}
	  }
	
