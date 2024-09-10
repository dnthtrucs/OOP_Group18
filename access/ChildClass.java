package access;

public class ChildClass extends ParentClass {
    public void accessProtectedMethod() {
        protectedMethod(); // Truy cập vào phương thức protected từ lớp kế thừa
    }

    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.accessProtectedMethod(); // Gọi phương thức truy cập protected
    }
}
