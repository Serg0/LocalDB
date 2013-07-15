package com.nadolinskyi.serhii.UI.adapters;

import java.util.List;

import com.nadolinskyi.serhii.localdb.R;
import com.nadolinskyi.serhii.localdb.models.Group;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class GroupsAdapter extends BaseAdapter {

	private List<Group> groups;
	private Activity context;

	public GroupsAdapter(Activity context, List<Group> groups) {
		this.context = context;
		this.groups = groups;
	}
	
	@Override
	public int getCount() {
		return groups.size();
	}

	@Override
	public Group getItem(int position) {
		return groups.get(position);
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View rowView = convertView;
	    if (rowView == null) {
	      LayoutInflater inflater = (LayoutInflater) context.getLayoutInflater();
	      rowView = inflater.inflate(R.layout.group_row, parent);
	      ViewHolder viewHolder = new ViewHolder();
	      viewHolder.text = (TextView) rowView.findViewById(R.id.textViewGroup);
	      rowView.setTag(viewHolder);
	    }

	    ViewHolder holder = (ViewHolder) rowView.getTag();
	    holder.text.setText(getItem(position).getName());

	    return rowView;
	}

	
	static class ViewHolder {
	    public TextView text;
	  }
}
