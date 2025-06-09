
package local.kaline.garagem.repositories;

import java.util.List;
import local.kaline.garagem.entities.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ppjata
 */
public interface GaragemRepository extends JpaRepository<Veiculo, Long> {
    
    List<Veiculo> findById( long id);
    List<Veiculo> findByCorIgnoreCase (String cor);
    List<Veiculo> findByAno (long ano);
}
