package junitpkg;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;

public class Linkvalidation {
	String y="https://www.google.com";
	
	@Test
	public void fu() {
		try {
			URL s=new URL(y);//constructor
			HttpURLConnection con=(HttpURLConnection)s.openConnection();//casting
			int code=con.getResponseCode();//response code
			System.out.println(code);
			
			if(code==200) {
				System.out.println("Response code 200 successful");
			}
			else {
				System.out.println("Not expected");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
