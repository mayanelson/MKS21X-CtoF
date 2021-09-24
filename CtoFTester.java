public class CtoFTester {
// Function should have celcius and fahrenheit values as parameters, and these should be doubles.
public static double celciusToFahrenheit(double celcius) {
  return (celcius * 9/5) + 32;
}
public static double fahrenheitToCelcius(double fahrenheit){
  return (fahrenheit -32) * 5/9;
}

public static void main(String[] args) {
  System.out.println(celciusToFahrenheit(20)); //should return 68
  System.out.println(fahrenheitToCelcius(20)); //should return -6.666 repeating
}
}
