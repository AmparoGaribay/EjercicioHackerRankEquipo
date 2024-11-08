import java.util.*;
import java.io.*;

class solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();// cantidad de contactos a ingresar
		in.nextLine(); // lee la siguiente linea
		
		Map<String, Integer> contactos = new HashMap<String, Integer>();
		
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
			contactos.put(name, phone);
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
			Integer getNumber = contactos.get(s);
			if (getNumber!=null) {
				System.out.println(s+ "=" + getNumber);
			}else {
				System.out.println("Not found");
			}
		}
		
		in.close();
	}
}