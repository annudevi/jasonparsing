package com.ananth.jasonparsing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.JsonNode;

class JasonTest {
	 private String simpleTestCasejsonSource = "{ \"title\":\"code from ananth\"}";
	  
	
	@Test
	void test() throws IOException {
		JsonNode node = Jason.jparse(simpleTestCasejsonSource);
		String actual = "code from ananth";
		System.out.println(node.get("title").asText());
		assertEquals(node.get("title").asText(), actual);
		
	}
	
	
}
