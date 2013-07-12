package com.nadolinskyi.serhii.localdb.models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name = SQLTablesConstants.TABLE_PERSONS)
public class Person extends Model implements SQLTablesConstants {
	
	@Column(name = ROW_ID)
	public long customId;
	@Column(name = ROW_NAME)
	public String name;
	@Column(name = ROW_AGE)
	public int age;
	@Column(name = ROW_IS_MALE)
	public boolean isMale;
	
	
	public Person() {
		super();
	}


	public Person(long customId, String name, int age, boolean isMale) {
		super();
		this.customId = customId;
		this.name = name;
		this.age = age;
		this.isMale = isMale;
	}


	public long getCustomId() {
		return customId;
	}


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public boolean isMale() {
		return isMale;
	}


	public void setCustomId(long customId) {
		this.customId = customId;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	
	

	
	
}
