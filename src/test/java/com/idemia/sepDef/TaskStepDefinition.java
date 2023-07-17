package com.idemia.sepDef;

import com.idemia.steps.ProjectSteps;
import com.idemia.steps.TaskSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TaskStepDefinition {
    @Steps
    ProjectSteps projectSteps;

    @Steps
    TaskSteps taskSteps;

    @Given("Existing project with name: {string}")
    public void existingProjectWithName(String projectName) {
        projectSteps.createNewProject(projectName);
    }

    @When("User creates new task with name {string}")
    public void userCreatesNewTaskWithName(String taskName) {
        taskSteps.createTask(taskName);
    }

    @Then("New task should be created")
    public void newTaskShouldBeCreated() {
        taskSteps.taskIsCreated();
    }
}


