package innerClass;

class MemberInnerClass {
	public int value= 10;
	class InnerClass{
		public void printData(){
			System.out.println("value : "+value);
		}
	}
	public static void main(String []args){
		MemberInnerClass outer = new MemberInnerClass();
		InnerClass inner = outer.new InnerClass();
		inner.printData();
	}
}
