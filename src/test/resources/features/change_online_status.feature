

Feature: online status and set a status message

  User Story :
  As a user, I should be able to change my online status and set a status message

  Acceptance Criteria:
  User can view Online Status
  User can change Online Status
  User can set a status message from any default options
  User can set a custom status message with also using any emoji option provided
  User can clear status message or set a time to clear the message automatically


  Scenario: User can view Online Status
      Given user is on the Online Status page
      Then user can view online status

  @wip
  Scenario Outline: User changes Online Status


    Given user is on the Online Status page
    When user clicks the  status option "<statusOption>"
    Then user's status is changed to "<statusOption>"
    Examples:
    |statusOption   |
    | Do not disturb |
    | Online |
    | Away |
    | Invisible |



    Scenario Outline: User can set a status message from any default options

      Given user is on the Online Status page
      When user clicks the custom status message "<statusMessage>"
      Then the user's status message is changed to "<statusMessage>"
      Examples:
        | statusMessage |
        | In a meeting |
        | Commuting |
        | Working remotely |
        | Out sick |
        | Vacationing |




  Scenario: User can set a custom status message with also using any emoji option provided

        Given user is on the Online Status page
        Then user can click a custom status message with also using any emoji option


Scenario: the user sets a time to clear the status message
      Given user is on the Online Status page
      When  the user clicks a time to clear the status message automatically
      Then the user sets a time to clear the status message automatically
            #Then the user's status message is automatically cleared after the specified time
Scenario: Clear the status message
        Given user is on the Online Status page
        When the user click the Clear status message
        Then the user's status message is now  empty








