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
public class EconomyBus extends Bus implements Serializable {
    public EconomyBus()
	{
		
	}
	public EconomyBus(String bus_Number, String route, int total_seats, Time deport_time) {
		super(bus_Number, route, total_seats, deport_time);
	}

	public double per_seat_charges()
	{
		return  1000.00;
	}
	public double Calculate_Bill()
	{
		return super.getNoOfSeats()*1000;
	}
	public String Check_Route()
	{
		return "Route of bus is:"+super.getRoute();
	}

	public void setbookedSeats(int n) {
		this.setNoOfSeats(n);	
	}

}
