public class PhoneBookNode {
  PhoneBookEntry entry;
  PhoneBookNode next;

  public PhoneBookNode(String firstName, String lastName, String address, String city,
    int zipcode, String phoneNumber){
    entry = new PhoneBookEntry(firstName, lastName, address, city, zipcode, phoneNumber);
    next = null;        
  }

  public PhoneBookNode(String firstName, String lastName, String address, String city,
    int zipcode, String phoneNumber, PhoneBookNode next){
    entry = new PhoneBookEntry(firstName, lastName, address, city, zipcode, phoneNumber);
    this.next = next;        
  }

  public PhoneBookNode(){
    this.next = null;
  }

  public String toString(){
    return entry.toString();
  }
}
