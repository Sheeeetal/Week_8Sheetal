package abstractexample23;

 class TestAbstraction1 {
     public static void main(String args[]){
         Shape s=new Circle1();//in a real scenario,object is provided through method,eg,get shape()method
         s.draw();
     }
}
