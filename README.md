**Validate - login as a registered and unregistered user**

This project contains automation testing to validate the login feature as a registered and unregistered user on https://webdriveruniversity.com/ using Selenium Java and the Behaviour Driven Development (BDD) method. The tools used are Cucumber, and I wrote using Gherkin for my scenario.

**Test Cases**

The following test cases were run:

![image](https://github.com/antonahmad-s/Portofolio-QA/assets/71451871/001de8fb-8da2-48af-8831-9c2bafc7e5b9)

![image](https://github.com/antonahmad-s/Portofolio-QA/assets/71451871/0f9fa406-0012-4831-9d87-c5101d3fabc6)

The script can be seen in the attached GitHub repository file. I created a separate page object that will be called in the script needed. Then, for the browser that is running, I have set parameters so that they can be adjusted for that browser.

**How to Run**

To run the automation test, I created a MainRunner class to make it easier to run the script; here's the MainRunner setup :
![image](https://github.com/antonahmad-s/Portofolio-QA/assets/71451871/a3e194f4-92ab-4929-a846-3490fe56213d)

In MainRunner, there is also a Cucumber Configuration to generate reports.

**Test Reports**

Automation tests were run using Cucumber, and the results can be seen in the following report:
  - Cucumber HTML Report
  - Cucumber JSON Report

From the report, it can be seen that:
  - The login scenario as a registered user was successfully run and passed
  - The login scenario for an unregistered user was also successfully run, and an error message was displayed as expected.

After the process is complete, the HTML report can be opened from target/cucumber.html and target/cucumber.json

The following is an example of a Report that has been generated:

**Report Passed**
![image](https://github.com/antonahmad-s/Portofolio-QA/assets/71451871/a1d3f645-dbc2-4979-ad74-cc94dd4c1cc1)


**Report Failed**
![image](https://github.com/antonahmad-s/Portofolio-QA/assets/71451871/a51c2fca-d556-4a84-bc35-b67ed9abc87e)

**References**

Some references used in this project:
  - Cucumber Documentation
  - Selenium Documentation
  - Udemy
    
This is the README for the Validate - login as a registered and unregistered user automation test result. Please read the report and files in the repository for more details. If you have any questions, please get in touch with me on Instagram (@antonahmad_s)
