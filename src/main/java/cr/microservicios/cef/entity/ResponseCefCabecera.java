package cr.microservicios.cef.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseCefCabecera {

	@JsonProperty("Table")
	private List<ResponseCefDetalle> table;

	public List<ResponseCefDetalle> getTable() {
		return table;
	}

	public void setTable(List<ResponseCefDetalle> table) {
		this.table = table;
	}

}
