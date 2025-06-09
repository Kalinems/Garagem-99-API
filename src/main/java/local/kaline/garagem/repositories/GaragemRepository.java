
package local.kaline.garagem.repositories;

import local.kaline.garagem.entities.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ppjata
 */
public interface GaragemRepository extends JpaRepository<Veiculo, Long> {
    
}
