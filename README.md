QA Analyst Automation Project

**Overview**
This project is an automation testing suite developed to validate the functionality of the 'Date of Birth' field in a web application's contact form (http://webdriveruniversity.com/Contact-Us/contactus.html). The suite focuses on verifying field presence, mandatory nature, age restrictions, email validation, and overall form functionality.

Folder Structure
1. AssignmentDocs: Contains documents addressing the QA Analyst Assignment.
2. drivers: Web drivers essential for Chrome and Firefox browsers.
3. src/test/java: Java test scripts implementing the automation logic.

Manual Test Cases
The manual test cases are designed to validate the 'Date of Birth' field in the contact form. They cover various scenarios such as:
1. Verifying the presence and correct placement of the Date of Birth field.
2. Ensuring the field is mandatory and rejects submissions if left empty.
3. Validating correct handling of boundary values, like minimum and maximum ages.
4. Testing the field's response to different date formats, including invalid and future dates.
5. Assessing the form's behavior on various devices and browsers to ensure consistent functionality.
6. These tests ensure the robustness and reliability of the Date of Birth field in capturing and processing user input as per the business requirements.

Technologies and Frameworks
1. Java 1.8: The core programming language used for writing test scripts.
2. Maven: Dependency management and project build tool.
3. TestNG: Framework for organizing and executing tests in a systematic manner.
4. Selenium WebDriver: Automates browser actions to simulate user interactions.
5. Eclipse IDE: Integrated development environment used for developing and running tests.

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

1. EmailValidationTest: Validates email formats.
2. ContactFormTest: Triggered by EmailValidationTest, it tests form functionality, such as field validation and response message accuracy.

