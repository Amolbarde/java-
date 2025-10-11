public class Person {
    private String nm;

    public String getName() {
        return nm;
    }

    public void setName(String name) {
        this.nm = name;
    }
}

// 🧠 Trick to Remember Encapsulation:
// 🔒 “Private lock, public key”
// private = locked data (can't be accessed directly)
// get / set = key to open or change it
