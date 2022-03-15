Feature: DemoTours Login Function Feature

  @Smoke
  Scenario: As an User, I will be able to sign in with valid credentials and should verify the success message
    Given Open Browser
    And Go to URL
    When Enter UserName and Password
    And Verify Login Success Msg
    Then Close Browser
