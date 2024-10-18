Feature: Verifying Cancel Booking Module

  @CancelBooking
  Scenario Outline: Cancel the Created Order Id - Book hotel by card (credit card)
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
    Then User should verify same booked Hotel Price is present or not
    When User edit the Check-in Date "<Modify Date>"
    Then User should verify after modify check-in date success message "Booking updated successfully"
    When User search the Order ID
    Then User should verify same booked Order ID is present or not
    And User should verify same booked Hotel Name is present or not
    Then User should verify same booked Hotel Price is present or not
    When User should Cancel the new order ID
    Then User should verify after cancel booking success message "Your booking cancelled successfully"

    Examples: 
      | userName                | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email                   | Enter Registration No. | Enter Company Name     | Enter Company Address | Request       | Card Type   | Modify Date |
      | ajithprakasam@gmail.com | Prakasam@77 | Tamil Nadu | Chennai | Standard | 2024-11-11 | 2024-11-14 |          2 |            2 |            2 | Mr                | Prakasam   | Manickam  | 9600809646 | ajithprakasam@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Valet Parking | Credit Card | 2024-11-15  |

  Scenario Outline: Cancel the Created Order Id - Book hotel by  (UPI ID)
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
    Then User should verify same booked Hotel Price is present or not
    When User edit the Check-in Date "<Modify Date>"
    Then User should verify after modify check-in date success message "Booking updated successfully"
    When User search the Order ID
    Then User should verify same booked Order ID is present or not
    And User should verify same booked Hotel Name is present or not
    And User should verify same booked Hotel Price is present or not
    When User should Cancel the new order ID
    Then User should verify after cancel booking success message "Your booking cancelled successfully"

    Examples: 
      | userName                | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email                   | Enter Registration No. | Enter Company Name     | Enter Company Address | Request       | upiId                | Modify Date |
      | ajithprakasam@gmail.com | Prakasam@77 | Tamil Nadu | Chennai | Standard | 2024-11-11 | 2024-11-14 |          2 |            2 |            2 | Mr                | Prakasam   | Manickam  | 9600809646 | ajithprakasam@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Valet Parking | seleniumtraining@vbc | 2024-11-19  |

  Scenario Outline: Cancel the Created Order Id - Book hotel by card (credit card) without special request and with GST
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
    Then User should verify same booked Hotel Price is present or not
    When User edit the Check-in Date "<Modify Date>"
    Then User should verify after modify check-in date success message "Booking updated successfully"
    When User search the Order ID
    Then User should verify same booked Order ID is present or not
    And User should verify same booked Hotel Name is present or not
    And User should verify same booked Hotel Price is present or not
    When User should Cancel the new order ID
    Then User should verify after cancel booking success message "Your booking cancelled successfully"

    Examples: 
      | userName                | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email                   | Enter Registration No. | Enter Company Name     | Enter Company Address | Card Type   | Modify Date |
      | ajithprakasam@gmail.com | Prakasam@77 | Tamil Nadu | Chennai | Standard | 2024-11-11 | 2024-11-14 |          2 |            2 |            2 | Mr                | Prakasam   | Manickam  | 9600809646 | ajithprakasam@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Credit Card | 2024-11-15  |

  Scenario Outline: Cancel the Created Order Id - Book hotel by card (credit card) without special request and GST
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
    Then User should verify same booked Hotel Price is present or not
    When User edit the Check-in Date "<Modify Date>"
    Then User should verify after modify check-in date success message "Booking updated successfully"
    When User search the Order ID
    Then User should verify same booked Order ID is present or not
    And User should verify same booked Hotel Name is present or not
    Then User should verify same booked Hotel Price is present or not
    When User should Cancel the new order ID
    Then User should verify after cancel booking success message "Your booking cancelled successfully"

    Examples: 
      | userName                | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email                   | Card Type   | Modify Date |
      | ajithprakasam@gmail.com | Prakasam@77 | Tamil Nadu | Chennai | Standard | 2024-11-11 | 2024-11-14 |          2 |            2 |            2 | Mr                | Prakasam   | Manickam  | 9600809646 | ajithprakasam@gmail.com | Credit Card | 2024-11-15  |

  Scenario Outline: Cancel the Created Order Id - Book hotel by  (UPI ID) without special request and with GST
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
    Then User should verify same booked Hotel Price is present or not
    When User edit the Check-in Date "<Modify Date>"
    Then User should verify after modify check-in date success message "Booking updated successfully"
    When User search the Order ID
    Then User should verify same booked Order ID is present or not
    And User should verify same booked Hotel Name is present or not
    And User should verify same booked Hotel Price is present or not
    When User should Cancel the new order ID
    Then User should verify after cancel booking success message "Your booking cancelled successfully"

    Examples: 
      | userName                | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email                   | Enter Registration No. | Enter Company Name     | Enter Company Address | upiId                | Modify Date |
      | ajithprakasam@gmail.com | Prakasam@77 | Tamil Nadu | Chennai | Standard | 2024-11-11 | 2024-11-14 |          2 |            2 |            2 | Mr                | Prakasam   | Manickam  | 9600809646 | ajithprakasam@gmail.com |             9043592058 | Greens Tech OMR Branch | Thoraipakkam          | seleniumtraining@vbc | 2024-11-19  |

  Scenario Outline: Cancel the Created Order Id - Book hotel by  (UPI ID) without special request and GST
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
    Then User should verify same booked Hotel Price is present or not
    When User edit the Check-in Date "<Modify Date>"
    Then User should verify after modify check-in date success message "Booking updated successfully"
    When User search the Order ID
    Then User should verify same booked Order ID is present or not
    And User should verify same booked Hotel Name is present or not
    And User should verify same booked Hotel Price is present or not
    When User should Cancel the new order ID
    Then User should verify after cancel booking success message "Your booking cancelled successfully"

    Examples: 
      | userName                | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email                   | upiId                | Modify Date |
      | ajithprakasam@gmail.com | Prakasam@77 | Tamil Nadu | Chennai | Standard | 2024-11-11 | 2024-11-14 |          2 |            2 |            2 | Mr                | Prakasam   | Manickam  | 9600809646 | ajithprakasam@gmail.com | seleniumtraining@vbc | 2024-11-19  |

  Scenario Outline: Cancel the Created Order Id - Book hotel by  (UPI ID) with special request and without GST
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
    Then User should verify same booked Hotel Price is present or not
    When User edit the Check-in Date "<Modify Date>"
    Then User should verify after modify check-in date success message "Booking updated successfully"
    When User search the Order ID
    Then User should verify same booked Order ID is present or not
    And User should verify same booked Hotel Name is present or not
    And User should verify same booked Hotel Price is present or not
    When User should Cancel the new order ID
    Then User should verify after cancel booking success message "Your booking cancelled successfully"

    Examples: 
      | userName                | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email                   | Request       | upiId                | Modify Date |
      | ajithprakasam@gmail.com | Prakasam@77 | Tamil Nadu | Chennai | Standard | 2024-11-11 | 2024-11-14 |          2 |            2 |            2 | Mr                | Prakasam   | Manickam  | 9600809646 | ajithprakasam@gmail.com | Valet Parking | seleniumtraining@vbc | 2024-11-19  |

  Scenario Outline: Cancel the existing Order ID
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prakasam"
    When User navigate to My Booking page
    Then User should verify after navigate to My Booking page success message as "Bookings"
    When User should Cancel the existing order ID "<order ID>"
    Then User should verify after cancel booking success message "Your booking cancelled successfully"

    Examples: 
      | userName                | password    | Modify Date |
      | ajithprakasam@gmail.com | Prakasam@77 | 2024-11-19  |

  Scenario Outline: Cancel the first Order ID
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prakasam"
    When User navigate to My Booking page
    Then User should verify after navigate to My Booking page success message as "Bookings"
    When User should Cancel the first order ID
    Then User should verify after cancel booking success message "Your booking cancelled successfully"

    Examples: 
      | userName                | password    |
      | ajithprakasam@gmail.com | Prakasam@77 |

  Scenario Outline: Cancel the last Order ID
    Given User is on the OMR Branch hotel page
    When User login "<userName>" and "<password>"
    Then User should verify success message after login "Welcome Prakasam"
    When User navigate to My Booking page
    Then User should verify after navigate to My Booking page success message as "Bookings"
    When User should Cancel the last order ID
    Then User should verify after cancel booking success message "Your booking cancelled successfully"

    Examples: 
      | userName                | password    |
      | ajithprakasam@gmail.com | Prakasam@77 |

  Scenario Outline: Cancel the Created Order Id - Book hotel by card (credit card) with special request and without GST
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
    Then User should verify same booked Hotel Price is present or not
    When User edit the Check-in Date "<Modify Date>"
    Then User should verify after modify check-in date success message "Booking updated successfully"
    When User search the Order ID
    Then User should verify same booked Order ID is present or not
    And User should verify same booked Hotel Name is present or not
    And User should verify same booked Hotel Price is present or not
    When User should Cancel the new order ID
    Then User should verify after cancel booking success message "Your booking cancelled successfully"

    Examples: 
      | userName                | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Childs | Select Salutation | First Name | Last Name | Mobile No. | Email                   | Request       | Card Type   | Modify Date |
      | ajithprakasam@gmail.com | Prakasam@77 | Tamil Nadu | Chennai | Standard | 2024-11-11 | 2024-11-14 |          2 |            2 |            2 | Mr                | Prakasam   | Manickam  | 9600809646 | ajithprakasam@gmail.com | Valet Parking | Credit Card | 2024-11-15  |
