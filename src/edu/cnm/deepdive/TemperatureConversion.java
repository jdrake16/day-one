package edu.cnm.deepdive;

public class TemperatureConversion {

  public static void main(String[] args) {

    if (args.length ==0) {
      double c = 100;
      double f = 32;
      System.out.println("Celsius " + c + " = " + convertC2F(c) + " Fahrenheit");
      System.out.println("Fahrenheit " + f + " = " + convertF2C(f) + " Celsius");
    } else {
      for (int i = 0; i < args.length; i++) {
        double c = Double.parseDouble(args[i]);
        System.out.println("Celsius" + c + " = " + convertC2F(c) + " Fahrenheit");
      }

    }

  }

  public static double convertC2F(double celsius) {
    double fahrenheit = celsius * 9 / 5 + 32;
    return fahrenheit;
  }
  public static double convertF2C(double fahrenheit) {

    return (fahrenheit -32) * 5 / 9;
  }
}

