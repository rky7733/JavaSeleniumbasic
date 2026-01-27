package AgileAutomate;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ContactTestCasse {

	public static void main(String[] args) {
		contactById();
	}
public static void contactById() {
	Response rs = RestAssured.given().auth().basic("evaritesh@com", "evaritesh@2001").accept(ContentType.JSON)
	.get("https://evaritesh.agilecrm.com/dev/api/contacts/5554539161387008");
	
	String jsonresp = rs.getBody().asPrettyString();
	System.out.println(jsonresp);
	
	JSONObject jsonRoot = new JSONObject(jsonresp);
	Number rootId = jsonRoot.getNumber("id");
	System.out.println(rootId);
	JSONObject viewed= jsonRoot.getJSONObject("viewed");
	System.out.println(viewed);
	Number viewedTime = viewed.getNumber("viewed_time");
	System.out.println(viewedTime);
	JSONArray rootTags = jsonRoot.getJSONArray("tags");
	Object tagOne = rootTags.get(0);
	System.out.println(tagOne);
	Object tagTwo = rootTags.get(1);
	System.out.println(tagTwo);
	Object tagThree = rootTags.get(2);
	System.out.println(tagThree);
}
}






























