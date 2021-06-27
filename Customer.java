/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Princess Anayah K
 */
public class Customer {
    private String name;
	private String email;
	private String pickup;
	private String dropoff;
	private int NO_of_seats;
	private Bus search_bus;
	private String type;
	private Date date;
	private Time depart_time;
	public Customer() {
		
	}
	public Customer(String name, String email, String pickup_location, String dropoff_location,String type) {
		this.name=name;
		this.email=email;
		this.pickup=pickup_location;
		this.dropoff=dropoff_location;
		this.type=type;
//		this.date=new Date(date);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPickup() {
		return pickup;
	}
	public void setPickup(String pickup) {
		this.pickup = pickup;
	}
	public String getDropoff() {
		return dropoff;
	}
	public void setDropoff(String dropoff) {
		this.dropoff = dropoff;
	}
	public int getNO_of_seats() {
		return NO_of_seats;
	}
	public void setNO_of_seats(int nO_of_seats) {
		NO_of_seats = nO_of_seats;
	}
	public Bus getSearch_bus() {
		return search_bus;
	}
	public void setSearch_bus(Bus search_bus) {
		this.search_bus = search_bus;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = new Date(date);
	}
	public Time getDepart_time() {
		return depart_time;
	}
	public void setDepart_time(Time depart_time) {
		this.depart_time = new Time(depart_time);
	}

    
}
