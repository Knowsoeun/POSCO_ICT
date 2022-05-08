**ERROR 발생**  
```java
public class Test{
  public static void main(String[] args){
    byte b = 30000; 
  }
}
```
byte형은 8bit로 -128~127 사이의 정수를 나타낸다. (2^8=128 참고)  
그런데, 127이 넘는 30000을 넣으면 큰 자료형->작은 자료형으로 오버플로우가 일어나 에러가 발생하게 된다.  
그러므로 (byte)로 명시적 형변환을 해주어야 에러가 발생하지 않는다.  



**수정한 코드**
```java
public class Test{
  public static void main(String[] args){
    byte b = (byte )30000; 
  }
}
```
