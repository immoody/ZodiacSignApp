
enum ZodiacSign{
    ARIES, TAURUS, GEMINI, CANCER, LEO, VIRGO, LIBRA, SCORPIO, SAGITTARIUS, CAPRICORN, AQUARIUS ,PISCES
}
public class Profile {
	  private String Name ;
	    private int BornMonth;
	    private int BornDay;
	    private int BornHour;
	    private int BornMinute;
	    private ZodiacSign Rising;
	    private ZodiacSign ZodiacSign;
	    public static int count = 0;
	    private String ZodiacSignFortune;
	    private String MoonSigngnFortune;
	    
	    
	 

		@Override
		public String toString() {
			return Name + " " + ZodiacSign ;
		}

		public static int getCount() {
			return count;
		}


		public static int[] ProfilePool = new int[3]; 

	    public int[] getProfilePool() {
			return ProfilePool;
		}

		public void setProfilePool(int[] profilePool) {
			ProfilePool = profilePool;
		}

		public Profile() {
			count ++;
	    }

	    public Profile(String name, int bornMonth, int bornDay, int bornHour, int bornMinute) {
	        Name = name;
	        BornMonth = bornMonth;
	        BornDay = bornDay;
	        BornHour = bornHour;
	        BornMinute = bornMinute;
	        switch (BornMonth){
	            case 1:
	                if(bornDay <= 20) {
	                	this.ZodiacSign= ZodiacSign.CAPRICORN;
	                	this.ZodiacSignFortune = "This week is going to beatiful for "+ this.ZodiacSign.toString();
	                }
	                else if(21 <= bornDay && bornDay  <= 31) {
	                    this.ZodiacSign =  ZodiacSign.AQUARIUS;
	                    this.ZodiacSignFortune = "This week is going to beatiful for "+ this.ZodiacSign.toString();}
	                break;
	            case 2:
	                if(bornDay <= 18) {
	                    this.ZodiacSign = ZodiacSign.AQUARIUS;
	                    this.ZodiacSignFortune = "This week is going to beatiful for "+ this.ZodiacSign.toString();}
	                else if(19 <= bornDay && bornDay  <= 29) {
	                    this.ZodiacSign = ZodiacSign.PISCES;
	                    this.ZodiacSignFortune = "This week is going to beatiful for "+ this.ZodiacSign.toString();}
	                break;
	            case 3:
	                if(bornDay <= 20) {
	                    this.ZodiacSign = ZodiacSign.PISCES;
	                    this.ZodiacSignFortune = "This week is going to beatiful for "+ this.ZodiacSign.toString();}
	                else if(21 <= bornDay && bornDay  <= 31) {
	                    this.ZodiacSign = ZodiacSign.ARIES;
	                    this.ZodiacSignFortune = "This week is going to beatiful for "+ this.ZodiacSign.toString();}
	                break;
	            case 4:
	                if(bornDay <= 20) {
	                    this.ZodiacSign = ZodiacSign.ARIES;
	                    this.ZodiacSignFortune = "This week is going to beatiful for "+ this.ZodiacSign.toString();}
	                else if(21 <= bornDay && bornDay  <= 30) {
	                    this.ZodiacSign = ZodiacSign.TAURUS;
	                    this.ZodiacSignFortune = "This week is going to beatiful for "+ this.ZodiacSign.toString();}
	                
	                break;
	            case 5:
	                if(bornDay <= 21) {
	                    this.ZodiacSign = ZodiacSign.TAURUS;
	                    this.ZodiacSignFortune = "This week is going to beatiful for "+ this.ZodiacSign.toString();}
	                else if(22 <= bornDay && bornDay  <= 31) {
	                    this.ZodiacSign = ZodiacSign.GEMINI;
	                    this.ZodiacSignFortune = "This week is going to beatiful for "+ this.ZodiacSign.toString();}
	                break;
	            case 6:
	                if(bornDay <= 21) {
	                    this.ZodiacSign = ZodiacSign.GEMINI;
	                    this.ZodiacSignFortune = "This week is going to beatiful for "+ this.ZodiacSign.toString();}
	                else if(22 <= bornDay && bornDay  <= 30) {
	                    this.ZodiacSign = ZodiacSign.CANCER;
	                    this.ZodiacSignFortune = "This week is going to beatiful for "+ this.ZodiacSign.toString();}
	                break;
	            case 7:
	                if(bornDay <= 22) {
	                    this.ZodiacSign = ZodiacSign.CANCER;
	                    this.ZodiacSignFortune = "This week is going to beatiful for "+ this.ZodiacSign.toString();}
	                else if(23 <= bornDay && bornDay  <= 31) {
	                    this.ZodiacSign = ZodiacSign.LEO;
	                    this.ZodiacSignFortune = "This week is going to beatiful for "+ this.ZodiacSign.toString();}
	                break;
	            case 8:
	                if(bornDay <= 23) {
	                    this.ZodiacSign = ZodiacSign.LEO;
	                    this.ZodiacSignFortune = "This week is going to beatiful for "+ this.ZodiacSign.toString();}
	                if(24 <= bornDay && bornDay  <= 31) {
	                    this.ZodiacSign = ZodiacSign.VIRGO;
	                    this.ZodiacSignFortune = "This week is going to beatiful for "+ this.ZodiacSign.toString();}
	                break;
	            case 9:
	                if(bornDay <= 22) {
	                    this.ZodiacSign = ZodiacSign.VIRGO;
	                    this.ZodiacSignFortune = "This week is going to beatiful for "+ this.ZodiacSign.toString();}
	                if (23 <= bornDay && bornDay  <= 30) {
	                    this.ZodiacSign = ZodiacSign.LIBRA;
	                    this.ZodiacSignFortune = "This week is going to beatiful for "+ this.ZodiacSign.toString();}
	                break;
	            case 10:
	                if(bornDay <= 23) {
	                    this.ZodiacSign = ZodiacSign.LIBRA;
	                    this.ZodiacSignFortune = "This week is going to beatiful for "+ this.ZodiacSign.toString();}
	                else if(24 <= bornDay && bornDay  <= 31) {
	                    this.ZodiacSign = ZodiacSign.SCORPIO;
	                    this.ZodiacSignFortune = "This week is going to beatiful for "+ this.ZodiacSign.toString();}
	                break;
	            case 11:
	                if(bornDay <= 22) {
	                    this.ZodiacSign = ZodiacSign.SCORPIO;
	                    this.ZodiacSignFortune = "This week is going to beatiful for "+ this.ZodiacSign.toString();}
	                else if(23 <= bornDay && bornDay  <= 30) {
	                    this.ZodiacSign = ZodiacSign.SAGITTARIUS;
	                    this.ZodiacSignFortune = "This week is going to beatiful for "+ this.ZodiacSign.toString();}
	                break;
	            case 12:
	                if(bornDay <= 21) {
	                    this.ZodiacSign = ZodiacSign.SAGITTARIUS;
	                    this.ZodiacSignFortune = "This week is going to beatiful for "+ this.ZodiacSign.toString();}
	                else if(22 <= bornDay && bornDay  <= 31) {
	                    this.ZodiacSign = ZodiacSign.CAPRICORN;
	                    this.ZodiacSignFortune = "This week is going to beatiful for "+ this.ZodiacSign.toString();}
	                break;
	        }
	        Main.Pool.add(this);
	        this.count ++;
	    }

