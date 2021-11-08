package business;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import ennity.Khachhangcanhan;
import ennity.Dailycap1;
import ennity.Khachhangcongty;
import ennity.Nguoi;

public class Quanlydanhsach {
	public ArrayList<Nguoi> listNguoi;
	public void Nhap() throws Exception {
	this.listNguoi = new ArrayList<>();
	this.load("src/inhoadon.txt");
	}
	public void load(String filename) throws IOException {
		BufferedReader br=null;
		FileReader fr = null;
		String sCurrentLine = null;
		
		try {
			fr=new FileReader(filename);
			br=new BufferedReader(fr);
			String[] words = null;
			while ((sCurrentLine = br.readLine()) != null) {
				words = sCurrentLine.split(",");
			
			if ("Khachhangcanhan".equals(words[0].trim())) {
				Khachhangcanhan s = new Khachhangcanhan();
				s.setMa(words[1].trim());
				s.setName(words[2].trim());
				s.setSoluong(Float.parseFloat(words[3].trim()));
				s.setDiachi(Float.parseFloat(words[4].trim()));
				s.Xetchietkhau();
				s.thanhtien();
				float trogia = Trogia.calculateTrogia(s);
				s.setTrogia(trogia);
				listNguoi.add(s);
			} else if ("Dailycap1".equals(words[0].trim())) {
				Dailycap1 s = new Dailycap1();
				s.setMa(words[1].trim());
				s.setName(words[2].trim());
				s.setSoluong(Float.parseFloat(words[3].trim()));
				s.setHoptac(Float.parseFloat(words[4].trim()));
				s.Xetchietkhau();
				s.thanhtien();
				float trogia = Trogia.calculateTrogia(s);
				s.setTrogia(trogia);
				listNguoi.add(s);
			} else {
				Khachhangcongty s = new Khachhangcongty();
				s.setMa(words[1].trim());
				s.setName(words[2].trim());
				s.setSoluong(Float.parseFloat(words[3].trim()));
				s.setSoluongnhanvien(Float.parseFloat(words[4].trim()));
				s.Xetchietkhau();
				s.thanhtien();
				float trogia = Trogia.calculateTrogia(s);
				s.setTrogia(trogia);
				listNguoi.add(s);
			}
		}
		} finally {
			if(br != null)
				br.close();
			if (fr != null)
				fr.close();
		}
	}
	public ArrayList<Nguoi> getAllNguoi(){
		return listNguoi;
	}
	public float Tongtien() {
		float tong=0;
		for (int i=0;i<getAllNguoi().size();i++)
		{
			tong=tong+getAllNguoi().get(i).getThanhtien();
		}
		return tong;
	}
	public void Muanhieu() {
		float d=0;
		int k=0;
		for (int i=0;i<getAllNguoi().size();i++)
			if (d < getAllNguoi().get(i).getSoluong()) {
				d=getAllNguoi().get(i).getSoluong();
				k=i;
			}
		System.out.println("Nguoi mua nhieu san pham nhat:");
		System.out.println("                Ma\tTen\tSo luong\tThanh tien\tChiet khau\tTrogia");
		System.out.println(getAllNguoi().get(k));
	}
	public float Tongtienchietkhau() {
		float tong=0;
		for (int i=0;i<getAllNguoi().size();i++)
		{
			tong=tong+getAllNguoi().get(i).getChietkhau();
		}
		return tong;
	}
	
	public int Demdaily() {
		int dem=0;
		for(int i=0; i<getAllNguoi().size();i++) {
			if (getAllNguoi().get(i) instanceof Dailycap1) dem++ ;
		}
			
		return dem;
	}
	
	public void Sapxepsoluong() {
		Collections.sort(listNguoi, new Soluongtangdan());
		Collections.sort(listNguoi, new Thanhtiengiamdan());
		System.out.println("                Ma\tTen\tSo luong\tThanh tien\tChiet khau\tTrogia");
		for (int i=0;i<getAllNguoi().size();i++)
		{
			System.out.println(getAllNguoi().get(i));
		}
	}
	
	public float Tongtrogia() {
		float tongtrogia = 0;
		for (int i=0;i<getAllNguoi().size();i++)
		{
			tongtrogia=tongtrogia+getAllNguoi().get(i).getTrogia();
		}
		return tongtrogia;
	}
	
	public void Maxthanhtien() {
		float d=0;
		int k=0;
		for (int i=0;i<getAllNguoi().size();i++)
			if (d < getAllNguoi().get(i).getThanhtien()) {
				d=getAllNguoi().get(i).getThanhtien();
				k=i;
			}
		System.out.println("Thong tin hoa don thanh tien cao nhat:");
		System.out.println("                Ma\tTen\tSo luong\tThanh tien\tChiet khau\tTrogia");
		System.out.println(getAllNguoi().get(k));
	}
	public void Xuat() {
		System.out.println("                Ma\tTen\tSo luong\tThanh tien\tChiet khau\tTrogia");
		for (int i=0;i<getAllNguoi().size();i++)
		{
			System.out.println(getAllNguoi().get(i));
		}
	}
	
}



