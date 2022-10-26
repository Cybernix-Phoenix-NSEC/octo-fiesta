// Java Program to convert local time to GMT

// Importing libraries
// 1. input output libraries
import java.io.*;
// 3. Text class
import java.text.DateFormat;
import java.text.SimpleDateFormat;
// 2. Utility libraries for
// Date and TimeZone class
import java.util.Date;
import java.util.TimeZone;

// Class
class GFG {

	// Main driver method
	public static void main(String[] args)
	{

		// Creating a Date class object
		// to take local time from the user
		Date localTime = new Date();

		// Creating a DateFormat class object to
		// convert the localtime to GMT
		DateFormat s = new SimpleDateFormat("dd/MM/yyyy"
											+ " "
											+ " HH:mm:ss");

		// function will helps to get the GMT Timezone
		// using the getTimeZOne() method
		s.setTimeZone(TimeZone.getTimeZone("GMT"));

		// One can get any other time zone also
		// by passing some other argument to it

		// Printing the local time
		System.out.println("local Time:" + localTime);

		// Printing the GMT time to
		// illustrate changes in GMT time
		System.out.println("Time IN Gmt : "
						+ s.format(localTime));
	}
}
