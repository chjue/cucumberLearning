Feature: test baidu serch

  Scenario: search dog in baidu searchbox
    Given I open baidu search page
    When I input "dog" in search box
    And I click search button
    Then show search result should include "dog"