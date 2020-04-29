Feature: Flight Feature

  As a user I want to search for flights

  Scenario: User should navigate to the flight page
    Given   I am on Home page
    When    I click on Flights link
    Then    I should be on Flights page

  Scenario Outline: : Verify user is able to search for the destination flights of their choice
    Given   I am on Home page
    When    I click on Flights link
    And     I enter origin "<Flying from>"
    And     I enter destination "<Going to>"
    And     I enter departing date "<Departure date>"
    And     I enter returning date "<Returning date>"
    And     I click on Search button
    Then    I should see "<Results>" for my chosen destination

    Examples:
      | Flying from                                 | Going to                        | Departure date | Returning date | Results                            |
      | Dubai (DXB-All Airports)                    | Delhi (DEL-Indira Gandhi Intl.) | 08/07/2020     | 09/08/2020     | Select your departure to Delhi     |
      | London (LON-All Airports)                   | Sydney (SYD-All Airports)       | 28/11/2020     | 05/01/2021     | Select your departure to Sydney    |
      | Mumbai (BOM-Chhatrapati Shivaji Intl.)      | Singapore (SIN-All Airports)    | 27/05/2020     | 05/06/2020     | Select your departure to Singapore |
      | London (LON-All Airports)                   | Cape Town (CPT-Cape Town Intl.) | 15/01/2021     | 22/02/2021     | Select your departure to Cape      |
      | San Francisco, CA (SFO-San Francisco Intl.) | New York (NYC-All Airports)     | 15/08/2020     | 27/09/2020     | Select your departure to New York  |