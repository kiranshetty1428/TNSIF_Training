package org.tnsif.acc.c2tc.oops;
class device{
	void deviceType()
	{
		System.out.println("I am an electronic device");
	}
}
class phone extends device{
	void brand()
	{
		System.out.println("Brand: samsung");
	}
}
class SmartPhone extends phone{
	void feature()
	{
		System.out.println("features,Touchscreen,Camera,Internet");
	
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone Smart=new SmartPhone();
		Smart.deviceType();
		Smart.brand();
		Smart.feature();
	}

}
