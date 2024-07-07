package bank;

class Account {
    public String name;
    protected String email;
    private String password;

    // Getter and Setter for private password
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Print method to display name and email
    void print() {
        System.out.println(this.name);
        System.out.println(this.email);
    }
}

public class Bank {
    public static void main(String args[]) {
        Account acc1 = new Account();
        acc1.name = "Sharma";
        acc1.email = "admin@admin.com"; // Fixed email format
        acc1.setPassword("ABCDE");
        System.out.println(acc1.getPassword()); // Print password to verify it was set

        acc1.print(); // Display name and email
    }
}
