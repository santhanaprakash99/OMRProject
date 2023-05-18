@SelectHotel
Feature: Verifying omrbranch.com Select Hotel Details

  Scenario Outline: Verifying Select Hotel and Book Hotel page after accepting the alert message
    Given User is on OMRBranch Login page
    When User enters the "<userName>" and "<password>"
    Then User should verifies the login success message after click login button "Welcome Santhana Prakash"
    When User search hotels "<stateName>","<cityName>","<roomType>","<checkInDate>","<checkOutDate>","<rooms>","<adults>" and "<children>"
    Then User should verify  select hotel sucess message after click search button "Select Hotel"
    And User select the first hotel continue button and save the Hotel Name,Price
    And User should verify the book hotel success message  "Book Hotel" afte accept the alert message

    Examples: 
      | userName                    | password   | stateName  | cityName | roomType | checkInDate | checkOutDate | rooms | adults | children |
      | santhanaprakash99@gmail.com | Greens@123 | Tamil Nadu | Chennai  | Standard | 2023-05-30  | 2023-05-31   | 1-One | 1-One  |        0 |

  Scenario Outline: Verifying Select Hotel after dismiss the alert message verify it navigate in the same page
    Given User is on OMRBranch Login page
    When User enters the "<userName>" and "<password>"
    Then User should verifies the login success message after click login button "Welcome Santhana Prakash"
    When User search hotels "<stateName>","<cityName>","<roomType>","<checkInDate>","<checkOutDate>","<rooms>","<adults>" and "<children>"
    Then User should verify  select hotel sucess message after click search button "Select Hotel"
    And User select the first hotel click continue button and save the Hotel Name,Price
    Then User verify the Select hotel success message after  and dismiss the alert message "Select Hotel"

    Examples: 
      | userName                    | password   | stateName  | cityName | roomType | checkInDate | checkOutDate | rooms | adults | children |
      | santhanaprakash99@gmail.com | Greens@123 | Tamil Nadu | Chennai  | Standard | 2023-05-30  | 2023-05-31   | 1-One | 1-One  |        0 |

  Scenario Outline: Verifying sorting functionality on prices low to high in select Hotel page
    Given User is on OMRBranch Login page
    When User enters the "<userName>" and "<password>"
    Then User should verifies the login success message after click login button "Welcome Santhana Prakash"
    When User search hotels "<stateName>","<cityName>","<roomType>","<checkInDate>","<checkOutDate>","<rooms>","<adults>" and "<children>"
    Then User should verify  select hotel sucess message after click search button "Select Hotel"
    And User should verify the prices  are in ascending order after click the price low to high radiobutton

    Examples: 
      | userName                    | password   | stateName  | cityName | roomType | checkInDate | checkOutDate | rooms | adults | children |
      | santhanaprakash99@gmail.com | Greens@123 | Tamil Nadu | Chennai  | Standard | 2023-05-30  | 2023-05-31   | 1-One | 1-One  |        0 |

  Scenario Outline: Verifying sorting functionality on prices high to low in select Hotel page
    Given User is on OMRBranch Login page
    When User enters the "<userName>" and "<password>"
    Then User should verifies the login success message after click login button "Welcome Santhana Prakash"
    When User search hotels "<stateName>","<cityName>","<roomType>","<checkInDate>","<checkOutDate>","<rooms>","<adults>" and "<children>"
    Then User should verify  select hotel sucess message after click search button "Select Hotel"
    And User should verify the prices  are in descending order after click the price high to low radiobutton

    Examples: 
      | userName                    | password   | stateName  | cityName | roomType | checkInDate | checkOutDate | rooms | adults | children |
      | santhanaprakash99@gmail.com | Greens@123 | Tamil Nadu | Chennai  | Standard | 2023-05-30  | 2023-05-31   | 1-One | 1-One  |        0 |

  Scenario Outline: Verifying same Room type filter is selected in Select Hotel page
    Given User is on OMRBranch Login page
    When User enters the "<userName>" and "<password>"
    Then User should verifies the login success message after click login button "Welcome Santhana Prakash"
    When User search hotels "<stateName>","<cityName>","<roomType>","<checkInDate>","<checkOutDate>","<rooms>","<adults>" and "<children>"
    Then User should verify  select hotel sucess message after click search button "Select Hotel"
    And User should verify the all the hotels names are ends with the same selected "<roomType>" filter

    Examples: 
      | userName                    | password   | stateName  | cityName | roomType | checkInDate | checkOutDate | rooms | adults | children |
      | santhanaprakash99@gmail.com | Greens@123 | Tamil Nadu | Chennai  | Standard | 2023-05-30  | 2023-05-31   | 1-One | 1-One  |        0 |
