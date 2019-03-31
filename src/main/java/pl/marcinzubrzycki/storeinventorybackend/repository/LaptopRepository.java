package pl.marcinzubrzycki.storeinventorybackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.marcinzubrzycki.storeinventorybackend.model.Laptop;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {
}
