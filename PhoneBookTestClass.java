public class PhoneBookTestClass {
  public static void main(String[] args){
    PhoneBookManager phonebook = new PhoneBookManager();

    phonebook.add("Sarah", "Hoekema", "4 Privet Drive", "Little Whinging", 12345, "3601234567");
    phonebook.add("Sarah", "Hoekemo", "4 Privet Drive", "Little Whinging", 12345, "3601234567");
    phonebook.add("Serah", "Hoekema", "4 Privet Drive", "Little Whinging", 12345, "3601234567");
    System.out.println(phonebook.get(2));
    phonebook.print();
    System.out.println("---------------------");
    phonebook.search("Hoekema");
    System.out.println("---------------------");
    phonebook.delete("Serah", "Hoekema", "4 Privet Drive");
    phonebook.print();
  }
}