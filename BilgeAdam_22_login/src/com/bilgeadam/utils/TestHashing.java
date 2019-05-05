package com.bilgeadam.utils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class TestHashing {

	public static void main(String[] args) {
		StringBuilder str = hashPassword("koray", HashAlgorithm.SHA256);
		System.out.println("Hashed value : " + str);
	}

	
	public static StringBuilder hashPassword(String password, HashAlgorithm hashAlgoritm) {
		StringBuilder str = new StringBuilder();
		
		try {
			MessageDigest messageDigest = MessageDigest.getInstance(hashAlgoritm.getHashAlg());
			
			byte[] hashedPassword = messageDigest.digest(password.getBytes(StandardCharsets.UTF_8));
			
			
			for (byte b : hashedPassword) {
				str.append(String.format("%02x", b));
			}
			
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return str;
		
	}
	
}
