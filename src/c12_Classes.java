import c12_Classes.*;

public class c12_Classes {
	public static void main(String[] args) {		
		//For now, a class is a new kind of type (like string or int)
		
		//Client is a class
		//You can create an "instance" of a class using the "new" keyword
		Client client1=new Client();
		//I can access the "properties" of an instance using the "dot" operator
		client1.name="Jack";
		client1.surname="Sparrow";
	
		//Each instance has his own space in memory and can remember
		//different values
		Client client2=new Client();
		client2.name="Mickey";
		client2.surname="Mouse";

		
		//Let's imagine a Point a in a 2D Plane
		//These points has 2 coordinates: x & y
		//for this example we will use only integers to represent positions

		//This point is in the center of the chart (0,0)
        //We create a variable of type Point
		//to do this we use the "new" operator
        Point originPoint = new Point();
        originPoint.x = 0;
        originPoint.y = 0;

        //This point is at (3,0)
        Point p = originPoint;
        p.x = 3;

        //If we don't use the "new" operator, the variable
        //will have an special "null" value
        //It means variable notInitPoint has no valid value
        Point notInitPoint; //notInitPoint=null

        //if you use a variable that contains a null value,
        //it will throw an error
        //notInitPoint.x = 3; will throw an error

        //but... we can init the variable later...
        notInitPoint = new Point(); //now it has no null value
        //Question: if we don't put values in x and y
        //What value has x and y?

        //Let's represent a (2,-1) point in a plane with our Point class
        Point aPoint = new Point();
        aPoint.x = 2;
        aPoint.y = -1;

        //RECAP:
        //Object=an instance in execution of a class
        //"originPoint" and "aPoint" references 2 different instances
        //of the same class (the has same structure) but they hold
        //different data (values)
        
        //Class==is the schema, the mold, the cast, the shape... 
        //that is used to create the structure of the instances

	}

}
