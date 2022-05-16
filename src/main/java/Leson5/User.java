package Leson5;

public class User {
    private String UserName;
    private String PostStatus;
    private String Email;
    private String Mobile;
    private int Salary;
    private byte Age;

    public String getUserName() {
        return UserName;
    }

    public String setUserName(String userName) {
        UserName = userName;
        return userName;
    }

    public String getPostStatus() {
        return PostStatus;
    }

    public String setPostStatus(String postStatus) {
        PostStatus = postStatus;
        return postStatus;
    }

    public String getEmail() {
        return Email;
    }

    public String setEmail(String email) {
        Email = email;
        return email;
    }

    public String getMobile() {
        return Mobile;
    }

    public String setMobile(String mobile) {
        Mobile = mobile;
        return mobile;
    }

    public int getSalary() {
        return Salary;
    }

    public int setSalary(int salary) {
        Salary = salary;
        return salary;
    }

    public byte getAge() {
        return Age;
    }

    public int setAge(byte age) {
        Age = age;
        return 0;
    }
// Закомментировать этот код чтобы заработало задание 1
    public User (String UserName, String PostStatus, String Email, String Mobile, int Salary, byte Age){
    this.UserName = UserName;
    this.PostStatus = PostStatus;
    this.Email = Email;
    this.Mobile = Mobile;
    this.Salary = Salary;
    this.Age = Age;
}
// До сих пор

public void PrintInfo(){
    System.out.println("FIO "+UserName+" POST "+ PostStatus +" Mail "+Email+ " MOBILE " + Mobile
    + " Salary " + Salary + " AGE " + Age );
}
}
