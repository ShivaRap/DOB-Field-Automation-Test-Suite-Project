QA Analyst Automation Project

**Overview**
This project is an automation testing suite developed to validate the functionality of a web application's contact form. The focus is on verifying various aspects such as field presence, mandatory fields, age restrictions, and email validation based on specified test cases and automation of some scenarios. 

Folder Structure
1. AssignmentDocs: Contains documents addressing the QA Analyst Assignment.
2. drivers: Web drivers essential for Chrome and Firefox browsers.
3. src/test/java: Java test scripts implementing the automation logic.

Technologies and Frameworks
Java 1.8: The core programming language used for writing test scripts.
Maven: Dependency management and project build tool.
TestNG: Framework for organizing and executing tests in a systematic manner.
Selenium WebDriver: Automates browser actions to simulate user interactions.
Eclipse IDE: Integrated development environment used for developing and running tests.

Dependencies
All dependencies are managed in the pom.xml file. Simply clone the repository and let Maven handle the installations.
This project requires TestNG version 7.0.0 or older (compatible with Java 1.8). 
1. To install a compatible TestNG version in Eclipse:
2. Click on 'Help' in the menu.
3. Choose 'Install New Software'.
4. Paste this link: https://testng.org/testng-eclipse-update-site/7.0.0
5. click Add.. -> provide a name -> Finish

**Running the Tests**
1. Open the project in Eclipse.
2. Find testng.xml in the project root.
3. Right-click on testng.xml and choose 'Run As' -> 'TestNG Suite'.

Running testng.xml triggers two main test classes:

EmailValidationTest: Validates email formats.
 ContactFormTest: Triggered by EmailValidationTest, it tests form functionality, such as field validation and response message accuracy._

