

Feature: online status and set a status message

  User Story :
  As a user, I should be able to change my online status and set a status message

  Acceptance Criteria:
  User can view Online Status
  User can change Online Status
  User can set a status message from any default options
  User can set a custom status message with also using any emoji option provided
  User can clear status message or set a time to clear the message automatically


  #Background: For the scenarios in the feature file, user is expected to be on Online Status
   # Given user is on the Online Status page
  @wip
    Scenario: User can view Online Status
      Given user is on the Online Status page

      Then user can view online status

  Scenario: User changes Online Status
    #Given the user is logged in to the online status page
    #Given user is on the Online Status page
    #When the user navigates to the set status page
    #And the user clicks the Online status option
    #Then the user's status is selected Online

    Given user is on the Online Status page
    When the user navigates to the set status page
    And the user clicks the Away status option
    Then the user's status changed to Away

    Given user is on the Online Status page
    When the user navigates to the set status page
    And the user clicks the Do not disturb status option
    Then the user's status changed to Do not disturb

    Given user is on the Online Status page
    When the user navigates to the set status page
    And the user clicks the Invisible status option
    Then the user's status is changed to Invisible


    Scenario: User can set a status message from any default options
    Given user is on the Online Status page
    When the user navigates to the set status page
    And the user enters a custom status message In a meeting
    Then the user's status message is changed to In a meeting

    Given user is on the Online Status page
    When the user navigates to the set status page
    And the user enters a custom status message commuting
    Then the user's status message is changed to commuting

    Given user is on the Online Status page
    When the user navigates to the set status page
    And the user enters a custom status message Working remotely
    Then the user's status message is changed to Working remotely

    Given user is on the Online Status page
    When the user navigates to the set status page
    And the user enters a custom status message Out sick
    Then the user's status message is changed to Out sick


    Given user is on the Online Status page
    When the user navigates to the set status page
    And the user enters a custom status message Vacationing
    Then the user's status message is changed to Vacationing


      Scenario: User can set a custom status message with also using any emoji option provided
        Given user is on the Online Status page
        When the user navigates to the set status page
        Then user can click a custom status message with also using any emoji option



    Given user is on the Online Status page
    When the user navigates to the set status page
    And the user sets a time to clear the status message automatically
    Then the user's status message is automatically cleared after the specified time


    Given user is on the Online Status page
    When the user navigates to the set status page
    And the user click the "Clear status message"
    Then the user's status message is now  empty

