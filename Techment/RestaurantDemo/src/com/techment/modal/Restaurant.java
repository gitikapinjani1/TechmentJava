package com.techment.modal;

import java.util.List;

public class Restaurant {

	String restaurantName;
	IHotDrink hotDrink;
	ISoftDrink softDrink;

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	
	public void setHotDrink(IHotDrink hotDrink) {
		this.hotDrink = hotDrink;
	}


	public void setSoftDrink(ISoftDrink softDrink) {
		this.softDrink = softDrink;
	}


	public String getRestaurantName() {
		return restaurantName;
	}


	public IHotDrink getHotDrink() {
		return hotDrink;
	}


	public ISoftDrink getSoftDrink() {
		return softDrink;
	}


	public void displayRestaurantDetails()
	{
		System.out.println("Restaurant Name: "+restaurantName);
		hotDrink.drink();
		softDrink.drink();
	}
	
	
}
