/*This program calculates bar and plate size
Types of elements are based on UNKM.321154.002
*/

import java.lang.*;
import java.util.*;
import java.math.*;

public class Main
{
    public static int Linside;
    public static int Sinside;
    public static int Hinside;
    
    public static int L;
    public static int S;
    public static int H;
    
    final public static int thickness = 5;
    
	public static void main(String[] args) {
		System.out.println("Начало работы. Далее надо будет ввести внутренние габариты ДхШхВ, Д больше Ш");
		Scanner input = new Scanner(System.in);
		
		System.out.println("Введите внутреннюю длину и нажмите ENTER:");
		Linside = input.nextInt();
		System.out.println("Введите внутреннюю ширину:");
		Sinside = input.nextInt();
		System.out.println("Введите внутренню высоту:");
		Hinside = input.nextInt();
		L = Linside + 130;
		S = Sinside + 130;
		H = Hinside + 160;
		
		
		System.out.println("Внутренние габариты ДхШхВ: " + Linside + "x" + Sinside + "x" + Hinside);
		System.out.println("Наружные габариты ДхШхВ: " + L + "x" + S + "x" + H);
		
		// Calculation
		int halfS = (int) (Sinside/2);
		int halfL = (int) (Linside/2);
		int L1 = (int) Math.round(Math.sqrt(Hinside*Hinside + halfS*halfS)) - 40;
		int L2 = L1 + 10; //(int) Math.round(Math.sqrt(Hinside*Hinside + halfL*halfL)) - 40;
		int L3 = H - 10;
		int L4 = S - 10;
		int L5 = S;
		int L6 = L - 60;
		int L7 = L;
		int L8 = S;
		int L9 = L;
		int S10 = H - 165;
		int L10 = S;
		int H10 = thickness;
		int S11 = H - 165;
		int L11 = L;
		int H11 = thickness;
		double S12 = ( (double) Sinside - 40 - 35)/2;
		int L12 = L;
		int H12 = thickness;
		int S13 = S;
		int L13 = L;
		int H13 = thickness;
		
		// Output
		System.out.println("1) Брус 30 L = " + L1);
		System.out.println("2) Брус 30 L = " + L2);
		System.out.println("3) Брус 30 L = " + L3);
		System.out.println("4) Брус 30 L = " + L4);
		System.out.println("5) Брус 30 L = " + L5);
		System.out.println("6) Брус 30 L = " + L6);
		System.out.println("7) Брус 30 L = " + L7);
		System.out.println("8) Доска 25х100 L = " + L8);
		System.out.println("9) Доска 50х100 L = " + L9);
		System.out.println("10) Лист ДхШхВ: " + S10 + "x" + L10 + "x" + H10);
		System.out.println("11) Лист ДхШхВ: " + S11 + "x" + L11 + "x" + H11);
		System.out.println("12) Лист ДхШхВ: " + S12 + "x" + L12 + "x" + H12);
		System.out.println("13) Лист ДхШхВ: " + S13 + "x" + L13 + "x" + H13);
	}
}
