#feature to pokrycie zaleznosci 1<->1

@Project
Feature: User can handle projects at Todolist application

  @Scenario_project_create
  Scenario Outline: User can create project <Project Name>
    When user creates new project named: "<Project Name>"
    Then project should be created
    And created project is available at project's list

    Examples:
      | Project Name |
      | Temp Project |
      | Bucket List  |

  @Scenario_project_update
  Scenario Outline: User can update project
    Given existing project with name: "<Project Name>"
    When user sets is project not favorite filed
    Then project is updated

    Examples:
      | Project Name      |
      | My sample project |
