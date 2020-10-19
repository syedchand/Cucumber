Feature: Add New Customer

	@Regression
  Scenario Outline: User should be able to enter valid personal information of customer
    Given User has launched the banking website
    When User Enters "<Username>" and "<Password>"
    When User clicks on Add New Customer
    When User Enters "<CustomerName>" and "<Gender>" and "<DateofBirth>" and "<Address>" and "<City>" and "<State>" and "<PIN>" and "<Mobile Number>" and "<Email>" and "<Password>"
    Then User should click on submit

    Examples: 
      | Username   | CustomerName | Gender | DateofBirth | Address                    | City     | State | PIN    | Mobile Number | Email             | Password |
      | mngr289192 | Rohit        | Male   | 09/07/1990  | 231 lincoln avenue apt 123 | Lonetree | CO    | 080124 |    5454127741 | test123@gmail.com | YgUqavY  |
