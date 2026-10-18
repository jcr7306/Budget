package com.budget;
import java.math.BigDecimal;

public class UserBudget implements BudgetCalculator {
    private String username;
    private BigDecimal monthlyIncome;

    public UserBudget(String username, BigDecimal monthlyIncome) {
        this.username = username;
        this.monthlyIncome = monthlyIncome;
    }

    public String getUsername() { return username; }
    public BigDecimal getMonthlyIncome() { return monthlyIncome; }

    @Override
    public BigDecimal getNeedsAllocation() { return monthlyIncome.multiply(new BigDecimal("0.50")); }

    @Override
    public BigDecimal getWantsAllocation() { return monthlyIncome.multiply(new BigDecimal("0.30")); }

    @Override
    public BigDecimal getSavingsAllocation() { return monthlyIncome.multiply(new BigDecimal("0.20")); }

    public String getFormattedIncome() { return String.format("%,.2f", monthlyIncome); }
    public String getFormattedNeeds() { return String.format("%,.2f", getNeedsAllocation()); }
    public String getFormattedWants() { return String.format("%,.2f", getWantsAllocation()); }
    public String getFormattedSavings() { return String.format("%,.2f", getSavingsAllocation()); }
}
