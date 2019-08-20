package com.bbva.mfad.batch.mapper;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class RequestMapper implements FieldSetMapper<StringBuilder> {

	@Override
	public StringBuilder mapFieldSet(FieldSet fieldSet) throws BindException {
		StringBuilder sb = new StringBuilder();
		sb.append(fieldSet.readRawString("CATNEGOCIO"));
		sb.append(fieldSet.readRawString("SOLICITUD"));
		sb.append("ETS0000008");
		return sb;
	}

}
