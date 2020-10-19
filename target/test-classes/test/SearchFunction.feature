Feature: Imlement Search Functionality in E-Commerce website

  Scenario Outline: Search function should display all the related prodcuts
    Given Customer "<UserName>" has Logged into the E-Commerce WebSite
    When Customer tries to search "<Product>"
    Then All the "<Product>" should be dispayed on the page.

    Examples: 
      | UserName | Product     |
      | Chand    | Laptop      |
      | Nikunj   | Desktop     |
      | Rahul    | Smart Phone |
