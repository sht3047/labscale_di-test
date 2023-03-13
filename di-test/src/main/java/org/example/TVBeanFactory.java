package org.example;

public class TVBeanFactory {
    public TV getBean(String beanName) {
        Object bean = null;

        if (beanName.equalsIgnoreCase("samsung")) {
            return new SamsungTV2();
        }
        else if (beanName.equalsIgnoreCase("lg")) {
            return new LgTV2();
        }

        return null;
    }
}
