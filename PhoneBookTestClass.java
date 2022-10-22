//Sarah Hoekema and Sean Chambers
//CS 145
//October 25, 2022
//Assignment 2: Phone Book

import PhoneBook.PhoneBookEntry;
import PhoneBook.PhoneBookManager;

//PhoneBookTestClass.java tests the methods within the PhoneBookManager class.
public class PhoneBookTestClass {
  public static void main(String[] args){
    PhoneBookManager chicago = new PhoneBookManager();
    PhoneBookManager newYork = new PhoneBookManager();
    chicago.add("Bowen", "Lorene", "507 North Avenue", "Chicago", 92758, "3607295739");
    chicago.add("Lawan", "Michelle", "2985 Lorne St", "Chicago", 92746, "3602847583");
    chicago.add("Alle", "Coleman", "6388 Benson Ave", "Chicago", 92746, "3602847673");
    chicago.add("Lawan", "David", "2985 Lorne St", "Chicago", 92746, "3601534487");
    chicago.add("VanHilkema", "Yvette", "25 Pyramid Way", "Chicago", 92748, "3602857297");
    System.out.println(chicago);
    System.out.println("-----------------");
    chicago.search("Lawan");
    System.out.println("-----------------");
    chicago.modify("VanHilkema", "Yvette", "25 Pyramid Way", new PhoneBookEntry("VanHilkema", "Yvette", "1126 Lilac Court", "Chicago", 92748, "3602857297"));
    System.out.println(chicago);
    System.out.println("-----------------");
    chicago.remove("Bowen", "Lorene", "507 North Avenue");
    System.out.println(chicago);
    System.out.println("-----------------");
    chicago.movePhoneBook("Alle", "Coleman", "6388 Benson Ave", "555 Milford Lane", "New York", 10238, newYork);
    System.out.println(chicago);
    System.out.println("-----------------");
    System.out.println(newYork);
    System.out.println("Chicago phone book size: " + chicago.size());
    chicago.clear();
    System.out.println(chicago);
    System.out.println("Is Chicago phone book empty? " + chicago.isEmpty());
  }
}