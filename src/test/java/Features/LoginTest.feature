Feature: Login TestCases

  Scenario Outline: Verify login functionality with correct username and correct password
    Given I navigated to website
    And Enter "<username>" and "<password>"
    When I hit login button
    Then I should be able to see homepage of the website

    Examples:
      | username      | password     |
      | standard_user | secret_sauce |


  Scenario Outline: Verify login functionality with correct username and incorrect password
    Given I navigated to website
    And Enter "<username>" and "<password>"
    When I hit login button
    Then I should be able to see error message

    Examples:
      | username      | password |
      | standard_user | secret   |

  Scenario Outline: Verify login functionality with incorrect username and correct password
    Given I navigated to website
    And Enter "<username>" and "<password>"
    When I hit login button
    Then I should be able to see error message

    Examples:
      | username | password     |
      | standard | secret_sauce |

  Scenario Outline: Verify login functionality with incorrect username and incorrect password
    Given I navigated to website
    And Enter "<username>" and "<password>"
    When I hit login button
    Then I should be able to see error message

    Examples:
      | username | password |
      | standard | secret   |