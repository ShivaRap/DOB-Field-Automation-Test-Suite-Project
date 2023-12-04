**QA Analyst Automation Project**

**Overview**
This project is an automation testing suite developed to validate the functionality of a web application's contact form. The focus is on verifying various aspects such as field presence, mandatory fields, age restrictions, and email validation based on specified test cases

**Folder Structure**
AssignmentDocs: Documents related to the QA Analyst Assignment.
drivers: Web drivers for Chrome and Firefox.
src/test/java: Java test scripts.

**Technologies and Frameworks**

Java 1.8: The programming language for test scripts.
Maven: Manages project dependencies and builds.
TestNG: The testing framework for organizing and running tests.
Selenium WebDriver: Automates actions in web browsers.
Eclipse IDE: Development environment for coding and test execution.

**Dependencies**

Dependencies are listed in pom.xml. Clone the repository and let Maven install the necessary dependencies.

This project requires TestNG version 7.0.0 or older (compatible with Java 1.8). To install a compatible TestNG version in Eclipse:

Click on 'Help' in the menu.
Choose 'Install New Software'.
Paste this link: https://testng.org/testng-eclipse-update-site/](https://testng.org/testng-eclipse-update-site/7.0.0)
click Add.. -> provide a name -> Finish

**Running the Tests**

Open the project in Eclipse.
Find testng.xml in the project root.
Right-click on testng.xml and choose 'Run As' -> 'TestNG Suite'.
Running testng.xml triggers two main test classes:

_EmailValidationTest: Validates email formats.
ContactFormTest: Triggered by EmailValidationTest, it tests form functionality, such as field validation and response message accuracy._

