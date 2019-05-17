package com.example.demo;

import com.example.demo.abstractfactory.AbsFactory;
import com.example.demo.abstractfactory.IFactory;
import com.example.demo.factorymethod.Factory;
import com.example.demo.factorymethod.FactoryA;
import com.example.demo.factorymethod.FactoryB;
import com.example.demo.singleton.Singleton3;
import com.example.demo.staticfactory.Market;
import com.example.demo.staticfactory.WorkShop;
import com.example.demo.strategy.*;
import com.example.demo.template.AudiCar;
import com.example.demo.template.BenzCar;
import com.example.demo.template.CarModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
    /**
     * 测试单例模式
     */
    @Test
    public void contextLoads1() {
        Singleton3 singleton1 = Singleton3.getInstance();
        Singleton3 singleton2 = Singleton3.getInstance();
        singleton1.show();
        singleton2.show();
        if (singleton1 == singleton2) {
            System.out.println("该对象的字符串表示形式:");
            System.out.println("singleton :" + singleton1.toString());
            System.out.println("singleton2:" + singleton2.toString());
        }
    }

    /**
     * 测试简单工厂模式
     */
    @Test
    public void contextLoads2() {
        WorkShop workShop = Market.getMenu(Market.MENU_CAR);
        workShop.work();
    }

    /**
     * 测试工厂方法模式
     */
    @Test
    public void contextLoads3() {
        Factory factory1 = new FactoryA();
        factory1.ManuFacture().show();
        Factory factory2 = new FactoryB();
        factory2.ManuFacture().show();

    }

    /**
     * 测试抽象工厂模式
     */
    @Test
    public void contextLoads4() {
        IFactory factory = null;
        factory = new AbsFactory();
        factory.createProduct1().show();
        factory.createProduct2().show();

    }//空指针异常（已解决）

    /**
     * 策略模式测试
     */
    @Test
    public void contextLoads5() {
        //加
        Context context1 = new Context(new AddStrategy());
        System.out.println(context1.calculate(3, 3));
        //减
        Context context2 = new Context(new SubstractStrategy());
        System.out.println(context2.calculate(3, 3));
        //乘
        Context context3 = new Context(new MultiplyStrategy());
        System.out.println(context3.calculate(3, 3));
        //除
        Context context4 = new Context(new DivisionStrategy());
        System.out.println(context4.calculate(3, 3));
    }

    /**
     * 测试模板模式
     */
    @Test
    public void contextLoads6() {
        CarModel carModel1 = new AudiCar();
        carModel1.excet();

        CarModel carModel2 = new BenzCar();
        carModel2.excet();

    }
}
