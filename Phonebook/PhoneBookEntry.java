//Sarah Hoekema
//CS 145
//October 25, 2022
//Assignment 2: Phone Book

package PhoneBook;

public class PhoneBookEntry {
  protected String firstName;
  protected String lastName;
  protected String address;
  protected String city;
  protected int zipcode;
  protected String phoneNumber;

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
