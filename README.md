QA Analyst Automation Project

Overview

This project includes automated tests for a web application's form validation. It's structured for easy understanding and showcases the application of automation testing in QA.

Folder Structure
AssignmentDocs: Documents related to the QA Analyst Assignment.
drivers: Web drivers for Chrome and Firefox.
src/test/java: Java test scripts.

Technologies and Frameworks

Java 1.8: The programming language for test scripts.
Maven: Manages project dependencies and builds.
TestNG: The testing framework for organizing and running tests.
Selenium WebDriver: Automates actions in web browsers.
Eclipse IDE: Development environment for coding and test execution.

Dependencies

Dependencies are listed in pom.xml. Clone the repository and let Maven install the necessary dependencies.

This project requires TestNG version 7.0.0 or older (compatible with Java 1.8). To install a compatible TestNG version in Eclipse:

Click on 'Help' in the menu.
Choose 'Install New Software'.
Paste this link: https://testng.org/testng-eclipse-update-site/
Select a version that is 7.0.0 or older.

Running the Tests

Open the project in Eclipse.
Find testng.xml in the project root.
Right-click on testng.xml and choose 'Run As' -> 'TestNG Suite'.
TestNG Suite
Running testng.xml triggers two main test classes:

EmailValidationTest: Validates email formats.
ContactFormTest: Triggered by EmailValidationTest, it tests form functionality, such as field validation and response message accuracy.

