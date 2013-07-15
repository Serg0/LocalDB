package com.nadolinskyi.serhii.UI;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

import com.nadolinskyi.serhii.localdb.R;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		

		//TODO show frags
		showFragment(new GroupsFragment());
	}

	
	public void showFragment(Fragment fragment){
		showFragment(fragment, null);
	}
	
	public void showFragment(Fragment fragment, Bundle args){
		FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
		
		if(args != null){
			fragment.setArguments(args);
		}
		
		ft.replace(R.id.fragContainer, fragment);
		ft.commit();
		
		
		
	}

}
