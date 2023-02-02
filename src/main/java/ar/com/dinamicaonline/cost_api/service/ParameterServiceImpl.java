package ar.com.dinamicaonline.cost_api.service;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ar.com.dinamicaonline.cost_api.dto.TransferMoneyDTO;
import ar.com.dinamicaonline.cost_api.repositories.ParameterRepository;

@Service
public class ParameterServiceImpl implements ParameterService {

    @Autowired
    private ParameterRepository parameterRepository;

    @Override
    public ResponseEntity<?> getTransferMoney() {
        Map<String, Object> responseBody = new HashMap<>();
        List<TransferMoneyDTO> parameters = parameterRepository.findTransferMoney();
        for (TransferMoneyDTO parameter : parameters) {
            responseBody.put(parameter.getParameterName(), parameter.getParameterValue());
        }
        return new ResponseEntity<>(responseBody,  HttpStatus.OK);
    }

}
