package br.com.funnycorporation.phrasemaker.repository;

import br.com.funnycorporation.phrasemaker.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FraseRepository extends JpaRepository<Frase,Long> {
}
