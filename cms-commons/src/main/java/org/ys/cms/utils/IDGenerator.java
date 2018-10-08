package org.ys.cms.utils;

import java.util.UUID;

public class IDGenerator {
	private IDGenerator(){}
	
	public static String generateUUID(){
		return UUID.randomUUID().toString();
	}
}
