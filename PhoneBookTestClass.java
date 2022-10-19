public class PhoneBookTestClass {
  public static void main(String[] args){
    PhoneBookManager phonebook = new PhoneBookManager();

    phonebook.add("Sarah", "Hoekemo", "4 Privet Drive", "Little Whinging", 12345, "3601234567"); 
    System.out.println(phonebook.get(0));
    phonebook.add("Sarah", "Hoekema", "4 Privet Drive", "Little Whinging", 12345, "3601234567");
    System.out.println(phonebook.get(1));
    phonebook.add("Serah", "Hoekema", "4 Privet Drive", "Little Whinging", 12345, "3601234567");
  }
}