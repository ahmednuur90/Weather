import java.util.*;

public class Weather{

	private int tempF;		//temperature in F
	private int windSpeed;		//windspeed in mph
	private double windChill;		
	private boolean severe;	//if the wind chill is under -15 'F then it's considered severe


	/**Description: Automatically fills the information of Temp and Windspeed to 0 if it's not given by the user
	   Input: this method uses the instance variables tempF and windSpeed
	   Output: this method has no output
	*/
	public Weather(){
		this(0,0);
	}
	


	/**Description: constructor that gives values to the instance variables
	*/
	public Weather(int tempF, int windSpeed){			//constructor
		this.tempF = tempF;
		this.windSpeed = windSpeed;
		setWindChill();		
	}

	/**Description: this method sets the temperature
	*/
	public void setTemp(int tempF){
		this.tempF = tempF;
	}

	/**Description: this method sets the windspeed
	*/
	public void setWindSpeed(int windSpeed){
		this.windSpeed = windSpeed;
		setWindChill();			//calculates windchill
	}

	/**Description: this method calculates the windchill
	*/
	public void setWindChill(){
		this.windChill = 35.74 + ((0.6215*tempF) - 35.75*Math.pow(windSpeed, 0.16) + 0.4275*tempF*Math.pow(windSpeed, 0.16));
	}

	/**Descrption: this method calculates if the windchill is under -15'F or not
	*/
	public boolean isSevere(){
		if(this.windChill < -15){		//checks if the windchill is below -15'F or not
			this.severe = true;
		}
		return this.severe;
	}

	/**Description: this method returns the temperature
	*/
	public int getTemp(){
		return tempF;
	}

	/**Description: this method returns the windspeed
	*/
	public int getWindSpeed(){
		return windSpeed;
	}

	/**Description: this method returns the windchill
	*/
	public double getWindChill(){
		return windChill;
	}

	/**Description: this method 
	*/
	public String toString(){
		return "Current Temperature is " + getTemp() + "'F. Feels like " + String.format("%.2f", getWindChill()) + "'F and the Wind Speed is " + getWindSpeed() + " mph";
	}
}