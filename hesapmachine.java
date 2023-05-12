import java.util.Scanner;
public class hesapmachine {
    

public static void main(String[] args) {
    int number1,number2;
    int select;
    try (Scanner input = new Scanner(System.in)) {
        System.out.print("İlk sayıyı girin  :");
        number1=input.nextInt();
        System.out.print("İkinci sayıyı girin  :");
        number2=input.nextInt();
        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme :");
        select=input.nextInt();
    }
    if (select<1||select>5){System.out.print("Hatalı seçim yaptınız!");return;}
    switch (select) {
        case 1:
        System.out.print("Toplam :"+(number1+number2));
        break;
        case 2:
        System.out.print("Fark :"+(number1-number2));
        break;
        case 3:
        System.out.print("Çarpım :"+(number1*number2));
        break;
        case 4:
        if (number2!=0){System.out.print("Bölüm :"+(number1/number2));
        break;}
        else{
            System.out.print("İkinci sayı  0 olamaz!");
        }
        default:
        break;
            }
        }
    }
    
