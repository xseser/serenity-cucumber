package com.idemia.sepDef;

import com.idemia.steps.ProjectSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;

public class projectStepDefinition {

//    @Steps
//    ProjectSteps projectSteps;
//
//    @When("user creates new project named: {string}")
//    public void userCreatesNewProject(String projectName) {
//        projectSteps.createNewProject(projectName);
//    }
//
//    @Then("project should be created")
//    public void projectShouldBeCreated() {
//        Response response = Serenity.sessionVariableCalled("resp");
//        projectSteps.projectWasCreated(response);
//    }
//
//    @Then("created project is available at project's list")
//    public void createdProjectIsAvailableAtProjectSList() {
//        String projectId = Serenity.sessionVariableCalled("projectId");
//        projectSteps.projectIsAvailable(projectId);
//    }
}