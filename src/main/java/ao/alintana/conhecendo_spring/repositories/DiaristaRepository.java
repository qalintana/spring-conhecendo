package ao.alintana.conhecendo_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ao.alintana.conhecendo_spring.models.Diarista;

public interface DiaristaRepository extends JpaRepository<Diarista, Long>{

    
} 