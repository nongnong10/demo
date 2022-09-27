public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String adress) {
        this.address = adress;
    }

    /**
     * In ra thong tin Person.
     */
    public String toString() {
        String res = "Person[name=" + this.name;
        res += ",address=" + this.address + "]";
        return res;
    }
}
