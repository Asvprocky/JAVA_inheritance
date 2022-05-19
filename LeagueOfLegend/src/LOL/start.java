package LOL;

import java.util.Scanner;

public class start {
    public static void main(String[] args){
//===========스캐너 사용법========================================
        Scanner scan = new Scanner(System.in);

        String name;
        int age;
        double height;
        String intro;
        String buffer;

        Scanner sc = new Scanner(System.in);
        System.out.println("name");
        name = sc.next();
        System.out.println("age");
        age = sc.nextInt();
        System.out.println("heights");
        height = sc.nextDouble();
        System.out.println("introduce your self");
        buffer = sc.nextLine();
        intro = sc.nextLine();

        System.out.println("your name is "+name+",your age is "+age+",your height is "+height+"yeayea.");
        System.out.println(intro);
    //====================================================================================================
        garen_Class obj = new garen_Class();
        skill_Class skill = new skill_Class();
        obj.setName("garen");
        obj.PutName();
        obj.setgaren_speed(30.5f);
        obj.putgaren_speed();
        obj.setHP(1005);
        obj.putHP();
        obj.setgaren_brain(1);
        obj.putgaren_brain();
        skill.setQ_skill("attack enm head");
        skill.putQ_skill();
        skill.setW_skill("give me shiled");
        skill.putW_skill();
        skill.setE_skill("slice enm body");
        skill.putE_skill();
        skill.setE_skill("make exprogen enm");
        skill.putE_skill();
    }
}