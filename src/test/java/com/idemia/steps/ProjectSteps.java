package com.idemia.steps;

import com.idemia.model.User;
import com.idemia.utilities.RestHelper;
import io.restassured.response.Response;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import org.assertj.core.api.Assertions;

public class ProjectSteps {

//    @Step
//    public void createNewProject(String name) {
//        Response response = RestHelper.createNewProject(name);
//        Serenity.setSessionVariable("resp").to(response);
//    }
//
//    @Step
//    public void projectWasCreated(Response response) {
//        Assertions.assertThat(response.statusCode()).as("My custom error message!").isEqualTo(200);
//        String projectId = response.getBody().jsonPath().getString("id");
//        Assertions.assertThat(response.getBody().jsonPath().getString("id")).isNotEmpty();
//
//        Serenity.setSessionVariable("projectId").to(projectId);
//    }
//
//    @Step
//    public void userCreatesProjectAndVerifiesIfProjectExists(String projectName){
//        createNewProject(projectName);
//        Response response = Serenity.sessionVariableCalled("resp");
//        projectWasCreated(response);
//        String projectId = Serenity.sessionVariableCalled("projectId");
//        projectIsAvailable(projectId);
//    }
//
//    @Step
//    public void projectIsAvailable(String projectId) {
//        Response response = RestHelper.getProject(projectId);
//        Response response1 = RestHelper.getAllProjects();
//
//        Assertions.assertThat(response.statusCode()).isEqualTo(200);
//        Assertions.assertThat(response1.statusCode()).isEqualTo(200);
//    }
//
//    @Step
//    public void updateProject(String projectId, Boolean bool){
//        Response response = RestHelper.updateProject(projectId, bool);
//        Serenity.setSessionVariable("updateProjectResponse").to(response);
//
//
//
//        Serenity.setSessionVariable("IsFavorite").to(bool);
//
//        Assertions.assertThat(response.statusCode()).isEqualTo(200);
//    }
//
//    @Step
//    public void checkIfProjectIsUpdated(String projectId){
//        Response response = RestHelper.getProject(projectId);
//
//        Assertions.assertThat(response.statusCode()).isEqualTo(200);
//        Boolean bool = Serenity.sessionVariableCalled("IsFavorite");
//
//        Assertions.assertThat(response
//                        .getBody()
//                        .jsonPath()
//                        .getBoolean("is_favorite"))
//                        .isEqualTo((bool));
//    }

    @Step
    public void userMakesNewAccount(){
        Response response = RestHelper.createUser()
    }

}
