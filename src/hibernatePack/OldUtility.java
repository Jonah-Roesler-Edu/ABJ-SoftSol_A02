package hibernatePack;
import java.io.*;

public class OldUtility {
	
	public static boolean verifyL(String username, String password) {
		boolean success = false;
		boolean user = false;
		boolean passw = false;
		if(username.equals("VIP")) {
			return success = true;
		}
		else {
			success = false;
		}
		
		//FILEPATH FOR SCHOOL
		//String fileuser = "C:\\Users\\300281578\\eclipse-workspace\\Iteration01\\src\\iteration01\\usernames.txt";
		
		//FILEPATH FOR JONAH HOME
		String fileuser = "C:\\Temp\\Eclipse-2018-12 workspace\\Iteration01\\src\\iteration01\\userData.txt";
		
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
				String[] lineArr = line.split(",");
				System.out.println(lineArr[0]);
				System.out.println(lineArr[1]);
				System.out.println("testy 01");
				nameLineNum++;
				System.out.println("LINE# " + nameLineNum);
				
				if(username.equals(lineArr[0]) && password.equals(lineArr[1]))
				{
					user = true;
					passw = true;
					break;
				}
				else {
					user = false;
					passw = false;
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
		
		//FILEPATH FOR JONAH HOME
		/*
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
		*/
		
		if(user == true && passw == true)
		{
			success = true;	
		}
//		else {
//			success = false;
//		}
		return success;
	}
	
		public static void writeAccount(String fName, String pass, String lName, String email) {
			//FILEPATH FOR JONAH HOME
			String fileuser = "C:\\Temp\\Eclipse-2018-12 workspace\\Iteration01\\src\\iteration01\\userData.txt";
			
			///Iteration01/src/iteration01/usernames.txt
			File nameListFile = new File(fileuser);
			
			try {
				//true = appendfile instead of overwrite
				FileWriter fw = new FileWriter(nameListFile, true);
				PrintWriter pw = new PrintWriter(fw);
				
				pw.println(fName + "," + pass + "," + lName + "," + email);
				System.out.println("New name entry " + fName);
				
				fw.close();
				pw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			//FILEPATH FOR JONAH HOME
			/*
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
			*/
			
		}
		
		public static String[] retrieveProfile(String username) {
			
			//FILEPATH FOR SCHOOL
			//String fileuser = "C:\\Users\\300281578\\eclipse-workspace\\Iteration01\\src\\iteration01\\userData.txt";
			
			//FILEPATH FOR JONAH HOME
			String fileuser = "C:\\Temp\\Eclipse-2018-12 workspace\\Iteration01\\src\\iteration01\\userData.txt";
			
			///Iteration01/src/iteration01/usernames.txt
			File nameListFile = new File(fileuser);
			String line = null;
			int nameLineNum = 0;
			
			//Data array
			String[] userData = new String[4];
			
			try {
				FileInputStream fis = new FileInputStream(nameListFile);
				InputStreamReader isr = new InputStreamReader(fis);
				BufferedReader br = new BufferedReader(isr);
				
				
				while((line = br.readLine()) != null)
				{
					String[] lineArr = line.split(",");
					System.out.println(lineArr[0]);
					nameLineNum++;
					System.out.println("LINE# " + nameLineNum);
					
					if(username.equals(lineArr[0]))
					{
						userData = lineArr;
						break;
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
			
			return userData;
			
		}
	
	
	

}
