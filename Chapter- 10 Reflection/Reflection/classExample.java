package Reflection;

class LoadDynamically{
    public void load(){
        System.out.println("LoadDynamically.....");
    }
}

class Testing{
    public static void main(String []args) throws ClassNotFoundException{
    	LoadDynamically obj = new LoadDynamically();
    	System.out.println(obj.getClass().getName());
    }
}


class classExample {
	public static void main(String []args){
		System.out.println((Boolean.class).getName());
		System.out.println((LoadDynamically.class).getName());
	}
}


