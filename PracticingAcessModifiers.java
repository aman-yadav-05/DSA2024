class AccountInfo {
    private String password;
    String name;

    public void setPass(String pass) {
        this.password = pass;
    }

    public void getPass() {
        System.out.println(this.password);
    }
}

public class PracticingAcessModifiers {
    public static void main(String[] args) {
        AccountInfo a1 = new AccountInfo();
        a1.setPass("this is a password.");
        a1.getPass();
    }
}
