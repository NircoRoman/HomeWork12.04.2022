package Leson5;

public class Staff {
    public static void main(String[] args) {
        User[] user = new User[5];
        user[0] = new User("Ivanov Ivan", "Engeber", "Ivan@mail.ru","+112 222 112",
                55000 , (byte) 39);
        user[1] = new User("Petrov Sergei", "Mechanic", "Sampdelcin@gmail.com" ,
                "+ 112 22 111 110", 34900 , (byte) 33);
        user[2] = new User("Mudakov Petr", "BOSS","Bigboss@mail.ru",
                "+112 112 112", 1000000 , (byte) 45);
        user[3] = new User("Seregin Sergei" , "Sofer", "autoauto@mao;.ru",
                "+112 03 03 03 03", 32000 , (byte) 22);
        user[4] = new User("Melinic Misha" , "Dizainer" , "tuttam@gmail.com" ,
                "+112 111 111 11" , 89000 , (byte) 37);
        for (int i = 0; i < user.length; i++) {
            if (user[i].getAge() > 40) {
                user[i].PrintInfo();

            }
        }
    }
}