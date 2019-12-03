
package com.country.data.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {

	@JsonProperty("name")
	private String name;
	@JsonProperty("topLevelDomain")
	private List<String> topLevelDomain;
	@JsonProperty("alpha2Code")
	private String alpha2Code;
	@JsonProperty("alpha3Code")
	private String alpha3Code;
	@JsonProperty("callingCodes")
	private List<String> callingCodes;
	@JsonProperty("capital")
	private String capital;
	@JsonProperty("altSpellings")
	private List<String> altSpellings;
	@JsonProperty("region")
	private String region;
	@JsonProperty("subregion")
	private String subregion;
	@JsonProperty("population")
	private Integer population;
	@JsonProperty("latlng")
	private List<Float> latlng;
	@JsonProperty("demonym")
	private String demonym;
	@JsonProperty("area")
	private Float area;
	@JsonProperty("gini")
	private Object gini;
	@JsonProperty("timezones")
	private List<String> timezones;
	@JsonProperty("borders")
	private List<String> borders;
	@JsonProperty("nativeName")
	private String nativeName;
	@JsonProperty("numericCode")
	private String numericCode;
	@JsonProperty("currencies")
	private List<String> currencies;
	@JsonProperty("languages")
	private List<String> languages;
	@JsonProperty("relevance")
	private String relevance;

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("topLevelDomain")
	public List<String> getTopLevelDomain() {
		return topLevelDomain;
	}

	@JsonProperty("topLevelDomain")
	public void setTopLevelDomain(List<String> topLevelDomain) {
		this.topLevelDomain = topLevelDomain;
	}

	@JsonProperty("alpha2Code")
	public String getAlpha2Code() {
		return alpha2Code;
	}

	@JsonProperty("alpha2Code")
	public void setAlpha2Code(String alpha2Code) {
		this.alpha2Code = alpha2Code;
	}

	@JsonProperty("alpha3Code")
	public String getAlpha3Code() {
		return alpha3Code;
	}

	@JsonProperty("alpha3Code")
	public void setAlpha3Code(String alpha3Code) {
		this.alpha3Code = alpha3Code;
	}

	@JsonProperty("callingCodes")
	public List<String> getCallingCodes() {
		return callingCodes;
	}

	@JsonProperty("callingCodes")
	public void setCallingCodes(List<String> callingCodes) {
		this.callingCodes = callingCodes;
	}

	@JsonProperty("capital")
	public String getCapital() {
		return capital;
	}

	@JsonProperty("capital")
	public void setCapital(String capital) {
		this.capital = capital;
	}

	@JsonProperty("altSpellings")
	public List<String> getAltSpellings() {
		return altSpellings;
	}

	@JsonProperty("altSpellings")
	public void setAltSpellings(List<String> altSpellings) {
		this.altSpellings = altSpellings;
	}

	@JsonProperty("region")
	public String getRegion() {
		return region;
	}

	@JsonProperty("region")
	public void setRegion(String region) {
		this.region = region;
	}

	@JsonProperty("subregion")
	public String getSubregion() {
		return subregion;
	}

	@JsonProperty("subregion")
	public void setSubregion(String subregion) {
		this.subregion = subregion;
	}

	@JsonProperty("population")
	public Integer getPopulation() {
		return population;
	}

	@JsonProperty("population")
	public void setPopulation(Integer population) {
		this.population = population;
	}

	@JsonProperty("latlng")
	public List<Float> getLatlng() {
		return latlng;
	}

	@JsonProperty("latlng")
	public void setLatlng(List<Float> latlng) {
		this.latlng = latlng;
	}

	@JsonProperty("demonym")
	public String getDemonym() {
		return demonym;
	}

	@JsonProperty("demonym")
	public void setDemonym(String demonym) {
		this.demonym = demonym;
	}

	@JsonProperty("area")
	public Float getArea() {
		return area;
	}

	@JsonProperty("area")
	public void setArea(Float area) {
		this.area = area;
	}

	@JsonProperty("gini")
	public Object getGini() {
		return gini;
	}

	@JsonProperty("gini")
	public void setGini(Object gini) {
		this.gini = gini;
	}

	@JsonProperty("timezones")
	public List<String> getTimezones() {
		return timezones;
	}

	@JsonProperty("timezones")
	public void setTimezones(List<String> timezones) {
		this.timezones = timezones;
	}

	@JsonProperty("borders")
	public List<String> getBorders() {
		return borders;
	}

	@JsonProperty("borders")
	public void setBorders(List<String> borders) {
		this.borders = borders;
	}

	@JsonProperty("nativeName")
	public String getNativeName() {
		return nativeName;
	}

	@JsonProperty("nativeName")
	public void setNativeName(String nativeName) {
		this.nativeName = nativeName;
	}

	@JsonProperty("numericCode")
	public String getNumericCode() {
		return numericCode;
	}

	@JsonProperty("numericCode")
	public void setNumericCode(String numericCode) {
		this.numericCode = numericCode;
	}

	@JsonProperty("currencies")
	public List<String> getCurrencies() {
		return currencies;
	}

	@JsonProperty("currencies")
	public void setCurrencies(List<String> currencies) {
		this.currencies = currencies;
	}

	@JsonProperty("languages")
	public List<String> getLanguages() {
		return languages;
	}

	@JsonProperty("languages")
	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	@JsonProperty("relevance")
	public String getRelevance() {
		return relevance;
	}

	@JsonProperty("relevance")
	public void setRelevance(String relevance) {
		this.relevance = relevance;
	}

}