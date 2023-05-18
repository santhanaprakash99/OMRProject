@Login
Feature: Verifying omrbranch.com login Details

  @Valid
  Scenario Outline: Verifying login with valid Credentials
    Given User is on OMRBranch Login page
    When User enters the "<userName>" and "<password>"
    Then User should verifies the login success message after click login button "Welcome Santhana Prakash"

    Examples: 
      | userName                    | password   |
      | santhanaprakash99@gmail.com | Greens@123 |

  Scenario Outline: Verifying login with valid Credentials using ENTER key
    Given User is on OMRBranch Login page
    When User enters the "<userName>" and "<password>" using Enter key
    Then User should verifies the login success message after click login button "Welcome Santhana Prakash"

    Examples: 
      | userName                    | password   |
      | santhanaprakash99@gmail.com | Greens@123 |

  Scenario Outline: Verifying login with Invalid Credentials
    Given User is on OMRBranch Login page
    When User enters the "<userName>" and "<password>"
    Then User should verifies the login Error message after click login button "Invalid Login details or Your Password might have expired"

    Examples: 
      | userName                    | password  |
      | santhanaprakash99@gmail.com | Hello@123 |
