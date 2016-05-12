package com.liferay.mobile.screens.ddl.form.connector;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * @author Javier Gamarra
 */
public interface ScreensDDLRecordConnector {
	JSONArray getDdlRecords(long recordSetId, long userId, String s, int startRow, int endRow) throws Exception;

	JSONArray getDdlRecords(long recordSetId, String s, int startRow, int endRow) throws Exception;

	Integer getDdlRecordsCount(long recordSetId, long userId) throws Exception;

	Integer getDdlRecordsCount(long recordSetId) throws Exception;

	JSONObject getDdlRecord(long recordId, String s) throws Exception;
}
