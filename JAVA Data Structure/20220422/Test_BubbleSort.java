/*
 2022-04-22
 노소은
 */


class Sort_{
	public void bubbleSort(int a[]){
		int i, j, temp, size;
		size = a.length;
		for(i=size-1; i>0; i--){
			System.out.printf("\n버블 정렬 %d 단계 : ", size-i);
			for(j=0; j<i; j++){
				if(a[j] > a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
}
				System.out.printf("\n\t");
				for(int k=0; k<size; k++)
					System.out.printf("%3d ", a[k]);
}
}
 }
}
	class Test_BubbleSort{
		public static void main(String args[]){
			int a[] = { 34, 27, 19, 51, 8, 24, 11};
			Sort_ S = new Sort_();
			System.out.printf("\n정렬할 원소 : ");
			for(int i=0; i<a.length; i++)
				System.out.printf(" %d", a[i]);
			System.out.println();
			S.bubbleSort(a);
 }
}