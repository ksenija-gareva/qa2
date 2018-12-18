package cucumberStepDefinitions;

import cucumber.api.java.en.Given;

public class StepDefs {
    @Given("Print test annotation (.*)")
    public void printTestAnnotation(String annotation) {
        System.out.println(annotation);
    }
}
