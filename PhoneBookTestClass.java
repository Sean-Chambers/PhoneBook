public class PhoneBookTestClass {
  public static void main(String[] args){
    String last1 = "Hoekema";
    String last2 = "Hoekemo";
    System.out.println(last1.compareTo(last2));
    PhoneBookManager phonebook = new PhoneBookManager();

    phonebook.add("Sarah", "Hoekemo", "4 Privet Drive", "Little Whinging", 12345, "3601234567"); 
    System.out.println(phonebook.get(0));
    System.out.println(last1.compareTo(phonebook.get(0).entry.lastName));
    phonebook.add("Sarah", "Hoekema", "4 Privet Drive", "Little Whinging", 12345, "3601234567");
    System.out.println(phonebook.get(0));
    phonebook.add("Serah", "Hoekema", "4 Privet Drive", "Little Whinging", 12345, "3601234567");
    //System.out.println(phonebook.get(2));
    phonebook.print();
    System.out.println("---------------------");
    phonebook.print();
    System.out.println("---------------------");
    phonebook.search("Hoekema");
    System.out.println("---------------------");
    phonebook.delete("Sarah", "Hoekema", "4 Privet Drive");
    System.out.println(phonebook.size());
    phonebook.delete("Serah", "Hoekema", "4 Privet Drive");
    phonebook.print();
  }
}