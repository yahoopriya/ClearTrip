package com.epam.cleartrip.utility;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonDataReader {

	private String date;

	private String fdest;

	private String tolocation;

	private String useremailid;

	private String title;

	private String uName;

	private String uLastName;

	private String umobileNo;

	private String adultCount;

	LinkedHashMap<String, String> map;

	public JsonDataReader() {

		try {
			this.loadDatafromjson();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;

	}

	public String getFdest() {
		return fdest;
	}

	public void setFdest(String fdest) {
		this.fdest = fdest;
	}

	public String getTolocation() {
		return tolocation;
	}

	public void setTolocation(String tolocation) {
		this.tolocation = tolocation;
	}

	public String getUseremailid() {
		return useremailid;
	}

	public void setUseremailid(String useremailid) {
		this.useremailid = useremailid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuLastName() {
		return uLastName;
	}

	public void setuLastName(String uLastName) {
		this.uLastName = uLastName;
	}

	public String getUmobileNo() {
		return umobileNo;
	}

	public void setUmobileNo(String umobileNo) {
		this.umobileNo = umobileNo;
	}

	public String getAdultCount() {
		return adultCount;
	}

	public void setAdultCount(String adultCount) {
		this.adultCount = adultCount;
	}

	@SuppressWarnings("unchecked")
	public void loadDatafromjson() throws IOException {

		File jsonfile = new File("D:\\MyNewwork-Space\\demo.epam.com\\Data\\flight.json");

		ObjectMapper mapper = new ObjectMapper();
		map = mapper.readValue(jsonfile, LinkedHashMap.class);

		this.setDate(this.map.get("date"));
		this.setAdultCount(this.map.get("adultCount"));
		this.setFdest(this.map.get("fdest"));
		this.setTolocation(this.map.get("tolocation"));
		this.setTitle(this.map.get("title"));
		this.setuLastName(this.map.get("uName"));
		this.setuName(this.map.get("uLastName"));
		this.setUmobileNo(this.map.get("umobileNo"));
		this.setUseremailid(this.map.get("useremailid"));
	}

	public static void main(String[] args) throws IOException {

		JsonDataReader obj = new JsonDataReader();
		System.out.println(obj.getDate());
		System.out.println(obj.getFdest());
	}
}