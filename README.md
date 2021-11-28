#Employee monthly pay slip

Create a console application that given employee annual salary details outputs a monthly pay slip.
Attributes of the employee are:
• name
• annual salary
Attributes of the monthly pay slip are:
• name
• gross monthly income = annual salary / 12 (months)
• monthly income tax = (annual tax rate as provided below) / 12 (months)
• net monthly income = gross monthly income - income tax


The following annual tax rates apply:
Taxable income Tax on this income
$0 - $20,000 Nil $0
$20,001 - $40,000 10c for each $1 over $20,000
$40,001 - $80,000 20c for each $1 over $40,000
$80,001 - $180,000 30c for each $1 over $80,000
$180,001 and over 40c for each $1 over $180,000

#For example, for an employee with an annual salary of $60,000:#

gross monthly income
= 60,000 / 12
= 5,000

monthly income tax
= ((20,000 * 0) + ((40,000 - 20,000) * 0.1) + ((60,000 - 40,000) * 0.2)) / 12
= (0 + (20,000 * 0.1) + (20,000 * 0.2)) / 12
= (0 + 2,000 + 4,000) / 12
= 500

net monthly income
= 5,000 – 500
= 4,500

Here is example console input:

GenerateMonthlyPayslip "Mary Song" 60000

and example output:Monthly Payslip for: "Mary Song"
Gross Monthly Income: $5000
Monthly Income Tax: $500
Net Monthly Income: $4500

Build/Create JAR instructions
-------------------------------

## Getting Started
### Dependencies

1. JDK 8
2. Apache Maven 3.5.0

### Installing
#### Install JDK on Mac OS .
* Check if JDK has been Pre-installed<br />
  - Open a terminal and run the below command
    ```
    javac -version
    ```
  - If a JDK version number is returned, then JDK has been pre-installed, please skip next step.

* Downloading JDK <br />
  - Goto Java SE download site @ http://www.oracle.com/technetwork/java/javase/downloads/index.html.<br />
  - Choose the operationg platform and Downloaing the installer.<br />

* Install and verify your installation <br />
  - Double-click the downloaded Disk Image (DMG) file. Follow the screen instructions to install JDK/JRE <br />
  - To verify your installation, open a "Terminal" and issue these commands.<br />
  ```
  // Display the JDK version
  javac -version
  javac 1.x.x_xx

  // Display the JRE version
  java -version
  java version "1.x.x_xx"
  Java(TM) SE Runtime Environment (build 1.x.x_xx-xxx)
  Java HotSpot(TM) Client VM (build 22.1-b02, mixed mode, sharing)

  // Display the location of Java Compiler
  which javac
  /usr/bin/javac

  // Display the location of Java Runtime
  which java
  /usr/bin/java
  ```

#### Install Apache Maven
On mac<br/>
Please open a terminal and run the below commands.
```
brew install maven
```
On Ubuntu<br/>
```
 sudo apt-get install maven
```

#### Verification

Run command `mvn -version` to verify installation
```
Apache Maven 3.5.0 (ff8f5e7444045639af65f6095c62210b5713f426; 2017-04-04T05:39:06+10:00)
Maven home: /usr/local/Cellar/maven/3.5.0/libexec
Java version: 1.8.0_112, vendor: Oracle Corporation
Java home: /Library/Java/JavaVirtualMachines/jdk1.8.0_112.jdk/Contents/Home/jre
Default locale: en_AU, platform encoding: UTF-8
OS name: "mac os x", version: "10.12.4", arch: "x86_64", family: "mac"
```
Ensure JAVA_HOME environment variable is set and points to your JDK installation
* Check environment variable value

```
1. echo $JAVA_HOME
2. /Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home
```
* Adding to PATH

```
export PATH=/opt/apache-maven-3.5.0/bin:$PATH
```
## How to run and test the application.
### For compiling the application

 ```
 mvn compile
 ```
 ### For running the application
 - Run this command
 ```
  mvn exec:java
 ```
 ### For running the tests
 - Tests require JUnit and Mockito <br />
 - Run this command to test the application
 ```
 mvn test
 ```
