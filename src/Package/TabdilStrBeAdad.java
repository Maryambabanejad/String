package Package;

import javax.swing.*;
import java.util.Scanner;

public class TabdilStrBeAdad {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();                 //  str >>>  245+32=
        System.out.println("Enter number : ");
        int len=str.length();
        for (int i = 0; i < len; i++) {                 // یعنی از خونه اول که صفر شروع کن تا خونه 7 یا طول رشته 6 -شرط هم اینکه تا کمتر از طول رشته باشه یعنی 6 تا خونه رو یکی یکی برو
            if (str i=='+' || str i == '-'|| str i == '*' ||str i '/'){
                int op=str i;                               // اگر عملگر بود بریز تو str
            }
        }
        else if ('0'<= str i && str i <= '9');              // اگر بین 0 تا 9 بود یعنی عدد
    }
}
