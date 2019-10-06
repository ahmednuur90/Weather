/**Author: Ahmed Nuur
   Student Number: 105031864
   Date: 2019-10-03
*/

import java.util.*;

public class WeatherTester{

	public static void main(String[] args){

		int tempF;
		int windSpeed;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the temperature in Faranheit: ");
		tempF = input.nextInt();

		System.out.println("Enter the windspeed: ");
		windSpeed = input.nextInt();


		Weather weather = new Weather(tempF,windSpeed);		//object weathers

		System.out.println(weather);

		if(weather.isSevere()){		//if the windchill is less than -15'F then it's severe
			System.out.println("The weather is severe!");
		}					
	}
}