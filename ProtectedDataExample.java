class FirstClass {
    protected int protectedData = 10;

    public void showProtectedData() {
        System.out.println("Protected Data in FirstClass: " + protectedData);
    }
}

class SecondClass {
    public void manipulateProtectedData() {
        FirstClass firstClassInstance = new FirstClass();
        
        System.out.println("Manipulating Protected Data in SecondClass");
        firstClassInstance.protectedData = 20; 
        
        firstClassInstance.showProtectedData();
    }

    public static void main(String[] args) {
        SecondClass secondClassInstance = new SecondClass();
        secondClassInstance.manipulateProtectedData();
    }
}
