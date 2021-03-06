package com.indracompany.qa.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static cucumber.api.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(glue = "com.indracompany.qa.steps",snippets = CAMELCASE
        ,features = "src\\test\\resources\\features\\HU_DistribucionWebAdvantage.feature"
)
public class DistribucionRunner {

}
