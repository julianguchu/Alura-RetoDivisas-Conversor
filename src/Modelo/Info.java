package Modelo;

import java.sql.Timestamp;

public class Info {
	
	private Double rate;
	private Timestamp timestamp;
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "Info [rate=" + rate + ", timestamp=" + timestamp + "]";
	}
	

	
	
}
