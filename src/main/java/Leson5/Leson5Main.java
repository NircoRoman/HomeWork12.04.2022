package Leson5;

public class Leson5Main {
    public static void main(String[] args) {
        Leson5Users DataUser = new Leson5Users();
        String UF = DataUser.setUserName("Mudakov Vitalik Boris");
        String UP = DataUser.setPostStatus(" BOSS");
        String UE = DataUser.setEmail("bigboss@gmail.com");
        String UT = DataUser.setMobile("+272 77 99 77 99");
        String UZ = String.valueOf(DataUser.setSalary(1000000));
        String UA = String.valueOf(DataUser.setAge((byte) 54));
        RunRun(UF, UP, UE, UT, UZ, UA);
    }
    public static void RunRun (String UF, String UP, String UE, String UT, String UZ, String UA ){
        System.out.println("FIO - " + UF + " - POST - " + UP + " MAIL - " + UE + " MOBILE - " + UT + " SALARY - " + UZ +
                " AGE - " + UA);
    }
}
