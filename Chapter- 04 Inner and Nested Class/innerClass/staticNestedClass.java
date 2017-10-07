package innerClass;

class staticNestedClass {
	public static int value= 10;
	static class InnerClass{
		public void printData(){
			System.out.println("value : "+value);
		}
	}
	public static void main(String []args){
		InnerClass inner = new staticNestedClass.InnerClass();
		inner.printData();
	}
}


class staticNestedClass1 {
	public static int value= 10;
	static class InnerClass1{
		public static void printData(){
			System.out.println("value : "+value);
		}
	}
	public static void main(String []args){
		staticNestedClass1.InnerClass1.printData();
	}
}


