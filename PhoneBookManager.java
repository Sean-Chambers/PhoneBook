public class PhoneBookManager {
  private PhoneBookNode head;

  PhoneBookManager(){
    this.head = null;
  }

  public void add(String lastName, String firstName, String address, String city,
    int zipcode, String phoneNumber){ //TODO: fix for test case in PhoneBookTestClass
    //read in last name and first name
    String last = lastName;
    String first = firstName;
    PhoneBookNode current = head;
    if(head == null){
      head = new PhoneBookNode("Sarah", "Hoekema", "4 Privet Drive", "Little Whinging", 12345, "3601234567");
    } else{
      //for each letter of last name, while Character value is greater than Character value of name 
      //of next entry at same index, move current to next reference
      for(int i = 0; i < last.length(); i++){
        while(current.next!=null &&
        Character.compare(last.charAt(i), current.next.entry.lastName.charAt(i)) > 0){
          current = current.next;
        }
      }
      //for each letter of first name, while Character value is greater than Character value of name 
      //of next entry at same index, move current to next reference
      for(int i = 0; i < first.length(); i++){
        while(current.next!=null &&
        Character.compare(first.charAt(i), current.next.entry.firstName.charAt(i)) > 0){
          current = current.next;
        }
      }
      //second level of organization if names are the same??
      //when pointing to correct position:
      current.next = new PhoneBookNode(lastName, firstName, address, city,
        zipcode, phoneNumber, current.next);
    }
  }

  public void modify(){
    //TODO: complete modify method
  }

  public void delete(){
    //TODO: complete delete method
  }

  public void search(){
    //TODO: complete search method
  }

  public PhoneBookNode get(int index){
    if(index == 0){
      return head;
    } else{
      PhoneBookNode current = head;
      for(int i = 0; i <= index; i++){
        current = current.next;
      }
      return current;
    }
  }

  public void move(int given, int target){
    //TODO: complete move method
  }

  public PhoneBookNode movePhoneBook(String lastName, String firstName){
    //TODO: complete movePhoneBook method
  }

  public void print(){
    //TODO: complete print method
  }

}