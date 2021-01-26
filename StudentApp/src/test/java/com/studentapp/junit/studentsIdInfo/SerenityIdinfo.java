package com.studentapp.junit.studentsIdInfo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;



import io.restassured.RestAssured;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Manual;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Title;

@SuppressWarnings("unused")
@RunWith(SerenityRunner.class)
public class SerenityIdinfo {
	
	@BeforeClass
	public static void init(){
		RestAssured.baseURI="http://localhost:8080/student";
	}
	
	@Test
	public void getAllStudents(){
		SerenityRest.given()
		.when()
		.get("/list")
		.then()
		.log()
		.all()
		.statusCode(200);
	}
}
