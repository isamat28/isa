package com.devEx.stepDef;

import com.devEx.utulities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class ProfileStepDef {
    @Given("User creates a GET request and able to see all profiles")
    public void user_creates_a_get_request_and_able_to_see_all_profiles() {
        given().accept(ContentType.JSON)
                .when()
                .get()(ConfigurationReader.get("allProfiles"))
    }
    @Then("Verify that status code is {int}")
    public void verify_that_status_code_is(int expectedStatusCode) {

    }
}
