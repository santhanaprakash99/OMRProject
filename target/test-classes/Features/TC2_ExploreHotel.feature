@Explore
Feature: Verifying omrbranch.com Explore Hotel Details

  Scenario Outline: Verifying Search Hotel page with all fields entered
    Given User is on OMRBranch Login page
    When User enters the "<userName>" and "<password>"
    Then User should verifies the login success message after click login button "Welcome Santhana Prakash"
    When User search hotels "<stateName>","<cityName>","<roomType>","<checkInDate>","<checkOutDate>","<rooms>","<adults>" and "<children>"
    Then User should verify  select hotel sucess message after click search button "Select Hotel"

    Examples: 
      | userName                    | password   | stateName  | cityName | roomType | checkInDate | checkOutDate | rooms | adults | children |
      | santhanaprakash99@gmail.com | Greens@123 | Tamil Nadu | Chennai  | Standard | 2023-05-30  | 2023-05-31   | 1-One | 1-One  |        0 |

  Scenario Outline: Verifying Search Hotel page with only mandatory fields entered
    Given User is on OMRBranch Login page
    When User enters the "<userName>" and "<password>"
    Then User should verifies the login success message after click login button "Welcome Santhana Prakash"
    When User search hotels "<stateName>","<cityName>","<checkInDate>","<checkOutDate>","<rooms>" and "<adults>"
    Then User should verify  select hotel sucess message after click search button "Select Hotel"

    Examples: 
      | userName                    | password   | stateName  | cityName | checkInDate | checkOutDate | rooms | adults |
      | santhanaprakash99@gmail.com | Greens@123 | Tamil Nadu | Chennai  | 2023-05-30  | 2023-05-31   | 1-One | 1-One  |

  Scenario Outline: Verifying Error message in Search Hotel page without Enter any fields
    Given User is on OMRBranch Login page
    When User enters the "<userName>" and "<password>"
    Then User should verifies the login success message after click login button "Welcome Santhana Prakash"
    And User should verify error message after click search button "Please select state","Please select city","Please select Check-in date","Please select Check-out date","Please select no. of rooms" and "Please select no. of adults"

    Examples: 
      | userName                    | password   |
      | santhanaprakash99@gmail.com | Greens@123 |

  Scenario Outline: Verifying Search Hotel page with all fields entered and verify filter room type
    Given User is on OMRBranch Login page
    When User enters the "<userName>" and "<password>"
    Then User should verifies the login success message after click login button "Welcome Santhana Prakash"
    When User search hotels "<stateName>","<cityName>","<roomType>","<checkInDate>","<checkOutDate>","<rooms>","<adults>" and "<children>"
    Then User should verify  select hotel sucess message after click search button "Select Hotel"
    And User should verify same selected "<roomType>" filter is present

    Examples: 
      | userName                    | password   | stateName  | cityName | roomType                            | checkInDate | checkOutDate | rooms | adults | children |
      | santhanaprakash99@gmail.com | Greens@123 | Tamil Nadu | Chennai  | Standard/Deluxe/Suite/Luxury/Studio | 2023-05-30  | 2023-05-31   | 1-One | 1-One  |        0 |