	public void signZodiac(){
	    switch (getBornMonth()){
	        case 1:
	            if(this.getBornDay() <= 20)
	                this.ZodiacSign = ZodiacSign.CAPRICORN;
	            else if(21 <= this.getBornDay() && this.getBornDay()  <= 31)
	                this.ZodiacSign =  ZodiacSign.AQUARIUS;
	            break;
	        case 2:
	            if(this.getBornDay() <= 18)
	                this.ZodiacSign = ZodiacSign.AQUARIUS;
	            else if(19 <= this.getBornDay() && this.getBornDay()  <= 29)
	                this.ZodiacSign = ZodiacSign.PISCES;
	            break;
	        case 3:
	            if(this.getBornDay() <= 20)
	                this.ZodiacSign = ZodiacSign.PISCES;
	            else if(21 <= this.getBornDay() && this.getBornDay()  <= 31)
	                this.ZodiacSign = ZodiacSign.ARIES;
	            break;
	        case 4:
	            if(this.getBornDay() <= 20)
	                this.ZodiacSign = ZodiacSign.ARIES;
	            else if(21 <= this.getBornDay() && this.getBornDay()  <= 30)
	                this.ZodiacSign = ZodiacSign.TAURUS;
	            break;
	        case 5:
	            if(this.getBornDay() <= 21)
	                this.ZodiacSign = ZodiacSign.TAURUS;
	            else if(22 <= this.getBornDay() && this.getBornDay()  <= 31)
	                this.ZodiacSign = ZodiacSign.GEMINI;
	            break;
	        case 6:
	            if(this.getBornDay() <= 21)
	                this.ZodiacSign = ZodiacSign.GEMINI;
	            else if(22 <= this.getBornDay() && this.getBornDay()  <= 30)
	                this.ZodiacSign = ZodiacSign.CANCER;
	            break;
	        case 7:
	            if(this.getBornDay() <= 22)
	                this.ZodiacSign = ZodiacSign.CANCER;
	            else if(23 <= this.getBornDay() && this.getBornDay()  <= 31)
	                this.ZodiacSign = ZodiacSign.LEO;;
	            break;
	        case 8:
	            if(this.getBornDay() <= 23)
	                this.ZodiacSign = ZodiacSign.LEO;;
	            if(24 <= this.getBornDay() && this.getBornDay()  <= 31)
	                this.ZodiacSign = ZodiacSign.VIRGO;
	            break;
	        case 9:
	            if(this.getBornDay() <= 22)
	                this.ZodiacSign = ZodiacSign.VIRGO;;
	            if (23 <= this.getBornDay() && this.getBornDay()  <= 30)
	                this.ZodiacSign = ZodiacSign.LIBRA;
	            break;
	        case 10:
	            if(this.getBornDay() <= 23)
	                this.ZodiacSign = ZodiacSign.LIBRA;
	            else if(24 <= this.getBornDay() && this.getBornDay()  <= 31)
	                this.ZodiacSign = ZodiacSign.SCORPIO;
	            break;
	        case 11:
	            if(this.getBornDay() <= 22)
	                this.ZodiacSign = ZodiacSign.SCORPIO;
	            else if(23 <= this.getBornDay() && this.getBornDay()  <= 30)
	                this.ZodiacSign = ZodiacSign.SAGITTARIUS;
	            break;
	        case 12:
	            if(this.getBornDay() <= 21)
	                this.ZodiacSign = ZodiacSign.SAGITTARIUS;
	            else if(22 <= this.getBornDay() && this.getBornDay()  <= 31)
	                this.ZodiacSign = ZodiacSign.CAPRICORN;
	            break;
	    }
	}

