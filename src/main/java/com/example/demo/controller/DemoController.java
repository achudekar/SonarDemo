package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.DemoDto;

@RestController
public class DemoController {

	@GetMapping("/")
	private List<DemoDto> getDemoJSON() {
		List<DemoDto> demoDtos = new ArrayList<>();
		
		for(int i = 0; i < 100 ; i++) {
			DemoDto demoDto = new DemoDto();
			demoDto.setElementName("Element");
			demoDto.setElementIndex(i);
			demoDtos.add(demoDto);
		}
		
		return demoDtos;
	}

}
