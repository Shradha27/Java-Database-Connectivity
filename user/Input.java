package user;
import java.util.Scanner;

public class Input {
    GetterSetter gs=new GetterSetter();
	void returninput()
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter username");
	   gs.setUsername(sc.next());
	   System.out.println("Enter password");
	   gs.setPassword(sc.next());
	   sc.close();
	}
	void returnoutput()
	{ 
		System.out.println("Username: "+gs.getUsername()+"\nPassword: "+gs.getPassword());
	}
}
