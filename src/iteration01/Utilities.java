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
		
		//FILEPATH FOR SCHOOL
		//String fileuser = "C:\\Users\\300281578\\eclipse-workspace\\Iteration01\\src\\iteration01\\usernames.txt";
		
		//FILEPATH FOR JONAH HOME
		String fileuser = "C:\\Temp\\Eclipse-2018-12 workspace\\Iteration01\\src\\iteration01\\usernames.txt";
		
		///Iteration01/src/iteration01/usernames.txt
		File nameListFile = new File(fileuser);
		String line = null;
		int nameLineNum = 0;
		try {
			FileInputStream fis = new FileInputStream(nameListFile);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			while((line = br.readLine()) != null)
			{
				nameLineNum++;
				System.out.println("UN# " + nameLineNum);
				if(username.equals(line))
				{
					user = true;
					break;
				}
				else {
					user = false;
				}
				
			}
			br.close(); 
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
		
		String filepassw = "C:\\Temp\\Eclipse-2018-12 workspace\\Iteration01\\src\\iteration01\\passwords.txt";
		String line1 = null;
		int passLineNum = 0;
		try {
			FileReader filereader1 = new FileReader(filepassw);
			BufferedReader bufferedreader1 = new BufferedReader(filereader1);
			while((line1 = bufferedreader1.readLine()) != null)
			{
				passLineNum++;
				System.out.println("PW# " + passLineNum);
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
	                filepassw + "'");                
	        }
	        catch(IOException ex) {
	            System.out.println(
	                "Error reading file '" 
	                + filepassw + "'");                  
	        }
		if(user == true && passw == true && nameLineNum == passLineNum)
		{
			success = true;	
		}
		return success;
	}
	
		public static void writeAccount(String fName, String pass) {
			//FILEPATH FOR JONAH HOME
			String fileuser = "C:\\Temp\\Eclipse-2018-12 workspace\\Iteration01\\src\\iteration01\\usernames.txt";
			
			///Iteration01/src/iteration01/usernames.txt
			File nameListFile = new File(fileuser);
			
			try {
				//true = appendfile instead of overwrite
				FileWriter fw = new FileWriter(nameListFile, true);
				PrintWriter pw = new PrintWriter(fw);
				
				pw.println(fName);
				System.out.println("New name entry " + fName);
				
				fw.close();
				pw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			//FILEPATH FOR JONAH HOME
			String filepassw = "C:\\Temp\\Eclipse-2018-12 workspace\\Iteration01\\src\\iteration01\\passwords.txt";
			
			///Iteration01/src/iteration01/usernames.txt
			File passListFile = new File(filepassw);
			
			try {
				//true = appendfile instead of overwrite
				FileWriter fw = new FileWriter(passListFile, true);
				PrintWriter pw = new PrintWriter(fw);
				
				pw.println(pass);
				System.out.println("New pass entry " + pass);
				
				fw.close();
				pw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
	
	

}
