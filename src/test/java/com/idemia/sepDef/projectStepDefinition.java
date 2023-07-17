package com.idemia.sepDef;

import com.idemia.steps.ProjectSteps;
import com.idemia.utilities.ItemType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;

public class projectStepDefinition {

    @Steps
    ProjectSteps projectSteps;

    @When("user creates new project named: {string}")
    public void userCreatesNewProject(String projectName) {
        projectSteps.createNewProject(projectName);
    }
    @Then("{itemType} should be created")
    public void projectShouldBeCreated(ItemType type) {
//        itemType = ItemType.valueOf("Task");
        Response response = Serenity.sessionVariableCalled("resp");
        projectSteps.projectWasCreated(response);
    }
    @Then("created project is available at project's list")
    public void createdProjectIsAvailableAtProjectSList() {
        String projectId = Serenity.sessionVariableCalled("projectId");
        projectSteps.projectIsAvailable(projectId);
    }

//    private void userCreatesProjectAndVerifiesIfProjectExists(String projectName){
//        projectSteps.createNewProject(projectName);
//        Response response = Serenity.sessionVariableCalled("resp");
//        projectSteps.projectWasCreated(response);
//        String projectId = Serenity.sessionVariableCalled("projectId");
//        projectSteps.projectIsAvailable(projectId);
//    }

    @Given("existing project with name: {string}")
    public void existingProjectWithName(String projectName) {
        projectSteps.userCreatesProjectAndVerifiesIfProjectExists(projectName);
    }
    @When("user sets is project (not )favorite filed")
    public void userSetAsFavoriteProject() {
        String projectId = Serenity.sessionVariableCalled("projectId");
        projectSteps.updateProject(projectId, true);

    }
    @Then("project is updated")
    public void isUpdated() {
        String projectId = Serenity.sessionVariableCalled("projectId");
        projectSteps.checkIfProjectIsUpdated(projectId);
    }


}
