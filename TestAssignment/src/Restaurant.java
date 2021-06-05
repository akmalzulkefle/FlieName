import java.util.Scanner; 
public class Restaurant { 


 double totalPrice,pay,change,totalPrice2,realPrice,time,fee;
int quantity,quantity2,food,drink,table;
	
	
 Scanner sc = new Scanner(System.in); 
	
Restaurant(){ //contstructor overloading-no argument
   
	System.out.print("Enter Table No: ");
	this.table = sc.nextInt();
	menu();
	foodOrder();
	drinkOrder();
	balance(totalPrice,totalPrice2);
}

Restaurant(double time){//contstructor overloading-one argument
	this.time=time;
	menu();
	foodOrder();
	drinkOrder();
	balance(totalPrice,totalPrice2);
	
	
}
Restaurant(double fee,double time){//contstructor overloading-two argument
	menu();
	foodOrder();
	drinkOrder();
	balanceCod(totalPrice,totalPrice2);
	this.fee=fee;
	this.time=time;
}


public void balance(double totalPrice,double totalPrice2) { 
	realPrice=(totalPrice+totalPrice2);
	System.out.println("Total price is : RM " +realPrice); 
	System.out.print("Enter a payment : RM ");
	pay = sc.nextDouble();//enter your payment 
	if(pay < realPrice){
	System.out.println("Not enough payment");
	}else{
	change = pay-realPrice;//money change
	System.out.printf("The change is : RM%.2f\n",change);
	}
	
}
public void balanceCod(double totalPrice,double totalPrice2) {
	realPrice=(totalPrice+totalPrice2+5);
	System.out.println("Total price is : RM " +realPrice);
	System.out.print("Enter a payment : RM ");
	pay = sc.nextDouble();//enter your payment
	if(pay < realPrice){
	System.out.println("Not enough payment");
	}else{
	change = pay-realPrice;//money change
	System.out.printf("The change is : RM%.2f\n",change);
	}
}
public void menu() {
	System.out.println("\tWelcome to MyRestaurant ");
	System.out.println(" ----------------Menu----------------");
	System.out.println("\t---Food---");
	System.out.println(" 1.Nasi Lemak"+ "  RM4.00");
	System.out.println(" 2.Nasi Ayam"+ "   RM5.00");
	System.out.println(" 3.Nasi Kandar"+ " RM7.00");
	System.out.println(" 4.Nasi Kukus"+ "  RM5.00");
	System.out.println("\t---Drink---");
	System.out.println(" 1.Air Sirap"+ "   RM1.00");
	System.out.println(" 2.Air Limau"+ "   RM1.50");
	System.out.println(" 3.Air Teh"+ "     RM2.00");
	System.out.println(" 4.Air Bandung"+ " RM1.80");
	System.out.println(" 99.Cancel Order");
}
public void foodOrder() {
	System.out.print("\nPlease enter the food code : ");
	this.food = sc.nextInt();
	if(food==1){ 
		System.out.println("You order Nasi Lemak");
		System.out.print("How many Nasi Lemak you want to Buy? :");
		this.quantity =sc.nextInt();//quantity that you want
		this.totalPrice =(quantity*4);
		
		
	}
	if(food==2){
		System.out.println("You order Nasi Ayam");
		System.out.print("How many Nasi Ayam you want to Buy? :");
		this.quantity =sc.nextInt();//quantity that you want
		this.totalPrice =(quantity*5);
		
	}
	if(food==3){
		System.out.println("You order Nasi Kandar");
		System.out.print("How many Nasi Kandar you want to Buy? :");
		this.quantity =sc.nextInt();//quantity that you want
		this.totalPrice =(quantity*7);
		
	}
	if(food==4){
		System.out.println("You order Nasi Kukus");
		System.out.print("How many Nasi Kukus you want to Buy? :");
		this.quantity =sc.nextInt();//quantity that you want
		this.totalPrice =(quantity*5);
	    }
	if(drink==99) {
		System.out.println("Cancel Order");
		System.exit(0);
	}
	
		
}
public void drinkOrder() {
	
		System.out.print("\nPlease enter the drink code : ");
		this.drink= sc.nextInt();
		if(drink==1){
			System.out.println("You order Air Sirap");
			System.out.print("How many Air sirap you want to Buy? :");
			this.quantity2 =sc.nextInt();//quantity that you want
			this.totalPrice2 =(quantity2*1.00);
			
			
		}
		if(drink==2){
			System.out.println("You order Air Limau");
			System.out.print("How many Air Limau you want to Buy? :");
			this.quantity2 =sc.nextInt();//quantity that you want
			this.totalPrice2 =(quantity2*1.50);
			
		}
		if (drink==3){
			System.out.println("You order Air Teh");
			System.out.print("How many Air Teh you want to Buy? :");
			this.quantity2 =sc.nextInt();//quantity that you want
			this.totalPrice2 =(quantity2*2.00);
			
		}
		 if(drink==4){
			System.out.println("You order Air Bandung");
			System.out.print("How many Air Bandung you want to Buy? :");
			this.quantity2 =sc.nextInt();//quantity that you want
			this.totalPrice2 =(quantity2*1.80);
			
		}	
		if(drink==99) {
			System.out.println("Cancel Order");
			System.exit(0);
		}
		
	
}

}