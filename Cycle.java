import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.stream.Stream;

public class Cycle {
	private String Name;
	private int cycleMonth;
	private int cycleDay;
	private int remainigMonth;
	private int remainigDay;
	private Calendar CurrentDate  ;
	private  String datee;
	DateFormat df;
	
	
	public Cycle(int month,int day,String name) {
	      this.cycleDay = day;
	      this.cycleMonth = month;
	      this.Name = name;
	      
	      this.CurrentDate = Calendar.getInstance();
	      df = new SimpleDateFormat("dd/MM/yy");
	      datee = df.format(CurrentDate.getTime());
	        String[] dateArray= datee.split("/");
	      
	      //int currentMonth = (Character.getNumericValue(datee.charAt(3))*10) + (Character.getNumericValue(datee.charAt(4)));
	        int currentMonth = Integer.parseInt(dateArray[1]);
	        int currentDay = Integer.parseInt(dateArray[0]);
	      if((this.cycleMonth-currentMonth)<0)
	         this.remainigMonth = (this.cycleMonth-currentMonth)+12;
	      else
	         this.remainigMonth = this.cycleMonth-currentMonth;
	      
	      if(currentMonth == 1 || currentMonth == 3 ||
	            currentMonth == 5 || currentMonth == 7 || currentMonth == 8 || currentMonth == 10 || currentMonth == 12) {
	         if((cycleDay-currentDay) < 0){
	         this.remainigDay = (currentDay-cycleDay)+31;
	         this.remainigMonth -= 1;
	         }
	         else 
	            this.remainigDay = (currentDay-cycleDay);
	            
	      }
	      if (currentMonth == 2) {
	         if((cycleDay-currentDay) < 0){
	            this.remainigDay = ((currentDay-cycleDay)+28);
	            this.remainigMonth =this.remainigMonth-1;
	            }
	            else 
	               this.remainigDay = (cycleDay-currentDay);
	               
	         
	         
	      }
	      else {
	         if((cycleDay-currentDay) < 0){
	            this.remainigDay = ((cycleDay-currentDay)+30);
	            this.remainigMonth =this.remainigMonth-1;
	            }
	            else 
	               this.remainigDay = (cycleDay-currentDay);
	               
	         
	      }


	      
	   }
	
	
	
	public String getName() {
		return Name;
	}




	public void setName(String name) {
		Name = name;
	}




	public int getRemainigMonth() {
		return remainigMonth;
	}



	public int getRemainigDay() {
		return remainigDay;
	}








	//In this version cycle fortune for every single zodiac sign is not going to be implemented.
	public String CycleFortune(Profile profile) {
		
		return "This "+Name+" is goning to be tough for you";
	}
	


}
