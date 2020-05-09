package io.github.andreygfranca.web.api.v1.library;

import io.github.andreygfranca.service.library.dto.AuthorDTO;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class ITAuthorController {

    @Test
    public void givenAnAuthorWhenCreateThenReturn() {
        AuthorDTO dto = new AuthorDTO();
        dto.setBibliography("Simple bibliography");
        dto.setBirthDate(new Date());
        dto.setName("A Simple Book Name");

        given()
                .contentType("application/json")
                .body(dto)
                .when()
                .post("/api/v1/author")
                .then()
                .assertThat()
                .statusCode(201)
                .and()
                .body("name", equalTo(dto.getName()));
    }

}