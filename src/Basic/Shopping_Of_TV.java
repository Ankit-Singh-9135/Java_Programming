package Basic;

public class Shopping_Of_TV {

	public static void main(String[] args) {
		float cost_price = 3500;
		float profit = (cost_price * 27 )/ 100;
		float selling_price = cost_price + profit;
		float VAT = (selling_price * 12.7f)/100;
		float service_charge = (selling_price * 3.87f)/100;
		float total_selling_price = selling_price+VAT+service_charge;
		
		System.out.println("Cost price : " + cost_price);
		System.out.println("Selling price : " + selling_price);
		System.out.println("profit : " + profit);
		System.out.println("VTR : "+VAT);
		System.out.println("Service charge : "+service_charge);
		System.out.println("Total Selling Price : "+total_selling_price);

	}

}
