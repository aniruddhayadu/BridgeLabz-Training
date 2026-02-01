package com.json.basics;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FilterJson {
	public static void main(String[] args) throws Exception {

		ObjectMapper mapper = new ObjectMapper(); // JSON parser

		String json = "[{\"name\":\"Aniruddha\",\"age\":20},{\"name\":\"Princi\",\"age\":22},{\"name\":\"Nikki\",\"age\":27}]";
		JsonNode root = mapper.readTree(json); // parse JSON array

		for (JsonNode node : root) {
			if (node.get("age").asInt() > 25) { // filter condition
				System.out.println(node); // matching record
			}
		}
	}
}