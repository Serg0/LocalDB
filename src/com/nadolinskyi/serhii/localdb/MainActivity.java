package com.nadolinskyi.serhii.localdb;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.nadolinskyi.serhii.localdb.constants.MockNames;
import com.nadolinskyi.serhii.localdb.models.Person;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		processDB();
	}

	private void processDB() {
		
		
		List<Person> personsList = geneRatePersonsList(10);
		
		
	}

	
	
	private List<Person> geneRatePersonsList(int listSize) {
		// TODO check this
		
		List<Person> persons = new ArrayList<Person>();

		Random rand = new Random(47);
		
		for(int index = 0; index < listSize; index++){
			
			Person person = new Person();
			boolean isMale = rand.nextBoolean();
			
			person.setMale(isMale);
			if(isMale){
				person.setName(MockNames.maleNames[rand.nextInt(MockNames.maleNames.length)]);
			}else{
				person.setName(MockNames.femaleNames[rand.nextInt(MockNames.femaleNames.length)]);
			}
			
			person.setCustomId(rand.nextLong());
			
		}
		
		
		
		return persons;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
