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
public class Time implements Serializable {
    private int hours;
	private int minutes;
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		if(hours>0 && hours<24)
			this.hours = hours;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		if(minutes>0 && minutes<=60)
			this.minutes = minutes;
	}
	public 	Time() {
		
	}

	public Time(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
	}
	public Time(Time deport_time2)
	{
		this.hours=deport_time2.hours;
		this.minutes=deport_time2.minutes;
	}
	

    
    
}
