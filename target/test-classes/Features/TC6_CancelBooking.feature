@Cancel
Feature: Verifying omrbranch.com Cancel Booking Details

  Scenario Outline: cancel the generated Order  Id
    Given User is on OMRBranch Login page
    When User enters the "<userName>" and "<password>"
    Then User should verifies the login success message after click login button "Welcome Santhana Prakash"
    When User search hotels "<stateName>","<cityName>","<roomType>","<checkInDate>","<checkOutDate>","<rooms>","<adults>" and "<children>"
    Then User should verify  select hotel success message after click search button "Select Hotel"
    And User select the first hotel continue button and save the Hotel Name,Price
    Then User should verify the book hotel success message "Book Hotel" after accept the alert message
    When User add guest details "<salutation>","<firstName>","<lastName>","<mobileNO>" and "<email>"
    And User add the GST details "<regNo>","<companyName>" and "<companyAddress>"
    And User add special request "<request>"
    And User proceeds payment options "<cardType>"
      | CardType          | CardNo           | CardName        | Year  | Month | Cvv |
      | Debit visa        | 5555555555552222 | santhanaprakash | April |  2025 | 123 |
      | Debit Amex        | 5555555555552222 | santhanaprakash | April |  2025 | 123 |
      | Debit Mastercard  | 5555555555552222 | santhanaprakash | April |  2025 | 123 |
      | Debit Discover    | 5555555555552222 | santhanaprakash | April |  2025 | 123 |
      | Credit visa       | 5555555555552223 | santhanaprakash | April |  2025 | 123 |
      | Credit Amex       | 5555555555552223 | santhanaprakash | April |  2025 | 123 |
      | Credit Mastercard | 5555555555552223 | santhanaprakash | April |  2025 | 123 |
      | Credit Discover   | 5555555555552223 | santhanaprakash | April |  2025 | 123 |
    Then User should verify Booking success message "Booking is Confirmed" and save order id
    And User should verify booked hotel is same as selected hotel
    When User navigate to my booking page
    Then User should verify the booking message "Bookings"
    When User enter the generated order id
    Then User should verfiy the same Hotel Name is presented
    And User should verify the same price is presented
    And User should verify the  same order id is presented
    When User cancel the generated order id
    Then User should verify the success message "Your booking cancelled successfully"

    Examples: 
      | userName                    | password   | stateName  | cityName | roomType | checkInDate | checkOutDate | rooms | adults | children | salutation | firstName | lastName | mobileNO   | email                       | regNo      | companyName  | companyAddress         | cardType    | request            |
      | santhanaprakash99@gmail.com | Greens@123 | Tamil Nadu | Chennai  | Standard | 2023-05- 25 | 2023-05-31   | 1-One | 1-One  |        0 | Mr.        | santhana  | prakash  | 9486063515 | santhanaprakash99@gmail.com | 9043592058 | Thoraipakkam | Greens Tech OMR Branch | Debit Card  | Need Valet Parking |
      | santhanaprakash99@gmail.com | Greens@123 | Tamil Nadu | Chennai  | Standard | 2023-05- 25 | 2023-05-31   | 1-One | 1-One  |        0 | Mr.        | santhana  | prakash  | 9486063515 | santhanaprakash99@gmail.com | 9043592058 | Thoraipakkam | Greens Tech OMR Branch | Credit Card | Need Valet Parking |

  Scenario Outline: cancel the  existing Order  Id
    Given User is on OMRBranch Login page
    When User enters the "<userName>" and "<password>"
    Then User should verifies the login success message after click login button "Welcome Santhana Prakash"
    When User navigate to my booking page
    Then User should verify the booking message "Bookings"
    When User enter the existing "<orderId>"
    Then User should verify the  same order id is presented
    And User cancel  the existing order id
    Then User should verify the sucess message "Your booking cancelled successfully"

    Examples: 
      | userName                    | password   | orderId    |
      | santhanaprakash99@gmail.com | Greens@123 | MWFPA13078 |

  Scenario Outline: cancel the first Order  Id
    Given User is on OMRBranch Login page
    When User enters the "<userName>" and "<password>"
    Then User should verifies the login success message after click login button "Welcome Santhana Prakash"
    When User navigate to my booking page
    Then User should verify the booking message "Bookings"
    And User cancel the first available order id
    Then User should verify the sucess message "Your booking cancelled successfully"

    Examples: 
      | userName                    | password   |
      | santhanaprakash99@gmail.com | Greens@123 |

  Scenario Outline: Edit and cancel the generated Order  Id
    Given User is on OMRBranch Login page
    When User enters the "<userName>" and "<password>"
    Then User should verifies the login success message after click login button "Welcome Santhana Prakash"
    When User search hotels "<stateName>","<cityName>","<roomType>","<checkInDate>","<checkOutDate>","<rooms>","<adults>" and "<children>"
    Then User should verify  select hotel sucess message after click search button "Select Hotel"
    And User select the first hotel continue button and save the Hotel Name,Price
    Then User should verify the book hotel success message  "Book Hotel"  after  accept the alert message
    When User add guest details "<salutation>","<firstName>","<lastName>","<mobileNO>" and "<email>"
    And User add the GST details "<regNo>","<companyName>" and "<companyAddress>"
    And User add special request "<request>"
    And User proceeds payment options "<cardType>"
      | CardType          | CardNo           | CardName        | Year  | Month | Cvv |
      | Debit visa        | 5555555555552222 | santhanaprakash | April |  2025 | 123 |
      | Debit Amex        | 5555555555552222 | santhanaprakash | April |  2025 | 123 |
      | Debit Mastercard  | 5555555555552222 | santhanaprakash | April |  2025 | 123 |
      | Debit Discover    | 5555555555552222 | santhanaprakash | April |  2025 | 123 |
      | Credit visa       | 5555555555552223 | santhanaprakash | April |  2025 | 123 |
      | Credit Amex       | 5555555555552223 | santhanaprakash | April |  2025 | 123 |
      | Credit Mastercard | 5555555555552223 | santhanaprakash | April |  2025 | 123 |
      | Credit Discover   | 5555555555552223 | santhanaprakash | April |  2025 | 123 |
    Then User should verify Booking sucess message "Booking is Confirmed" and save order id
    And User should verify booked hotel is same as selected hotel
    When User navigate to my booking page
    Then User should verify the booking message "Bookings"
    When User enter the generated order id
    Then User should verfiy the same Hotel Name is presented
    And User should verify the same price is presented
    And User should verify the  same order id is presented
    When User edit the generated order checkin date "<cDate>"
    Then User should verify the success message "Booking updated sucessfully" after click the confirm button
    When User cancel the generated order id
    Then User should verify the success message "Your booking cancelled successfully"

    Examples: 
      | userName                    | password   | stateName  | cityName | roomType | checkInDate | checkOutDate | rooms | adults | children | salutation | firstName | lastName | mobileNO   | email                       | regNo      | companyName  | companyAddress         | cardType    | cDate       | request            |
      | santhanaprakash99@gmail.com | Greens@123 | Tamil Nadu | Chennai  | Standard | 2023-05- 25 | 2023-05-31   | 1-One | 1-One  |        0 | Mr.        | santhana  | prakash  | 9486063515 | santhanaprakash99@gmail.com | 9043592058 | Thoraipakkam | Greens Tech OMR Branch | Debit Card  | 2023-05- 27 | Need Valet Parking |
      | santhanaprakash99@gmail.com | Greens@123 | Tamil Nadu | Chennai  | Standard | 2023-05- 25 | 2023-05-31   | 1-One | 1-One  |        0 | Mr.        | santhana  | prakash  | 9486063515 | santhanaprakash99@gmail.com | 9043592058 | Thoraipakkam | Greens Tech OMR Branch | Credit Card | 2023-05- 27 | Need Valet Parking |
