Feature: Mernagria

  Scenario: registe new pet
    Given I am on the "new pet" page
    When I click the "registe" button

    Then I should go to the "register" page