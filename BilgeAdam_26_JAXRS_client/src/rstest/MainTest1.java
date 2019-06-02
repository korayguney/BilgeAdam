package rstest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;

import entity.Student;

public class MainTest1 {

	public static void main(String[] args) throws IOException {
		int userId = 3;
		
		URL url = new URL("http://localhost:8080/BilgeAdam_26_JAXRS_server/rest/UserService/getUserbyId/" + userId);
		
		InputStream inputStream = url.openStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		
		String txt = "";
		
		while (true) {
			String readedTxt = reader.readLine();
			
			if(readedTxt == null) 
				break;
			
			txt += readedTxt;
			System.out.println(readedTxt);
		}
		
		Gson gson = new Gson();
		Student s = gson.fromJson(txt, Student.class);
		
		System.out.println(s);
		
	}
	
	
	
}
