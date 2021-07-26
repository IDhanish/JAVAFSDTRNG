package com.ust.examples;
class CreditCards{
	private String cardName;
	private String expiryDate;
	private float creditBalance;
	CreditCards(){
		
	}
	void checkCardBalance() {
		if(creditBalance>40000) {
			System.out.println("sufficient balance");
		}
		else {
			System.out.println("not sufficient balance");
		}
	}

}
class Visa extends CreditCards{
	float interestRate;
	float creditLimit;
	Visa(){
		super();
	}
	void discounts() {
		System.out.println("many discounts will be provided");
	}
}
class mastercard extends CreditCards{
	void discounts() {
		System.out.println("online payment mode provided");
	}
}
public class Example27 {

	public static void main(String[] args) {
		Visa e1=new Visa();
		//e1.cardName="Visa Card";
		//e1.expiryDate="30-06-2021";
		e1.interestRate=4.15f;
		e1.checkCardBalance();
		//System.out.println(e1.cardName+"\n"+e1.expiryDate+"\n"+e1.creditBalance+"\n"+e1.interestRate+"\n"+e1.creditLimit);
	}}