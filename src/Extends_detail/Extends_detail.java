package Extends_detail;

public class   Extends_detail {
    public static void main(String[] args) {
        new cat();
        hashiqi ha = new hashiqi();
        ha.eat();
        ha.drink();
        ha.lookHome();
        ha.cai();


        taidi tai = new taidi();
        tai.eat();
        tai.drink();

    }
}
//动物类
class anmis {
    public void eat(){
        System.out.println("吃饭");
    }
    public void drink(){
        System.out.println("喝水");
    }
}
//猫类
class cat extends anmis {

    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}

//狗类
class dog extends anmis {
    public void lookHome(){
        System.out.println("看家");
    }
}

class hashiqi extends dog {
    public void cai(){
        System.out.println("拆家");
    }
}

class taidi extends dog {
    public void chen(){
        System.out.println("蹭一蹭");
    }
}