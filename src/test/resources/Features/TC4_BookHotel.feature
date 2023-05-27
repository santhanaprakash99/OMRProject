@BookHotel
Feature: Verifying omrbranch.com Book Hotel Details
  email

  @AllF
  Scenario Outline: Verifying Book Hotel including GST and select Debit card  or Credit card with special request
    Given User is on OMRBranch Login page
    When User enters the "<userName>" and "<password>"
    Then User should verifies the login success message after click login button "Welcome Santhana"
    When User search hotels "<stateName>","<cityName>","<roomType>","<checkInDate>","<checkOutDate>","<rooms>","<adults>" and "<children>"
    Then User should verify  select hotel sucess message after click search button "Select Hotel"
    And User select the first hotel continue button and save the Hotel Name,Price
    Then User should verify the book hotel success message "Book Hotel" after accept the alert message
    When User add guest details "<salutation>","<firstName>","<lastName>","<mobileNO>", "<email>" and User add the GST details "<regNo>","<companyName>" and "<companyAddress>"
    And User add special request "<request>"
    And User proceeds payment options "<cardType>"
      | CardType   | CardNo           | CardName        | Month     | Year | Cvv |
      | Visa       | 5555555555552222 | santhanaprakash | September | 2024 | 123 |
      | Amex       | 5555555555552222 | santhanaprakash | September | 2024 | 123 |
      | Mastercard | 5555555555552222 | santhanaprakash | September | 2024 | 123 |
      | Discover   | 5555555555552222 | santhanaprakash | September | 2024 | 123 |
      | Visa       | 5555555555552223 | santhanaprakash | September | 2024 | 123 |
      | Amex       | 5555555555552223 | santhanaprakash | September | 2024 | 123 |
      | Mastercard | 5555555555552223 | santhanaprakash | September | 2024 | 123 |
      | Discover   | 5555555555552223 | santhanaprakash | September | 2024 | 123 |
    Then User verify Booking sucess message "Booking is Confirmed" and save order id
    And User verify booked hotel is same as selected hotel

    Examples: 
      | userName                    | password   | stateName  | cityName | roomType | checkInDate | checkOutDate | rooms | adults | children | salutation | firstName | lastName | mobileNO   | email                       | regNo      | companyAddress | companyName            | cardType    | request            |
      | santhanaprakash99@gmail.com | Greens@123 | Tamil Nadu | Chennai  | Standard | 2023-05-30  | 2023-05-31   | 1-One | 1-One  |        0 | Mr.        | santhana  | prakash  | 9486063515 | santhanaprakash99@gmail.com | 9043592058 | Thoraipakkam   | Greens Tech OMR Branch | Debit Card  | Need Valet Parking |
      | santhanaprakash99@gmail.com | Greens@123 | Tamil Nadu | Chennai  | Standard | 2023-05-30  | 2023-05-31   | 1-One | 1-One  |        0 | Mr.        | santhana  | prakash  | 9486063515 | santhanaprakash99@gmail.com | 9043592058 | Thoraipakkam   | Greens Tech OMR Branch | Credit Card | Need Valet Parking |

  @Nor
  Scenario Outline: Verifying Book Hotel including GST and select Debit card or credit card without special request
    Given User is on OMRBranch Login page
    When User enters the "<userName>" and "<password>"
    Then User should verifies the login success message after click login button "Welcome Santhana"
    When User search hotels "<stateName>","<cityName>","<roomType>","<checkInDate>","<checkOutDate>","<rooms>","<adults>" and "<children>"
    Then User should verify  select hotel sucess message after click search button "Select Hotel"
    And User  select the first hotel continue button and save the Hotel Name,Price
    Then User should verify the book hotel success message "Book Hotel" after accept the alert message
    When User add guest details "<salutation>","<firstName>","<lastName>","<mobileNO>" and "<email>"
    And User add the GST details "<regNo>","<companyName>" and "<companyAddress>"
    And User proceeds payment options "<cardType>"
      | CardType   | CardNo           | CardName        | Month     | Year | Cvv |
      | Visa       | 5555555555552222 | santhanaprakash | September | 2024 | 123 |
      | Amex       | 5555555555552222 | santhanaprakash | September | 2024 | 123 |
      | Mastercard | 5555555555552222 | santhanaprakash | September | 2024 | 123 |
      | Discover   | 5555555555552222 | santhanaprakash | September | 2024 | 123 |
      | Visa       | 5555555555552223 | santhanaprakash | September | 2024 | 123 |
      | Amex       | 5555555555552223 | santhanaprakash | September | 2024 | 123 |
      | Mastercard | 5555555555552223 | santhanaprakash | September | 2024 | 123 |
      | Discover   | 5555555555552223 | santhanaprakash | September | 2024 | 123 |
    Then User verify Booking sucess message "Booking is Confirmed"and save the order id
    And User verify booked hotel is same as selected hotel

    Examples: 
      | userName                    | password   | stateName  | cityName | roomType | checkInDate | checkOutDate | rooms | adults | children | salutation | firstName | lastName | mobileNO   | email                       | regNo      | companyAddress | companyName            | cardType    |
      | santhanaprakash99@gmail.com | Greens@123 | Tamil Nadu | Chennai  | Standard | 2023-05-30  | 2023-05-31   | 1-One | 1-One  |        0 | Mr.        | santhana  | prakash  | 9486063515 | santhanaprakash99@gmail.com | 9043592058 | Thoraipakkam   | Greens Tech OMR Branch | Debit Card  |
      | santhanaprakash99@gmail.com | Greens@123 | Tamil Nadu | Chennai  | Standard | 2023-05-30  | 2023-05-31   | 1-One | 1-One  |        0 | Mr.        | santhana  | prakash  | 9486063515 | santhanaprakash99@gmail.com | 9043592058 | Thoraipakkam   | Greens Tech OMR Branch | Credit Card |

  @WOgst
  Scenario Outline: Verfying Book Hotel Without GST and select Debit card  with special request
    Given User is on OMRBranch Login page
    When User enters the "<userName>" and "<password>"
    Then User should verifies the login success message after click login button "Welcome Santhana"
    When User search hotels "<stateName>","<cityName>","<roomType>","<checkInDate>","<checkOutDate>","<rooms>","<adults>" and "<children>"
    Then User should verify  select hotel sucess message after click search button "Select Hotel"
    And User select the first hotel continue button and save the Hotel Name,Price
    Then User should verify the book hotel success message "Book Hotel" after accept the alert message
    When User add guest details "<salutation>","<firstName>","<lastName>","<mobileNO>" and "<email>"
    And User add special request "<request>"
    And User proceeds payment options "<cardType>"
      | CardType   | CardNo           | CardName        | Month     | Year | Cvv |
      | Visa       | 5555555555552222 | santhanaprakash | September | 2024 | 123 |
      | Amex       | 5555555555552222 | santhanaprakash | September | 2024 | 123 |
      | Mastercard | 5555555555552222 | santhanaprakash | September | 2024 | 123 |
      | Discover   | 5555555555552222 | santhanaprakash | September | 2024 | 123 |
    Then User verify Booking sucess message "Booking is Confirmed" and save the order id
    And User verify booked hotel is same as selected hotel

    Examples: 
      | userName                    | password   | stateName  | cityName | roomType | checkInDate | checkOutDate | rooms | adults | children | salutation | firstName | lastName | mobileNO   | email                       | cardType   | request            |
      | santhanaprakash99@gmail.com | Greens@123 | Tamil Nadu | Chennai  | Standard | 2023-05-30  | 2023-05-31   | 1-One | 1-One  |        0 | Mr.        | santhana  | prakash  | 9486063515 | santhanaprakash99@gmail.com | Debit Card | Need Valet Parking |

  Scenario Outline: Verifying Book Hotel Without GST and select Credit card  without special request
    Given User is on OMRBranch Login page
    When User enters the "<userName>" and "<password>"
    Then User should verifies the login success message after click login button "Welcome Santhana"
    When User search hotels "<stateName>","<cityName>","<roomType>","<checkInDate>","<checkOutDate>","<rooms>","<adults>" and "<children>"
    Then User should verify  select hotel sucess message after click search button "Select Hotel"
    And User select the first hotel continue button and save the Hotel Name,Price
    Then User should verify the book hotel success message "Book Hotel" after accept the alert message
    When User add guest details "<salutation>","<firstName>","<lastName>","<mobileNO>" and "<email>"
    And User proceeds payment options "<cardType>"
      | CardType   | CardNo           | CardName        | Month     | Year | Cvv |
      | Visa       | 5555555555552223 | santhanaprakash | September | 2024 | 123 |
      | Amex       | 5555555555552223 | santhanaprakash | September | 2024 | 123 |
      | Mastercard | 5555555555552223 | santhanaprakash | September | 2024 | 123 |
      | Discover   | 5555555555552223 | santhanaprakash | September | 2024 | 123 |
    Then User verify Booking sucess message "Booking is Confirmed" and save the order id
    And User verify booked hotel is same as selected hotel

    Examples: 
      | userName                    | password   | stateName  | cityName | roomType | checkInDate | checkOutDate | rooms | adults | children | salutation | firstName | lastName | mobileNO   | email                       | cardType    |
      | santhanaprakash99@gmail.com | Greens@123 | Tamil Nadu | Chennai  | Standard | 2023-05-30  | 2023-05-31   | 1-One | 1-One  |        0 | Mr.        | santhana  | prakash  | 9486063515 | santhanaprakash99@gmail.com | Credit Card |

  Scenario Outline: Verifying error message for without entering the Guest details
    Given User is on OMRBranch Login page
    When User enters the "<userName>" and "<password>"
    Then User should verifies the login success message after click login button "Welcome Santhana"
    When User search hotels "<stateName>","<cityName>","<roomType>","<checkInDate>","<checkOutDate>","<rooms>","<adults>" and "<children>"
    Then User should verify  select hotel sucess message after click search button "Select Hotel"
    And User select the first hotel continue button and save the Hotel Name,Price
    Then User should verify the book hotel success message "Book Hotel" after accept the alert message
    And User should verify error message for guest details after without entering the details "Let us know for whom you are booking the hotel","Please select Salutation of the user","Please provide First Name of the user","Please provide Last Name of the user","Please provide Contact Number of the user to ease the communication (if required)" and "Please provide Email ID of the user to ease the communication (if required)"

    Examples: 
      | userName                    | password   | stateName  | cityName | roomType | checkInDate | checkOutDate | rooms | adults | children |
      | santhanaprakash99@gmail.com | Greens@123 | Tamil Nadu | Chennai  | Standard | 2023-05-30  | 2023-05-31   | 1-One | 1-One  |        0 |
