import c13_Methods.*;
public class c13_Methods {

	public static void main(String[] args) {
		/*Client client1=new Client();
		client1.name="Sara";
		client1.surname="Connor";
		System.out.println(client1.getFullName());
		
		Client client2=new Client();
		//client2.setFullName("Gil, Carlos");
		System.out.println(client2.name);
		System.out.println(client2.surname);
		*/
		Point p=new Point();
		p.x=10;
		p.y=30;
		System.out.println(p.x);
		System.out.println(p.y);
		
		p.incrementX();
		p.incrementY();
		System.out.println(p.x);
		System.out.println(p.y);
		
		
		
	}

}
