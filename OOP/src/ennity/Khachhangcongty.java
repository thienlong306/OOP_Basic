package ennity;

import java.util.Scanner;

public class Khachhangcongty extends Nguoi {
	
private float soluongnhanvien;
	
	public Khachhangcongty(String ma, String name, float soluong, float giaban, float thanhtien, float chietkhau, float soluongnhanvien,float trogia) {
		super(ma,name,soluong,giaban,thanhtien,chietkhau,trogia);
		this.soluongnhanvien=soluongnhanvien;
	}

	public float getSoluongnhanvien() {
		return soluongnhanvien;
	}

	public void setSoluongnhanvien(float soluongnhanvien) {
		this.soluongnhanvien = soluongnhanvien;
	}

	public Khachhangcongty () {
		soluongnhanvien=0;
	}

	public void Xetchietkhau() {
	float s;
	if (getSoluongnhanvien()>500) s=5*getGiaban()*getSoluong()/100;
	else if (getSoluongnhanvien()>100) s=2*getGiaban()*getSoluong()/100;
	else s=0;
	setChietkhau(s);
	
	}
	
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap ma cua Khachhangcongty:");
		String ma = sc.nextLine();
		
		System.out.print("Nhap ten:");
		String name = sc.nextLine();
		
		System.out.print("Nhap so luong:");
		float soluong = sc.nextFloat();
		
		System.out.print("Nhap so luong nhan vien:");
		float soluongnhanvien = sc.nextFloat();
		
		setName(name);
		setMa(ma);
		setSoluong(soluong);
		setSoluongnhanvien(soluongnhanvien);
	}
	
	
	@Override
	public String toString() {
		System.out.print("Khachhangcongty:");
		return getMa() + "\t" + getName() + "\t" + getSoluong() + "\t        " + getThanhtien() + "\t" + getChietkhau() + "\t        " + getTrogia();
	}

	public void thanhtien() {
		float tien;
		tien= this.getSoluong()*this.getGiaban() - this.getChietkhau()+ 10*this.getSoluong()*this.getGiaban()/100;
		setThanhtien(tien);
	}
	
	


}
