import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.NumberFormatException;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class HrDashboard {

	static Logger logger = LogManager.getLogger(HrDashboard.class);

	public void hrDashboard(String firstName, String lastName) {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		while (true) {// this loop iterate till the user choose to exit
			while (true) {// this loop will iterate till the choosen option matches mentioned options
							// below

				try {

					logger.info("-------*******----------********--------");
					logger.info("Choose the function");
					logger.info("1.Onboarding");
					logger.info("2.Promotion");
					logger.info("3.Demotion");
					logger.info("4.Location Transfer");
					logger.info("5.Department Transfer");
					logger.info("6.Termination");
					logger.info("7.Search by Id");
					logger.info("8.All Employee Details");
					logger.info("9.Rehire Employee");
					logger.info("10.Exit");

					Integer function = Integer.parseInt(bufferedReader.readLine());

					if (function > 0 && function < 11) {
						switch (function) {
						case 1:
							// calls the onboarding method of Onboarding
							Onboarding onboarding = new Onboarding();
							onboarding.onboarding();
							break;
						case 2:
							Promotion promotion = new Promotion();
							promotion.promotion();
							break;
						case 3:
							Demotion demotion = new Demotion();
							demotion.demotion();
							break;
						case 4:
							LocationTransfer locationTransfer = new LocationTransfer();
							locationTransfer.locationTransfer();
							break;
						case 5:
							DepartmentTransfer departmentTransfer = new DepartmentTransfer();
							departmentTransfer.departmentTransfer();
							break;
						case 6:
							Termination termination = new Termination();
							termination.termination();
							break;
						case 7:
							SearchEmployeeById searchEmployeeById = new SearchEmployeeById();
							searchEmployeeById.searchEmployeeById();
							break;
						case 8:

							DisplayAllEmployees displayAllEmployees = new DisplayAllEmployees();
							displayAllEmployees.displayAllEmployees();
							break;
						case 9:
							Rehire rehire = new Rehire();
							rehire.rehire();
							break;
						case 10:
							logger.info("Have a nice day " + firstName + " " + lastName);
							System.exit(0);
						}
					} else {

						logger.info("Please choose a valid option");

					}
				} catch (IOException iOException) {
					logger.info(iOException.getMessage());
				} catch (NumberFormatException numberFormatException) {
					logger.info("Please choose function as digit");

				}
			}

		}

	}
}