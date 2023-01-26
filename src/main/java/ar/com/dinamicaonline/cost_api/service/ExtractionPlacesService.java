package ar.com.dinamicaonline.cost_api.service;

import org.springframework.http.ResponseEntity;

public interface ExtractionPlacesService {
    
    ResponseEntity<?> getDepositMoney();
    ResponseEntity<?> getCashWithdrawal();

}
