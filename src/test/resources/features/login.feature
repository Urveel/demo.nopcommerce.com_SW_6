
Feature: Login feature

  Scenario: User should navigate to login page successfully
    Given I am on homepage
    When Click on login link
    Then verify that "Welcome, Please Sign In!" message display

    Scenario: verifyTheErrorMessageWithInValidCredentials
      Given I am on homepage
      When Click on login link
      And Enter EmailId
      And Enter Password
      And Click on Login Button
      Then Verify that the Error message

  Scenario: verifyThatUserShouldLogInSuccessFullyWithValidCredentials
    Given I am on homepage
    When Click on login link
    And Enter EmailId
    And Enter Password
    And Click on Login Button
    Then Verify that LogOut link is display


  Scenario: VerifyThatUserShouldLogOutSuccessFully
    Given I am on homepage
    When Click on login link
    And Enter EmailId
    And Enter Password
    And Click on LogOut Link
    Then Verify that LogIn Link Display






