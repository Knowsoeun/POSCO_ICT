package prac2;

public class Ts {

		// TODO Auto-generated method stub
		
		//필드 선언
		public static final int NUM=0;
		public static final int STR=1;
		public String s;
		public String t;

		
		//생성자 정의
		public Ts(String s, String t) {
			this.s=s;
			this.t=t;

		}

		
		//메소드 정의
		public int check() {
			//이중 for문 (1)
			//s, t 이중 for문 쓰지 말고 따로 하기
			/*
			for (int i=0; i<s.length(); i++) {                             //s문자열 길이만큼 반복
				for (int j=0; j<t.length(); j++) {                         //t문자열 길이만큼 반복
					if(Character.isDigit(s.charAt(i))==false)            
						if(s.charAt(i)!='.')                               
							if(s.charAt(i)!='-')                           
								if (Character.isDigit(t.charAt(i))==false) 
									if(t.charAt(i)!='.')                   
										if(t.charAt(i)!='-')              
											return STR;                     
				}
			}
			return NUM;  //둘다 숫자이므로 NUM인 0을 반환한다.
			
			*/
			
			 //단일 for문 (2)
			 for (int i=0; i<s.length(); i++){
			 	if(Character.isDigit(s.charAt(i))==false && s.charAt(i)!='.' && s.charAt(i)!='-')
			 	  return STR;
			 }
			 
			 for (int i=0; i<t.length(); i++){
			 	if(Character.isDigit(t.charAt(i))==false && t.charAt(i)!='.' && t.charAt(i)!='-')
			 	  return STR;
			 }
			 
			 return NUM;
			 
		}
}




// 숫자면 return num 문자열이면 return str
// 그게 아니라면 return num return STR
