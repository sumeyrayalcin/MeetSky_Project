

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

    Scenario: User can view Online Status
      Given user is on the Online Status page
      Then user can view online status
  @wip
  Scenario Outline: User changes Online Status

    #Given user is on the Online Status page
    #When  the user clicks the Away status option
    #Then the user's status changed to Away

   #Given user is on the Online Status page
   # When the user clicks the Do not disturb status option
    #And user clicks set status message
   # Then the user's status changed to Do not disturb

    #Given user is on the Online Status page
    #When  the user clicks the Invisible status option
    #And user clicks set status message
    #Then the user's status is changed to Invisible

    #Given user is on the Online Status page
    #When  the user clicks the Online status option
    #Then the user's status changed to Online

    Given user is on the Online Status page
    When user clicks the  status option "<statusOption>"
    Then user's status is changed to "<statusOption>"
    Examples:
    |statusOption   |
    |  online       |
    |    away       |
    | do not disturb|




    Scenario: User can set a status message from any default options
    Given user is on the Online Status page
    When the user enters a custom status message In a meeting
      And user clicks set status message
    Then the user's status message is changed to In a meeting

    Given user is on the Online Status page
    When the user enters a custom status message commuting
      And user clicks set status message
    Then the user's status message is changed to commuting

    Given user is on the Online Status page
    When the user enters a custom status message Working remotely
      And user clicks set status message
    Then the user's status message is changed to Working remotely

    Given user is on the Online Status page
    When  the user enters a custom status message Out sick
      And user clicks set status message
    Then the user's status message is changed to Out sick


    Given user is on the Online Status page
    When the user enters a custom status message Vacationing
      And user clicks set status message
    Then the user's status message is changed to Vacationing


      Scenario: User can set a custom status message with also using any emoji option provided
        Given user is on the Online Status page
        Then user can click a custom status message with also using any emoji option



    Given user is on the Online Status page
    When  the user clicks a time to clear the status message automatically
      Then the user sets a time to clear the status message automatically
    #Then the user's status message is automatically cleared after the specified time


    Given user is on the Online Status page
    When the user click the Clear status message
    Then the user's status message is now  empty

