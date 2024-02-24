import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InputValidation {
	
	
	static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	
	static Logger logger=LogManager.getLogger(InputValidation.class);

	public int employeeIdValidation() {

		while (true) {//this loop iterates till the given input is valid
			 
			

			try {

				logger.info("Enter Employee Id");
				// Receiving input from the user
				int employeeid = Integer.parseInt(bufferedReader.readLine());
				int max = Integer.MAX_VALUE;

				//this if block checks the given input is above zero 
				if (employeeid > 0 && employeeid < max) {

					//if the input is above zero the if block will execute and returns the value
					return employeeid;

				} else {

						//if the input is below zero this else block will execute along with the instrucions mentioned below
						logger.info("Please don't enter 0 as Employee Id");

				}//if the user gives input other than numbers NumberFormatException will occur this catch block hadles the exception
			} catch (NumberFormatException e) {
				logger.info("Enter digits as Employee Id");
			} catch (IOException e) {
				logger.info("An I/O error has occurred: " + e.getMessage());
			}

		}
	}

	public String employeeFirstNameValidation() {
		while (true) {//this loop iterates till the given input is valid
				

			try {
				logger.info("Enter First Name");
				// Receiving input from the user
				String employeeFirstName = bufferedReader.readLine();

				//Checking weather the input is empty or not
				if (employeeFirstName.isEmpty()) {
						//if the input is empty this block will execute with the instructions mentioned below
						logger.info("Please enter a valid First Name");
				} else {
					//if the input is not empty this block will execute and returns the value
					return employeeFirstName;
				}
			} catch (IOException e) {
				logger.info("An I/O error has occurred: " + e.getMessage());
			}

		}
	}

	public String employeeLastNameValidation() {
		while (true) {//this loop iterates till the given input is valid
				logger.info("Enter Last Name");
			
			try {
				// Receiving input from the user
				String employeeLastName = bufferedReader.readLine();	
				//Checking weather the input is empty or not
				if (employeeLastName.isEmpty()) {

						//if the input is empty this block executes and below messeage is displayed to the user
						logger.info("Please enter valid Last Name");

				} else {
						//if the input is not empty this block will execute and the input is returned
					return employeeLastName;
				}
			} catch (IOException e) {
				logger.info("An I/O error has occurred: " + e.getMessage());
				
			}

		}
	}

	public String employeeEmailValidation() {
				logger.info("Enter the Email");
		String mail="";
		try {
				// Receiving input from the user
			 mail = bufferedReader.readLine();
			String regexPattern = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
			boolean test1 = Pattern.matches(regexPattern, mail);
			// checking for validation
			if (test1 == true) { // if the given email is valid this block executes

				 return mail;

			} else { // if the given email is not valid this block executes

				while (true) { //this loop iterates till the given input is valid

						logger.info("Enter Valid Email such as email@example.com");

					try {
						// Receiving input from the user
						 mail = bufferedReader.readLine();

						String regexPattern1 = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
						boolean test = Pattern.matches(regexPattern1, mail);

						if (test == true) { // if the given email is valid this block executes and returns the email

							return mail;
						} 
					} catch (IOException e) {
						logger.info("An I/O error has occurred: " + e.getMessage());
						
					}
					
				}
			}
		} catch (IOException e1) {
			logger.info("An I/O error has occurred: " + e1.getMessage());
		}
		return mail;
		
		

	}

	public String employeeDesignationValidation() {

		while(true) {//this loop iterates till the given input is valid
			try {
				//instrucations to the user
				logger.info("choose the designation by selecting the given digit");
				logger.info("-----------------------");
				logger.info("1.IAM Engineer");
				logger.info("2.QA Engineer");
				logger.info("3.Senior IAM Engineer");
				logger.info("4.IAM Architect");
				logger.info("5.Assistant Manager");
				logger.info("6.Manager");
				logger.info("7.Senior Manager");
				logger.info("8.Account Manager");
				logger.info("9.Executive");
				logger.info("10.Senior Execuitve");
				logger.info("11.Associate Director");
			
			while(true) {//this loop iterates till the given input is valid digit
				//Receving the output from the user 
				int option = Integer.parseInt(bufferedReader.readLine());
				//this if condition will makesure that the given input is between the mentioned numbers
				if(option>=1&&option<=11) {
				String designtaion;
			//swith case returns the user choosen option which matches the case
			switch(option) {
				
			case 1: 
					return designtaion = "IAM Engineer";
			case 2:
					return designtaion = "QA Engineer";
			case 3:
					return designtaion = "Senior IAM Engineer";
			case 4:
					return designtaion ="IAM Architect";
			case 5:
					return designtaion ="Assistant Manager";
			case 6:
					return designtaion ="Manager";
			case 7:
					return designtaion ="Senior Manager";
			case 8:
					return designtaion ="Account Manager";
			case 9:
					return designtaion ="Executive";
			case 10:
					return designtaion ="Senior Execuitve";
			case 11:
					return designtaion ="Associate Director";
			}
				}else {
					//if the given input is not in the mentioned list this block will exute with the below instruction
					logger.info("Please select valid digits from given options");
				}
			
			}//if the user gives input other than numbers NumberFormatException will occur this catch block hadles the exception
			} catch (NumberFormatException e) {
				logger.info("Enter digits as input");
			} catch (IOException e) {
				logger.info("An I/O error has occurred: " + e.getMessage());
				
			}
			return null;
			}
	}

	public String employeeDepartmentValidation() {
		while(true) {//this loop iterates till the given input is valid
			try {
				//instrucations to the user
				logger.info("choose the department by selecting the given digit");
				logger.info("-----------------------");
				logger.info("1.HR");
				logger.info("2.Finance");
				logger.info("3.Sales and Marketing");
				logger.info("4.Tech");
			 
			
			while(true) {//this loop iterates till the given input is valid digit
			int option = Integer.parseInt(bufferedReader.readLine());

				//this if condition will makesure that the given input is between the mentioned numbers
				if(option>=1&&option<=4) {

				String department;

			//swith case returns the user choosen option which matches the case
			switch(option) {
				
			case 1: 
				return department = "HR";
			case 2:
				return department = "Finance";
			case 3:
				return department = "Sales and Marketing";
			case 4:
				return department ="Tech";
			
			}
				}else {
					logger.info("Please select valid digits from given options");
				}
			
			}//if the user gives input other than numbers NumberFormatException will occur this catch block hadles the exception
			} catch (NumberFormatException e) {
				logger.info("Enter digits as input");
			} catch (IOException e) {
				logger.info("An I/O error has occurred: " + e.getMessage());
				
			}
			return null;
			}
	}

	public String employeeLocationValidation() {
		
		while (true) {//this loop iterates till the given input is valid
			try {
				logger.info("Enter Location");
				String employeeLocation = bufferedReader.readLine();
				//Checking weather the input is empty or not
				if (employeeLocation.isEmpty()) {
					logger.info("Please enter valid Location");
				} else {
					
					return employeeLocation;
				}
			} catch (IOException e) {
				logger.info("An I/O error has occurred: " + e.getMessage());
				
			}
			
		}
	}

	public Double employeeSalaryValidation() {
		logger.info("Enter the Salary");
		while (true) {//this loop iterates till the given input is valid
			 
			try {
				Double employeeSalary = Double.parseDouble(bufferedReader.readLine());
				Integer range = Integer.MAX_VALUE;
				if (employeeSalary > 0 && employeeSalary < range) {
					return employeeSalary;
				} else {
					logger.info("Please do not enter 0 as Salary");
				}
			} catch (NumberFormatException e) {
				logger.info("Please enter Salary in digits");
				
			} catch (IOException e) {
				logger.info("An I/O error has occurred: " + e.getMessage());
				
			}
			
		}
	}

	public String employeeDateValidation() {
		logger.info("Enter Date of joining");
		while (true) {//this loop iterates till the given input is valid
			
			String employeeDateOfJoining;
			try {
				employeeDateOfJoining = bufferedReader.readLine();
				//Checking weather the input is empty or not
				if (employeeDateOfJoining.isEmpty()) {
					logger.info("Please enter valid Date");
				} else {
				 return	employeeDateOfJoining;
				}
			} catch (IOException e) {
				logger.info("An I/O error has occurred: " + e.getMessage());
			}
			
		}
	}

	public String employeePasswordValidation() {
		logger.info("Enter password");
		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
		String password="";
		try {
			// Receiving input from the user
			password = bufferedReader.readLine();
		
			boolean pas = Pattern.matches(regex, password);
			if (pas == true) {
				return password;
			} else {
				while (true) {//this loop iterates till the given input is valid

					logger.info("The longer, the better. Use a mixture of uppercase letters, lowercase letters, and numbers a minimum of 8 characters long");
					String regex1 = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
					// Receiving input from the user
					password = bufferedReader.readLine();
					boolean pas1 = Pattern.matches(regex1, password);
					if (pas1 == true) {
					return password;
					}
				}
		}
	
		} catch (IOException e) {
		logger.info("An I/O error has occurred: " + e.getMessage());
		}
		return password;
	}

}
