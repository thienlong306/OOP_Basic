package business;

import ennity.Khachhangcanhan;
import ennity.Khachhangcongty;
import ennity.Nguoi;

public class Trogia {

	public static float calculateTrogia(Nguoi emp) {
		// TODO Auto-generated method stub
		float trogia = 0;
		
		if (emp instanceof Khachhangcanhan) {
			Khachhangcanhan s = (Khachhangcanhan) emp;
			if (s.getSoluong()>2)
				trogia=2*s.getSoluong()*s.getGiaban()/100 + 100000*s.getSoluong();
			else trogia=trogia=2*s.getSoluong()*s.getGiaban()/100;
			
		} else if (emp instanceof Khachhangcongty) {
			Khachhangcongty t = (Khachhangcongty) emp;
			trogia=t.getSoluong()*120000;
		}
		return trogia;
	}

}
