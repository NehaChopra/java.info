package Reflection;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Scanner;

class disassemblesClass {
	public static void main(String []args) throws ClassNotFoundException{
		Class obj = Class.forName("java.lang.Object");
		System.out.println("Class : "+obj + " DeclaredFields..");
		Field[] field = obj.getDeclaredFields();
		for(int index=0; index<field.length; index++){
			System.out.println(field[index]);
		}
		System.out.println("Class : "+obj + " DeclaredConstructors..");
		Constructor[] cons = obj.getDeclaredConstructors();
		for(int index=0; index<cons.length; index++){
			System.out.println(cons[index]);
		}
		System.out.println("Class : "+obj + " DeclaredMethods..");
		Method[] method = obj.getDeclaredMethods();
		for(int index=0; index<method.length; index++){
			System.out.println(method[index]);
		}
	}
}
