package exercise;

public class ArrayIntMax {
	public static void main(String[] args) {
		//주어진 배열의 항목에서 최대값 구하기
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		int count = array.length;
		
		for(int i=0; i<count; i++) {
			if(max<array[i]) {
				max = array[i];
			}
		}
		System.out.println("max: " + max);
	}

}
