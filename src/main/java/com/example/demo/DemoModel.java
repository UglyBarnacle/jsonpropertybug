package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@Document
public class DemoModel
{
	@JsonProperty("doNotWant")
	private String doWantName;

	@Id
	private String id;
}
