Feature: Adding an address to the active user account

  Scenario Outline: User has an active account
    Given I'm on shop main page
    When I login using "mhgwrsdzokmeyjvcha@cazlp.com" and "haslo"
    And I go to my addresses page
    When I add new address
    And I enter new address alias <alias> address <address> city <city> zip <zip> country <country> phone <phone>
    Then I can see new address ""
    And I verify created address alias <alias> address <address> city <city> zip <zip> country <country> phone <phone>
    And I remove the address
    And I close the browser
    Examples:
      | alias | address     | city     | zip      | country          | phone        |
      | "1"   | "Golden 12" | "London" | "21-354" | "United Kingdom" | "0501234567" |