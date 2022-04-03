Feature: Add new address

  Scenario Outline: User can log in and add new address

    Given open browser on https://mystore-testlab.coderslab.pl/
    When user logged in with correct login and password
    And click addresses tile
    And click +create new address
    And fill out and save form with correct values: <Alias>, <Address>, <City>, <Zip Code>, <Country>, <Phone>
    Then Address is saved
    Examples:
      | alias  | street        | city  | zipcode | country | phone   |
      | Kermit | Sesame Street | Bytom | 49-100  | Poland  | 5553212 |