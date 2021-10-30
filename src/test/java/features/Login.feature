Feature: LoginFeatura
  This deals with login funcionality of the application

  Scenario: Login as correct username and password
    Given Inavigate to the login page
    And I enter the users email address as Email:admin
    And I verify the count of my address digits for R$ 1000
    And I enter the following for Login
      | username | password      |
      | admin    | adminpassword |
    And I click login button
    Then I should see the userform paga

  Scenario Outline: Login whith correct username and password
    Given Inavigate to the login page
    And I enter <username> and <password>
    And I click login button
    Then I should see the userform paga
    Examples:
      | username | password      |
      | execute  | automation    |
      | admin    | admin         |
      | admin    | adminpassword |
      | tester   | qa            |