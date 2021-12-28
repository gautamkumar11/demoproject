package in.sts.demoproject.productlist;

import java.util.ArrayList;
import java.util.List;

import in.sts.demoproject.product.Product;



public class ProductList {
	
	List<Product> productList;
	
	
	public List<Product> data(Product product){
		productList = new ArrayList<Product>();
		productList.add(null);
		
		return productList;
	}
}
