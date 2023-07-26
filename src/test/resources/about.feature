Feature: Visit the about page

  Scenario: Go to the about page and verify
    Given user is on the landing page of github.com
    When user clicks the about button
    Then user is taken to the about page