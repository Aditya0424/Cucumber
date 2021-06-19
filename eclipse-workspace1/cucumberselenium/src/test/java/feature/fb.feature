Feature: Flight Tracker

  @TC1
  Scenario Outline: Check Air India flight status
    Given I am on Flighaware home page
    When I key in AirIndia flight number "<FlightNumber>"
    And I click on Search
    Then Flight status is displayed

    Examples: 
      | FlightNumber |
      | AI890        |
      | AI687        |
      | AI636        |

  @TC2
  Scenario: Check Air India flight status using header
    Given I am on Flighaware home page
    When I key in AirIndia flight number as below
    
    | AI890 |
    | AI687 |
    | AI636 |
    
    And I click on Search
    Then Flight status is displayed