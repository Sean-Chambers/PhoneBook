public class PhoneBookManager {
  private int size;
  private PhoneBookNode head;

  PhoneBookManager(){
    size = 0;
    head = null;
  }

  public void add(String lastName, String firstName, String address, String city,
    int zipcode, String phoneNumber){
    //read in last name and first name
    String last = lastName;
    String first = firstName;
    PhoneBookNode current = head;
    if(head == null){
      head = new PhoneBookNode(lastName, firstName, address, city, zipcode, phoneNumber);
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
    size++;
  }

  public void modify(){
    //TODO: complete modify method
  }

  public void delete(String lastName, String firstName, String address){
    PhoneBookNode current = head;
    while(current.next != null){ //TODO: convert to for loop so that last node is checked
      if(current.next.entry.lastName.equals(lastName) &&
      current.next.entry.firstName.equals(firstName) &&
      current.next.entry.address.equals(address) && 
      current.next.next != null){
        current.next = current.next.next;
        break;
      }
      current = current.next;
    }
  }

  public void search(String lastName, String firstName){
    PhoneBookNode current = head;
    while(current.next != null){ //TODO: convert to for loop so that last node is checked
      if(current.entry.lastName.equals(lastName) && current.entry.firstName.equals(firstName)){
        System.out.println(current);
      }
      current = current.next;
    }
  }

  public void search(String lastName){
    PhoneBookNode current = head;
    while(current.next != null){ //TODO: convert to for loop so that last node is checked
      if(current.entry.lastName.equals(lastName)){
        System.out.println(current);
      }
      current = current.next;
    }
  }

  //pre-condition: 0 <= index < size
  public PhoneBookNode get(int index){
    PhoneBookNode current = head;
    for(int i = 0; i < index; i++){
      current = current.next;
    }
    return current;
  }

  public void move(int given, int target){
    //TODO: complete move method
  }

  public PhoneBookNode movePhoneBook(String lastName, String firstName){
    //TODO: complete movePhoneBook method
  }

  public void print(){
    PhoneBookNode current = head;
    while(current.next != null){
      System.out.println(current);
      current = current.next;
    }
    System.out.println(current);
  }
}