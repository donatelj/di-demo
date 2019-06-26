package guru.springframework.services;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hello - From the Primary Greeting Service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hola - Desde tu servicio primario.";
    }

    @Override
    public String getGermanGreeting() {
        return "Hallo von Ihrem primären Dienst";
    }
}
