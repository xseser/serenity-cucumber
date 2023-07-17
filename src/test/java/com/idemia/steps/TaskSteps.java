package com.idemia.steps;

import com.google.gson.JsonObject;
import com.idemia.utilities.RestHelper;
import io.restassured.response.Response;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import org.assertj.core.api.Assertions;

import java.util.ArrayList;

public class TaskSteps {

    @Step
    public void createTask(String taskName) {
        String projectID = Serenity.sessionVariableCalled("projectId");

        System.out.println("--------------------------" + projectID);

        Response response = RestHelper.createNewTask(taskName, projectID);
        Assertions.assertThat(response.getStatusCode()).isEqualTo(200);

        Serenity.setSessionVariable("taskCreationKey").to(response);
    }

    @Step
    public void taskIsCreated(){
        Response response = Serenity.sessionVariableCalled("taskCreationKey");
        Assertions.assertThat(response.getStatusCode()).isEqualTo(200);
//
//
//        String taskId = response.getBody().jsonPath().getString("id");
//        Serenity.setSessionVariable("taskId").to(taskId);


    }
}
