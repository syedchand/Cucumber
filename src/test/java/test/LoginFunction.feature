@LoginFeature
Feature: Login to Demo Baning WebSite
	
	@Sanity1
  Scenario Outline: User should be able to login to the Banking WebSite
    Given User has launched the banking website
    When User Enters "<Username>" and "<Password>"
    Then User "<Username>" should be landing to Home Page

    Examples: 
      | Username   | Password |
      | mngr289192 | YgUqavY  |
      
      
  @Sanity
  Scenario Outline: User should be able to login to the Banking WebSite
    Given User has launched the banking website
    When User Enters "<Username>" and "<Password>"
    Then User "<Username>" should be landing to Home Page

    Examples: 
      | Username   | Password |
      | mngr289192 | YgUqavY  |
      
      
  @Sanity @Regression
  Scenario Outline: User should be able to login to the Banking WebSite
    Given User has launched the banking website
    When User Enters "<Username>" and "<Password>"
    Then User "<Username>" should be landing to Home Page

    Examples: 
      | Username   | Password |
      | mngr289192 | YgUqavY  |
      
      
