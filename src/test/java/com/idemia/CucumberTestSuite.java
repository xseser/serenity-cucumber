package com.idemia;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
//        tags = "not @Smoke"
        tags = "not @DataTable"
)
public class CucumberTestSuite {

}