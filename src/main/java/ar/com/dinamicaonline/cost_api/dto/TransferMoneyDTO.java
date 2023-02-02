package ar.com.dinamicaonline.cost_api.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
 public class TransferMoneyDTO {
    @Id
    private Integer id;
    private String parameterName;
    private String parameterValue;
    
    public TransferMoneyDTO(Integer id, String parameterName, String parameterValue) {
        this.id = id;
        this.parameterName = parameterName;
        this.parameterValue = parameterValue;
    }
    public TransferMoneyDTO() {
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getParameterName() {
        return parameterName;
    }
    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }
    public String getParameterValue() {
        return parameterValue;
    }
    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }

}
