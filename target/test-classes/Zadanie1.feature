Feature: Add new address

  Scenario Outline: User can log in and add new address

    Given open browser on https://mystore-testlab.coderslab.pl/
    When user logged in with correct login and password
    And click addresses tile
    And click +create new address
    And fill out and save form with correct values <alias> <address> <city> <postcode> <country> <phone>
    Then Address is saved
    Examples:
      | alias  | address       | city  | postcode | country | phone   |
      | Kermit | Sesame Street | Bytom | 49-100   | Poland  | 5553212 |