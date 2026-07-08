package Test_2;

abstract class product{
	int proid;
	String proname;
	double price;
	public product(int proid, String proname, double price) {
		super();
		this.proid = proid;
		this.proname = proname;
		this.price = price;
	}
	public int getProid() {
		return proid;
	}
	public String getProname() {
		return proname;
	}
	public double getPrice() {
		return price;
	}
	abstract  void display();	
}
class electronicproduct extends product{
	public electronicproduct(int proid, String proname, double price) {
		super(proid, proname, price);
		// TODO Auto-generated constructor stub
	}
	int warrantyPeriod;

	

	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}
	public void display() {
		System.out.println("ELECTRONIC PRODUCT INFORMATION:");
	     System.out.println("ProductId : " + proid);
	     System.out.println("ProductName : " + proname);
	     System.out.println("Price : $" + price);
	     System.out.println("Warranty Period : " + warrantyPeriod + " Months");
	     System.out.println();
		
	}
}

class ClothingProduct extends product{
	String size;
	String material;
	ClothingProduct(int id, String name, double p, String s, String m) {
	     super(id, name, p);
	     size = s;
	     material = m;
	 }
	String getSize() {
	     return size;
	 }
	 String getMaterial() {
	     return material;
	 }
	 void displayInfo() {
	     System.out.println("CLOTHING PRODUCT INFORMATION:");
	     System.out.println("ProductId : " + proid);
	     System.out.println("ProductName : " + proname);
	     System.out.println("Price : $" + price);
	     System.out.println("Size : " + size);
	     System.out.println("Material : " + material);
	     System.out.println();
	 }
	 @Override
	 void display() {
		// TODO Auto-generated method stub
		
	 }
}


public class Question2 {
	public static void main(String[] args) {
		electronicproduct p = new electronicproduct(201, "Laptop", 1200.0);
	     ClothingProduct c1 = new ClothingProduct(301, "T-Shirt", 25.0, "M", "Cotton");
	     c1.display();
	     p.display();	
	}
}
