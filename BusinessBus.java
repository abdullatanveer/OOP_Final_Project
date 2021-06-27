/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Princess Anayah K
 */
import java.io.Serializable;
public class BusinessBus extends Bus implements Serializable {
    public BusinessBus()
	{
		
	}
	
	public BusinessBus(String bus_Number, String route, int total_seats, Time deport_time) {
		super(bus_Number, route, total_seats, deport_time);
	}

	@Override
	public String toString() {
		return "BusinessBus [getBus_Number()=" + getBus_Number() + ", getRoute()=" + getRoute() + ", getNoOfSeats()="
				+ getNoOfSeats() + ", getDeport_time()=" + getDeport_time() + ", getTotal_seats1()=" + getTotal_seats1()
				+ "]";
	}

	public double per_seat_charges()
	{
		return  3000.00;
	}
	public double Calculate_Bill()
	{
		return super.getNoOfSeats()*3000.00;
	}
	public String Check_Route()
	{
		return "Route of bus is:"+super.getRoute();
	}

	public void setbookedSeats(int n) {
		// TODO Auto-generated method stub
		this.setNoOfSeats(n);
		
	}

    
}
