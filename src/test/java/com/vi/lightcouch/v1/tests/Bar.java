package com.vi.lightcouch.v1.tests;

import com.vi.lightcouch.v1.Document;

public class Bar extends Document {
	private String bar;
	
	public Bar() {
		
	}
	
	public Bar(String id) {
		this.setId(id);
	}

	public String getBar() {
		return bar;
	}

	public void setBar(String bar) {
		this.bar = bar;
	}

	@Override
	public String toString() {
		return "Bar [bar=" + bar + "]";
	}
}
