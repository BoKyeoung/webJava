package ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;


public class HttpMainTest4 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/comments/10");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			connection.setRequestMethod("GET"); // POST
			connection.setRequestProperty("Content-type", "application/json");
			connection.connect();

			int statusCode = connection.getResponseCode();

			System.out.println("statusCode : " + statusCode);

			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

			StringBuffer sb = new StringBuffer();
			String line = null;

			if (statusCode == 200) {

				while ((line = reader.readLine()) != null) {
					sb.append(line);
				}
			} else {
				System.out.println("서버에 연결을 할 수 없습니다.");
			}

			String str = sb.toString();
			Gson gson = new Gson();
//			Post post = gson.fromJson(str, Post.class);
			Dao dao = gson.fromJson(str, Dao.class);
			
			System.out.println(dao.postId);
			System.out.println(dao.body);
			System.out.println(dao.email);
			System.out.println(dao.id);
			System.out.println(dao.name);
			

		} catch (MalformedURLException e) {
			e.printStackTrace();

		} catch (IOException e) {

		}

	}

}
