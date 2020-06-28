package Codiiiin;

public class CapitalOneBank {
    public static void main(String[] args) {
        bankAccount turkan =new bankAccount("turkan ","Aydin");
        System.out.println(turkan.getAccountholder());
        System.out.println(turkan.getBalance());

        turkan.checkBalance();
        turkan.depositing(120);


       turkan.checkBalance();//bundan sonra 120 yatirdigimizi cek ettik


        turkan.withdrawing(20);//20 cektik
        turkan.checkBalance();

        turkan.withdrawing(100);
        System.out.println(turkan);

    }
}
