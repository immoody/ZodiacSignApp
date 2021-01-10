
public class MathCheck {
	private int Overall;
	private int LoveAndMarridge;
	private int Commucation;
	private String OverallFortune;
	private String LoveAndMarridgeFortune;
	private String CommucationFortune;
	
	
	public MathCheck(Profile x,ZodiacSign a) {
		if(x.getMoonSign() == ZodiacSign.ARIES) {
			switch (a) {
				case LEO:
					Overall = 97;
					LoveAndMarridge = 96;
					Commucation = 90;
					break;
				case SAGITTARIUS:
					Overall = 93;
					LoveAndMarridge = 85;
					Commucation = 95;
					break;
				case GEMINI:
					Overall = 83;
					LoveAndMarridge = 85;
					Commucation = 80;
					break;
				case LIBRA:
					Overall = 85;
					LoveAndMarridge = 84;
					Commucation = 70;
					break;
				case AQUARIUS:
					Overall = 78;
					LoveAndMarridge = 78;
					Commucation = 85;
					break;
				case VIRGO:
					Overall = 63;
					LoveAndMarridge = 55;
					Commucation = 75;
					break;
				case PISCES:
					Overall = 67;
					LoveAndMarridge = 46;
					Commucation = 65;
					break;
				case ARIES:
					Overall = 50;
					LoveAndMarridge = 40;
					Commucation = 35;
					break;
				case SCORPIO:
					Overall = 50;
					LoveAndMarridge = 46;
					Commucation = 60;
					break;
				case CAPRICORN:
					Overall = 47;
					LoveAndMarridge = 46;
					Commucation = 55;
					break;
				case CANCER:
					Overall = 42;
					LoveAndMarridge = 49;
					Commucation = 30;
					break;
				case TAURUS:
					Overall = 38;
					LoveAndMarridge = 48;
					Commucation = 30;
					break;
					
				
				
							
			}
			
		}
		else {
			Overall = 100;
			LoveAndMarridge = 100;
			Commucation = 100;
			
		}
		if(Overall >= 70 ) {
			OverallFortune = "Super match over all with "+ a.toString();
		}else if (Overall<70 || Overall>= 50) {
			OverallFortune = "Good match over all with "+ a.toString();
		}else
			OverallFortune = "Bad match over all with "+ a.toString();
		
		if(LoveAndMarridge >= 70 ) {
			LoveAndMarridgeFortune = "Super match for love and marridge with "+ a.toString();
		}else if (LoveAndMarridge<70 || LoveAndMarridge>= 50) {
			LoveAndMarridgeFortune = "Good match for love and marridge with "+ a.toString();
		}else
			LoveAndMarridgeFortune = "Bad match for love and marridge with "+ a.toString();
		
		if(Commucation >= 70 ) {
			CommucationFortune = "Super match for communication with "+ a.toString();
		}else if (Commucation<70 || Commucation>= 50) {
			CommucationFortune = "Good match for communication with "+ a.toString();
		}else
			CommucationFortune = "Bad match for communication with "+ a.toString();
		
		
	}
	public int getOverall() {
		return Overall;
	}


	public void setOverall(int overall) {
		Overall = overall;
	}


	public int getLoveAndMarridge() {
		return LoveAndMarridge;
	}


	public void setLoveAndMarridge(int loveAndMarridge) {
		LoveAndMarridge = loveAndMarridge;
	}


	public int getCommucation() {
		return Commucation;
	}


	public void setCommucation(int commucation) {
		Commucation = commucation;
	}


	public String getOverallFortune() {
		return OverallFortune;
	}


	public void setOverallFortune(String overallFortune) {
		OverallFortune = overallFortune;
	}


	public String getLoveAndMarridgeFortune() {
		return LoveAndMarridgeFortune;
	}


	public void setLoveAndMarridgeFortune(String loveAndMarridgeFortune) {
		LoveAndMarridgeFortune = loveAndMarridgeFortune;
	}


	public String getCommucationFortune() {
		return CommucationFortune;
	}


	public void setCommucationFortune(String commucationFortune) {
		CommucationFortune = commucationFortune;
	}

	
	
	

}
