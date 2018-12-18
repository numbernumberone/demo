public class Zhangsan implements  Person{

    public static void main(String[] args) {

    }

    private String sex = "女";
    private String name = "小星星";


    @Override
//    public void findLove() {
//        System.out.println("我叫王锐" +this.name+">"+"性别"+this.sex+"hello");
//        System.out.println("我叫王锐");
//        System.out.println("我叫王锐");
//        System.out.println("我叫王锐");
//    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void findLove() {
        System.out.println("我叫王锐" +this.name+">"+"性别"+this.sex+"hello");
        System.out.println("");
        System.out.println("我叫王锐");
        System.out.println("我叫王锐");
    }
}
