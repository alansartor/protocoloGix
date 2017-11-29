package ar.com.gix.gixServer.support;

/**
 * 
 * @author alansartor18@hotmail.com
 *
 */
public class MetaData {
	private Integer pageNumber;
	private Integer pageSize;
	private Integer totalPages;
	private String nextPageLink;
	private String lastPageLink;
	
	public Integer getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}
	public String getNextPageLink() {
		return nextPageLink;
	}
	public void setNextPageLink(String nextPageLink) {
		this.nextPageLink = nextPageLink;
	}
	public String getLastPageLink() {
		return lastPageLink;
	}
	public void setLastPageLink(String lastPageLink) {
		this.lastPageLink = lastPageLink;
	}
	
	
}
