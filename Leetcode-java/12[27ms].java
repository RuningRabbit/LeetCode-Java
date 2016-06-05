public class Solution {
    public String intToRoman(int num) {
		Map<Integer,String>roman=new HashMap<>();
		roman.put(1, "I");
		roman.put(2, "II");
		roman.put(3, "III");
		roman.put(4, "IV");
		roman.put(5, "V");
		roman.put(6, "VI");
		roman.put(7, "VII");
		roman.put(8, "VIII");
		roman.put(9, "IX");
		roman.put(10, "X");
		roman.put(20, "XX");
		roman.put(30, "XXX");
		roman.put(40, "XL");
		roman.put(50, "L");
		roman.put(60, "LX");
		roman.put(70, "LXX");
		roman.put(80, "LXXX");
		roman.put(90, "XC");
		roman.put(100, "C");
		roman.put(200, "CC");
		roman.put(300, "CCC");
		roman.put(400, "CD");
		roman.put(500, "D");
		roman.put(600, "DC");
		roman.put(700, "DCC");
		roman.put(800, "DCCC");
		roman.put(900, "CM");
		roman.put(1000, "M");
		roman.put(2000, "MM");
		roman.put(3000, "MMM");
		StringBuffer res=new StringBuffer("");
		int a=0;
		a=(num/1000)%10;
		if(a!=0) res.append(roman.get(a*1000));
		a=(num/100)%10;
		if(a!=0) res.append(roman.get(a*100));
		a=(num/10)%10;
		if(a!=0) res.append(roman.get(a*10));
		a=num%10;
		if(a!=0) res.append(roman.get(a));
		return res.toString();
	}

}