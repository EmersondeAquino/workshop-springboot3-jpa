package com.emersonweb.courso.entites.enums;

public enum OrderStatus {

	Waiting_Payment(1),
	Paid(2),
	shipped(3),
	canceled(4),
	delivered(5); 
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static OrderStatus valueOf(int code) {
		for (OrderStatus value :OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
}
