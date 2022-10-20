package PhoneBook;

public class PhoneBookEntry {
  protected String firstName;
  protected String lastName;
  protected String address;
  protected String city;
  protected int zipcode;
  protected String phoneNumber;

  public PhoneBookEntry(String firstName, String lastName, String address, String city,
  int zipcode, String phoneNumber){
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.city = city;
    this.zipcode = zipcode;
    this.phoneNumber = phoneNumber;
  }

}
