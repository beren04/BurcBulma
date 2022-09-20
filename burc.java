package first;

import java.util.Scanner;

public class burcBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum gününüzü giriniz:");
        byte dg = input.nextByte();

        System.out.print("Doğum ayınızı giriniz:");
        byte da = input.nextByte();

        if(da==1){
            if(dg<=21){
                System.out.println("Oğlak");
            }else{
                System.out.println("Kova");
            }
        }else if (da==2){
            if(dg<=19){
                System.out.println("Kova");
            }else{
                System.out.println("Balık");
            }
        }else if (da==3){
            if(dg<=20){
                System.out.println("Balık");
            }else{
                System.out.println("Koç");
            }
        }else if (da==4){
            if(dg<=20){
                System.out.println("Koç");
            }else{
                System.out.println("Boğa");
            }
        }else if (da==5){
            if(dg<=21){
                System.out.println("Boğa");
            }else{
                System.out.println("İkizler");
            }
        }else if (da==6){
            if(dg<=22){
                System.out.println("İkizler");
            }else{
                System.out.println("Yengeç");
            }
        }else if (da==7){
            if(dg<=22){
                System.out.println("Yengeç");
            }else{
                System.out.println("Aslan");
            }
        }else if (da==8){
            if(dg<=22){
                System.out.println("Aslan");
            }else{
                System.out.println("Başak");
            }
        }else if (da==9){
            if(dg<=22){
                System.out.println("Başak");
            }else{
                System.out.println("Terazi");
            }
        }else if (da==10){
            if(dg<=22){
                System.out.println("Terazi");
            }else{
                System.out.println("Akrep");
            }
        }else if (da==11){
            if(dg<=21){
                System.out.println("Akrep");
            }else{
                System.out.println("Yay");
            }
        }else if (da==12){
            if(dg<=21){
                System.out.println("Yay");
            }else{
                System.out.println("Oğlak");
            }
        }
    }
}
