@Project
Feature: User can handle tasks at Todolist application

  @Scenario_Task_Create
  Scenario Outline: User can create <Task Name> in <Project Name>
    Given Existing project with name: "<Project Name>"
    When User creates new task with name "<Task Name>"
    Then New task should be created

    Examples:
      | Project Name      | Task Name        |
      | My sample project | sample task name |