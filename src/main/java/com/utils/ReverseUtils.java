package com.utils;

public class ReverseUtils {

	public static String reverse(String message){
		if(message != null){
			message = new StringBuilder(message).reverse().toString();
		}
		return message;
	}
	
}
