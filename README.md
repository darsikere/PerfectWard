# PerfectWard

# Framework Description

1. Framework is created using typical page object pattern using page factory.

2. feature files are created in src/test/resources/features folder

3. in src/main/java there is a page object folder created which consists of different page classes like homepage and contact page

4. each page class contains elements and actions on page and elements are initialised using page factory

5. in src/main/java a StepDefinitions package folder is created with StepDefinition files generated using feature files

6. Hooks file is create in StepDefinitions files which consists of before and after scenarios

7. a test runner file shows the path for StepDefinitions and feature folder with options related to cucumber

8. TestBase class is created with some common functions around webdriver initialization and browsers that can be accessed

# Running Tests

If you have to change account section, you should change it in feature file steps
run mvn clean and mvn install from project root to build project
To run tests from features folder right click on scenario and select Run Scenario.
To run tests from command line navigate to project root in command prompt and run 'mvn test'.
to run particular scenarios use command mvn test -Dtest=TestRunner -Dcucumber.options="--tags @Testing"

# Test Results

html test report will be created in report folder under root and can be opened in any browser
