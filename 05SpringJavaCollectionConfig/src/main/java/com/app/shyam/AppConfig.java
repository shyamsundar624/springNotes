package com.app.shyam;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.shyam.entity.Farmer;

@Configuration
public class AppConfig {

	@Bean
	public Farmer farmer() {
		Farmer farmer = new Farmer();
		farmer.setName(list());
		farmer.setCode(set());
		farmer.setFarm(map());
		farmer.setPro(porp());
		
		return farmer;
	}

	private Properties porp() {
		Properties p = new Properties();
		p.put("X1", "Z1");
		p.put("X2", "Z2");
		p.put("X3", "Z3");
		p.put("X4", "Z4");
		return p;
	}

	private Map<Integer, String> map() {
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(1, "M1");
		map.put(2, "M2");
		map.put(3, "M3");
		map.put(4, "M4");
		return map;

	}

	private Set<String> set() {
		Set<String> set = new LinkedHashSet<String>();
		set.add("s1");
		set.add("s2");
		set.add("s3");
		set.add("s4");
		return set;
	}

	private List<String> list() {
		List<String> list = new LinkedList<String>();
		list.add("shyam");
		list.add("sangam");
		list.add("pankaj");
		list.add("raju");
		return list;
	}

}
