package user;

public class MainProgram {

	public static void main(String[] args) {
		GetterSetter gs = new GetterSetter();
		gs.setUsername("Shradha");
		gs.setPassword("password");
		System.out.println("Username: "+gs.getUsername()+"\nPassword: "+gs.getPassword());
	}
}
