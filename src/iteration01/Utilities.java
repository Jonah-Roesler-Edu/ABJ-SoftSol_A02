package iteration01;
import java.io.*;

public class Utilities {
	
	public static boolean verifyL(String username, String password) {
		boolean success = false;
		boolean user = false;
		boolean passw = false;
		if(username.equals("VIP")) {
			success = true;
		}
		else {
			success = false;
		}
		
		
		String fileuser = "C:\\Users\\300281578\\eclipse-workspace\\Iteration01\\src\\iteration01\\usernames.txt";
		///Iteration01/src/iteration01/usernames.txt
		File nameListFile = new File(fileuser);
		String line = null;
		try {
			FileInputStream fis = new FileInputStream(nameListFile);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			while((line = br.readLine()) != null)
			{
				if(username.equals(line))
				{
					user = true;
					break;
				}
				else {
					user = false;
				}
			}br.close(); 
			isr.close();
			fis.close();
		}
		 catch(FileNotFoundException ex) {
	            System.out.println(
	                "Unable to open file '" + 
	                fileuser + "'");                
	        }
	        catch(IOException ex) {
	            System.out.println(
	                "Error reading file '" 
	                + fileuser + "'");                  
	        }
		
		/*String filepassw = "password.txt";
		String line1 = null;
		try {
			FileReader filereader1 = new FileReader(filepassw);
			BufferedReader bufferedreader1 = new BufferedReader(filereader1);
			while((line1 = bufferedreader1.readLine()) != null)
			{
				if(password.equals(line1))
				{
					passw = true;
					break;
				}
				else {
					passw = false;
				}
			}
		}
		 catch(FileNotFoundException ex) {
	            System.out.println(
	                "Unable to open file '" + 
	                fileuser + "'");                
	        }
	        catch(IOException ex) {
	            System.out.println(
	                "Error reading file '" 
	                + fileuser + "'");                  
	        }
		if(user == true && passw == true)
		{
			success = true;	
		}
		return success;
	}*/
		if(user == true)
		{
			success = true;
		}
		return success;
	}
	
	public static String ReadFile() {
		String fileData = "read file failure";
		
		
		
		
		
		return fileData;
	}
	
	
	

}
