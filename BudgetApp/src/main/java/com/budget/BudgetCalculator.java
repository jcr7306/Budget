package com.budget;
import java.math.BigDecimal;

public interface BudgetCalculator {
    BigDecimal getNeedsAllocation();
    BigDecimal getWantsAllocation();
    BigDecimal getSavingsAllocation();
}
