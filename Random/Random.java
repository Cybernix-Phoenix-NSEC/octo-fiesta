
// Random Generator Class

class Random
{
	double ct;
	double number;
		
	Random()
	{
		ct=11042000.0;
		number=1;
	}
	
	Random(double num)
	{
		number=num;
		ct=Math.pow(num, 21);
	}
	
	double next()
	{
		number*=(System.nanoTime()%1019);
		number=(Math.pow(number, 43)+ct)%10009;
	
		return number/10000.0;
	}
	
	double next(double n)
	{
		number*=(System.nanoTime()%1019);
		number=(Math.pow(number, 43)+ct)%10007.4487;
	
		return number%n;
	}
	
	void seed(double num)
	{
		ct=Math.pow(num%107, 29);
	}
}
