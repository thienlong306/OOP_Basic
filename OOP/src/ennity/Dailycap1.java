package ennity;

import java.util.Scanner;

public class Dailycap1 extends Nguoi {
	
	private float hoptac;
	
	public Dailycap1(String ma, String name, float soluong, float giaban, float thanhtien, float chietkhau, float hoptac,float trogia) {
		super(ma,name,soluong,giaban,thanhtien,chietkhau,trogia);
		this.hoptac=hoptac;
	}
	
	
	
	public float getHoptac() {
		return hoptac;
	}



	public void setHoptac(float hoptac) {
		this.hoptac = hoptac;
	}



	public Dailycap1 () {
		hoptac=0;
	}

	public void Xetchietkhau() {
	float s,d;
	s=30*getSoluong()*getGiaban()/100;
	if (getHoptac()>3 && getHoptac()<6)
		d=getHoptac()*getGiaban()*getSoluong()/100;
	else if (getHoptac()>5) 
		d=5*getGiaban()*getSoluong()/100;
	else d=0;
	
	setChietkhau(s+d);
	
	}	
	
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap ma cua Dailycap1:");
		String ma = sc.nextLine();
		
		System.out.print("Nhap ten:");
		String name = sc.nextLine();
		
		System.out.print("Nhap so luong:");
		float soluong = sc.nextFloat();
		
		
		System.out.print("Nhap nam hop tac:");
		float hoptac = sc.nextFloat();
		
		setName(name);
		setMa(ma);
		setSoluong(soluong);
		setHoptac(hoptac);
	}
	
	
	@Override
	public String toString() {
		System.out.print("KhachhangDaily1:");
		return getMa() + "\t" + getName() + "\t" + getSoluong() + "\t        " + getThanhtien() + "\t" + getChietkhau() + "\t" + getTrogia();
	}

	public void thanhtien() {
		float tien;
		tien= this.getSoluong()*this.getGiaban() - this.getChietkhau()+ 10*this.getSoluong()*this.getGiaban()/100;
		setThanhtien(tien);
	}
	
	

}
