//Sarah Hoekema and Sean Chambers
//CS 145
//October 25, 2022
//Assignment 2: Phone Book

package PhoneBook;

//PhoneBookNode.java represents a single LinkedList node of type PhoneBookEntry. It contains
//getter and setter methods for the data within a PhoneBookEntry object, as well as a toString
//method for returning the string representation of a single entry.
public class PhoneBookNode {
  //fields
  private PhoneBookEntry entry;
  PhoneBookNode next;

  //constructor
  public PhoneBookNode(String lastName, String firstName, String address, String city,
    int zipcode, String phoneNumber){
    entry = new PhoneBookEntry(lastName, firstName, address, city, zipcode, phoneNumber);
    next = null;        
  }

  //constructor
  public PhoneBookNode(String lastName, String firstName, String address, String city,
    int zipcode, String phoneNumber, PhoneBookNode next){
    entry = new PhoneBookEntry(lastName, firstName, address, city, zipcode, phoneNumber);
    this.next = next;        
  }

  //constructor
  public PhoneBookNode(){
    this.next = null;
  }

  //returns a String representation of the node
  public String toString(){
    return entry.lastName + ", " + entry.firstName + "\n" + entry.address + "\n"
    + entry.city + "  " + entry.zipcode + "\n" + entry.phoneNumber + "\n";
  }

  //returns the first name of the entry
  public String getFirstName(){
    return entry.firstName;
  }

  //returns the last name of the entry
  public String getLastName(){
    return entry.lastName;
  }

  //returns the address of the entry
  public String getAddress(){
    return entry.address;
  }

  //returns the city of the entry
  public String getCity(){
    return entry.city;
  }

  //returns the zipcode of the entry
  public int getZipcode(){
    return entry.zipcode;
  }

  //returns the phone number of the entry
  public String getPhoneNumber(){
    return entry.phoneNumber;
  }

  //sets the first name of the entry
  public void setFirstName(String firstName){
    entry.firstName = firstName;
  }

  //sets the last name of the entry
  public void setLastName(String lastName){
    entry.lastName = lastName;
  }

  //sets the address of the entry
  public void setAddress(String address){
    entry.address = address;
  }

  //sets the city of the entry
  public void setCity(String city){
    entry.city = city;
  }

  //sets the zipcode of the entry
  public void setZipcode(int zipcode){
    entry.zipcode = zipcode;
  }

  //sets the phone number of the entry
  public void setPhoneNumber(String phoneNumber){
    entry.phoneNumber = phoneNumber;
  }
}
