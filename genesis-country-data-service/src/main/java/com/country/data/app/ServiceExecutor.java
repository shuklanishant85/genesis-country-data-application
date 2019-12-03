package com.country.data.app;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.country.data.model.Country;
import com.country.data.service.ResponseHandler;

public class ServiceExecutor {

	public static final String PATH = "C:/Project/Development/APAD/genesis-country-data-service/configuration/countryList.txt";

	public static void main(String[] args) {
		try {
			@SuppressWarnings("unchecked")
			List<String> countryList = FileUtils.readLines(new File(PATH));
			for (String countryName : countryList) {
				Country country = new ResponseHandler().executeRequest(countryName);
				if (country != null) {
					System.out.println(country.toString());
					if (country.getNumericCode() != null) {
						System.out.println("\n\n");
						System.out.println("country : " + country.getName());
						System.out.println("numeric code : " + country.getNumericCode());
						System.out.println("capital : " + country.getCapital());
						System.out.println("currencies : " + country.getCurrencies().toString());
						System.out.println("population : " + country.getPopulation());
						System.out.println("borders : " + country.getBorders().toString());
						System.out.println("----------------------------------------------");
						System.out.println("\n\n");

					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
