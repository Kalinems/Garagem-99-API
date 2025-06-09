
package local.kaline.garagem.service;

import java.util.List;
import local.kaline.garagem.entities.Veiculo;
import local.kaline.garagem.repositories.GaragemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ppjata
 */
@Service
public class GaragemService {
    
    @Autowired
    private GaragemRepository garagemRepository;
    
    public List<Veiculo> findAll() {
        
        List<Veiculo> result = garagemRepository.findAll();
        return result;
    }
}
