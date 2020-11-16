package com.tushu;

import java.util.Scanner;

import com.tushu.view.BookService;

public class BookManager {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
			BookService service=new BookService();
			Scanner sc=new Scanner(System.in);
			while(true)
			{
				menu();
				int choose=sc.nextInt();
				switch(choose) {
				case 1: service.addBook();break;
				case 2: service.delBook();break;
				case 3: service.updateBook();break;
				case 4: service.selectBook();break;
				case 5: service.selectAll();break;
				case 0: System.exit(0);	
				}
				
			}
			
	}
	
	
	    //菜单
		public static void menu()
		{
			System.out.println("|---------------- ----图书管理系统--------------------|");
			System.out.println("|	1增加 	2删除	3修改	4查找	5显示所有	0退出 |");
			System.out.println("|----------------------------------------------------|");
		    System.out.println("请选择业务:");
			
		}

}
