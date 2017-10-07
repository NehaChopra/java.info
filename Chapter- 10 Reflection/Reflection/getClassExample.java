package Reflection;

class LoadDynamically1{
    public void load(){
        System.out.println("LoadDynamically.....");
    }
}

class Testing1{
    public static void main(String []args) throws ClassNotFoundException{
    	LoadDynamically obj = new LoadDynamically();
    	System.out.println(obj.getClass().getName());
    }
}
