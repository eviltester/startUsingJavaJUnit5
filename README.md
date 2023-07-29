# Start Using Java JUnit5

[![build status](https://github.com/eviltester/startUsingJavaJUnit5/actions/workflows/build.yml/badge.svg)](https://github.com/eviltester/startUsingJavaJUnit5/actions)

Basic setup for an up to date java maven project with Junit 5.

This project demonstrates:

- Maven Setup
- JUnit execution
- Jacoco Test Coverage Report Generation

Requirements:

- Install Java JDK (SDK) (anything above v 1.9)
- Install maven

## Pre-requisite Install Instructions

Install instructions can be found in `speedrun_install_java_checklist.md`

Read the [Speedrun Install Java Checklist](https://github.com/eviltester/startUsingJavaJUnit5/blob/master/speedrun_install_java_checklist.md)
for more details.

## Usage

In the root folder where the `pom.xml` resides, type:

~~~~~~~~
mvn test
~~~~~~~~

And you should see something like:

~~~~~~~~
[INFO] Scanning for projects...
[INFO]
[INFO] --------------< uk.co.compendiumdev:startusingjavajunit5 >--------------
[INFO] Building startusingjavajunit5 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------

[INFO]

... blah blah blah ...

[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running co.compendiumdev.junit.MyFirstTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.068 s - in co.compendiumdev.junit.MyFirstTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] --- jacoco:0.8.10:report (report) @ startusingjavajunit5 ---
[INFO] Loading execution data file /../startUsingJavaJUnit5/target/jacoco.exec
[INFO] Analyzed bundle 'startusingjavajunit5' with 1 classes
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.150 s
[INFO] Finished at: 2023-07-29T11:02:19+01:00
[INFO] ------------------------------------------------------------------------
~~~~~~~~

If you see the `BUILD SUCCESS` then everything has installed properly.

In the `/target/site/jacoco/` folder the `index.hmtl` file should have the JUnit execution and coverage report.

## About

Author: [Alan Richardson](https://www.linkedin.com/in/eviltester/)

* [EvilTester.com](https://eviltester.com)
* [Compendium Developments](https://compendiumdev.co.uk)

- [A Java JUnit 4 version of this project is available](https://github.com/eviltester/startUsingJavaJUnit)
    - [github.com/eviltester/startUsingJavaJUnit](https://github.com/eviltester/startUsingJavaJUnit)