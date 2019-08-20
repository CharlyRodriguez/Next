package com.bbva.mfad.batch.chunk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class RequestWriter implements ItemWriter<StringBuilder>{

	private static final Logger LOGGER = LoggerFactory.getLogger(RequestWriter.class);

	@Override
	public void write(List<? extends StringBuilder> map) throws Exception {
		for (StringBuilder seguimientoDTO : map) {
			LOGGER.warn("SALIDA: " + map);
		}
	}
}
