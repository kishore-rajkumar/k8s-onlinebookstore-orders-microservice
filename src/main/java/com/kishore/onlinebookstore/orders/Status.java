package com.kishore.onlinebookstore.orders;

public enum Status {
	SHIPPED("Shipped"), IN_TRANSIT("In transit");

	private String description;

	Status(String desc) {
		this.description = desc;
	}

	public String get() {
		return description;
	}

}
