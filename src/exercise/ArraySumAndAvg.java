package exercise;

public class ArraySumAndAvg {
	public static void main(String[] args) {
		//주어진 배열의 전체 항목의 합과 평균 값 구하기
		
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		int sum = 0;
		double avg = 0;
		int count= 0;
		
		System.out.println("배열의 길이: " + array.length);		
		System.out.println("0번째 배열의 길이: " + array[0].length);		
		System.out.println("1번째 배열의 길이: " + array[1].length);		
		System.out.println("2번째 배열의 길이: " + array[2].length);		
		System.out.println();
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum += array[i][j];
				count++;
				avg = sum/count;
			}
		}
		
		System.out.println("sum: "+sum);
		System.out.println("count: "+count);
		System.out.println("avg: "+avg);
	}
}
