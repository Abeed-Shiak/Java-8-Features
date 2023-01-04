package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

	public static void main(String[] args) {
		
		List<Product>list = new ArrayList<>();
		
		for(Product product :getProduct()) {
			if(product.getPrice()>25000) {
				list.add(product);
			}
		}
		for(Product product :list) {
			System.out.println(product);
		}
		System.out.println("******************");
		
		//using stream API 
	List<Product>list2 =getProduct()
			.stream().filter((product)->product.getPrice()>25000f)
			.collect(Collectors.toList());
	list2.forEach(System.out::println);
		
		
	}
	private static List<Product>getProduct(){
		List<Product>listProduct = new ArrayList<>();
		listProduct.add(new Product(1, "hpLaptop", 25000f));
		listProduct.add(new Product(2, "DELL", 25000F));
		listProduct.add(new Product(3, "ASUS", 350000F));
		listProduct.add(new Product(4, "fujistu", 450000));
		listProduct.add(new Product(5, "volvo", 35000));
		
		return listProduct;
	}
	

}
class Product {
	private int id;
	private String name;
	private float price;
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
}