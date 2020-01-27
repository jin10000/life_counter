package org.king.life_counter.controller;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	@GetMapping(value = "ex")
	public Map<String,Object> ex(){
		Map<String,Object> resMap = new HashMap<>();
		resMap.put("owner", "jinman");
		return resMap;
	}
	
	// 어떤 메소드 추가
}
