package lab3_3b;

public class Circle {
   private double radius;

     public Circle(double radius)
     {
    	 this.radius=radius;
     }
     public double computeArea()
     {
    	 return Math.PI*radius*radius;
     }
 public double getRadius() {
	return radius;
}

//public void setRadius(double radius) {
//	this.radius = radius;
//}
   
}
