package week1.day1;

public class FibanocciSeries {

	public static void main(String[] args) {
		
		
		int fnum=0, snum=1, tnum, range=8;
		for (int i=1; i<=range; i++)
		{
			System.out.println(fnum);
			tnum = fnum + snum;
			fnum = snum;
			snum = tnum;
		}
	}

}
