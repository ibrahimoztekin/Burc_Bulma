import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int month,day;
        String burc="";
        boolean isError=false;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz Ay: ");
        month=input.nextInt();

        System.out.print("Doğduğunuz Gün: ");
        day=input.nextInt();

        if (month==1){
            if (day<22){
                burc="Oğlak";
            }else if(day>=22 && day<=31){
                burc="Kova";
            }
            else {
                isError=true;
            }
        }else if (month==2){
            if (day<20){
                burc="Kova";
            }else if(day>=20 && day<=28){
                burc="Balık";
            }
            else {
                isError=true;
            }
        }else if (month==3){
            if (day<20){
                burc="Balık";
            }else if(day>=20 && day<=31){
                burc="Koç";
            }
            else {
                isError=true;
            }
        }else if (month==4){
            if (day<21){
                burc="Koç";
            }else if(day>=21 && day<=30){
                burc="Boğa";
            }
            else {
                isError=true;
            }
        }else if (month==5){
            if (day<22){
                burc="Boğa";
            }else if(day>=22 && day<=31){
                burc="İkizler";
            }
            else {
                isError=true;
            }
        }else if (month==6){
            if (day<23){
                burc="İkizler";
            }else if(day>=23 && day<=30){
                burc="Yengeç";
            }
            else {
                isError=true;
            }
        }else if (month==7){
            if (day<23){
                burc="Yengeç";
            }else if(day>=23 && day<=31){
                burc="Aslan";
            }
            else {
                isError=true;
            }
        }else if (month==8){
            if (day<23){
                burc="Aslan";
            }else if(day>=23 && day<=31){
                burc="Başak";
            }
            else {
                isError=true;
            }
        }else if (month==9){
            if (day<23){
                burc="Başak";
            }else if(day>=22 && day<=30){
                burc="Terazi";
            }
            else {
                isError=true;
            }
        }else if (month==10){
            if (day<23){
                burc="Terazi";
            }else if(day>=23 && day<=31){
                burc="Akrep";
            }
            else {
                isError=true;
            }
        }else if (month==11){
            if (day<22){
                burc="Akrep";
            }else if(day>=22 && day<=30){
                burc="Yay";
            }
            else {
                isError=true;
            }
        }else if (month==12){
            if (day<22){
                burc="Yay";
            }else if(day>=22 && day<=31){
                burc="Oğlak";
            }
            else {
                isError=true;
            }
        }


        if(isError){
            System.out.println("Hatalı Giriş Yaptınız Tekrar Deneyiniz");
        }else {
            System.out.println("Burcunuz: "+burc);
        }

    }
}
