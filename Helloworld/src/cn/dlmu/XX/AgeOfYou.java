package cn.dlmu.XX;

import java.util.Scanner;

public class AgeOfYou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("请输入年龄");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int a = Integer.valueOf(line);
        System.out.println("出生年：");
        System.out.println(2016-a);
        
	}

}
