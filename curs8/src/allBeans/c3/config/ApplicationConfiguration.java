package allBeans.c3.config;

import allBeans.c3.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("allBeans.c3")
public class ApplicationConfiguration {

    @Bean
    public Dog littleDog(){
        return new Dog("Timy");
    }

    @Bean
    public Dog bigDog(){
        return new Dog("Rex");
    }

    @Bean
    public String name() {
        return "Kity";
    }



}
