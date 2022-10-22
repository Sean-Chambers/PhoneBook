//Sarah Hoekema and Sean Chambers
//CS 145
//October 25, 2022
//Assignment 2: Phone Book

package PhoneBook;

//PhoneBookEntry.java stores the first name, last name, address, city, zipcode, and phone number
//of an entry in a phone book
public class PhoneBookEntry {
  //fields
  protected String firstName;
  protected String lastName;
  protected String address;
  protected String city;
  protected int zipcode;
  protected String phoneNumber;

  //constructor
  public PhoneBookEntry(String lastName, String firstName, String address, String city,
  int zipcode, String phoneNumber){
    this.lastName = lastName;
    this.firstName = firstName;
    this.address = address;
    this.city = city;
    this.zipcode = zipcode;
    this.phoneNumber = phoneNumber;
  }

}
