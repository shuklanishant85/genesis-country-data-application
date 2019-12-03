package com.country.data.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

/**
 * @author nisshukl0
 *
 */
public class ConnectionManager {

	private static final Log LOGGER = LogFactory.getLog(ConnectionManager.class);

	/**
	 * @return
	 */
	public PoolingHttpClientConnectionManager getConnectionManager() {
		LOGGER.info("creating new pooling connection manager");
		PoolingHttpClientConnectionManager poolingConnectionManager = new PoolingHttpClientConnectionManager();
		poolingConnectionManager.setMaxTotal(3);
		poolingConnectionManager.setDefaultMaxPerRoute(2);
		return poolingConnectionManager;
	}

}
