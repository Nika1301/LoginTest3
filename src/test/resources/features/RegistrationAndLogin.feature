Feature: Registration and Loogin

  Scenario: Registration and Loogin
    Given Navigate to sharelane.com
    When You've been navigate to it, click SignUp
    And Enter Zip code
    Then click Continue
    And Enter First Name
    And Enter Last Name
    And Enter Email
    And Enter Password
    And Enter Confirm Password
    Then click Register
    When You've been registered, click underlined here
    Then Enter logemail
    And Enter logpassword
    And Click LogIn
    Then You've been login in

