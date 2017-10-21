/**
 * 
 */
package com.emrs.entity;

import java.sql.Date;

/**
 * @author Administrator
 *
 */
public class MbileInfo {
	private int mbile_id;
	private String mbile_number;
	private String brand;
	private Date start_time;
	private boolean is_rent;
	private boolean is_break;
	/**
	 * @return the mbile_id
	 */
	public int getMbile_id() {
		return mbile_id;
	}
	/**
	 * @param mbile_id the mbile_id to set
	 */
	public void setMbile_id(int mbile_id) {
		this.mbile_id = mbile_id;
	}
	/**
	 * @return the mbile_number
	 */
	public String getMbile_number() {
		return mbile_number;
	}
	/**
	 * @param mbile_number the mbile_number to set
	 */
	public void setMbile_number(String mbile_number) {
		this.mbile_number = mbile_number;
	}
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @return the start_time
	 */
	public Date getStart_time() {
		return start_time;
	}
	/**
	 * @param start_time the start_time to set
	 */
	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}
	/**
	 * @return the is_rent
	 */
	public boolean isIs_rent() {
		return is_rent;
	}
	/**
	 * @param is_rent the is_rent to set
	 */
	public void setIs_rent(boolean is_rent) {
		this.is_rent = is_rent;
	}
	/**
	 * @return the is_break
	 */
	public boolean isIs_break() {
		return is_break;
	}
	/**
	 * @param is_break the is_break to set
	 */
	public void setIs_break(boolean is_break) {
		this.is_break = is_break;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MbileInfo [mbile_id=" + mbile_id + ", mbile_number="
				+ mbile_number + ", brand=" + brand + ", start_time="
				+ start_time + ", is_rent=" + is_rent + ", is_break="
				+ is_break + "]";
	}
	
}
