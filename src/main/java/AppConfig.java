import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    // метод будет выполнен при создании контекста, и его результат станет объектом, управляемым Спрингом
    // бины можно вызывать из контекста по имени - getBean("name")
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean(name="cat")
    @Scope("prototype")
    public Cat getCat() {
        Cat cat = new Cat();
        cat.setName("Pickles");
        return cat;
    }
}