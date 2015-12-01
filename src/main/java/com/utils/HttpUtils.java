package com.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class HttpUtils {
	
	public static String readRequestBody(InputStream in) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String line = null;

        StringBuilder responseData = new StringBuilder();
        while((line = reader.readLine()) != null) {
            responseData.append(line);
        }
        return responseData.toString();
	}

}
