package AgileAutomate;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class JsonContentApis {

	public static void main(String[] args) {
	Response resp = RestAssured.given().auth().basic("evaritesh@com", "evaritesh@2001").accept(ContentType.JSON).get("https://evaritesh.agilecrm.com/dev/api/contacts");
	String jsoString=resp.getBody().asPrettyString();
	//System.out.println(jsoString);
	
	
	
	String creatingContactBody="{\r\n"
			+ "    \"star_value\": \"4\",\r\n"
			+ "    \"lead_score\": \"92\",\r\n"
			+ "    \"tags\": [\r\n"
			+ "        \"Lead\",\r\n"
			+ "        \"Likely Buyer\"\r\n"
			+ "    ],\r\n"
			+ "    \"properties\": [\r\n"
			+ "        {\r\n"
			+ "            \"type\": \"SYSTEM\",\r\n"
			+ "            \"name\": \"first_name\",\r\n"
			+ "            \"value\": \"shivam\"\r\n"
			+ "        },\r\n"
			+ "        {\r\n"
			+ "            \"type\": \"SYSTEM\",\r\n"
			+ "            \"name\": \"last_name\",\r\n"
			+ "            \"value\": \"Nolan\"\r\n"
			+ "        },\r\n"
			+ "        {\r\n"
			+ "            \"type\": \"SYSTEM\",\r\n"
			+ "            \"name\": \"email\",\r\n"
			+ "            \"subtype\": \"work\",\r\n"
			+ "            \"value\": \"dcGcai@walt.ltd\"\r\n"
			+ "        },\r\n"
			+ "        {\r\n"
			+ "            \"type\": \"SYSTEM\",\r\n"
			+ "            \"name\": \"address\",\r\n"
			+ "            \"value\": \"{\\\"address\\\":\\\"225 George Street\\\",\\\"city\\\":\\\"NSW\\\",\\\"state\\\":\\\"Sydney\\\",\\\"zip\\\":\\\"2000\\\",\\\"country\\\":\\\"Australia\\\"}\"\r\n"
			+ "        },\r\n"
			+ "        {\r\n"
			+ "            \"name\": \"phone\",\r\n"
			+ "            \"value\": \"8888888889\",\r\n"
			+ "            \"subtype\": \"work\"\r\n"
			+ "        },\r\n"
			+ "        {\r\n"
			+ "            \"name\": \"phone\",\r\n"
			+ "            \"value\": \"8888888889\",\r\n"
			+ "            \"subtype\": \"home\"\r\n"
			+ "        },\r\n"
			+ "        {\r\n"
			+ "            \"name\": \"website\",\r\n"
			+ "            \"value\": \"www.youtube.com\",\r\n"
			+ "            \"subtype\": \"YOUTUBE\"\r\n"
			+ "        },\r\n"
			+ "        {\r\n"
			+ "            \"name\": \"website\",\r\n"
			+ "            \"value\": \"www.linkedin.com\",\r\n"
			+ "            \"subtype\": \"LINKEDIN\"\r\n"
			+ "        },\r\n"
			+ "        {\r\n"
			+ "            \"name\": \"website\",\r\n"
			+ "            \"value\": \"www.mywebsite.com\",\r\n"
			+ "            \"subtype\": \"URL\"\r\n"
			+ "        },\r\n"
			+ "        {\r\n"
			+ "            \"name\": \"My custom field of type text\",\r\n"
			+ "            \"type\": \"CUSTOM\",\r\n"
			+ "            \"value\": \"My name is ghanshyam\"\r\n"
			+ "        },\r\n"
			+ "        {\r\n"
			+ "            \"name\": \"My custom field of type date\",\r\n"
			+ "            \"type\": \"CUSTOM\",\r\n"
			+ "            \"value\": 1479580200\r\n"
			+ "        },\r\n"
			+ "        {\r\n"
			+ "            \"name\": \"My custom field of type checkbox\",\r\n"
			+ "            \"type\": \"CUSTOM\",\r\n"
			+ "            \"value\": \"on\"\r\n"
			+ "        },\r\n"
			+ "        {\r\n"
			+ "            \"name\": \"My custom field of type list\",\r\n"
			+ "            \"type\": \"CUSTOM\",\r\n"
			+ "            \"value\": \"lemon\"\r\n"
			+ "        },\r\n"
			+ "        {\r\n"
			+ "            \"name\": \"My custom field of type companies\",\r\n"
			+ "            \"type\": \"CUSTOM\",\r\n"
			+ "            \"value\": \"[\\\"5767466600890368\\\",\\\"5114076984246272\\\",\\\"5746725247516672\\\"]\"\r\n"
			+ "        }\r\n"
			+ "    ]\r\n"
			+ "}";
	
	
	Response resp2=RestAssured.given().auth().basic("evaritesh@com", "evaritesh@2001").accept(ContentType.JSON).contentType(ContentType.JSON)
	.body(creatingContactBody).post("https://evaritesh.agilecrm.com/dev/api/contacts");
	
	String creatingContactJson=resp2.getBody().asPrettyString();
	System.out.println(creatingContactJson);
	int statusCode = resp2.statusCode();
	System.out.println(statusCode);
	
	}
}
