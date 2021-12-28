package in.sts.demoproject.main;

import in.sts.demoproject.product.Product;

public class MainClass {

	public static void main(String[] args) {
		Product product = new Product();
		product.setId(1);
		product.setName("mobile");
		product.setBrand("Nokia");
		product.setPrice("20000");
		product.setManufacture_date("12-12-2020");
		product.setExpiry_date("12-12-2022");
		product.getProductDimention().setBreadth(2);
				
		System.out.println(product.getProductDimention());
		System.out.println(product.getProductDimention().getBreadth());
		
		//System.out.println(product);
		
		
	}

}
