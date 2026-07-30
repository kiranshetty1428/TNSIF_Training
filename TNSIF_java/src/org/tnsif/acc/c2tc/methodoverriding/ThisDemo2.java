package org.tnsif.acc.c2tc.methodoverriding;

class ProductBottle
{
	double price;
	
	ProductBottle(double price)
	{
		this.price=price;
	}
	double CalculateDiscount()
	{
		return this.price*0.10;
	}
	double calculateFinalPrice()
	{
		return this.price-this.CalculateDiscount();
	}
}
public class ThisDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductBottle product=new ProductBottle(400);
		System.out.println("Final Price :"+ product.calculateFinalPrice());
	}

}
