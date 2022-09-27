public class Main {
    public static void main(String[] args) {
        Person a = new Person("Huy" , "XT");
        a.setAddress("Vinh");
        System.out.println(a.getAddress());
        Student b = new Student("Huy" , "XT" , "UET" , 2003 , 10);
        System.out.println(b.getFee());
        Staff c = new Staff("Huy" , "Vinh" , "UET", 100);
        System.out.println(c.toString());
    }

}
