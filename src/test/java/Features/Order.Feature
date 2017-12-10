@Regression
Feature: Ordering Feature
  This feature deals with the bonds ordering on AAMLive

  @Regression
  Scenario: End to end Municipal Order
    Given I navigated to the Login Page
    And Logged in with valid username and password
    When I navigate to Municipal Search Page
    And I click on Search Button
    And I open the first displayed municipal trust
    And I click Place Order Button
    And I Fill in the order information
    | clearingAgent | accountType | receivedBy    | discrete  | solicited | orderReceivedTimeHr | orderReceivedTimeMin  | newAccountName  | newAccountNumber  | newAccountState |
    | Pershing      | Wrap        | Test User1    | Yes       | No        | 01                  | 05                    | TestAccount1    | 12354             | Alaska          |
    | Pershing      | Standard    | Test User2    | No        | No        | 04                  | 00                    | TestAccount2    | 12354678          | Florida         |
    And I click review button
    And I click submit order button
    Then Order should be placed successfully


  @Regression
  Scenario Outline: End to end Corporate Order
    Given I navigated to the Login Page
    And Logged in with valid username and password
    When I navigate to Corporate Search Page
    And I click on Search Button
    And I open the first displayed corporate trust
    And I click Place Order Button
    And I Fill in the order information with "<clearingAgent>" and "<accountType>" and "<receivedBy>" and "<discrete>" and "<solicited>" and "<orderReceivedTimeHr>" and "<orderReceivedTimeMin>" and "<newAccountName>" and "<newAccountNumber>" and "<newAccountState>"
    And I click review button
    And I click submit order button
    Then Order should be placed successfully
    Examples:
      | clearingAgent | accountType | receivedBy    | discrete  | solicited | orderReceivedTimeHr | orderReceivedTimeMin  | newAccountName  | newAccountNumber  | newAccountState |
      | Pershing      | Wrap        | Test User1    | Yes       | No        | 01                  | 05                    | TestAccount1    | 12354             | Alaska          |
      | Pershing      | Standard    | Test User2    | No        | No        | 04                  | 00                    | TestAccount2    | 12354678          | Florida         |