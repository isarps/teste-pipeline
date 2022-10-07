package SanjaValley.Persuance.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import SanjaValley.Persuance.Entity.Palavra;

public interface PalavraRepository extends JpaRepository<Palavra, Long> {

    public List<Palavra> findByPalavra(String palavra);

}
