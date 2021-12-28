package in.sts.demoproject.product;

public class Product {
	private int id;
	private String name;
	private String manufacture_date;
	private String expiry_date;
	private String price;
	private String brand;
	
	private ProductDimention productDimention = new ProductDimention();
	
	public ProductDimention getProductDimention() {
		return productDimention;
	}
	
//	public void setProductDimention(ProductDimention productDimention) {
//		this.productDimention = productDimention;
//	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManufacture_date() {
		return manufacture_date;
	}
	public void setManufacture_date(String manufacture_date) {
		this.manufacture_date = manufacture_date;
	}
	public String getExpiry_date() {
		return expiry_date;
	}
	public void setExpiry_date(String expiry_date) {
		this.expiry_date = expiry_date;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", manufacture_date=" + manufacture_date + ", expiry_date="
				+ expiry_date + ", price=" + price + ", brand=" + brand + "]";
	}
	
}
