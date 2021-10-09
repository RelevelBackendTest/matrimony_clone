package com.relevel.backend.matrimony.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatrimonyController {

	@GetMapping("/ping")
	public String ping() {
		return "Ping is Successful";
	}
}

