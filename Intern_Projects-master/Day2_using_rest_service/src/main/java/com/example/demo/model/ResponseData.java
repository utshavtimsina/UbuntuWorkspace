package com.example.demo.model;

import java.io.Serializable;

public class ResponseData<T> implements Serializable {
 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2080645787965256437L;
	private int page;
	private int per_page;
	private int total;
	private int total_pages;
	private T data;
	
	@Override
	public String toString() {
		return "ResponseData [page=" + page + ", per_page=" + per_page + ", total=" + total + ", total_pages="
				+ total_pages + ", data=" + data + "]";
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPer_page() {
		return per_page;
	}
	public void setPer_page(int per_page) {
		this.per_page = per_page;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTotal_pages() {
		return total_pages;
	}
	public void setTotal_pages(int total_pages) {
		this.total_pages = total_pages;
	}
	public T getData() {
		return data;
	}
	public ResponseData() {
		//super();
		// TODO Auto-generated constructor stub
	}
	public ResponseData(int page, int per_page, int total, int total_pages, T data) {
		super();
		this.page = page;
		this.per_page = per_page;
		this.total = total;
		this.total_pages = total_pages;
		this.data = data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	
	
	
}
