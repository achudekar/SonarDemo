package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.DemoDto;

@RestController
public class DemoController {

	@GetMapping("/")
	private List<DemoDto> getDemoJSON() {
		List<DemoDto> demoDtos = new ArrayList<>();
		System.out.println("Hello");
		for(int i = 0; i < 100 ; i++) {
			DemoDto demoDto = new DemoDto();
			demoDto.setElementName("Element");
			demoDto.setElementIndex(i);
			demoDtos.add(demoDto);
		}
		
		return demoDtos;
	}
	
// 	@RequestMapping(value = "/abc")
// 	public void index(HttpServletResponse res, String value) {
//     		res.setHeader("Set-Cookie", value);
//     		Cookie cookie = new Cookie("jsessionid", value);
// 		res.addCookie(cookie);
// 	}

}
