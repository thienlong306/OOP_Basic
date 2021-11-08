package business;

import java.util.*;

import ennity.Nguoi;

class Soluongtangdan implements Comparator<Nguoi> {
	
	@Override
	public int compare(Nguoi s1, Nguoi s2) {
		if (s1.getSoluong() == s2.getSoluong())
			return 0;
		else if (s1.getSoluong()> s2.getSoluong())
			return 1;
		else
			return -1;
	}
}