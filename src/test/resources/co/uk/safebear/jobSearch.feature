
@to-do
Feature: Job Search

  Acceptance Criteria:
  *users must be able to search for job by job area

  Scenario Outline: a user searches for a job by category and no jobs are found
    When a user searches by "<keyword>" in the "<category>" category
    Then no jobs are found
    Examples:
    | keyword | category |
    | test    | IT       |
    | pilot   | Aviation |