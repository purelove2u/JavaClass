package format;

import java.text.DecimalFormat;

public class DecimalFormatEx {
	public static void main(String[] args) {
		double num = 1234567.89;
		
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));	//1234568
		
		df = new DecimalFormat("0.0");
		System.out.println(df.format(num));	//1234567.9
		
		df = new DecimalFormat("0000000000.00000");
		System.out.println(df.format(num));	//0001234567.89000
		
		df = new DecimalFormat("#");	
		System.out.println(df.format(num));	//1234568
		
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));	//1234567.9
		
		df = new DecimalFormat("##########.#####");
		System.out.println(df.format(num));	//1234567.89
		
		df = new DecimalFormat("#.0");
		System.out.println(df.format(num));	//1234567.9
		
		df = new DecimalFormat("#.# %");
		System.out.println(df.format(num));	//123456789 %

		df = new DecimalFormat("#,###");
		System.out.println(df.format(num));	//1,234,568

	}
}
