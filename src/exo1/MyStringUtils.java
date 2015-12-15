package exo1;

public class MyStringUtils {

	private String teststring;

	public String getTeststring() {
		return teststring;
	}

	public void setTeststring(String teststring) {
		this.teststring = teststring;
	}
	
	public boolean isNullOrEmpty(){	
		if(teststring != null)
			return teststring.isEmpty();
		else
			return true;		
	}
	
}
