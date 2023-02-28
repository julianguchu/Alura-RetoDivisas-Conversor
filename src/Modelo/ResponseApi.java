package Modelo;

import java.util.Date;

public class ResponseApi {
	private Date date;
	private Info info;
	private Query query;
	private Double result;
	private boolean success;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

	public Query getQuery() {
		return query;
	}

	public void setQuery(Query query) {
		this.query = query;
	}

	public Double getResult() {
		return result;
	}

	public void setResult(Double result) {
		this.result = result;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	@Override
	public String toString() {
		return "ResponseApi [date=" + date + ", info=" + info + ", query=" + query + ", result=" + result + ", success="
				+ success + "]";
	}

}
