/*
 * Purpose :Demos the use of Data Types
 * 
 * Date: 10-January-2019
 */

package DataTypesAndOperations;

public class DataTypes {

	public static void main(String[] args) {
		System.out.println("Here is the list of DataTypes used in Java");

		System.out.println("====================== Primitive DataTypes: integers ====================== ");
		byte b = 0; // TakesUp 1 byte or 8 bits
		short s = 0; // TakesUp 2 bytes or 16 bits
		int i = 0; // TakesUp 4 bytes or 32 bits
		long l = 0l; // TakesUp 8 bytes or 64 bits

		System.out.println("byte b = " + b + "\t short s = " + s + "\t int i = " + i + "\t long l = " + l);

		System.out.println("B.size is : " + Byte.SIZE + " bits or  " + Byte.SIZE / 8 + " bytes ");
		System.out.println("S.size is : " + Short.SIZE + " bits or  " + Short.SIZE / 8 + " bytes ");
		System.out.println("I.size is : " + Integer.SIZE + " bits or  " + Integer.SIZE / 8 + " bytes ");
		System.out.println("L.size is : " + Long.SIZE + " bits or  " + Long.SIZE / 8 + " bytes ");

		System.out.println("====================== Primitive DataTypes : float & double ====================== ");
		float f = 0.0f; // TakesUp 4 bytes or 32 bits
		double d = 0.0d; // TakesUp 8 bytes or 64 bits

		System.out.println("float f = " + f + "\t double d = " + d);

		System.out.println("F.size is : " + Float.SIZE + " bits or  " + Float.SIZE / 8 + " bytes ");
		System.out.println("D.size is : " + Double.SIZE + " bits or  " + Double.SIZE / 8 + " bytes ");

		System.out.println("====================== Primitive DataTypes : char ====================== ");
		char c = '\u0586'; // TakesUp 16 bits or 2 bytes
		System.out.println("char c = " + c);

		System.out.println("C.size is : " + Character.SIZE + " bits or  " + Character.SIZE / 8 + " bytes ");

		System.out.println("====================== Primitive DataTypes : boolean ====================== ");
		boolean bTrue = true;
		boolean bFalse = false;

		System.out.println("boolean bTrue = " + bTrue + "\t boolean bFalse = " + bFalse);
	}
}
