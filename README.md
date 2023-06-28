#insider-selenium used tools: Java, Maven, Testng, Extent Reports, Log4j, Docker, Jenkins

I used Java and Testng for my test scripts, Extent Reports for reporting, Log4j for logging and Docker and Jenkins for running my test remotely.

For parallel running: You should change suiteXmlFile at pom.xml below of surefire plugin or you can directly run ParallelRun.xml file

You can change the browser from testng.xml files

Script for running project: mvn clean test