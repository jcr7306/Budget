<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>50/30/20 Budgeting App</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 40px; background-color: #f4f4f9; }
        .container { max-width: 600px; margin: auto; background: white; padding: 20px; border-radius: 8px; box-shadow: 0px 0px 10px #ccc; }
        input, button { padding: 10px; margin: 5px 0; width: 100%; box-sizing: border-box; }
        button { background-color: #28a745; color: white; border: none; cursor: pointer; }
        .results { margin-top: 20px; padding: 15px; background: #e9ecef; border-radius: 5px; }
        .success { color: green; font-weight: bold; }
    </style>
</head>
<body>
<div class="container">
    <h2>50/30/20 Budget Calculator</h2>
    <form action="/calculate" method="post">
        <label>Username:</label>
        <input type="text" name="username" required>
        <label>Monthly Income ($):</label>
        <input type="text" name="income" pattern="[0-9,]+(\.[0-9]+)?" title="Enter numbers and commas only" required>
        <button type="submit">Calculate & Save Budget</button>
    </form>
    
    <% if(request.getAttribute("budget") != null) { %>
        <div class="results">
            <h3>Results for ${budget.username}</h3>
            <p><strong>Total Income:</strong> $${budget.formattedIncome}</p>
            <p><strong>50% NEEDS:</strong> $${budget.formattedNeeds}</p>
            <p><strong>30% WANTS:</strong> $${budget.formattedWants}</p>
            <p><strong>20% SAVINGS:</strong> $${budget.formattedSavings}</p>
            <p class="success">${successMessage}</p>
        </div>
    <% } %>
</div>
</body>
</html>
