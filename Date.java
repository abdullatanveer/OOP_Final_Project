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
public class Date implements Serializable {
    int day;
	int month;
	int year;
	public Date(int a,int b,int c) {
		if(a>0 || a<31)
			day=a;
		if(b>0 || b<12)
			month=b;
		if(c>0 || c>1700)
			year=c;
	}
	public Date(Date d1) {
		this.day=d1.day;
		this.month=d1.month;
		this.year=d1.year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public boolean equals(Date other_date) {
		if(other_date==null) {
			return false;
		}else {
			return
				day==(other_date.day) &&
				month==(other_date.month)&&
				year==(other_date.year);
			
		}
	}
}
