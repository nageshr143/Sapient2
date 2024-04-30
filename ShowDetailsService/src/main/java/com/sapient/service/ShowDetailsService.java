package com.sapient.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.entity.ShowDetails;
import com.sapient.repository.ShowDetailsRepository;
import com.sapient.request.CreateShowDetailsRequest;
import com.sapient.response.ShowDetailsResponse;

@Service
public class ShowDetailsService {

	Logger logger = LoggerFactory.getLogger(ShowDetailsService.class);
	
	@Autowired
	ShowDetailsRepository showDetailsRepository;

	public ShowDetailsResponse createShowDetails(CreateShowDetailsRequest createShowDetailsRequest) {
		
		logger.info("createShowDetails ");
		ShowDetails showDetails = new ShowDetails();
		showDetails.setShowName(createShowDetailsRequest.getShowName());
		showDetails.setStartTime(createShowDetailsRequest.getStartTime());
		
		showDetailsRepository.save(showDetails);
		
		return new ShowDetailsResponse(showDetails);
		
	}
	
	public ShowDetailsResponse getById (long id) {
		
		logger.info("Inside getById " + id);
		
		ShowDetails showDetails = showDetailsRepository.findById(id).get();
		
		return new ShowDetailsResponse(showDetails);
	}
	
}
