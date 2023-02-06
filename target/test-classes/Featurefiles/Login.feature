Feature: 
  To validate Login Functionality of Facebook Application

  Scenario Outline: 
    To validate Login using different credentials

    Given User gave to enter facebook login through chrome broswer
    When User enter  "<username>" and "<password>"
    And User click the login button
    Then User should be in invalid credential page

    Examples: 
      | username              | password    |
      | java123@gmail.com     | java123     |
      | selenium123@gmail.com | selenium123 |
      | python123@gmail.com   | python123   |
      | jira123@gmail.com     | jira123     |