	    public String getName() {
	        return Name;
	    }

	    public void setName(String name) {
	        Name = name;
	    }

	    public int getBornMonth() {
	        return BornMonth;
	    }

	    public void setBornMonth(int bornMonth) {
	        BornMonth = bornMonth;
	    }

	    public int getBornDay() {
	        return BornDay;
	    }

	    public void setBornDay(int bornDay) {
	        BornDay = bornDay;
	    }

	    public int getBornHour() {
	        return BornHour;
	    }

	    public void setBornHour(int bornHour) {
	        BornHour = bornHour;
	    }

	    public int getBornMinute() {
	        return BornMinute;
	    }

	    public void setBornMinute(int bornMinute) {
	        BornMinute = bornMinute;
	    }

	    public ZodiacSign getRising() {
	        return Rising;
	    }

	    public void setRising(ZodiacSign rising) {
	        Rising = rising;
	    }

	    public ZodiacSign getMoonSign() {
	        return ZodiacSign;
	    }

	    public void setMoonSign(ZodiacSign moonSign) {
	        ZodiacSign = moonSign;
	    }
	    public String getZodiacSignFortune() {
			return ZodiacSignFortune;
		}

		public String getMoonSigngnFortune() {
			return MoonSigngnFortune;
		}
		public String SignZodiacSignFortune() {
			return  "This week is going to beatiful for "+ this.ZodiacSign.toString();
		}
}
