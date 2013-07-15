package com.nadolinskyi.serhii.localdb.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.nadolinskyi.serhii.localdb.constants.MockData;
import com.nadolinskyi.serhii.localdb.models.Group;
import com.nadolinskyi.serhii.localdb.models.Person;

public class DataUtils {

	public static List<Group> generateGroupsList(int listSize) {
		// TODO check this
		
		List<Group> groups = new ArrayList<Group>();

		Random rand = new Random(53);
		
		for(int index = 0; index < listSize; index++){
			
			Group group = new Group();
			group.setCustomId(rand.nextLong());
		}
		
		return groups;
	}
	
	
	public static List<Person> generatePersonsList(int listSize) {
		// TODO check this
		
		List<Person> persons = new ArrayList<Person>();

		Random rand = new Random(47);
		
		for(int index = 0; index < listSize; index++){
			
			Person person = new Person();
			boolean isMale = rand.nextBoolean();
			
			person.setMale(isMale);
			if(isMale){
				person.setName(MockData.maleNames[rand.nextInt(MockData.maleNames.length)]);
			}else{
				person.setName(MockData.femaleNames[rand.nextInt(MockData.femaleNames.length)]);
			}
			
			person.setCustomId(rand.nextLong());
			
		}
				
		return persons;
	}
}
