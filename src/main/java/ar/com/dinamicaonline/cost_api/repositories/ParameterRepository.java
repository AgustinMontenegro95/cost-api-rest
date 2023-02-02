package ar.com.dinamicaonline.cost_api.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.dinamicaonline.cost_api.dto.TransferMoneyDTO;
import ar.com.dinamicaonline.cost_api.models.Parameter;

@Repository
public interface ParameterRepository extends JpaRepository<Parameter, Integer> {

    public List<TransferMoneyDTO> findTransferMoney();

}
