package com.blood.doner;

public class Doner {
	private int D_id;
	private int D_age;
	private String D_name;
	private String D_group;
	private String D_gender;
	public Doner(int d_id, int d_age, String d_name, String d_group, String d_gender) {
		super();
		D_id = d_id;
		D_age = d_age;
		D_name = d_name;
		D_group = d_group;
		D_gender = d_gender;
	}
	public Doner(int d_age, String d_name, String d_group, String d_gender) {
		super();
		D_age = d_age;
		D_name = d_name;
		D_group = d_group;
		D_gender = d_gender;
	}
	public Doner() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getD_id() {
		return D_id;
	}
	public void setD_id(int d_id) {
		D_id = d_id;
	}
	public int getD_age() {
		return D_age;
	}
	public void setD_age(int d_age) {
		D_age = d_age;
	}
	public String getD_name() {
		return D_name;
	}
	public void setD_name(String d_name) {
		D_name = d_name;
	}
	public String getD_group() {
		return D_group;
	}
	public void setD_group(String d_group) {
		D_group = d_group;
	}
	public String getD_gender() {
		return D_gender;
	}
	public void setD_gender(String d_gender) {
		D_gender = d_gender;
	}
	@Override
	public String toString() {
		return "Doner [D_id=" + D_id + ", D_age=" + D_age + ", D_name=" + D_name + ", D_group=" + D_group
				+ ", D_gender=" + D_gender + "]";
	}
	
	
}
