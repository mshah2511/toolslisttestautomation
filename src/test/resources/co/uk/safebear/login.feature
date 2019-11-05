Feature: Login

  User Story:
  * In order to access all the user features
  I want to know if my login is successful

  Rules:
  * The user must be informed if the login information is incorrect
  * The user must be taken to My Profile page if the login is successful


  Scenario Outline: a registered user logs into the website
    Given I am a registered user with username "<username>"
    When I enter username "<username>" and "<password>"
    Then The user is sucessfully logged in
    Examples:
    | username                   | password
    | mishal.shah@somoglobal.com | London145
    | mishalshah_1@hotmail.com   | London145
    | mishalashah.01@gmail.com   | London145

