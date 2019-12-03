package com.country.data.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Translations {

	@JsonProperty("de")
	private String de;
	@JsonProperty("es")
	private String es;
	@JsonProperty("fr")
	private String fr;
	@JsonProperty("ja")
	private String ja;
	@JsonProperty("it")
	private String it;

	@JsonProperty("de")
	public String getDe() {
		return de;
	}

	@JsonProperty("de")
	public void setDe(String de) {
		this.de = de;
	}

	@JsonProperty("es")
	public String getEs() {
		return es;
	}

	@JsonProperty("es")
	public void setEs(String es) {
		this.es = es;
	}

	@JsonProperty("fr")
	public String getFr() {
		return fr;
	}

	@JsonProperty("fr")
	public void setFr(String fr) {
		this.fr = fr;
	}

	@JsonProperty("ja")
	public String getJa() {
		return ja;
	}

	@JsonProperty("ja")
	public void setJa(String ja) {
		this.ja = ja;
	}

	@JsonProperty("it")
	public String getIt() {
		return it;
	}

	@JsonProperty("it")
	public void setIt(String it) {
		this.it = it;
	}

}