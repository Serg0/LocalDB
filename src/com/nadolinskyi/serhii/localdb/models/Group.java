package com.nadolinskyi.serhii.localdb.models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;


@Table(name = SQLTablesConstants.TABLE_GROUPS)
public class Group extends Model implements SQLTablesConstants {

	
	@Column(name = ROW_ID)
	public long customId;
	@Column(name = ROW_NAME)
	public String name;
	
	
	public Group(long custom_id, String name) {
		super();
		this.customId = custom_id;
		this.name = name;
	}

	public Group() {
		super();
	}

	public long getCustom_id() {
		return customId;
	}

	public void setCustomId(long customId) {
		this.customId = customId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
