package com.budget;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;

@Service
public class BudgetService {
    public UserBudget processNewBudget(String username, BigDecimal income) {
        UserBudget newBudget = new UserBudget(username, income);
        DataStorageManager.saveUserData(newBudget);
        return newBudget;
    }
}
