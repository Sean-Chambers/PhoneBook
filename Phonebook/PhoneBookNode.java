//Sarah Hoekema
//CS 145
//October 25, 2022
//Assignment 2: Phone Book

package PhoneBook;

public class PhoneBookNode {
  private PhoneBookEntry entry;
  PhoneBookNode next;

  public PhoneBookNode(String lastName, String firstName, String address, String city,
    int zipcode, String phoneNumber){
    entry = new PhoneBookEntry(lastName, firstName, address, city, zipcode, phoneNumber);
    next = null;        
  }

  public PhoneBookNode(String lastName, String firstName, String address, String city,
    int zipcode, String phoneNumber, PhoneBookNode next){
    entry = new PhoneBookEntry(lastName, firstName, address, city, zipcode, phoneNumber);
    this.next = next;        
  }

  public PhoneBookNode(){
    this.next = null;
  }

  public String toString(){
    return entry.lastName + ", " + entry.firstName + "\n" + entry.address + "\n"
    + entry.city + "  " + entry.zipcode + "\n" + entry.phoneNumber + "\n";
  }

  public String getFirstName(){
    return entry.firstName;
  }

  public String getLastName(){
    return entry.lastName;
  }

  public String getAddress(){
    return entry.address;
  }

  public String getCity(){
    return entry.city;
  }

  public int getZipcode(){
    return entry.zipcode;
  }

  public String getPhoneNumber(){
    return entry.phoneNumber;
  }

  public void setFirstName(String firstName){
    entry.firstName = firstName;
  }

  public void setLastName(String lastName){
    entry.lastName = lastName;
  }

  public void setAddress(String address){
    entry.address = address;
  }

  public void setCity(String city){
    entry.city = city;
  }

  public void setZipcode(int zipcode){
    entry.zipcode = zipcode;
  }

  public void setPhoneNumber(String phoneNumber){
    entry.phoneNumber = phoneNumber;
  }
}
