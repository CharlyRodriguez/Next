package com.bbva.mfad.batch.chunk;

import org.springframework.batch.item.ItemProcessor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class RequestProcessor implements ItemProcessor<StringBuilder, StringBuilder>{
private static final String FORMATO_PARAMETRO = "yyyyMMdd";
private static final String FORMATO_BD = "dd/MM/yyyy";
private String fecha;

	@Override
	public StringBuilder process(StringBuilder seguimiento) throws Exception {
		DateFormat jobDateformat = new SimpleDateFormat(FORMATO_PARAMETRO);
		DateFormat oracleDateFormat = new SimpleDateFormat(FORMATO_BD);
		
		Date fechaDt = jobDateformat.parse(fecha);
		String fhCons = oracleDateFormat.format(fechaDt); // dd/MM/yyyy
		fechaDt = oracleDateFormat.parse(fhCons);
		seguimiento.append(fechaDt);
		return seguimiento;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}
