package c13_Methods;

public class Client {
	public String name;
	public String surname;
		
	//A function inside a Class is a "Method"
	//Methods normally use the "data" in the Class
	//Methods that gets data from the Class
	//usually are called "getters"
	public String getFullName() {
		String fullName=surname+", "+name;
		return fullName;
	}

	//Methods that sets "data" in the Class
	//are called "setters"
	public void setFullName(String fullName) {
		String[] parts=fullName.split(",");
		surname=parts[0].trim();
		name=parts[1].trim();
	}
	
	
}
