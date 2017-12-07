Feature: LoginFeature
  This feature deals with the login functionality of the application

  @Smoke @Regression
  Scenario: Login with correct username and password
    Given I navigated to the Home Page
    When I go to the login page from header
    And Enter valid username and password
    And I click on Login button
    Then I should be directed to private Home Page
    And My first name should be displayed at the header