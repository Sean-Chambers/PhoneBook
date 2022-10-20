import PhoneBook.PhoneBookManager;

public class PhoneBookTestClass {
  public static void main(String[] args){
    PhoneBookManager phonebook = new PhoneBookManager();
    System.out.println("Hoekema".compareTo("Hoekema"));
    phonebook.add("Hoekemo", "Sarah", "4 Privet Drive", "Little Whinging", 12345, "3601234567"); 
    phonebook.add("Hoekema", "Sarah", "4 Privet Drive", "Little Whinging", 12345, "3601234567");
    phonebook.add("Hoekema", "Serah", "4 Privet Drive", "Little Whinging", 12345, "3601234567");
    phonebook.add("Hoekemu", "Serah", "4 Privet Drive", "Little Whinging", 12345, "3601234567");
    phonebook.print();
    System.out.println("-------------------");
    phonebook.remove("Hoekemo", "Sarah", "4 Privet Drive");
    phonebook.print();
    System.out.println("-------------------");
    phonebook.remove("Hoekema", "Sarah", "4 Privet Drive");
    phonebook.print();
    System.out.println("-------------------");
    phonebook.remove("Hoekemu", "Serah", "4 Privet Drive");
    phonebook.print();
  }
}