public class PhoneBookNode {
  String firstName;
  String lastName;
  String address;
  String city;
  int zipcode;
  int phoneNumber;
  PhoneBookNode next;

  public PhoneBookNode(String firstName, String lastName, String address, String city,
    int zipcode, int phoneNumber){
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.city = city;
    this.zipcode = zipcode;
    this.phoneNumber = phoneNumber;
    next = null;        
  }

  public PhoneBookNode(String firstName, String lastName, String address, String city,
    int zipcode, int phoneNumber, PhoneBookNode next){
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.city = city;
    this.zipcode = zipcode;
    this.phoneNumber = phoneNumber;
    this.next = next;        
  }
}
