package com.sapient.response;

import com.sapient.entity.ShowDetails;

public class ShowDetailsResponse {

	public long getShowId() {
		return showId;
	}

	public void setShowId(long showId) {
		this.showId = showId;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	private long showId;

	private String showName;

	private String startTime;
	
	public ShowDetailsResponse(ShowDetails address) {
		this.showId = address.getId();
		this.showName = address.getShowName();
		this.startTime = address.getStartTime();
	}


}
