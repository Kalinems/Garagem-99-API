
package local.kaline.garagem.controllers;

import java.util.List;
import local.kaline.garagem.entities.Veiculo;
import local.kaline.garagem.service.GaragemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ppjata
 */
@RestController
public class GaragemController {
    
    @Autowired
    private GaragemService garagemService;
    
    /**
     * Endpoint/ garagem/garagem
     * Retorna TODOS os veículos
     * @return
     */
    
    @GetMapping("/garagem")
    public List<Veiculo> findAll(){
        List<Veiculo> result = garagemService.findAll();
        return result;
    }
}
