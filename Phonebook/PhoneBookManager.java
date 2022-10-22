//Sarah Hoekema and Sean Chambers
//CS 145
//October 25, 2022
//Assignment 2: Phone Book

package PhoneBook;

//PhoneBookManager.java creates an LinkedList of PhoneBookNode nodes. The class contains methods
//to add, get, remove, modify, search, and move entries, as well as toString(), size(), clear(),
//and isEmpty() methods.
public class PhoneBookManager {
 //fields
  private int size;
  private PhoneBookNode head;

  //constructor
  public PhoneBookManager(){
    size = 0;
    head = null;
  }

  //accepts a last name, first name, address, city, zipcode, and phone number of a new entry, then
  //inserts that entry into the list at its alphabetically sorted position
  public void add(String lastName, String firstName, String address, String city,
    int zipcode, String phoneNumber){
    PhoneBookNode current = head;  
    if(head == null){
      head = new PhoneBookNode(lastName, firstName, address, city, zipcode, phoneNumber);
    } else if(lastName.compareTo(head.getLastName()) < 0 ||
    (lastName.compareTo(head.getLastName()) == 0 && firstName.compareTo(head.getFirstName()) < 0)){
      head = new PhoneBookNode(lastName, firstName, address, city, zipcode, phoneNumber, head);
    } else {
      while(current.next != null && 
      (lastName.compareTo(current.next.getLastName()) > 0 ||
      (lastName.compareTo(current.next.getLastName()) == 0 &&
      firstName.compareTo(current.next.getFirstName()) > 0))){
        current = current.next;
      }
      if(current.next != null){
        current.next = new PhoneBookNode(lastName, firstName, address, city,
        zipcode, phoneNumber, current.next);
      } else{
        current.next = new PhoneBookNode(lastName, firstName, address, city,
        zipcode, phoneNumber);
      }
    }
    size++;
  }

  //pre-condition: 0 <= index < size
  //returns the PhoneBookNode at a given index
  public PhoneBookNode get(int index){
    PhoneBookNode current = head;
    for(int i = 0; i < index; i++){
      current = current.next;
    }
    return current;
  }

  //accepts the last name, first name, and address of an entry to be modified, then removes that
  //entry and replaces it with a modified version
  public void modify(String lastName, String firstName, String address, PhoneBookEntry entry){
    PhoneBookNode current = head;
    for(int i = 0; i < size; i++){
      if(current.getLastName().equals(lastName) &&
      current.getFirstName().equals(firstName) &&
      current.getAddress().equals(address)){
        this.remove(lastName, firstName, address);
        this.add(entry.lastName, entry.firstName, entry.address,
        entry.city, entry.zipcode, entry.phoneNumber);
      }
      current = current.next;
    }
  }
 
  //accepts last name, first name, and current address of an entry to be moved, then adds the entry
  //into another phone book with its updated address, city, and zipcode and removes the entry from
  //the current phone book
  public void movePhoneBook(String lastName, String firstName, String currentAddress,
  String newAddress, String newCity, int newZipcode, PhoneBookManager other){
    PhoneBookNode current = head;
    for(int i = 0; i < size; i++){
      if(current.getLastName().equals(lastName) &&
      current.getFirstName().equals(firstName) &&
      current.getAddress().equals(currentAddress)){
        other.add(current.getLastName(), current.getFirstName(), newAddress, newCity,
        newZipcode, current.getPhoneNumber());
        this.remove(lastName, firstName, currentAddress);
      }
      current = current.next;
    }
  }

  //accepts the last name, first name, and address of the entry to be removed, then traverses
  //the list and removes the entry with the matching data 
  public void remove(String lastName, String firstName, String address){
    if(head.getLastName().equals(lastName) &&
    head.getFirstName().equals(firstName) &&
    head.getAddress().equals(address)){
      head = head.next;
      size--;
    } else{
      PhoneBookNode current = head;
      for(int i = 0; i < size - 1; i++){
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
  }

  //accepts a last name and first name to be searched, then traverses the list and prints out
  //all the matching entries
  public void search(String lastName, String firstName){
    PhoneBookNode current = head;
    for(int i = 0; i < size; i++){
      if(current.getLastName().equals(lastName) && current.getFirstName().equals(firstName)){
        System.out.println(current);
      }
      current = current.next;
    }
  }

  //accepts a last name to be searched, then traverses the list and prints out all the
  //matching entries
  public void search(String lastName){
    PhoneBookNode current = head;
    for(int i = 0; i < size; i++){
      if(current.getLastName().equals(lastName)){
        System.out.println(current);
      }
      current = current.next;
    }
  }

  //returns a String representation of the PhoneBookManager
  public String toString(){
    PhoneBookNode current = head;
    if(size == 0){
      return "Phone book is empty";
    } else{
      String s = "";
      for(int i = 0; i < size - 1; i++){
        s += current.toString() + "\n";
        current = current.next;
      }
      s += current.toString();
      return s;
    }
  }

  //returns the size of the PhoneBookManager
  public int size(){
    return size;
  }

  //clears the contents of the PhoneBookManager
  public void clear(){
    head = null;
    size = 0;
  }

  //returns true if the PhoneBookManager is empty and false if not
  public boolean isEmpty(){
    return size == 0;
  }
}