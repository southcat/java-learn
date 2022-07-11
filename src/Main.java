import jisuan.Mianji;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    xuanzetuxing();

    }
    public static void xuanzetuxing(){
        System.out.println("请输入需要计算的图形");
        System.out.println("1.正方形/长方形\n2.圆形");
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();

        if (b==1){
            System.out.println("请输入长");
            Scanner c =new Scanner(System.in);
            double d = c.nextDouble();
            System.out.println("请输入宽");
            double f = c.nextDouble();
            Mianji m = new jisuan.Mianji();
            m.zfxmianji(d,f);
        }else if (b==2){
            System.out.println("请输入半径");
            Scanner c =new Scanner(System.in);
            double d = c.nextDouble();
            Mianji m = new jisuan.Mianji();
            m.yxmianji(d);
        }else {
            System.out.println("输入错误,请重新输入");
            xuanzetuxing();



        }

    }
    }
