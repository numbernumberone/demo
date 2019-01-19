package corejava;



interface A{}
class B implements A{

}

class C extends B{

}
class instanceoftest {
    public static void main(String[] args) {
        A a=null;
        B b=null;
        B d = new B();
        boolean res;
        System.out.println("instanceoftest test case 1: ------------------");
        res = a instanceof A;
        System.out.println("a instanceof A " + res);
        res = d instanceof B;
        System.out.println("b instanceof B " + res);
    }

}
