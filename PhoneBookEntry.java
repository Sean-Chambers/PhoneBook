public class PhoneBookEntry {
  String firstName;
  String lastName;
  String address;
  String city;
  int zipcode;
  String phoneNumber;

  public PhoneBookEntry(String firstName, String lastName, String address, String city,
  int zipcode, String phoneNumber){
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.city = city;
    this.zipcode = zipcode;
    this.phoneNumber = phoneNumber;
  }

  public String toString(){
    return lastName + ", " + firstName + "\n" + address + "\n" + city + "  " + zipcode + "\n" + phoneNumber + "\n";
  }
}
