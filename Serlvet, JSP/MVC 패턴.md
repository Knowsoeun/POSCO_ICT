## MVC
### 1. MVC를 지키면서 코딩하는 법 
1. Model 내부에 Controller와 View에 관련된 코드가 있으면 안된다. 즉, Model에는 데이터와 관련된 코드만 넣는다.
2. View 내부에는 Model에 관련된 코드는 있어도 된다. Controller에 관련된 코드는 있으면 안된다.  
3. 모 사용자에게 똑같이 보여져야 하는 부분은 Model로부터 받으면 안되고, View가 자체적으로 가지고 있어야 한다.  
사용자마다 다르게 보여져야 하는 부분은 Model로부터 받는다.
4. Controller는 Model과 View에 의존할 수 있다.
5. View가 Model로부터 데이터를 받을 때, 반드시 COntroller 코드 내에서만 받아야한다.
