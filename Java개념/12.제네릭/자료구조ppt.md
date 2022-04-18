## 1. 단순연결리스트  
```java

```
## 2. 연결 스택과 큐: 여러 개의 스택과 큐를 순차적으로 표현하여 효율적으로 관리 가
## 3. 원형 연결 리스트: 마지막 노드가 리스트의 첫번째 노드를 가지키도록 한 경우  
- 체인: 마지막 노드의 링크 필드 값이 NULL인 단순 연결 리스트   
![image](https://user-images.githubusercontent.com/63652571/163745809-fbe4d863-f449-4059-a0d5-d4479d84df6e.png)
```java
search = a.link;
while (search != a){
  search = search.link;
}
```
## 4. 이중 연결 리스트
