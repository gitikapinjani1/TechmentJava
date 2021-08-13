package com.Techment.OopsAssignment;

abstract class PrepaidCard{
	
	int cardNo;
	double availableBalance;
	double swipeLimit;
	
	abstract boolean swipeCard(int amount);

	@Override
	public String toString() {
		return "PrepaidCard [cardNo=" + cardNo + ", availableBalance="
				+ availableBalance + ", swipeLimit=" + swipeLimit + "]";
	}
	
	
	void rechargeCard(int amount)
	{
		availableBalance+=amount;
		System.out.println("your balance = "+availableBalance);
	}
	
}


class TravelCard extends PrepaidCard implements Rewardable{
	int rewardPoints;
	
	@Override
	boolean swipeCard(int amount) {
		if(amount>swipeLimit)
			return false;
		else
		{
			if(amount<availableBalance){
			availableBalance-=((60*amount)+(amount/20));
			return true;
			}
			else
				return false;}
	}

	public int IrewardPoints(int amount) {
		if((amount*60)>100)
		{
			rewardPoints=(amount*60)/100;
		}
		return 0;
	}
	
}

interface Rewardable{
	int IrewardPoints(int amount);
	
}

public class Ex3 {

	public static void main(String[] args) {
		
		TravelCard tc=new TravelCard();
		tc.cardNo=200001;
		tc.availableBalance=100;
		tc.swipeLimit=50;
		System.out.println(tc.toString());
		boolean b=tc.swipeCard(40);
		if(b)
		{
			System.out.println("Amount withdraw successfully");
			tc.IrewardPoints(40);
			System.out.println("reward points = "+tc.rewardPoints);
			System.out.println(tc.toString());
			
		}
		else
			System.out.println("swipe amount is less or you dont have enough amount");
	}

}
