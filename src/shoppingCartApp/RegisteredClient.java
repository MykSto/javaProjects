//inherits behavior from Client
package shoppingCartApp;

public class RegisteredClient extends Client {
	private int id;
	private String name;
	private String surname;
	
	public RegisteredClient (int ClientId, String ClientName, String ClientSurname){
		id = ClientId;
		name = ClientName;
		surname = ClientSurname;
	}
	
	public int getId (){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public String getSurname(){
		return surname;
	}
		
}
