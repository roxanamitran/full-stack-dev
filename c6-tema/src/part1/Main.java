package part1;

import part1.beans.Car;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import part1.beans.Plane;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-part1.xml");
        Car myCar = context.getBean("myCar", Car.class);
        myCar.setColor("black");
        myCar.setNubberOfPassangers(5);

        System.out.println("My car is " + myCar.getColor() + " and is perfect for " + myCar.getNubberOfPassangers() + " persons.");

        Plane myPlane = context.getBean("myPlane", Plane.class);
        myPlane.setManufacturer("Airbus");
        System.out.println("My plane was manufactured by " + myPlane.getManufacturer());
    }
}