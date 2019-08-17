package com.zxd.Beans;

import java.util.ArrayList;
import java.util.List;

public class PageBean {
	private List<Emp> list = new ArrayList<Emp>();
	private int pageSize = 0;
	private int curPage = 0;
	private int totalCnt = 0;
	private int totalPage = 0;
	
	public PageBean() {}
	
	public List<Emp> getList() {
		return list;
	}
	public void setList(List<Emp> list) {
		this.list = list;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	public int getTotalCnt() {
		return totalCnt;
	}
	public void setTotalCnt(int totalCnt) {
		this.totalCnt = totalCnt;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
}
