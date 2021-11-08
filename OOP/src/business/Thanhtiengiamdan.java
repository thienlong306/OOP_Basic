package business;

import java.util.*;

import ennity.Nguoi;

class Thanhtiengiamdan implements Comparator<Nguoi> {
	
	@Override
	public int compare(Nguoi s1, Nguoi s2) {
		if(s1.getSoluong() == s2.getSoluong())
			if (s1.getThanhtien() == s2.getThanhtien())
				return 0;
			else if (s1.getThanhtien()< s2.getThanhtien())
				return 1;
			else
				return -1;
		else return 0;
	}
}