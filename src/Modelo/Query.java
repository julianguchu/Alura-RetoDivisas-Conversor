package Modelo;

public class Query {
	
	  private Integer  amount;
	  private String  from;
	  private String  to;
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	@Override
	public String toString() {
		return "Query [amount=" + amount + ", from=" + from + ", to=" + to + "]";
	}
	
	  
	  
}
