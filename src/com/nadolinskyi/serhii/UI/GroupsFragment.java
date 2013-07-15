package com.nadolinskyi.serhii.UI;

import java.util.List;

import com.nadolinskyi.serhii.UI.adapters.GroupsAdapter;
import com.nadolinskyi.serhii.localdb.R;
import com.nadolinskyi.serhii.localdb.models.Group;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class GroupsFragment extends Fragment {
	
	private ListView listView;
	private GroupsAdapter adapter;
	private List<Group> groups;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		inflater.inflate(R.layout.groups_fragment, container);
		return super.onCreateView(inflater, container, savedInstanceState);
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
		groups = getGroupsFromDB();
		listView = (ListView) getView().findViewById(R.id.listView);
		adapter = new GroupsAdapter(getActivity(), groups);
		listView.setAdapter(adapter);
		
	}

	private List<Group> getGroupsFromDB() {
		// TODO Auto-generated method stub
		return null;
	}
}
