package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TVUse{
//    private SamsungTV tv;
//    private LgTV tv;
    private  TV tv;
    public TVUse(TV tv){
//        tv = new SamsungTV();
//        this.tv = new LgTV2();
        this.tv = tv;
    }
    public void watchTV(){
        tv.powerOn();
        tv.volumeUp();
        tv.volumeDown();
        tv.powerOff();
//        tv.turnOn();
//        tv.soundUp();
//        tv.soundDown();
//        tv.turnOff();
    }

    public static void main(String[] args){

//        TV tv = (new TVBeanFactory()).getBean(args[0]);

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:appContextConfig.xml");

        TV tv = (TV) context.getBean(tv);

        TVUse user = new TVUse(tv);
        user.watchTV();
    }
}
