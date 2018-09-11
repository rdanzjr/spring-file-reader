package com.rickydanzberger;

public class CensusReportDataRow 
{

	private Integer ZipCode;
	private Integer TotalPopulation;
	private Double MedianAge;
	private Integer TotalMales;
	private Integer TotalFemales;
	private Integer TotalHousehold;
	private Double AverageHouseHoldSize;
	
	
	
	public CensusReportDataRow(String[] data)
	{
		this.setZipCode(Integer.valueOf(data[0]));
		this.setTotalPopulation(Integer.valueOf(data[1]));
		this.setMedianAge(Double.valueOf(data[2]));
		this.setTotalMales(Integer.valueOf(data[3]));
		this.setTotalFemales(Integer.valueOf(data[4]));
		//this.setTotalHousehold(Integer.valueOf(data[5]));
		//this.setAverageHouseHoldSize(Double.valueOf(data[6]));
		
		
	}
	
	
	public Integer getZipCode() {
		return ZipCode;
	}
	public void setZipCode(Integer zipCode) {
		ZipCode = zipCode;
	}
	public Integer getTotalPopulation() {
		return TotalPopulation;
	}
	public void setTotalPopulation(Integer totalPopulation) {
		TotalPopulation = totalPopulation;
	}
	public Double getMedianAge() {
		return MedianAge;
	}
	public void setMedianAge(Double medianAge) {
		MedianAge = medianAge;
	}
	public Integer getTotalMales() {
		return TotalMales;
	}
	public void setTotalMales(Integer totalMales) {
		TotalMales = totalMales;
	}
	public Integer getTotalFemales() {
		return TotalFemales;
	}
	public void setTotalFemales(Integer totalFemales) {
		TotalFemales = totalFemales;
	}
	public Integer getTotalHousehold() {
		return TotalHousehold;
	}
	public void setTotalHousehold(Integer totalHousehold) {
		TotalHousehold = totalHousehold;
	}
	public Double getAverageHouseHoldSize() {
		return AverageHouseHoldSize;
	}
	public void setAverageHouseHoldSize(Double averageHouseHoldSize) {
		AverageHouseHoldSize = averageHouseHoldSize;
	}


	@Override
	public String toString() {
		return "CensusReportDataRow [ZipCode=" + ZipCode + ", TotalPopulation=" + TotalPopulation + ", MedianAge="
				+ MedianAge + ", TotalMales=" + TotalMales + ", TotalFemales=" + TotalFemales + ", TotalHousehold="
				+ TotalHousehold + ", AverageHouseHoldSize=" + AverageHouseHoldSize + "]";
	}
	
	
}
