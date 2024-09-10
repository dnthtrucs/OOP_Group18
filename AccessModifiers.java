public class AccessModifiers {

    public int publicField = 1;

    protected int protectedField = 2;

    int packageField = 3;

    private int privateField = 4;

    public void publicMethod() {
        System.out.println("Public Method");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    void packageMethod() {
        System.out.println("Package-Access Method");
    }

    private void privateMethod() {
        System.out.println("Private Method");
    }

    public void accessPrivateMembers() {
        System.out.println("Private Field: " + privateField);
        privateMethod();
    }
}
