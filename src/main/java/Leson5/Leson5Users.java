package Leson5;

public class Leson5Users {
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
        return age;
    }

}
