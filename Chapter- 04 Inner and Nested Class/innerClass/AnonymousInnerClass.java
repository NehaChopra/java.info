package innerClass;

abstract class ParentClass{
	abstract public void method();
}
class AnonymousInnerClass {
	public static void main(String []args){
		ParentClass obj = new ParentClass(){
			public void method(){
				System.out.println("AnonymousInnerClass...");
			}
		};
		obj.method();
	}
}


interface ParentInterface{
	abstract public void method();
}
class AnonymousInnerClassInterfaceImplementation {
	public static void main(String []args){
		ParentInterface obj = new ParentInterface(){
			public void method(){
				System.out.println("AnonymousInnerClass...");
			}
		};
		obj.method();
	}
}