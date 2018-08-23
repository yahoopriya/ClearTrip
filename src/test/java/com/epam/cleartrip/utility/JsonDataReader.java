package com.epam.cleartrip.utility;


import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JsonDataReader {

	private String date ;

	private String fdest;

	private String tolocation;

	private String useremailid;

	private String title;

	private String uName;

	private String uLastName;

	private String umobileNo;

	private String adultCount;
	
	LinkedHashMap<String, String> map ;
	
	public String getDate() {
		
		System.out.println(this.date);
		return date;
	}


	public void setDate(String date) {
		this.date = date;
		
	}


	public String getFdest() {
		return fdest;
	}


	public void setFdest(String fdest) {
		this.fdest = map.get(fdest);
	}


	public String getTolocation() {
		return tolocation;
	}


	public void setTolocation(String tolocation) {
		this.tolocation =(String)(tolocation);
	}


	public String getUseremailid() {
		return useremailid;
	}


	public void setUseremailid(String useremailid) {
		this.useremailid = map.get(useremailid);
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = map.get(title);
	}


	public String getuName() {
		return uName;
	}


	public void setuName(String uName) {
		this.uName = map.get(uName);
	}


	public String getuLastName() {
		return uLastName;
	}


	public void setuLastName(String uLastName) {
		this.uLastName = map.get(uLastName);
	}


	public String getUmobileNo() {
		return umobileNo;
	}


	public void setUmobileNo(String umobileNo) {
		this.umobileNo = map.get(umobileNo);
	}


	public String getAdultCount() {
		return adultCount;
	}


	public  void setAdultCount(String adultCount) {
		this.adultCount = map.get(adultCount);
	}

	
	@SuppressWarnings("unchecked")
	public void loadDatafromjson() throws IOException {
		
		File jsonfile = new File("D:\\MyNewwork-Space\\demo.epam.com\\Data\\flight.json");
		
	    ObjectMapper mapper = new ObjectMapper();
	     map = mapper.readValue(jsonfile, LinkedHashMap.class);
		System.out.println(map);
		this.date = map.get(date);	
	}
	
	public static void main(String[] args) throws IOException {
		
		JsonDataReader obj = new JsonDataReader();
		obj.loadDatafromjson();
		obj.setDate(obj.map.get("date"));
		System.out.println(obj.getDate());
}
}