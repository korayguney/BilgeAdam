package com.bilgeadam.dateexamples;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ZoneIdClass {

	public static void main(String[] args) {
		
		Map<String, String> sortedMap = new LinkedHashMap();
		Set<String> zonelist = ZoneId.getAvailableZoneIds();
		Map<String, String> zonedMap = getAllZoneIds(zonelist);
		
//		zonedMap.entrySet().stream().sorted(new Comparator<Map.Entry<String, String>>() {
//
//			@Override
//			public int compare(Entry<String, String> o1, Entry<String, String> o2) {
//				return o1.getKey().compareTo(o2.getKey());
//			}
//		}).forEachOrdered(new Consumer<Map.Entry<String, String>>() {
//
//			@Override
//			public void accept(Entry<String, String> zone) {
//				sortedMap.put(zone.getKey(), zone.getValue());
//			}
//		});
//		
//		sortedMap.entrySet().forEach(new Consumer<Map.Entry<String, String>>() {
//
//			@Override
//			public void accept(Entry<String, String> zone) {
//				System.out.println(zone.getKey() + " -----> " + zone.getValue());
//			}
//		});
		
//		
//		zonedMap.entrySet().stream().sorted((o1,o2) -> o1.getKey().compareTo(o2.getKey())).
//		forEachOrdered(zone -> sortedMap.put(zone.getKey(), zone.getValue()));
//		
//		sortedMap.entrySet().forEach(zone -> System.out.println(zone.getKey() + " -----> " + zone.getValue()));
		
		zonedMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).
		forEachOrdered(zone -> sortedMap.put(zone.getKey(), zone.getValue()));
		
		sortedMap.entrySet().forEach(zone -> System.out.println(zone.getKey() + " -----> " + zone.getValue()));
	}

	private static Map<String, String> getAllZoneIds(Set<String> zonelist) {
		
		Map<String, String> zonemap = new HashMap<>();
		
		LocalDateTime ldt = LocalDateTime.now();
		
		for (String zone : zonelist) {
			ZoneId zoneId = ZoneId.of(zone);
			ZonedDateTime zdt = ldt.atZone(zoneId);
			ZoneOffset zos = zdt.getOffset();
			
			zonemap.put(zone.toString(), zos.getId());
		}
		return zonemap;
	}

}
