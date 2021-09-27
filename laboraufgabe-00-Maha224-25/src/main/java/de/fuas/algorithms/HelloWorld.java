package de.fuas.algorithms;

import java.util.Random;

public class HelloWorld
{
  private static final String welcomeText = "Welcome to Algorithmen";

  public static String[] getWelcomeText()
  {

    String[] stringArray = new String[3];
    stringArray[0] = welcomeText;
    stringArray[1] = newText();
    return stringArray;
  }

  private static String newText()
  {
    Random WUERFEL = new Random();
    int die_roll = WUERFEL.nextInt();

    if (die_roll % 2 == 0)
      return "Git is great!";
    else
      return "Java is great!";
  }
}
