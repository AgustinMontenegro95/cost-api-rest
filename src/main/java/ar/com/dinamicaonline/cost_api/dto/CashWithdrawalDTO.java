package ar.com.dinamicaonline.cost_api.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CashWithdrawalDTO {
    @Id
    private Integer id;
    private String name;
    private double minExtractionAmount;
    private double minExtractionCommision;
    private double extractionCommisionPercent;
    private double maxExtractionAmount;
    private double maxExtractionCommisionZero;
    private int maxExtractionCount;
    
    public CashWithdrawalDTO(Integer id, String name, double minExtractionAmount, double minExtractionCommision,
            double extractionCommisionPercent, double maxExtractionAmount, double maxExtractionCommisionZero,
            int maxExtractionCount) {
        this.id = id;
        this.name = name;
        this.minExtractionAmount = minExtractionAmount;
        this.minExtractionCommision = minExtractionCommision;
        this.extractionCommisionPercent = extractionCommisionPercent;
        this.maxExtractionAmount = maxExtractionAmount;
        this.maxExtractionCommisionZero = maxExtractionCommisionZero;
        this.maxExtractionCount = maxExtractionCount;
    }

    public CashWithdrawalDTO() {
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getMinExtractionAmount() {
        return minExtractionAmount;
    }
    public void setMinExtractionAmount(double minExtractionAmount) {
        this.minExtractionAmount = minExtractionAmount;
    }
    public double getMinExtractionCommision() {
        return minExtractionCommision;
    }
    public void setMinExtractionCommision(double minExtractionCommision) {
        this.minExtractionCommision = minExtractionCommision;
    }
    public double getExtractionCommisionPercent() {
        return extractionCommisionPercent;
    }
    public void setExtractionCommisionPercent(double extractionCommisionPercent) {
        this.extractionCommisionPercent = extractionCommisionPercent;
    }
    public double getMaxExtractionAmount() {
        return maxExtractionAmount;
    }
    public void setMaxExtractionAmount(double maxExtractionAmount) {
        this.maxExtractionAmount = maxExtractionAmount;
    }
    public double getMaxExtractionCommisionZero() {
        return maxExtractionCommisionZero;
    }
    public void setMaxExtractionCommisionZero(double maxExtractionCommisionZero) {
        this.maxExtractionCommisionZero = maxExtractionCommisionZero;
    }
    public int getMaxExtractionCount() {
        return maxExtractionCount;
    }
    public void setMaxExtractionCount(int maxExtractionCount) {
        this.maxExtractionCount = maxExtractionCount;
    }
    
}
