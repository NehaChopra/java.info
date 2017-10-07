package Reflection;

class LoadDynamicallyTest{
    public void load(){
        System.out.println("LoadDynamically.....");
    }
}

class newInstanceExample {
	public static void main(String []args) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		((Reflection.LoadDynamicallyTest) (Class.forName("Reflection.LoadDynamicallyTest")).newInstance()).load();
	}
}
