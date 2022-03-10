package ooday04;

public class Test {
    public static void main(String[] args) {
        Student[] stus = new Student[3];
        stus[0]=new Student("Tom",18,"LA","001");
        stus[1]=new Student("Kate",18,"LA","002");
        stus[2]=new Student("Kate",17,"NY","003");
        for (int i = 0; i < stus.length; i++) {
            stus[i].sayHi();
        }
        System.out.println();

        Doctor[] docs = new Doctor[3];
        docs[0]=new Doctor("张医生",49,"北京","副主人医师");
        docs[1]=new Doctor("刘医生",54,"天津","主任医师");
        docs[2]=new Doctor("和医生",46,"天津","主治医师");
        for (int i = 0; i < docs.length; i++) {
            docs[i].sayHi();
        }
        System.out.println();

        Teacher[] teas = new Teacher[2];
        teas[0]=new Teacher("Mis. chen",36,"Boston",4777);
        teas[1]=new Teacher("Mis. lou",40,"London",4888);
        for (int i = 0; i < teas.length; i++) {
            teas[i].sayHi();
        }
    }
}
