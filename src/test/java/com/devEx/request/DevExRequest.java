package com.devEx.request;

import com.devEx.utulities.ConfigurationReader;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class DevExRequest {
    static Response response;

    public static Response getAllProfiles(){
        response = given().accept(ContentType.JSON)
                .when()
                .get(ConfigurationReader.get("allProfiles"));
        response.prettyPrint();
        return response;
    }

}
