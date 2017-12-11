@Smoke
Feature: LoginFeature
  This feature deals with the login functionality of the application

  @Smoke
  Scenario: Login with correct username and password
    Given I navigated to the Home Page
    When I go to the login page from header
    And Enter valid username and password
    And I click on Login button
    Then I should be directed to private Home Page
    And My first name should be displayed at the header

  @Smoke
  Scenario: Login with invalid username and password
    Given I navigated to the Home Page
    When I go to the login page from header
    And Enter invalid username and password
    And I click on Login button
    Then Invalid username or password error message should be displayed
    And Error message text should be "Invalid Login Name or Password."
    But I shouldn't be directed to private Home Page

  @Smoke
  Scenario: Login with invalid email and password
    Given I navigated to the Home Page
    When I go to the login page from header
    And Enter invalid email and password
    And I click on Login button
    Then Invalid username or password error message should be displayed
    And Error message text should be "The email address as entered was not found in our system."
    But I shouldn't be directed to private Home Page