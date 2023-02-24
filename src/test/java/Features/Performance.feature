Feature: Performance check

  Scenario Outline: Verify Delivery page functionality with performance when user didn't fill his first name
    Given I navigated to website
    And Enter "<username>" and "<password>"
    When I hit login button
    Then I should be able to see homepage of the website
    And Proceed for checkout after adding my product
    When I enter my "<Lastname>" and "<zipcode>"
    Then And error should be appear in front of user

    Examples:
      | username                | password     | Lastname | zipcode |
      | performance_glitch_user | secret_sauce | Hello    | 123456  |


  Scenario Outline: Verify Delivery page functionality when user didn't fill his first name
    Given I navigated to website
    And Enter "<username>" and "<password>"
    When I hit login button
    Then I should be able to see homepage of the website
    And Proceed for checkout after adding my product
    When I enter my "<Firstname>" and "<zipcode>" and leave lastname
    Then And error should be appear in front of user of lastname

    Examples:
      | username                | password     | Firstname | zipcode |
      | performance_glitch_user | secret_sauce | Hello     | 123456  |


  Scenario Outline: Verify Delivery page functionality when user didn't fill his first name
    Given I navigated to website
    And Enter "<username>" and "<password>"
    When I hit login button
    Then I should be able to see homepage of the website
    And Proceed for checkout after adding my product
    When I enter my "<Firstname>" and "<Lastname>" and leave zipcode
    Then And error should be appear in front of user of zipcode

    Examples:
      | username                | password     | Firstname | Lastname |
      | performance_glitch_user | secret_sauce | Hello     | 123456   |