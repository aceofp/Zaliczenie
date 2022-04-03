package Zad1;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/Cucumber/Features/Zadanie1.feature",
        plugin = {"pretty", "html:out"},
        glue = "StepDefinitions")

public class Zadanie1 {

}

