public class PhonebookTest {
    public static void main(String[] args) {
        Phonebook pb = new Phonebook();
        pb.add("Dexter Morgan", "558-78-17");
        pb.add("Michael Scofield", "776-17-16");
        pb.add("Mathew Murdock", "123-64-78");
        pb.add("Gregory House", "576-14-68");
        pb.get("Dexter Morgan");
        pb.get("Michael Scofield");
        pb.get("Gregory House");
    }
}

