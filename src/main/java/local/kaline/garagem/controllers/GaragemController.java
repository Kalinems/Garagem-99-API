
package local.kaline.garagem.controllers;

import java.util.List;
import local.kaline.garagem.entities.Veiculo;
import local.kaline.garagem.service.GaragemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    
    /**
     * Endpoint /garagem/veiculo/{garagemName}
     * @param id
     * @return
     */
    @GetMapping("/garagem/forsale/{id}")
    public List<Veiculo> findById(@PathVariable long id) {
        List<Veiculo> result = garagemService.findById(id);
        return result;
    }
    
    /**
     * Endpoint / garagem/ veiculo/{garagemName}
     * preparado para devolver código de status conforme
     * padronização REST.
     * @param cor
     * @return
     */
    @GetMapping("/garagem/color/{cor}")
    public List<Veiculo> findByColorIgnoreCase(@PathVariable String cor) {
        List<Veiculo> result = garagemService.findByColorIgnoreCase(cor);
        
       /** if (result.isEmpty()) {
            //Ops.. lista vazia.
            //notFound devolve 404 **/
            return result;
        }
    }
