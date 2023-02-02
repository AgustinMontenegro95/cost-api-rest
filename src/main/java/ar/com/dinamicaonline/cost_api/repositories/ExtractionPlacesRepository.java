package ar.com.dinamicaonline.cost_api.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.dinamicaonline.cost_api.dto.CashWithdrawalDTO;
import ar.com.dinamicaonline.cost_api.dto.DepositMoneyDTO;
import ar.com.dinamicaonline.cost_api.models.ExtractionPlaces;

public interface ExtractionPlacesRepository extends JpaRepository<ExtractionPlaces, Integer> {
    
    public List<DepositMoneyDTO> findDepositMoney();
        
    public List<CashWithdrawalDTO> findCashWithdrawal();

}
