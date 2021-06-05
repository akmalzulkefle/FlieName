public class main {

	public static void main(String[] args) {
		Restaurant di=new Restaurant();
		
		System.out.println("-------------------------------------------------");
		System.out.println("\t\tThis is your receipt");
		System.out.println("Counter: "+2+"\t\t\t\tStaff: "+"Hazim");
		System.out.println("Table No: "+di.table);
		System.out.printf("Total price  : RM %.2f\n",di.realPrice);
		System.out.printf("Paid         : RM %.2f\n",di.pay);
		System.out.printf("The change  : RM %.2f\n",di.change);
		System.out.println("\t\tThank you buy with us");
		System.out.println("-------------------------------------------------");	
		System.out.println();
		
		Restaurant sp=new Restaurant(3.50);
		System.out.println("-------------------------------------------------");
		System.out.println("\t\tThis is your receipt");
		System.out.println("Self Pickup");
		System.out.println("Counter: "+3+"\t\t\t\tStaff: "+"Hazim");
		System.out.printf("Pickup Time: %.2f PM\n",sp.time);
		System.out.printf("Total price  : RM %.2f\n",sp.realPrice);
		System.out.printf("Paid         : RM %.2f\n",sp.pay);
		System.out.printf("The change  : RM %.2f\n",sp.change);
		System.out.println("\t\tThank you buy with us");
		System.out.println("-------------------------------------------------");	
		System.out.println();
		
		Restaurant cod=new Restaurant(5.00,30.00);
		System.out.println("-------------------------------------------------");
		System.out.println("\t\tThis is your receipt");
		System.out.println("Delivery"+"\t\t\t\tRider: "+"Hazim");
		System.out.println("Delivery Time: "+cod.time+" Minutes");
		System.out.printf("Total price  : RM %.2f\n",cod.realPrice);
		System.out.println("Delivery Fee: RM "+cod.fee);
		System.out.printf("Paid         : RM %.2f\n",cod.pay);
		System.out.printf("The change  : RM %.2f\n",cod.change);
		System.out.println("\t\tThank you buy with us");
		System.out.println("-------------------------------------------------");	
	}

}