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
public abstract class Bus implements Serializable {
    private String Bus_Number;
	private String  Route;
	private int NoOfSeats;
	private Time deport_time;
	public String getBus_Number() {
		return Bus_Number;
	}
	public void setBus_Number(String bus_Number) {
		Bus_Number = bus_Number;
	}
	public String getRoute() {
		return Route;
	}
	public void setRoute(String route) {
		Route = route;
	}
	public int getNoOfSeats() {
		return NoOfSeats;
	}
	public void setNoOfSeats(int total_seats) {
		this.NoOfSeats = total_seats;
	}
	public Time getDeport_time() {
		return new Time(deport_time);
	}
	public void setDeport_time(Time deport_time) {
		this.deport_time = deport_time;
	}
	public Bus() {
		
	}
	public Bus(String bus_Number, String route, int total_seats, Time deport_time2) {
		
		this.Bus_Number = bus_Number;
		this.Route = route;
		this.NoOfSeats = total_seats;
		this.deport_time = new Time(deport_time2);
	}
//	public String toString()
//	{
//		return "Bus Number="+ Bus_Number+ " Route="+Route+ " Total Seats="+ NoOfSeats+ " Deport Time="+new Time(deport_time);
//	}
	
	public abstract double per_seat_charges();
	@Override
	public String toString() {
		return "Bus [Bus_Number=" + Bus_Number + ", Route=" + Route + ", NoOfSeats=" + NoOfSeats + ", deport_time="
				+ deport_time + "]";
	}
	public abstract double Calculate_Bill();
	public abstract String Check_Route();
	public double getTotal_seats1() {
	
		return 0;
	}


}
    

