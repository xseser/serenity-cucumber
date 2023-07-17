@DataTable
Feature: Data tables guide

  Scenario: Data examples
    Given User has data
      | title    | author      |
      | ausdthor | J K Rowling |
      | sdadsa   | dsadsda     |
      | kawaaa   | kawusia     |
    Then data was parsed