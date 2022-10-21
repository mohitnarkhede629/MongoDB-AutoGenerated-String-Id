package com.technoelevate.mongodb.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Response {
	
	public boolean error;
	public String  messege;
	public Object data;

}
