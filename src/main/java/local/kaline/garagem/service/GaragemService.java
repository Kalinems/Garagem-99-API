
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
    
    /**
     * Retorno DTO Garagem filtrado por cidade.
     * @param id
     * @param 
     * @return
     */
    public List<Veiculo> findById(long id) {
        List<Veiculo> result = garagemRepository.findById(id);
        return result;
    }
    
    public List<Veiculo> findByColorIgnoreCase(String cor) {
        List<Veiculo> result = garagemRepository.findByCorIgnoreCase(cor);
        return result;
    }
    
    public List<Veiculo> findByAno(long ano) {
        List<Veiculo> result = garagemRepository.findByAno(ano);
        return result;
    }
}
