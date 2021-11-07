package com.ananth.jasonparsing;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Jason {
private static ObjectMapper objectMapper = getDefaultObjectMapper();
 
private static ObjectMapper getDefaultObjectMapper() {
	// TODO Auto-generated method stub
	ObjectMapper defaultObjectMapper = new ObjectMapper();
	return defaultObjectMapper;
}

public static JsonNode jparse(String src) throws IOException {
	return objectMapper.readTree(src);
	
}



}
