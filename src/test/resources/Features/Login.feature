Feature: Login to SRK

  @ValidCredentials
  Scenario: Login with valid credentials

    Given User is on Home page
    When User enters username as "ppd"
    And User enters password as "srk1964"
    Then User should be able to login successfully
    Given User will be on Dashbaord page
      When user Registration page
      Then submit details



#  @InvalidCredentialsError
#    Scenario Outline: Login With Invalid Credentials
#      Given User will be on Homepage
#      When User enters Username as "<username_incorrect>"
#      And User enters Password as "<password_incorrect>"
#      Then User will get an error message from this " <username_incorrect>" and "<password_incorrect>"
#      Examples:
#      | username_incorrect | password_incorrect |
#      | admin              | admin123           |
#      | ADMIN              | ADMIN              |

#    @RegistrationPage
#    Scenario: Register User
#      Given User will be on Deshbordpage
#      When user Registration page
#      Then submit details

