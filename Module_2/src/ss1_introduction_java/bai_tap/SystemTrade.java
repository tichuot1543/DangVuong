package ss1_introduction_java.bai_tap;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class SystemTrade {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số tiền muốn chuyển đổi: ");
        usd = sc.nextDouble();
        double trade = usd * vnd;
       NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("vi","VN"));
       String format = formatter.format(trade);
       System.out.println(format);
    }
    }

