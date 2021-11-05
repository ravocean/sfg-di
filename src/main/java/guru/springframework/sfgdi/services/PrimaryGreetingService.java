package guru.springframework.sfgdi.services;

public class PrimaryGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hellow World - From the PRIMARY Bean";
    }
}
