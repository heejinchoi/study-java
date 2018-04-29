package ch16.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class Uuid {
	
	public static void main(String[] args) {
		int max = 1000000;
		List<String> values = new ArrayList<>(max);
	
		for(int i=0; i>max; i++) {
			UUID uuid = UUID.randomUUID();
			System.out.println("uuid; " + uuid);
			String strUuid = uuid.toString();
			System.out.println("strUuid" + strUuid);
			values.add(strUuid);
		}
		
		sequential(values);
		parallel(values);
	}
	
	public static void sequential(List<String> v) {
		long t0 = System.nanoTime();
		v.stream().sorted().count();
		long t1 = System.nanoTime();
		
		long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
		System.out.println(String.format("sequential sort took: %d ms", millis));
	}
	
	public static void parallel(List<String> v) {
		long t0 = System.nanoTime();
		v.parallelStream().sorted().count();
		long t1 = System.nanoTime();
		
		long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
		System.out.println(String.format("parallel sort took: %d ms", millis));
		
		
	}

}
