import PhoneBook.PhoneBookEntry;
import PhoneBook.PhoneBookManager;

public class PhoneBookTestClass {
  public static void main(String[] args){
    PhoneBookManager phonebook = new PhoneBookManager();
    phonebook.add("Hoekemo", "Sarah", "4 Privet Drive", "Little Whinging", 12345, "3601234567"); 
    phonebook.add("Hoekema", "Sarah", "4 Privet Drive", "Little Whinging", 12345, "3601234567");
    phonebook.add("Hoekema", "Serah", "4 Privet Drive", "Little Whinging", 12345, "3601234567");
    phonebook.add("Hoekemu", "Serah", "4 Privet Drive", "Little Whinging", 12345, "3601234567");
    System.out.println(phonebook);
    System.out.println("----------------");
    phonebook.search("Hoekema");
    System.out.println("----------------");
    phonebook.search("Hoekema", "Serah");
    System.out.println("----------------");
    phonebook.modify("Hoekema", "Sarah", "4 Privet Drive",
    new PhoneBookEntry("Hoekema", "Sarah", "123 Hill Road", "New York", 34567, "3601234567"));
    System.out.println(phonebook.get(0));
    System.out.println("----------------");
  }
}