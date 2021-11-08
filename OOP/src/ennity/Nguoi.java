package ennity;

public class Nguoi {
	
	private String ma;
	private String name;
	private float soluong;
	private float giaban;
	private float thanhtien;
	private float chietkhau;
	private float trogia;
	
	public Nguoi(String ma, String name, float soluong, float giaban, float thanhtien, float chietkhau,float trogia) {
		this.ma=ma;
		this.name=name;
		this.soluong=soluong;
		this.giaban=giaban;
		this.thanhtien=thanhtien;
		this.chietkhau=chietkhau;
		this.trogia=trogia;
	}
	
	public Nguoi () {
		ma=null;
		name=null;
		soluong=0;
		giaban=100000;
		thanhtien=0;
		chietkhau=0;
		trogia=0;
	}
	
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSoluong() {
		return soluong;
	}
	public void setSoluong(float soluong) {
		this.soluong = soluong;
	}
	public float getGiaban() {
		return giaban;
	}
	public void setGiaban(float giaban) {
		this.giaban = giaban;
	}
	public float getThanhtien() {
		return thanhtien;
	}
	public void setThanhtien(float thanhtien) {
		this.thanhtien = thanhtien;
	}
	public float getChietkhau() {
		return chietkhau;
	}
	public void setChietkhau(float chietkhau) {
		this.chietkhau = chietkhau;
	}
	
	public float getTrogia() {
		return trogia;
	}

	public void setTrogia(float trogia) {
		this.trogia = trogia;
	}

	public String toString() {
		return getMa() + "\t" + getName() + "\t" + getSoluong() + "\t" + getThanhtien()+ "/" + getTrogia();
	}
	
}
