package innerClass;

class ParentClassTest{
	private int value = 10;
	public void method(){
		class LocalClass{
			void printDetails(){
				System.out.println("value : "+value);
			}
		}
		LocalClass local = new LocalClass();
		local.printDetails();
	}
}
class LocalInnerClass {
	public static void main(String []args){
		ParentClassTest obj = new ParentClassTest();
		obj.method();
	}
}


class ParentClassTest1{
	private int value = 10;
	public void method(){
		class LocalClass1{
			String localVariable = "Test";
			void printDetails(){
				System.out.println("value : "+value + " localVariable : "+ localVariable);
			}
		}
		LocalClass1 local = new LocalClass1();
		local.printDetails();
	}
}
class LocalInnerClass1 {
	public static void main(String []args){
		ParentClassTest1 obj = new ParentClassTest1();
		obj.method();
	}
}
