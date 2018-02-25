package api3;

import java.util.Arrays;

//배열의 항목 정렬
public class SortExample {
	public static void main(String[] args) {
		int[] scores = {99, 97, 98};
		Arrays.sort(scores);
		
		for(int i=0; i<scores.length; i++) {
			System.out.println("scores[" + i + "]= " + scores[i]);
		}
		System.out.println();
		
		String[] names = {"홍길동", "박수동", "김민수"};
		Arrays.sort(names);
		for(int i=0; i<names.length; i++) {
			System.out.println("names[" + i + "]= " + names[i]);
		}
		System.out.println();
		
		Member m1 = new Member("홍길동");
		Member m2 = new Member("박수동");
		Member m3 = new Member("김민수");
		Member[] members = {m1, m2, m3};
		
		Arrays.sort(members);
		for(int i=0; i<members.length; i++) {
			System.out.println("members[" + i + "]= " + members[i].name);
		}
	}
}
