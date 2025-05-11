
public class Book {
	
	private int pId;
	private String pName;
	private String pAuthor;
	private double price;
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpAuthor() {
		return pAuthor;
	}
	public void setpAuthor(String pAuthor) {
		this.pAuthor = pAuthor;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public void dispBook()
	{
		System.out.println("BookName"+pName+" "+"BookId"+pId+" "+"BookAuthor"+pAuthor+" "+"BookPrice"+price);
	}
	
	
	
	
	

}
