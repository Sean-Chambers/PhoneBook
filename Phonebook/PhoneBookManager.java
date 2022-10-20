package PhoneBook;

public class PhoneBookManager {
  private int size;
  private PhoneBookNode head;

  public PhoneBookManager(){
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
    } else if(last.compareTo(current.getLastName()) < 0 ||
      (last.compareTo(current.getLastName()) == 0 && first.compareTo(current.getFirstName()) < 0)){
      head = new PhoneBookNode(lastName, firstName, address, city, zipcode, phoneNumber, head);
    } else { //TODO: debug sorting and adding process
      for(int i = 0; i < size; i++){
        if(current.next != null &&
        last.compareTo(current.next.getLastName()) <= 0 &&
        first.compareTo(current.next.getFirstName()) < 0){
          current.next = new PhoneBookNode(lastName, firstName, address, city,
          zipcode, phoneNumber, current.next);
        } else {
          current = current.next;
        }
      }
    }
    size++;
  }

  //TODO: complete modify method

  public void delete(String lastName, String firstName, String address){
    PhoneBookNode current = head;
    for(int i = 0; i < size - 1; i++){ //TODO: debug delete method
      if(current.next.getLastName().equals(lastName) &&
      current.next.getFirstName().equals(firstName) &&
      current.next.getAddress().equals(address) && 
      current.next.next != null){
        current.next = current.next.next;
        size--;
        break;
      } else if(current.next.getLastName().equals(lastName) &&
      current.next.getFirstName().equals(firstName) &&
      current.next.getAddress().equals(address) && 
      current.next.next == null){
        current.next = null;
        size--;
        break;
      }
      current = current.next;
    }
  }

  public void search(String lastName, String firstName){
    PhoneBookNode current = head;
    for(int i = 0; i < size; i++){
      if(current.getLastName().equals(lastName) && current.getFirstName().equals(firstName)){
        System.out.println(current);
      }
      current = current.next;
    }
  }

  public void search(String lastName){
    PhoneBookNode current = head;
    for(int i = 0; i < size; i++){
      if(current.getLastName().equals(lastName)){
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

  //TODO: complete move method

  //TODO: complete movePhoneBook method

  public void print(){
    PhoneBookNode current = head;
    for(int i = 0; i < size; i++){
      System.out.println(current);
      current = current.next;
    }
  }

  public int size(){
    return size;
  }
}