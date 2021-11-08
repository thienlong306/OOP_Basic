package ennity;

import java.util.Scanner;

public class Khachhangcanhan extends Nguoi{
	private float diachi;
	
	public Khachhangcanhan(String ma, String name, float soluong, float giaban, float thanhtien, float chietkhau,float diachi,float trogia) {
		super(ma,name,soluong,giaban,thanhtien,chietkhau,trogia);
		this.diachi=diachi;
	}
	public Khachhangcanhan() {
		diachi=0;
	}

	public float getDiachi() {
		return diachi;
	}

	public void setDiachi(float diachi) {
		this.diachi = diachi;
	}
	
	public void Xetchietkhau() {
		
		float s,d;
		if (getSoluong()<7) s=0;
		else s=5*this.getSoluong()*this.getGiaban()/100;
		
		if (getDiachi()<10) d=10000*this.getSoluong();
		else d=0;
		
		setChietkhau(s+d);
	}
	
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap ma cua Khachhangcanhan:");
		String ma = sc.nextLine();
		
		System.out.print("Nhap ten:");
		String name = sc.nextLine();
		
		System.out.print("Nhap so luong:");
		float soluong = sc.nextFloat();
		
		
		System.out.print("Nhap khoang cach tu nha den cong ty:");
		float diachi = sc.nextFloat();
		
		setName(name);
		setMa(ma);
		setSoluong(soluong);
		setDiachi(diachi);
	}
	
	
	@Override
	public String toString() {
		System.out.print("Khachhangcanhan:");
		return getMa() + "\t" + getName() + "\t" + getSoluong() + "\t        " + getThanhtien() + "\t" + getChietkhau() + "\t        " + getTrogia();
	}

	public void thanhtien() {
		float tien;
		tien= this.getSoluong()*this.getGiaban() - this.getChietkhau()+ 10*this.getSoluong()*this.getGiaban()/100;
		setThanhtien(tien);
	}
	
	
}
