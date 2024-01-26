package entities;

import java.util.Date;

public class HourContract {
	private Date date;
	private Double valuePerHour;
	private Integer hours;
	public HourContract() {
		super();
	}
	public HourContract(Date date, Double valueperHour, Integer hours) {
		this.date = date;
		valuePerHour = valueperHour;
		this.hours = hours;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Double getValueperHour() {
		return valuePerHour;
	}
	public void setValueperHour(Double valueperHour) {
		valuePerHour = valueperHour;
	}
	public Integer getHours() {
		return hours;
	}
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public double totalValue() {
		return valuePerHour * hours;
	}
	
}
