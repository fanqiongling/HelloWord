import java.util.Scanner;
import java.util.Arrays;
enum Weekday{
    星期一,星期二,星期三,星期四,星期五,星期六,星期日
}//声明一个枚举类型
public class HelloWorld {
    public static void main(String args[]){
        System.out.println("这是一个简单的Java应用程序\n");
        System.out.println("请输入若干个数，每输入一个数回车确认" );
        System.out.println("最后输入0结束输入操作");
        Scanner reader=new Scanner(System.in);
        double z=reader.nextDouble();
        int m=0;
        double sum=0;
        while(z!=0){
            m=m+1;
            sum=sum+z;
            z=reader.nextDouble();
        }
        Student stu=new Student();
        Tester test=new Tester();
        stu.speak("We are student");
        stu.speak("我是一名测试人员");
        test.work(10,100);
        System.out.println(m+"个数的和等于"+sum);
        System.out.println(m+"个数的平均值等于"+sum/m);
        Weekday a=Weekday.星期日;
        if (a==Weekday.星期日){
            System.out.println("今天是"+a+",可以休息");
        }
        int b=96,c=1;
       switch(b+c){
            case 1:
                System.out.println(b+c);
                break;
            case 'a':
                System.out.println(b+c);//b+c=98=a，执行完该条语句没有break，继续执行下面的语句，直到执行到break语句才跳出
            case 10:
                System.out.println(b+c);
            case 20:
                System.out.println(b+c);
                break;
            default:System.out.println("没有匹配的"+(b+c));
        }//switch开关语句
        Weekday d=Weekday.星期五;
        switch(d){
            case 星期日:
                System.out.println("今天是"+d+",周末可以休息");
                break;
            case 星期五:
                System.out.println("今天是"+d+",明天就是周末可以休息了");
                break;
            default:System.out.println("没有匹配的"+d);
        }

        Weekday day[]=Weekday.values();
        System.out.println("输出数组day的元素"+Arrays.toString(day));
    }
}