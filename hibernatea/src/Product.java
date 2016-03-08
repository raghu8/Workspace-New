import java.util.Scanner;

public class Product {
	private String proName;
	private String price;
	private int productId;
	private String text;
	private byte[] image;

	public byte[] getImage() {
		return this.image;
	} 

	public void setImage(byte[] image) {
		this.image = image;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getProName() {
		return proName;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPrice() {
		return price;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

}