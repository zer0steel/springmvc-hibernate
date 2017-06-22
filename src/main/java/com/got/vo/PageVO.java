package com.got.vo;

public class PageVO {

	private int showRecordCount = 10;
	private int totalRecordCount;
	private int totalPageCount;
	private int start;
	private int end;
	private int currPage;
	
	public PageVO(int totalRecordCount, int currPage) {
		this.currPage = currPage;
		this.totalRecordCount = totalRecordCount;
		setTotalPage(totalRecordCount);
		setStartAndEnd(currPage);
	}

	private void setTotalPage(int totalRecordCount) {
		this.totalPageCount = (int) Math.ceil((double)totalRecordCount / this.showRecordCount);
	}

	private void setStartAndEnd(int currPage) {
		this.end = currPage * this.showRecordCount - 1;
		this.start = (currPage - 1) * this.showRecordCount;
	}
	
	public int getShowRecordCount() {
		return showRecordCount;
	}

	public void setShowRecordCount(int showRecordCount) {
		this.showRecordCount = showRecordCount;
	}

	public int getTotalRecordCount() {
		return totalRecordCount;
	}

	public int getTotalPageCount() {
		return totalPageCount;
	}

	public int getStart() {
		return start;
	}

	public int getEnd() {
		return end;
	}

	public int getCurrPage() {
		return currPage;
	}

	@Override
	public String toString() {
		return "PageVO [showRecordCount=" + showRecordCount + ", totalRecordCount=" + totalRecordCount
				+ ", totalPageCount=" + totalPageCount + ", start=" + start + ", end=" + end + ", currPage=" + currPage
				+ "]";
	}
}
