package dd;

public class scoreaverage2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double score[][]= {{3.3, 3.4}, // 1�г� 1, 2�б� ����
				{3.5, 3.6}, //2�г� 1, 2�б� ����
				{3.7, 4.0}, // 3�г� 1,2�б� ����
				{4.1, 4.2}}; // 4�г� 1,2�б� ����
		double sum ,sum1 = 0;
		double sum2 = 0;
		double total =0;
		
		int n = score.length;
		int m =score[0].length;
		System.out.println("|  �г�  |   1�б�  |   2�б�   |   ���   |");
		
		int years=1;
		for(int year =0; year<4; year++) {
			sum = score[year][0]+score[year][1];
			sum = Math.round(sum * 100) / 100.0;
			System.out.println("| "+years+"�г�  |   "+score[year][0]+"   |   "+score[year][1]+"   |   "+sum/2+"  |");
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
		System.out.println("|  ��ü  |   "+sum1/4+"  |   "+sum2/4+"   |   "+total+"   |");
	}
	

}
