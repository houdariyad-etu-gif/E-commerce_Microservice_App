package net.riyad.customerservice.repository;

import net.riyad.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
//@RepositoryRestResource : permet de demarer automatiquement un web service RESTfull qui permet d'acceder a toutes les methodes qu'on a dans l'interface JpaRepository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
//on a heritée tous les operations de mapping objet relationnel du repository JpaRepository, on a juste besoin de definir l'entite Customer et le type de l'identifiant Long
}
