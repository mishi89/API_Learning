package API_Hit_Using_ExistingJsonFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class Post_Resquest {

	public static void main(String[] args) throws FileNotFoundException {
	
	/*	File file = new File("../API_New_learning/db.json");
		FileReader reader = new FileReader(file);
		JSONTokener tokenor = new JSONTokener(reader);
		JSONObject jsonarray = new JSONObject(tokenor);
		String s = jsonarray.toString();
		*/
/*	--------------------------- Through Userinput---------------------*/
		/*System.out.println("Enter email id ");
		Scanner scanner  = new Scanner(System.in);
		String id = scanner.next();*/
	
		/*---------------- Through Random function -----------------------------*/
		Random rand = new  Random();
	int  a = rand.nextInt();
	
	
	/*String id = String.valueOf(a);
		s =s.replaceAll(Pattern.quote("{{id}}"), id);*/
	/*System.out.println(s);*/

		Response res = given().contentType(ContentType.JSON).when()
				.get("http://localhost:3000/StudentDetails");
	/*	System.out.println(res.statusCode());
		System.out.println(res.asString());*/
		/*String name =res.jsonPath().get("id");
		System.out.println("First Name" +" " + name);*/
		
		System.out.println(res.asString());

	}

}
