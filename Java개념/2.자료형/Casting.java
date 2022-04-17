public class Test{
  public static void main(String[] args){
    int a = 10;
    double b;
    
    b = a;  System.out.println(b);  //10 .0
    
    // 큰 자료형(double) -> 작은 자료형(int) 오버플로우로 error 발생
    a = b;  System.out.println(a); 
    
    //명시적 형변환으로 강제 형변환하면 error 발생x
    a = (int)b;  System.out.println(a); //10
    
    //double안붙이면 소수점 첫번째까지 나오고, double붙이면 끝까지 나온다.
    b = 10/3;  System.out.println(b);  //3.0
    b = (double)10/3;  System.out.println(b);  //3.3333333
    
    
    b = (int)10.20 + (int)3.3;  System.out.println(b);  //13.0
    b = (int)10.2 + 3.3;  System.out.println(b);  //13.3
  }
}
