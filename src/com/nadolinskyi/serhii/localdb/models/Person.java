package com.nadolinskyi.serhii.localdb.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name = SQLTablesConstants.TABLE_PERSONS)
public class Person extends Model implements SQLTablesConstants, Parcelable {
	
	@Column(name = ROW_ID, unique = true, onUniqueConflict = Column.ConflictAction.REPLACE)
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


	@Override
	public int describeContents() {
		return 0;
	}


	@Override
	public void writeToParcel(Parcel dest, int flags) {

		dest.writeLong(customId);
		dest.writeString(name);
		dest.writeInt(age);
		dest.writeByte((byte) (isMale ? 1 : 0));
	}
	
	public Person(Parcel in){
		customId	= in.readLong();
		name 		= in.readString();
		age			= in.readInt();
		isMale		= in.readByte() == 1;
	}
	
	public static final Parcelable.Creator<Person> CREATOR = new Parcelable.Creator<Person>() {
		public Person createFromParcel(Parcel in) {
			return new Person(in);
		}

		public Person[] newArray(int size) {
			return new Person[size];
		}
	};

	
	
}
