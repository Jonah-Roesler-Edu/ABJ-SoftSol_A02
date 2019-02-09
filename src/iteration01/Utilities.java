package iteration01;

public class Utilities {
	
	public static boolean verifyL(String username, String password) {
		boolean success = false;
		if(username.equals("VIP")) {
			success = true;
		}
		else {
			success = false;
		}
		return success;
		
	}
	
	public static String ReadFile() {
		String fileData = "read file failure";
		
		return fileData;
	}
	
	

}
