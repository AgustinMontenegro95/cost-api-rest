package ar.com.dinamicaonline.cost_api.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DepositMoneyDTO {
    @Id
    private Integer id;
    private String name;
    private double depositCommisionPercent;
    private double maxDepositCommisionZero;
    private int maxDepositCount;
    private double minDepositAmount;
    private double maxDepositAmount;
    private double minDepositCommision;

    public DepositMoneyDTO() {
    }
    
    public DepositMoneyDTO(Integer id, String name, double depositCommisionPercent, double maxDepositCommisionZero,
            int maxDepositCount, double minDepositAmount, double maxDepositAmount, double minDepositCommision) {
        this.id = id;
        this.name = name;
        this.depositCommisionPercent = depositCommisionPercent;
        this.maxDepositCommisionZero = maxDepositCommisionZero;
        this.maxDepositCount = maxDepositCount;
        this.minDepositAmount = minDepositAmount;
        this.maxDepositAmount = maxDepositAmount;
        this.minDepositCommision = minDepositCommision;
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
    public double getDepositCommisionPercent() {
        return depositCommisionPercent;
    }
    public void setDepositCommisionPercent(double depositCommisionPercent) {
        this.depositCommisionPercent = depositCommisionPercent;
    }
    public double getMaxDepositCommisionZero() {
        return maxDepositCommisionZero;
    }
    public void setMaxDepositCommisionZero(double maxDepositCommisionZero) {
        this.maxDepositCommisionZero = maxDepositCommisionZero;
    }
    public int getMaxDepositCount() {
        return maxDepositCount;
    }
    public void setMaxDepositCount(int maxDepositCount) {
        this.maxDepositCount = maxDepositCount;
    }
    public double getMinDepositAmount() {
        return minDepositAmount;
    }
    public void setMinDepositAmount(double minDepositAmount) {
        this.minDepositAmount = minDepositAmount;
    }
    public double getMaxDepositAmount() {
        return maxDepositAmount;
    }
    public void setMaxDepositAmount(double maxDepositAmount) {
        this.maxDepositAmount = maxDepositAmount;
    }
    public double getMinDepositCommision() {
        return minDepositCommision;
    }
    public void setMinDepositCommision(double minDepositCommision) {
        this.minDepositCommision = minDepositCommision;
    }

}
