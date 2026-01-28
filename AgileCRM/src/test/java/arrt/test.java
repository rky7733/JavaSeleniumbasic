package arrt;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class test {

	public static void main(String[] args) {
Response resp = RestAssured.given().auth().basic("evaritesh@com", "evaritesh@2001").accept(ContentType.JSON).get("https://evaritesh.agilecrm.com/dev/api/contacts");
String listingContactJson = resp.getBody().asPrettyString();
	System.out.println(listingContactJson);
	int statusCodeJson = resp.statusCode();
	System.out.println(statusCodeJson);
	
	}

}
