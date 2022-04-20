package dd;

public class scoreaverage2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double score[][]= {{3.3, 3.4}, // 1학년 1, 2학기 평점
				{3.5, 3.6}, //2학년 1, 2학기 평점
				{3.7, 4.0}, // 3학년 1,2학기 평점
				{4.1, 4.2}}; // 4학년 1,2학기 평점
		double sum ,sum1 = 0;
		double sum2 = 0;
		double total =0;
		
		int n = score.length;
		int m =score[0].length;
		System.out.println("|  학년  |   1학기  |   2학기   |   평균   |");
		System.out.println("---------------------------------------");
		
		int years=1;
		for(int year =0; year<4; year++) {
			sum = score[year][0]+score[year][1];
			sum = Math.round(sum * 100) / 100.0;
			System.out.println("| "+years+"학년  |   "+score[year][0]+"   |   "+score[year][1]+"   |   "+sum/2+"  |");
			years+=1;
		}
		
		for(int year =0; year<4; year++) {
			sum1 += score[year][0];
			sum2 += score[year][1];
		}
		total = sum1/4 + sum2/4;
		sum1 = Math.round(sum1 * 100) / 100.0;
		sum2 = Math.round(sum2 * 100) / 100.0;
		total = total/2;
		total = Math.round(total * 100) / 100.0;
		System.out.println("---------------------------------------");
		System.out.println("|  전체  |   "+sum1/4+"  |   "+sum2/4+"   |   "+total+"   |");
	}
	

}
