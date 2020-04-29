Feature: Login Feature

  As a user I want to login to my account

  Scenario: User should navigate to the account page
    Given   I am on Home page
    When    I click on Account link
    Then    I should the see text "Sign in to see exclusive Member Pricing."

  Scenario: Verify error message when user login with invalid credentials
    Given   I am on Home page
    When    I click on Account link
    And     I click on Sign In button
    And     I enter "xyz13@gmail.com" in the email address field
    And     I enter "abc123" in the password field
    And     I click on the Sign In button
    Then    I should see a error message "You may have entered an unknown email address or an incorrect password"

