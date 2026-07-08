package Test_3;

import java.util.*;

class Product {
    int productid;
    String productname;
    String productcat;
    double productPrice;
    double Discount;
    int productQuantity;

    public Product(int productid, String productname, String productcat, double productPrice,
			double Discount, int productQuantity) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productcat = productcat;
		this.productPrice = productPrice;
		this.Discount = Discount;
		this.productQuantity = productQuantity;
	}

	void display() {
        System.out.println(productid +" " + productname + " "  +
        		productcat + " "  + productPrice + " " +
                Discount + " "+productQuantity + " ");
    }
}

public class Store {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> l = new ArrayList<>();

        l.add(new Product(101, "iphone10", "Mobile", 20000, 0.2, 2));
        l.add(new Product(102, "Dell", "Laptop", 20000, 0.3, 4));
        l.add(new Product(103, "iphone13", "Mobile", 10000, 0.5, 1));
        l.add(new Product(104, "Lenovo", "Laptop", 30000, 0.8, 3));
        l.add(new Product(105, "iphone12", "Mobile", 50000, 0.5, 6));

        int choice;
        
        do {
            System.out.println("1. Sort by Id");
            System.out.println("2. List Mobiles with price more than 40000");
            System.out.println("3. Exit");
            System.out.print("Enter the option for sorting: ");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (int i=0;i<l.size();i++) {
                        for (int j=i+1;j<l.size();j++) {
                            if (l.get(i).productid>l.get(j).productid) {
                                Product temp=l.get(i);
                                l.set(i,l.get(j));
                                l.set(j,temp);
                            }
                        }
                    }
                    for (Product p:l) {
                        p.display();
                    }
                    break;

                case 2:
                    for (Product p:l) {
                        if (p.productcat.equals("Mobile")
                        		&& p.productPrice>40000) {
                            p.display();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Thank you");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } 
        while (choice != 3);

    }
}