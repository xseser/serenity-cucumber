package com.idemia.steps;

import com.idemia.utilities.RestHelper;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import net.serenitybdd.core.Serenity;

public class Hooks {

    @After
    public void deleteProject(Scenario scenario) {
        String projectId = Serenity.sessionVariableCalled("projectId");
        RestHelper.deleteProject(projectId);

    }
}
