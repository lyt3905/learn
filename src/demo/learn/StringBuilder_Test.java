package demo.learn;

import java.util.Scanner;


public class StringBuilder_Test {
    static String[] usename={"张三","王五","李四"};
    public static void main(String[] args)  {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入需要注册的用户名");
        String newusername=in.nextLine();
        CheckUserName(newusername);
    }
    static void CheckUserName(String UserName)  {
        for(String name:usename){
            if (name.equals(UserName)) {

                try {
                    throw new ResigerException("该用户已经被注册");
                } catch (ResigerException e) {
                    e.printStackTrace();
                    return;//结束方法用来
                }
            }
        }
        System.out.println("该用户可以被注册    ");

    }
}
