public class Test{
  public static void main(String[] args){
    int a = 10;
    double b;
    b = a;  System.out.println(b);  
    a = b;  System.out.println(a);  // 큰 자료형(double) -> 작은 자료형(int) 오버플로우로 error 발생
    a = (int)b;  System.out.println(a); //명시적 형변환으로 강제 형변환하면 error 발생x
    b = 10/3;  System.out.println(b);
    b = (double)10/3;  System.out.println(b);
    b = (int)10.20 + (int)3.3;  System.out.println(b);
    b = (int)10.2 + 3.3;  System.out.println(b);
  }
}
