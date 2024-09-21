fun main() {
    val expenseManager = ExpenseManager()

    // Добавление нескольких расходов
    expenseManager.addExpense(100.0, "Еда")
    expenseManager.addExpense(50.0, "Транспорт")
    expenseManager.addExpense(200.0, "Развлечения")
    expenseManager.addExpense(30.0, "Еда")

    // Вывод всех расходов
    expenseManager.printAllExpenses()

    // Вывод суммы всех расходов по категориям
    expenseManager.printTotalExpensesByCategory()
}