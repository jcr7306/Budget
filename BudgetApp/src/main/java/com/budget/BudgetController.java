package com.budget;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.math.BigDecimal;

@Controller
public class BudgetController {
    private final BudgetService budgetService;

    public BudgetController(BudgetService budgetService) {
        this.budgetService = budgetService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/calculate")
    public String calculate(@RequestParam String username, @RequestParam String income, Model model) {
        String cleanIncome = income.replace(",", "").trim();
        BigDecimal parsedIncome = new BigDecimal(cleanIncome);
        UserBudget budget = budgetService.processNewBudget(username, parsedIncome);
        model.addAttribute("budget", budget);
        model.addAttribute("successMessage", "Data saved to " + username + "_budget_data.txt");
        return "index";
    }
}
