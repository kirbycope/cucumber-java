Feature: The Internet Guinea Pig Website

  Scenario Outline: As a user, I can log into the secure area
    Given I am on the login page
    When I login with '<username>' and '<password>'
    Then I should see a text saying '<text>'

    Examples:
      | username | password | text                           |
      | valid    | valid    | You logged into a secure area! |
      | foobar   | barfoo   | Your username is invalid!      |
