public class AccessTest {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();

        System.out.println("Public Field: " + obj.publicField); 
        System.out.println("Protected Field: " + obj.protectedField);
        System.out.println("Package-Access Field: " + obj.packageField); 

        obj.publicMethod(); 
        obj.protectedMethod(); 
        obj.packageMethod(); 
        obj.accessPrivateMembers(); 
    }
}
