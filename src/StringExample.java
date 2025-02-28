
//String is immutable

import java.util.Locale;

public class StringExample {
 public static void main(String[] args) {
//
//        String name = "Arun";
//        name="Karthi";
//        System.out.println(name);


//String methods

  String name = "Arunkumar";//string literal

  //returns string length
  System.out.println(name.length());

  // check if string is empty or not
  System.out.println(name.isEmpty());

  //checks the equality of string wityh the given object
  System.out.println(name.equals("Arunkumar"));

  //it will switch the string into uppercase
  System.out.println(name.toUpperCase(Locale.ROOT));

  //it will switch the string into lowercase
  System.out.println(name.toLowerCase(Locale.ROOT));

  //it will give output of string index value
  System.out.println(name.charAt(3));

  //return the index of that stringvalue
  System.out.println(name.indexOf("r"));

  //checks the equality of string with given string objct without case sensitivity
  System.out.println(name.equalsIgnoreCase("ARUNKUMAR"));

  //gives true or false based on the given value is present or not
  System.out.println(name.contains("karthi"));


  //takes a paritucalr portion of the string
  System.out.println(name.substring(4));

  System.out.println(name.substring(0,4));

  //if you want to replace string use
  System.out.println(name.replace("Arunkumar","karthikeyan"));

  //it will concat the strings
  System.out.println(name.concat("Kanniappan"));

  //finds the character specified from the index position
  System.out.println(name.indexOf("k",2));

  //
 }

}