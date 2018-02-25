package referencetype;

public class EnumMethodExample {
	public static void main(String[] args) {
		
		//name() 메소드
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println("today에 저장된 이름: "+ name);
		
		
		//ordinal() 메소드
		int ordinal = today.ordinal();
		System.out.println("Week 열거 변수에 입력된 열거 상수의 갯수:" +ordinal);
		
		
		//compareTo() 메소드
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNSEDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println("월요일과 수요일의 비교: " + result1);
		System.out.println("수요일과 월요일의 비교"+ result2);
		
		System.out.println();
		
		//valueOf() 메소드
		System.out.println("args의 길이: " +args.length);
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말 이군요.");
			}
			else {
				System.out.println("평일 이군요.");
			}
		}
		
		System.out.println();
		
		//values() 메소드	
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
		
	}
}
