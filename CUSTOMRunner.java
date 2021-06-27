/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Princess Anayah K
 */
import java.util.ArrayList;
import java.util.Scanner;
public class CUSTOMRunner {
    public static void main(String args[]) {		
		Scanner input=new Scanner(System.in);
		int men;
		String name1;
		String name;
		String email;
		String dropoff;
		String pickup;
		String type;
		System.out.println("\t\t\tMain Menu\n\t\tSelect one of the following\n1:Admin \n2:Customer");
		men=input.nextInt();
		if(men==2) {
			name1=input.nextLine();
			System.out.println("Please enter your Name::");
			name=input.nextLine();
			System.out.println("Please enter your Email::");
			email=input.nextLine();		
			System.out.println("\t\t\t Please select your pickup city from the following \n1: Karachi  2: Lahore  3: Peshawar  4: Islamabad \n5: Multan  6: Gujranwala  7: Attock  8: Sialkot ");
			boolean stop=false;
			pickup = null;
			int opt=input.nextInt();
			do {
				if(opt==1) {
					pickup="Karachi";
					stop=true;
				}
				else if(opt==2){
					pickup="Lahore";
					stop=true;
				}
				else if(opt==3){
					pickup="Peshawar";
					stop=true;
				}
				else if(opt==4){
					pickup="Islamabad";
					stop=true;
				}
				else if(opt==5){
					pickup="Multan";
					stop=true;
				}
				else if(opt==6){
					pickup="Gujranwala";
					stop=true;
				}
				else if(opt==7){
					pickup="Attock";
					stop=true;
				}
				else if(opt==2){
					pickup="Sialkot";
					stop=true;
				}
			}while(!stop);
			System.out.println("\t\t\t Please Select Dropoff city from the followings \n1: Karachi  2: Lahore  3: Peshawar  4: Islamabad \n5: Multan  6: Gujranwala  7: Attock  8: Sialkot ");
			boolean stop2=false;
			dropoff = null;
			int opt2=input.nextInt();
			do {
				if(opt2==1) {
					dropoff="Karachi";
					stop2=true;
				}
				else if(opt2==2){
					dropoff="Lahore";
					stop2=true;
				}
				else if(opt2==3){
					dropoff="Peshawar";
					stop2=true;
				}
				else if(opt2==4){
					dropoff="Islamabad";
					stop2=true;
				}
				else if(opt2==5){
					dropoff="Multan";
					stop2=true;
				}
				else if(opt2==6){
					dropoff="Gujranwala";
					stop2=true;
				}
				else if(opt2==7){
					dropoff="Attock";
					stop2=true;
				}
				else if(opt2==2){
					dropoff="Sialkot";
					stop2=true;
				}
			}while(!stop2);
			System.out.println("Please select the Followings\n 1:Economy\n2:Buisness\n3:Luxury");
			type = null;
			int opt1=input.nextInt();
			boolean stop1=false;
			Customer c=new Customer(name, email, pickup, dropoff,type );
			CustomerFile.writeToFile(c);
			do {
				int n;
				if(opt1==1) {
					type="Economy";
					System.out.println("You are Using Economy now");
					System.out.println("\t\t\tSelect the Number of seats\n1: 01\n2: 02\n3: 03\n4: 04\n5: 05");
					int opt3=input.nextInt();
					boolean stop3=false;
					do {
						if(opt3==1) {
							n=1;
							EconomyBus EB=new EconomyBus();
							EB.setbookedSeats(n);
							System.out.println("\t\t\tBooked Sucessfully");							
							System.out.println("\t\t\tPress 0 to view Ticket Details\n\t\t\tPress 1 to go to main menu");
							int check=input.nextInt();
							if(check==0) {
								System.out.println("\t\t\t\tBill Details\n\t\t\t\t---------------\n\t\t\t\t--------------\n\t\t\t"+c.getName()+"\n\t\t\t"+c.getEmail()+"\n\t\t\t From  "+c.getPickup()+" To "+c.getDropoff());
								System.out.println("\t\t\t"+EB.Calculate_Bill());
								System.out.println("\t\t\tvia National Highway from "+c.getPickup()+" To "+c.getDropoff());
								System.out.println("\n\t\t\t\t==>Press 1 to go to Main Menu");
								int main=input.nextInt();
								if(main==1) {
									main(args);
								}
							}
							else {
								main(args);
							}
							stop3=true;
						}
						else if(opt3==2){
							n=2;
							EconomyBus EB=new EconomyBus();
							EB.setbookedSeats(n);
							System.out.println("\t\t\tBooked Sucessfully");							
							System.out.println("\t\t\tPress 0 to view Ticket Details");
							int check=input.nextInt();
							if(check==0) {
								System.out.println("\t\t\t\tBill Details\n\t\t\t\t---------------\n\t\t\t\t--------------\n\t\t\t"+c.getName()+"\n\t\t\t"+c.getEmail()+"\n\t\t\t From  "+c.getPickup()+" To "+c.getDropoff());
								System.out.println("\t\t\t"+EB.Calculate_Bill());
								System.out.println("\t\t\tvia National Highway from "+c.getPickup()+" To "+c.getDropoff());
								System.out.println("\\n\t\t\t\t==>Press 1 to go to Main Menu");
								int main=input.nextInt();
								if(main==1) {
									main(args);
								}
							}
							else {
								main(args);
							}
							stop3=true;
						}
						else if(opt3==3){
							n=3;
							EconomyBus EB=new EconomyBus();
							EB.setbookedSeats(n);

							System.out.println("\t\t\tBooked Sucessfully");							
							System.out.println("\t\t\tPress 0 to view Ticket Details");
							int check=input.nextInt();
							if(check==0) {
								System.out.println("\t\t\t\tBill Details\n\t\t\t\t---------------\n\t\t\t\t--------------\n\t\t\t"+c.getName()+"\n\t\t\t"+c.getEmail()+"\n\t\t\t From  "+c.getPickup()+" To "+c.getDropoff());
								System.out.println("\t\t\t"+EB.Calculate_Bill());
								System.out.println("\t\t\tvia National Highway from "+c.getPickup()+" To "+c.getDropoff());
								System.out.println("\\n\t\t\t\t==>tPress 1 to go to Main Menu");
								int main=input.nextInt();
								if(main==1) {
									main(args);
								}
							}
							else {
								main(args);
							}
							stop3=true;
						}
						else if(opt3==4){
							n=4;
							EconomyBus EB=new EconomyBus();
							EB.setbookedSeats(n);
							System.out.println("\t\t\tBooked Sucessfully");							
							System.out.println("\t\t\tPress 0 to view Ticket Details");
							int check=input.nextInt();
							if(check==0) {
								System.out.println("\t\t\t\tBill Details\n\t\t\t\t---------------\n\t\t\t\t--------------\n\t\t\t"+c.getName()+"\n\t\t\t"+c.getEmail()+"\n\t\t\t From  "+c.getPickup()+" To "+c.getDropoff());
								System.out.println("\t\t\t"+EB.Calculate_Bill());
								System.out.println("\t\t\tvia National Highway from "+c.getPickup()+" To "+c.getDropoff());
								System.out.println("\n\t\t\t\t==>Press 1 to go to Main Menu");
								int main=input.nextInt();
								if(main==1) {
									main(args);
								}
							}
							else {
								main(args);
							}
							stop3=true;
						}
						else if(opt2==5){
				
							n=5;
							EconomyBus EB=new EconomyBus();
							EB.setbookedSeats(n);
							System.out.println("\t\t\tBooked Sucessfully");							
							System.out.println("\t\t\tPress 0 to view Ticket Details");
							int check=input.nextInt();
							if(check==0) {
								System.out.println("\t\t\t\tBill Details\n\t\t\t\t---------------\n\t\t\t\t--------------\n\t\t\t"+c.getName()+"\n\t\t\t"+c.getEmail()+"\n\t\t\t From  "+c.getPickup()+" To "+c.getDropoff());
								System.out.println("\t\t\t"+EB.Calculate_Bill());
								System.out.println("\t\t\tvia National Highway from "+c.getPickup()+" To "+c.getDropoff());
								System.out.println("\n\t\t\t\t==>Press 1 to go to Main Menu");
								int main=input.nextInt();
								if(main==1) {
									main(args);
								}
							}
							else {
								main(args);
							}
							stop3=true;
						}
					}while(!stop3);
					stop1=true;
				}
				else if(opt1==2){
					type="Buiness";
					boolean stop3=false;
					System.out.println("You are Using Buisness now");
					System.out.println("\t\t\tSelect the Number of seats\n1: 01\n2: 02\n3: 03\n4: 04\n5: 05");
					int opt3=input.nextInt();
					do {
						if(opt3==1) {
							n=1;
							BusinessBus BB=new BusinessBus();
							BB.setbookedSeats(n);
							System.out.println("\t\t\tBooked Sucessfully");							
							System.out.println("\t\t\tPress 0 to view Ticket Details");
							int check=input.nextInt();
							if(check==0) {
								System.out.println("\t\t\t\tBill Details\n\t\t\t\t---------------\n\t\t\t\t--------------\n\t\t\t"+c.getName()+"\n\t\t\t"+c.getEmail()+"\n\t\t\t From  "+c.getPickup()+" To "+c.getDropoff());
								System.out.println("\t\t\t"+BB.Calculate_Bill());
								System.out.println("\t\t\tvia National Highway from "+c.getPickup()+" To "+c.getDropoff());
								System.out.println("\n\t\t\t\t==>Press 1 to go to Main Menu");
								int main=input.nextInt();
								if(main==1) {
									main(args);
								}
							}
							else {
								main(args);
							}
							stop3=true;
						}
						else if(opt3==2){
							n=2;
							BusinessBus BB=new BusinessBus();
							BB.setbookedSeats(n);
							System.out.println("\t\t\tBooked Sucessfully");							
							System.out.println("\t\t\tPress 0 to view Ticket Details");
							int check=input.nextInt();
							if(check==0) {
								System.out.println("\t\t\t\tBill Details\n\t\t\t\t---------------\n\t\t\t\t--------------\n\t\t\t"+c.getName()+"\n\t\t\t"+c.getEmail()+"\n\t\t\t From  "+c.getPickup()+" To "+c.getDropoff());
								System.out.println("\t\t\t"+BB.Calculate_Bill());
								System.out.println("\t\t\tvia National Highway from "+c.getPickup()+" To "+c.getDropoff());
								System.out.println("\n\t\t\t\t==>Press 1 to go to Main Menu");
								int main=input.nextInt();
								if(main==1) {
									main(args);
								}
							}
							else {
								main(args);
							}
							stop3=true;
						}
						else if(opt3==3){
							n=3;
							BusinessBus BB=new BusinessBus();
							BB.setbookedSeats(n);
							System.out.println("\t\t\tBooked Sucessfully");							
							System.out.println("\t\t\tPress 0 to view Ticket Details");
							int check=input.nextInt();
							if(check==0) {
								System.out.println("\t\t\t\tBill Details\n\t\t\t\t---------------\n\t\t\t\t--------------\n\t\t\t"+c.getName()+"\n\t\t\t"+c.getEmail()+"\n\t\t\t From  "+c.getPickup()+" To "+c.getDropoff());
								System.out.println("\t\t\t"+BB.Calculate_Bill());
								System.out.println("\t\t\tvia National Highway from "+c.getPickup()+" To "+c.getDropoff());
								System.out.println("\n\t\t\t\t==>Press 1 to go to Main Menu");
								int main=input.nextInt();
								if(main==1) {
									main(args);
								}
							}
							else {
								main(args);
							}
							stop3=true;
						}
						else if(opt3==4){
							n=4;
							BusinessBus BB=new BusinessBus();
							BB.setbookedSeats(n);
							System.out.println("\t\t\tBooked Sucessfully");							
							System.out.println("\t\t\tPress 0 to view Ticket Details");
							int check=input.nextInt();
							if(check==0) {
								System.out.println("\t\t\t\tBill Details\n\t\t\t\t---------------\n\t\t\t\t--------------\n\t\t\t"+c.getName()+"\n\t\t\t"+c.getEmail()+"\n\t\t\t From  "+c.getPickup()+" To "+c.getDropoff());
								System.out.println("\t\t\t"+BB.Calculate_Bill());
								System.out.println("\t\t\tvia National Highway from "+c.getPickup()+" To "+c.getDropoff());
								System.out.println("\n\t\t\t\t==>Press 1 to go to Main Menu");
								int main=input.nextInt();
								if(main==1) {
									main(args);
								}
							}
							else {
								main(args);
							}
							stop3=true;
						}
						else if(opt2==5){
							n=5;
							BusinessBus BB=new BusinessBus();
							BB.setbookedSeats(n);
							System.out.println("\t\t\tBooked Sucessfully");							
							System.out.println("\t\t\tPress 0 to view Ticket Details");
							int check=input.nextInt();
							if(check==0) {
								System.out.println("\t\t\t\tBill Details\n\t\t\t\t---------------\n\t\t\t\t--------------\n\t\t\t"+c.getName()+"\n\t\t\t"+c.getEmail()+"\n\t\t\t From  "+c.getPickup()+" To "+c.getDropoff());
								System.out.println("\t\t\t"+BB.Calculate_Bill());
								System.out.println("\t\t\tvia National Highway from "+c.getPickup()+" To "+c.getDropoff());
								System.out.println("\n\t\t\t==>Press 1 to go to Main Menu");
								int main=input.nextInt();
								if(main==1) {
									main(args);
								}
							}
							else {
								main(args);
							}
							stop3=true;
						}
					}while(!stop3);
					stop1=true;
				}
				else if(opt==3){
					type="Luxury";
					boolean stop3=false;
					System.out.println("You are Using Luxury now");
					System.out.println("\t\t\tSelect the Number of seats\n1: 01\n2: 02\n3: 03\n4: 04\n5: 05");
					int opt3=input.nextInt();
					do {
						if(opt3==1) {
							n=1;
							LuxuryBus LB=new LuxuryBus();
							LB.setbookedSeats(n);
							System.out.println("\t\t\tBooked Sucessfully");							
							System.out.println("\t\t\tPress 0 to view Ticket Details");
							int check=input.nextInt();
							if(check==0) {
								System.out.println("\t\t\t\tBill Details\n\t\t\t\t---------------\n\t\t\t\t--------------\n\t\t\t"+c.getName()+"\n\t\t\t"+c.getEmail()+"\n\t\t\t From  "+c.getPickup()+" To "+c.getDropoff());
								System.out.println("\t\t\t"+LB.Calculate_Bill());
								System.out.println("\t\t\tvia National Highway from "+c.getPickup()+" To "+c.getDropoff());
								System.out.println("\n\t\t\t\t==>Press 1 to go to Main Menu");
								int main=input.nextInt();
								if(main==1) {
									main(args);
								}
							}
							else {
								main(args);
							}
							stop3=true;
						}
						else if(opt3==2){
							n=2;
							LuxuryBus LB=new LuxuryBus();
							LB.setbookedSeats(n);
							System.out.println("\t\t\tBooked Sucessfully");							
							System.out.println("\t\t\tPress 0 to view Ticket Details");
							int check=input.nextInt();
							if(check==0) {
								System.out.println("\t\t\t\tBill Details\n\t\t\t\t---------------\n\t\t\t\t--------------\n\t\t\t"+c.getName()+"\n\t\t\t"+c.getEmail()+"\n\t\t\t From  "+c.getPickup()+" To "+c.getDropoff());
								System.out.println("\t\t\t"+LB.Calculate_Bill());
								System.out.println("\t\t\tvia National Highway from "+c.getPickup()+" To "+c.getDropoff());
								System.out.println("\n\t\t\t\t==>Press 1 to go to Main Menu");
								int main=input.nextInt();
								if(main==1) {
									main(args);
								}
							}
							else {
								main(args);
							}
							stop3=true;
						}
						else if(opt3==3){
							n=3;
							LuxuryBus LB=new LuxuryBus();
							LB.setbookedSeats(n);
							System.out.println("\t\t\tBooked Sucessfully");							
							System.out.println("\t\t\tPress 0 to view Ticket Details");
							int check=input.nextInt();
							if(check==0) {
								System.out.println("\t\t\t\tBill Details\n\t\t\t\t---------------\n\t\t\t\t--------------\n\t\t\t"+c.getName()+"\n\t\t\t"+c.getEmail()+"\n\t\t\t From  "+c.getPickup()+" To "+c.getDropoff());
								System.out.println("\t\t\t"+LB.Calculate_Bill());
								System.out.println("\t\t\tvia National Highway from "+c.getPickup()+" To "+c.getDropoff());
								System.out.println("\n\t\t\t\t==>Press 1 to go to Main Menu");
								int main=input.nextInt();
								if(main==1) {
									main(args);
								}
							}
							else {
								main(args);
							}
							stop3=true;
						}
						else if(opt3==4){
							n=4;
							LuxuryBus LB=new LuxuryBus();
							LB.setbookedSeats(n);
							System.out.println("\t\t\tBooked Sucessfully");							
							System.out.println("\t\t\tPress 0 to view Ticket Details");
							int check=input.nextInt();
							if(check==0) {
								System.out.println("\t\t\t\tBill Details\n\t\t\t\t---------------\n\t\t\t\t--------------\n\t\t\t"+c.getName()+"\n\t\t\t"+c.getEmail()+"\n\t\t\t From  "+c.getPickup()+" To "+c.getDropoff());
								System.out.println("\t\t\t"+LB.Calculate_Bill());
								System.out.println("\t\t\tvia National Highway from "+c.getPickup()+" To "+c.getDropoff());
								System.out.println("\n\t\t\t\t==>Press 1 to go to Main Menu");
								int main=input.nextInt();
								if(main==1) {
									main(args);
								}
							}
							else {
								main(args);
							}
							stop3=true;
						}
						else if(opt2==5){
							n=5;
							LuxuryBus LB=new LuxuryBus();
							LB.setbookedSeats(n);
							System.out.println("\t\t\tBooked Sucessfully");							
							System.out.println("\t\t\tPress 0 to view Ticket Details");
							int check=input.nextInt();
							if(check==0) {
								System.out.println("\t\t\t\tBill Details\n\t\t\t\t---------------\n\t\t\t\t--------------\n\t\t\t"+c.getName()+"\n\t\t\t"+c.getEmail()+"\n\t\t\t From  "+c.getPickup()+" To "+c.getDropoff());
								System.out.println("\t\t\t"+LB.Calculate_Bill());
								System.out.println("\t\t\tvia National Highway from "+c.getPickup()+" To "+c.getDropoff());
								System.out.println("\n\t\t\t\t==>Press 1 to go to Main Menu");
								int main=input.nextInt();
								if(main==1) {
									main(args);
								}
							}
							else {
								main(args);
							}
							stop3=true;
						}
						}while(!stop3);
					stop1=true;
				}
			}while(!stop1);
			
		}
		else {
			System.out.println("\t\t\t Please Select one of the Following\n\t\t\t1: Add Bus\n\t\t\t2: Delete Bus\n\t\t\t3: Seach Bus\n\t\t\t4: Update Bus\n\t\t\t5: See All Customers");
			int select=input.nextInt();
			if(select==1) {
				System.out.println("\t\t\t Please Select one of the Following\n\t\t\t1: Economy\n\t\t\t2: Luxury\n\t\t\t3: Buisness");
				int select1=input.nextInt();
				if(select1==1) {
					
					System.out.println("Enter Bus Number:");
					 String Bus_NO=input.nextLine();
//					 System.out.println("Enter Bus Route:");
					 String Route=input.nextLine();
					 System.out.println("Enter total Number of seats:");
					 int seats=input.nextInt();
					 System.out.println("Enter Departure time of Bus:");
					 System.out.println("Enter Hours:");
					 int hour=input.nextInt();
					 System.out.println("Enter Minutes:");
					 int Minutes=input.nextInt();
					 Time t=new Time(hour,Minutes);
					 EconomyBus b=new EconomyBus(Bus_NO,"Lahore",seats,t);
//					 EconomyFile.add(b);
					 EconomyFile.writeToFile(b);
					 System.out.println("The Bus is successfully added");
					System.out.println("\n\t\t\t\t==>Press 1 to go to Main Menu");
					int main=input.nextInt();
					if(main==1) {
						main(args);
					}
				
				}
				else if(select1==2) {
					System.out.println("Enter Bus Number:");
					 String Bus_number=input.nextLine();
//					 System.out.println("Enter Bus Route:");
					 String Routee=input.nextLine();
					 System.out.println("Enter total Number of seats:");
					 int Seat=input.nextInt();
					 System.out.println("Enter Departure time of Bus:");
					 System.out.println("Enter Hours:");
					 int Hours=input.nextInt();
					 System.out.println("Enter Minutes:");
					 int minute=input.nextInt();
					 Time T2=new Time(Hours,minute);
					 LuxuryBus d=new LuxuryBus(Bus_number,"Karachi",Seat,T2);
//					 EconomyFile.add(b);
					 LuxuryFile.writeToFile(d);
					 System.out.println("The Bus is successfully added");
					
					System.out.println("\n\t\t\t\t==>Press 1 to go to Main Menu");
					int main=input.nextInt();
					if(main==1) {
						main(args);
					}
				}
				else {
					System.out.println("Enter Bus Number:");
					 String Bus_Number=input.nextLine();
//					 System.out.println("Enter Bus Route:");
					 String route=input.nextLine();
					 System.out.println("Enter total Number of seats:");
					 int Seats=input.nextInt();
					 System.out.println("Enter Departure time of Bus:");
					 System.out.println("Enter Hours:");
					 int Hour=input.nextInt();
					 System.out.println("Enter Minutes:");
					 int minutes=input.nextInt();
					 Time T=new Time(Hour,minutes);
					 BusinessBus x=new BusinessBus(Bus_Number,"islamabad",Seats,T);
//					 EconomyFile.add(b);
					 BusinessList.writeToFile(x);
					 System.out.println("The Bus is successfully added");
					
					System.out.println("\n\t\t\t\t==>Press 1 to go to Main Menu");
					int main=input.nextInt();
					if(main==1) {
						main(args);
					}
				}
			}
			else if(select==2) {
				System.out.println("\t\t\t Please Select one of the Following\n\t\t\t1: Economy\n\t\t\t2: Luxury\n\t\t\t3: Buisness");
				int select1=input.nextInt();
				if(select1==1) {
					System.out.println("Enter the Bus number you want to delete");
					String no=input.nextLine();
					EconomyFile.deleteBus(no);
					System.out.println("Bus is successfully deleted");
					
					System.out.println("\n\t\t\t\t==>Press 1 to go to Main Menu");
					int main=input.nextInt();
					if(main==1) {
						main(args);
					}
				}
				else if(select1==2) {
					
					System.out.println("Enter the Bus number you want to delete");
					String no=input.nextLine();
					LuxuryFile.deleteBus(no);
					System.out.println("Bus is successfully deleted");
					System.out.println("\n\t\t\t\t==>Press 1 to go to Main Menu");
					int main=input.nextInt();
					if(main==1) {
						main(args);
					}
				}
				else {
					System.out.println("Enter the Bus number you want to delete");
					String no=input.nextLine();
					BusinessList.deleteBus(no);
					System.out.println("Bus is successfully deleted");
					
					System.out.println("\n\t\t\t\t==>Press 1 to go to Main Menu");
					int main=input.nextInt();
					if(main==1) {
						main(args);
					}
				}
			}
			else if(select==3) {
				System.out.println("\t\t\t Please Select one of the Following\n\t\t\t1: Economy\n\t\t\t2: Luxury\n\t\t\t3: Buisness");
				int select1=input.nextInt();
				if(select1==1) {
					
					System.out.println("Enter the number of bus you want to search");
					String no=input.nextLine();
					EconomyFile.search(no);
					System.out.println("\n\t\t\t\t==>Press 1 to go to Main Menu");
					int main=input.nextInt();
					if(main==1) {
						main(args);
					}
				}
				else if(select1==2) {
					
					System.out.println("Enter the number of bus you want to search");
					String no=input.nextLine();
					LuxuryFile.search(no);
					
					System.out.println("\n\t\t\t\t==>Press 1 to go to Main Menu");
					int main=input.nextInt();
					if(main==1) {
						main(args);
					}
				}
				else {
					System.out.println("Enter the number of bus you want to search");
					String no=input.nextLine();
					BusinessList.search(no);
					
					
					System.out.println("\n\t\t\t\t==>Press 1 to go to Main Menu");
					int main=input.nextInt();
					if(main==1) {
						main(args);
					}
				}
			}
			else if(select==5) {
				int i;
				ArrayList list=CustomerFile.readAllData();
				for(i=0 ;i<list.size(); i++){
					System.out.println( list.get(i).toString());
				}
			}
			else {
				System.out.println("\t\t\t Please Select one of the Following\n\t\t\t1: Economy\n\t\t\t2: Luxury\n\t\t\t3: Buisness");
				int select1=input.nextInt();
				if(select1==1) {
					
					System.out.println("Enter the Bus number you want to change");
					String no=input.nextLine();
					System.out.println("Enter New bus number");
					String no1=input.nextLine();
					EconomyFile.UpdateBus(no, no1);
					System.out.println("\n\t\t\t\t==>Press 1 to go to Main Menu");
					int main=input.nextInt();
					if(main==1) {
						main(args);
					}
				
				}
				else if(select1==2) {
					
					System.out.println("Enter the Bus number you want to change");
					String no=input.nextLine();
					System.out.println("Enter New bus number");
					String no1=input.nextLine();
					LuxuryFile.UpdateBus(no, no1);
					System.out.println("\n\t\t\t\t==>Press 1 to go to Main Menu");
					int main=input.nextInt();
					if(main==1) {
						main(args);
					}
				}
				else {
					System.out.println("Enter the Bus number you want to change");
					String no=input.nextLine();
					System.out.println("Enter New bus number");
					String no1=input.nextLine();
					BusinessList.UpdateBus(no, no1);
					
					System.out.println("\n\t\t\t\t==>Press 1 to go to Main Menu");
					int main=input.nextInt();
					if(main==1) {
						main(args);
					}
				}
				}
			}
			
		}
	
   }
    
