Feature: Ordering Feature
  This feature deals with the bonds ordering on aamlive

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
    Then Municipal order should be placed successfully