package net.riyad.customerservice;

import net.riyad.customerservice.entities.Customer;
import net.riyad.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(CustomerServiceApplication.class, args);

    }

    @Bean
    //@Bean : permet d'ajouter les customers dans la base de donnees au demarage de l'application
    CommandLineRunner start(CustomerRepository customerRepository) {
        //CommandLineRunner : permet d'executer du code au demarage de l'application
        return args -> {
            //methode 1 : creer customer en utilisant le constructeur avec parametres
            //customerRepository.save(new Customer(null, "Riyad", "riyad@example.com"));
            //methode 2 : creer customer en utilisant builder pattern
            customerRepository.save(Customer.builder()
                    .name("Riyad").email("riyad@example.com").build());
            customerRepository.save(Customer.builder()
                    .name("Imane").email("imane@example.com").build());
            customerRepository.save(Customer.builder()
                    .name("Yassine").email("yassine@example.com").build());
        };
    }
}

