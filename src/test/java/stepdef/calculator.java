package stepdef;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class calculator {
	private static final String Size = null;
	int num1, num2, result = 0;
	@Given("^user is providing two numbers \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_is_providing_two_numbers_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 System.out.println("user is providing two numbers " + arg1 +" "+ arg2);   
	//datatypes();
	 num1 = Integer.parseInt(arg1);
	 num2 = Integer.parseInt(arg2);
	}

	@Then("^\"([^\"]*)\" numbers$")
	public void numbers(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("perform the operation"+ " "+ arg1);
	    
	    if (arg1.equalsIgnoreCase("add")){
	    	result = num1+ num2;
	    }
	    else if (arg1.equalsIgnoreCase ("substract")){
	    	result = num1-num2;
	    }
	    else if (arg1.equalsIgnoreCase("multiply")){
	    	result = num1*num2;
	    }
	    else if (arg1.equalsIgnoreCase("devide")){
	    	result = num1/num2;
	    }
	    else if (arg1.equalsIgnoreCase("square")){
	    	result = num1*num1;
	    }
   	}

	@Then("^verify result is \"([^\"]*)\"$")
	public void verify_result_is(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
		
		assert Integer.parseInt(arg1)==result;
			
	}

	@Given("^user is providing a number \"([^\"]*)\"$")
	public void user_is_providing_a_number(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    num1 = Integer.parseInt(arg1);
		
		
	}
	
	
	public void datatypes(){
	/*
	 * This method is written to study datatypes 
		 */
      byte a = -128;
      short b = 0;   
      int c = 0;
      long d = 0;
      float e = 0;
      double f = 0;
      char g = '0';
      boolean h = false;
      
      a = 5;
      
      System.out.println("Variable a of type byte");
      System.out.println("Variable b of type short");
      System.out.println("Variable c of type int");
      System.out.println("Variable d of type long");
      System.out.println("Variable e of type float");
      System.out.println("Variable f of type double");
      System.out.println("Variable g of type char");
      System.out.println("Variable h of type boolean");	
		
      System.out.println("byte:" + Byte.MIN_VALUE +" " + Byte.MAX_VALUE + " " + Byte.SIZE + " " + Byte.BYTES);
      System.out.println("short" + Short.MIN_VALUE + " " + Short.MAX_VALUE + " " + Short.SIZE + " " + Short.BYTES);
      System.out.println("int" + Integer.MIN_VALUE + " " + Integer.MAX_VALUE + " " + Integer.SIZE + " " + Integer.BYTES);
      System.out.println("long" + Long.MIN_VALUE + " " + Long.MAX_VALUE + " " + Long.SIZE + " " + Long.BYTES);
      System.out.println("float" + Float.MIN_VALUE + " " + Float.MAX_VALUE + " " + Float.SIZE + " " + Float.BYTES);
      System.out.println("double" + Double.MIN_VALUE + " " + Double.MAX_VALUE + " " + Double.SIZE + " " + Double.BYTES);
      System.out.println("Character" + " " + Character.SIZE + " " + Character.BYTES);
      //System.out.println("" + " " + Character.SIZE + " " + Character.BYTES);
	}
	
}
	
