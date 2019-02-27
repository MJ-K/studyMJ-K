package exam_05;
//캡슐화 시켜보세요
public class HandPhone {
	private String productName;
	private String productType;
	private int price;
	private int phoneNumber;
	//프레임워크 사용시에는 기본생성자 만드는 습관을 들여놓자
	
	
	
	public HandPhone(String productName, String productType, int price, int phoneNumber) {
		//super();//생략가능
		this.productName = productName;
		this.productType = productType;
		this.price = price;
		this.phoneNumber = phoneNumber;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public String getProductType() {
		return productType;
	}



	public void setProductType(String productType) {
		this.productType = productType;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public int getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
