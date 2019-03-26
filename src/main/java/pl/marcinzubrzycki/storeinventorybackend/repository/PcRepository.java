package pl.marcinzubrzycki.storeinventorybackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.marcinzubrzycki.storeinventorybackend.model.Pc;

@Repository
public interface PcRepository extends JpaRepository<Pc, Long> {
}
