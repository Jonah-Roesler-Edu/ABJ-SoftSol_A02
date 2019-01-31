import javax.swing.JOptionPane;
public class HelloWorld {
	public static void main(String[] args)
	{
		
//		System.out.println("Hello World!");
//		System.out.println("Hello Alyssa Jia!");
//		System.out.println("Hello Jonah Roesler!");
		//Hello from Jonah 2019-01-30 4:46 PM
		
//		System.out.println("Hello Bogdan Bielka!");
		
		String message = new String();
		message = message + "Hello World!";
		message = message + "\n Hello Jonah Roesler!";
		message = message + "\n Hello Alyssa Jia!";
		
		JOptionPane.showMessageDialog(null, message, "Hello World App", JOptionPane.PLAIN_MESSAGE);
	}
}
