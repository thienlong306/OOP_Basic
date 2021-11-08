package ui;

import java.util.ArrayList;
import java.util.Scanner;

import business.Quanlydanhsach;
import ennity.Khachhangcanhan;
import ennity.Dailycap1;
import ennity.Khachhangcongty;
import ennity.Nguoi;

public class ui {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Quanlydanhsach s = new Quanlydanhsach();
		boolean keepRunning = true;
		Scanner scan = new 	Scanner (System.in);
		while(keepRunning) {
			System.out.println("------------------------------------------------------------------------------------------");
			s.Nhap();
			ArrayList<Nguoi> listNguoi = s. getAllNguoi();
			System.out.println("QuanLyHoaDon:");
			System.out.println("\t 1.Tong thanh tien:");
			System.out.println("\t 2.Tong tien tro gia");
			System.out.println("\t 3.Khach hang mua san pham nhieu nhat");
			System.out.println("\t 4.Hoa don thanh tien cao nhat");
			System.out.println("\t 5.Tong tien chiet khau");
			System.out.println("\t 6.Sap xep hoa don tang dan theo so luong,giam dan theo thanh tien");
			System.out.println("\t 7.So luong Dai ly cap 1");
			System.out.println("\t 8.Exit");
			System.out.print("Chon:");
			
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Tong thanh tien:" + s.Tongtien());
				break;
			case 2:
				System.out.println("Tong tro gia:" + s.Tongtrogia());
				break;
			case 3:
				s.Muanhieu();
				break;
			case 4:
				s.Maxthanhtien();
				break;
			case 5:
				System.out.println("Tong tien chiet khau:" + s.Tongtienchietkhau());
				break;
			case 6:
				System.out.println("Danh sach sap xep so luong tang dan:");
				s.Sapxepsoluong();
				break;
			case 7:
				System.out.println("So luong Dailycap1:" + s.Demdaily());
				break;
			case 8:
				keepRunning = false;
				break;
		}
		}	
		
	}
}
