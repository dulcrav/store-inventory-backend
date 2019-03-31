package pl.marcinzubrzycki.storeinventorybackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.marcinzubrzycki.storeinventorybackend.model.Smartphone;

@Repository
public interface SmartphoneRepository extends JpaRepository<Smartphone, Long> {
}
