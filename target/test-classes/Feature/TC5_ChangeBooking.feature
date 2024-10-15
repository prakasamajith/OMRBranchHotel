Feature: Verifying Change Booking Module

  Scenario Outline: Modify the Created Order Id - Book hotel by card (credit card)
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prakasam"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the last hotel name and hotel price
    And User select the last hotel and accept the alert
    Then User should verify after select success message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User add GST Details "<Enter Registration No.>","<Enter Company Name>" and "<Enter Company Address>"
    And User add Special Request "<Request>"
    And User enter payment details, procced with Card Type "<Card Type>"
      | Select Card | Card No          | Card Name | Month | Year | CVV |
      | Visa        | 5555555555552223 | xxxxx     | July  | 2025 | 123 |
      | MasterCard  | 5555555555554444 | xxxxx     | July  | 2025 | 123 |
      | Amex        | 5555555555550000 | xxxxx     | July  | 2025 | 123 |
      | Discover    | 5555555555556666 | xxxxx     | July  | 2025 | 123 |
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not
    When User navigate to My Booking page
    Then User should verify after navigate to My Booking page success message as "Bookings"
    When User search the Order ID
    Then User should verify same booked Order ID is present or not
    And User should verify same booked Hotel Name is present or not
    And User should verify same booked Hotel Price is present or not
    When User edit the Check-in Date "<Modify Date>"
    Then User should verify after modify check-in date success message "Booking updated successfully"

    Examples: 
      | userName | password | state | city | roomType | checkIn | check-out | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email | Enter Registration No. | Enter Company Name | Enter Company Address | Request | Card Type | Modify Date |
      | userName | password | state | city | roomType | checkIn | check-out | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email | Enter Registration No. | Enter Company Name | Enter Company Address | Request | Card Type | Modify Date |

  Scenario Outline: Modify the Created Order Id - Book hotel by  (UPI ID)
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prakasam"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the last hotel name and hotel price
    And User select the last hotel and accept the alert
    Then User should verify after select success message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User add GST Details "<Enter Registration No.>","<Enter Company Name>" and "<Enter Company Address>"
    And User add Special Request "<Request>"
    And User enter upi details "<upiId>" and click submit
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not
    When User navigate to My Booking page
    Then User should verify after navigate to My Booking page success message as "Bookings"
    When User search the Order ID
    Then User should verify same booked Order ID is present or not
    And User should verify same booked Hotel Name is present or not
    And User should verify same booked Hotel Price is present or not
    When User edit the Check-in Date "<Modify Date>"
    Then User should verify after modify check-in date success message "Booking updated successfully"

    Examples: 
      | userName | password | state | city | roomType | checkIn | check-out | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email | Enter Registration No. | Enter Company Name | Enter Company Address | Request | upiId | Modify Date |
      | userName | password | state | city | roomType | checkIn | check-out | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email | Enter Registration No. | Enter Company Name | Enter Company Address | Request | upiId | Modify Date |

  Scenario Outline: Modify the Created Order Id - Book hotel by card (credit card) without GST and  with special request
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prakasam"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the last hotel name and hotel price
    And User select the last hotel and accept the alert
    Then User should verify after select success message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User add Special Request "<Request>"
    And User enter payment details, procced with Card Type "<Card Type>"
      | Select Card | Card No          | Card Name | Month | Year | CVV |
      | Visa        | 5555555555552223 | xxxxx     | July  | 2025 | 123 |
      | MasterCard  | 5555555555554444 | xxxxx     | July  | 2025 | 123 |
      | Amex        | 5555555555550000 | xxxxx     | July  | 2025 | 123 |
      | Discover    | 5555555555556666 | xxxxx     | July  | 2025 | 123 |
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not
    When User navigate to My Booking page
    Then User should verify after navigate to My Booking page success message as "Bookings"
    When User search the Order ID
    Then User should verify same booked Order ID is present or not
    And User should verify same booked Hotel Name is present or not
    And User should verify same booked Hotel Price is present or not
    When User edit the Check-in Date "<Modify Date>"
    Then User should verify after modify check-in date success message "Booking updated successfully"

    Examples: 
      | userName | password | state | city | roomType | checkIn | check-out | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email | Request | Card Type | Modify Date |
      | userName | password | state | city | roomType | checkIn | check-out | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email | Request | Card Type | Modify Date |

  Scenario Outline: Modify the Created Order Id - Book hotel by card (credit card) without special request and with GST
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prakasam"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the last hotel name and hotel price
    And User select the last hotel and accept the alert
    Then User should verify after select success message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User add GST Details "<Enter Registration No.>","<Enter Company Name>" and "<Enter Company Address>"
    And User enter payment details, procced with Card Type "<Card Type>"
      | Select Card | Card No          | Card Name | Month | Year | CVV |
      | Visa        | 5555555555552223 | xxxxx     | July  | 2025 | 123 |
      | MasterCard  | 5555555555554444 | xxxxx     | July  | 2025 | 123 |
      | Amex        | 5555555555550000 | xxxxx     | July  | 2025 | 123 |
      | Discover    | 5555555555556666 | xxxxx     | July  | 2025 | 123 |
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not
    When User navigate to My Booking page
    Then User should verify after navigate to My Booking page success message as "Bookings"
    When User search the Order ID
    Then User should verify same booked Order ID is present or not
    And User should verify same booked Hotel Name is present or not
    And User should verify same booked Hotel Price is present or not
    When User edit the Check-in Date "<Modify Date>"
    Then User should verify after modify check-in date success message "Booking updated successfully"

    Examples: 
      | userName | password | state | city | roomType | checkIn | check-out | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email | Card Type | Modify Date |
      | userName | password | state | city | roomType | checkIn | check-out | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email | Card Type | Modify Date |

  Scenario Outline: Modify the Created Order Id - Book hotel by card (credit card) without special request and GST
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prakasam"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the last hotel name and hotel price
    And User select the last hotel and accept the alert
    Then User should verify after select success message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User enter payment details, procced with Card Type "<Card Type>"
      | Select Card | Card No          | Card Name | Month | Year | CVV |
      | Visa        | 5555555555552223 | xxxxx     | July  | 2025 | 123 |
      | MasterCard  | 5555555555554444 | xxxxx     | July  | 2025 | 123 |
      | Amex        | 5555555555550000 | xxxxx     | July  | 2025 | 123 |
      | Discover    | 5555555555556666 | xxxxx     | July  | 2025 | 123 |
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not
    When User navigate to My Booking page
    Then User should verify after navigate to My Booking page success message as "Bookings"
    When User search the Order ID
    Then User should verify same booked Order ID is present or not
    And User should verify same booked Hotel Name is present or not
    And User should verify same booked Hotel Price is present or not
    When User edit the Check-in Date "<Modify Date>"
    Then User should verify after modify check-in date success message "Booking updated successfully"

    Examples: 
      | userName | password | state | city | roomType | checkIn | check-out | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email | Enter Registration No. | Enter Company Name | Enter Company Address | Request | Card Type | Modify Date |
      | userName | password | state | city | roomType | checkIn | check-out | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email | Enter Registration No. | Enter Company Name | Enter Company Address | Request | Card Type | Modify Date |

  Scenario Outline: Modify the Created Order Id - Book hotel by  (UPI ID) without special request and with GST
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prakasam"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the last hotel name and hotel price
    And User select the last hotel and accept the alert
    Then User should verify after select success message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User add GST Details "<Enter Registration No.>","<Enter Company Name>" and "<Enter Company Address>"
    And User enter upi details "<upiId>" and click submit
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not
    When User navigate to My Booking page
    Then User should verify after navigate to My Booking page success message as "Bookings"
    When User search the Order ID
    Then User should verify same booked Order ID is present or not
    And User should verify same booked Hotel Name is present or not
    And User should verify same booked Hotel Price is present or not
    When User edit the Check-in Date "<Modify Date>"
    Then User should verify after modify check-in date success message "Booking updated successfully"

    Examples: 
      | userName | password | state | city | roomType | checkIn | check-out | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email | Enter Registration No. | Enter Company Name | Enter Company Address | Request | upiId | Modify Date |
      | userName | password | state | city | roomType | checkIn | check-out | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email | Enter Registration No. | Enter Company Name | Enter Company Address | Request | upiId | Modify Date |

  Scenario Outline: Modify the Created Order Id - Book hotel by  (UPI ID) without special request and GST
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prakasam"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the last hotel name and hotel price
    And User select the last hotel and accept the alert
    Then User should verify after select success message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User enter upi details "<upiId>" and click submit
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not
    When User navigate to My Booking page
    Then User should verify after navigate to My Booking page success message as "Bookings"
    When User search the Order ID
    Then User should verify same booked Order ID is present or not
    And User should verify same booked Hotel Name is present or not
    And User should verify same booked Hotel Price is present or not
    When User edit the Check-in Date "<Modify Date>"
    Then User should verify after modify check-in date success message "Booking updated successfully"

    Examples: 
      | userName | password | state | city | roomType | checkIn | check-out | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email | Enter Registration No. | Enter Company Name | Enter Company Address | Request | upiId | Modify Date |
      | userName | password | state | city | roomType | checkIn | check-out | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email | Enter Registration No. | Enter Company Name | Enter Company Address | Request | upiId | Modify Date |

  Scenario Outline: Modify the Created Order Id - Book hotel by  (UPI ID) with special request and without GST
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prakasam"
    When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel success message "Select Hotel"
    When User save the last hotel name and hotel price
    And User select the last hotel and accept the alert
    Then User should verify after select success message "Book Hotel"
    When User add Guest Details "<Select Salutation>","<First Name>","<Last Name>","<Mobile No.>" and "<Email>"
    And User add Special Request "<Request>"
    And User enter upi details "<upiId>" and click submit
    And User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    Then User should verify same selected Hotel is booked or not
    When User navigate to My Booking page
    Then User should verify after navigate to My Booking page success message as "Bookings"
    When User search the Order ID
    Then User should verify same booked Order ID is present or not
    And User should verify same booked Hotel Name is present or not
    And User should verify same booked Hotel Price is present or not
    When User edit the Check-in Date "<Modify Date>"
    Then User should verify after modify check-in date success message "Booking updated successfully"

    Examples: 
      | userName | password | state | city | roomType | checkIn | check-out | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email | Enter Registration No. | Enter Company Name | Enter Company Address | upiId | Modify Date |
      | userName | password | state | city | roomType | checkIn | check-out | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email | Enter Registration No. | Enter Company Name | Enter Company Address | upiId | Modify Date |

  Scenario Outline: Modify Check-in Date for existing Order ID
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prakasam"
    When User navigate to My Booking page
    Then User should verify after navigate to My Booking page success message as "Bookings"
    When User search the Order ID "#YPJCO46488"
    Then User should verify same booked Order ID is present or not
    When User edit the Check-in Date "<Modify Date>"
    Then User should verify after modify check-in date success message "Booking updated successfully"

    Examples: 
      | userName | password | Modify Date |
      | userName | password | Modify Date |

  Scenario Outline: Modify Check-in Date for first displayed Order ID
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prakasam"
    When User navigate to My Booking page
    Then User should verify after navigate to My Booking page success message as "Bookings"
    When User edit the Check-in Date for the first displayed Order ID "<Modify Date>"
    Then User should verify after modify check-in date success message "Booking updated successfully"

    Examples: 
      | userName | password | Modify Date |
      | userName | password | Modify Date |

  Scenario Outline: Modify Check-in Date for last displayed Order ID
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prakasam"
    When User navigate to My Booking page
    Then User should verify after navigate to My Booking page success message as "Bookings"
    When User edit the Check-in Date for the last displayed Order ID "<Modify Date>"
    Then User should verify after modify check-in date success message "Booking updated successfully"

    Examples: 
      | userName | password | Modify Date |
      | userName | password | Modify Date |
