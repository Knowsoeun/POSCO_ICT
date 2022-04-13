package prac;

class Time {
		// TODO Auto-generated method stub
		
		//필드 선언
		private int day;
		private int hour;
		private int min;
		private int sec;
		
		//매개변수가 있는 생성자 정의
		public Time(int hour, int min, int sec) {
			this.hour=hour;
			this.min=min;
			this.sec=sec;
		}
		
		public Time(int day, int hour, int min, int sec) {
			super();
			this.day = day;
			this.hour = hour;
			this.min = min;
			this.sec = sec;
		}

		/*
		 * public void setDay(int day) { this.day = day; }
		 */

		//최대초=24*3600초
		//add 메소드 정의
		public Time add(Time time) {
			
			int a=time.hour*60*60+time.min*60+time.sec; //입력받은 시간
			int b=this.hour*60*60+this.min*60+this.sec; //원래 시간
			
			int sum=a+b;
			int hour=sum/3600;
			int min=(sum%3600)/60;
			int sec=(sum%3600)%60;
			int day = 0;

			if (hour>=24) {
				day+=1;
				hour -= 24;
			}
			
//			Time newTime = new Time(hour, min, sec);
//			newTime.setDay(day);
			Time newTime = new Time(day, hour, min, sec);
			
			return newTime;
		}
		
		//sub 메소드 정의
		public Time sub(Time time) {
			int a=time.hour*60*60+time.min*60+time.sec; //입력받은 시간
			int b=this.hour*60*60+this.min*60+this.sec; //원래 시간
			
			int sub = b - a;
			int day = 0;
			
			if (sub < 0) {
				sub += (24 * 60 * 60);
				day = -1;
			}
			
			int hour=sub/3600;
			int min=(sub%3600)/60;
			int sec=(sub%3600)%60;
			

//			if (hour>=24) {
//				day+=1;
//				hour -= 24;
//			}
			
//			Time newTime = new Time(hour, min, sec);
//			newTime.setDay(day);
			Time newTime = new Time(day, hour, min, sec);
			
			return newTime;
		}
		
		//compare 메소드 정의
		public int compare(Time time) {
			
			int a=time.hour*60*60+time.min*60+time.sec; //입력받은 시간
			int b=this.hour*60*60+this.min*60+this.sec; //원래 시간
			
			if (a > b) {
				return -1;
			} else if (a == b) {
				return 0;
			} else {
				return 1;
			}
		}
		
		//print 메소드 정의
		public void print() {
			if(day == 0) {
				System.out.printf("당일 %d시 %d분 %d초 입니다.", hour, min, sec);
			} else if(day == 1) {
				System.out.printf("후일 %d시 %d분 %d초 입니다.", hour, min, sec);
			} else {
				System.out.printf("전일 %d시 %d분 %d초 입니다.", hour, min, sec);
			}
		}
		
	}

