package com.country.data.service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;

import com.country.data.model.Country;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author nisshukl0
 *
 */
public class ResponseHandler {
	private static final Log LOGGER = LogFactory.getLog(ResponseHandler.class);

	public Country executeRequest(String countryName) {
		Country country = null;
		PoolingHttpClientConnectionManager manager = new ConnectionManager().getConnectionManager();
		CloseableHttpClient client = HttpClients.custom().setConnectionManager(manager).build();
		HttpGet get = new HttpGet("https://restcountries-v1.p.rapidapi.com/name/" + countryName);
		get.addHeader("X-RapidAPI-Host", "restcountries-v1.p.rapidapi.com");
		get.addHeader("X-RapidAPI-Key", "3588b53f81mshb3756b0faa7195bp152291jsn9562b479f61a");
		try {
			HttpResponse response = client.execute(get);
			country = processResponse(response);
		} catch (ClientProtocolException e) {
			LOGGER.error("ClientProtocolException : " + e.getMessage());
		} catch (IOException e) {
			LOGGER.error("IOException in response : " + e.getMessage());
		} finally {
			try {
				client.close();
			} catch (IOException e) {
				LOGGER.error("IOException : " + e.getMessage());
			}
			manager.close();
		}
		return country;
	}

	/**
	 * @param response
	 * @throws IOException
	 */
	public Country processResponse(HttpResponse response) throws IOException {
		Header[] headers = response.getAllHeaders();
		Country country = null;
		for (Header header : headers) {
			LOGGER.info("Response Header Key : " + header.getName() + " ,Value : " + header.getValue());
		}
		StatusLine status = response.getStatusLine();
		if (status.getStatusCode() == 200) {
			LOGGER.info("valid response received");
			String resp = EntityUtils.toString(response.getEntity(), StandardCharsets.UTF_8);
			resp = StringUtils.removeStart(resp, "[");
			resp = StringUtils.removeEnd(resp, "]");
			LOGGER.info(resp);
			country = new ObjectMapper().readValue(resp, Country.class);
		}
		EntityUtils.consume(response.getEntity());
		return country;
	}

}
