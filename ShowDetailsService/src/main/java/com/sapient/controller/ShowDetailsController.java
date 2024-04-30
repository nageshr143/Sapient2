package com.sapient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.sapient.request.CreateShowDetailsRequest;
import com.sapient.response.ShowDetailsResponse;
import com.sapient.service.ShowDetailsService;

@RestController
@RequestMapping("/api/showdetails")
public class ShowDetailsController {

	@Autowired
	ShowDetailsService showDetailsService;

	@PostMapping("/create")
	public ShowDetailsResponse createShow(@RequestBody CreateShowDetailsRequest createShowDetailsRequest) {
		
		return showDetailsService.createShowDetails(createShowDetailsRequest);
	}
	
	@GetMapping("/getById/{id}")
	public ShowDetailsResponse getByShowId(@PathVariable long id) {
		return showDetailsService.getById(id);
	}
	
}
