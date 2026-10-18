package com.budget;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class DataStorageManager {
    public static boolean saveUserData(UserBudget budget) {
        try {
            File file = new File(budget.getUsername() + "_budget_data.txt");
            FileWriter writer = new FileWriter(file, true);
            writer.write("User: " + budget.getUsername() + "\n");
            writer.write("Income: $" + budget.getFormattedIncome() + "\n");
            writer.write(ExpenseCategory.NEEDS + ": $" + budget.getFormattedNeeds() + "\n");
            writer.write(ExpenseCategory.WANTS + ": $" + budget.getFormattedWants() + "\n");
            writer.write(ExpenseCategory.SAVINGS + ": $" + budget.getFormattedSavings() + "\n\n");
            writer.close();
            return true;
        } catch (IOException e) {
            System.out.println("Error saving user data: " + e.getMessage());
            return false;
        }
    }
}
