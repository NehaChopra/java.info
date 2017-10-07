package Reflection;

class forNameExample {

}

class LoadDynamically{
    public void load(){
        System.out.println("LoadDynamically.....");
    }
}

class Testing{
    public static void main(String []args) throws ClassNotFoundException{
    	(Class.forName("LoadDynamically")).getName();
    }
}
