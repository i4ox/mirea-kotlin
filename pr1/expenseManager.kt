import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class ExpenseManager {
    private val expenses = mutableListOf<Expense>()

    fun addExpense(amount: Double, category: String) {
        val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
        val date = dateFormat.format(Date())
        val expense = Expense(amount, category, date)
        expenses.add(expense)
    }

    fun printAllExpenses() {
        if (expenses.isEmpty()) {
            println("Список расходов пуст.")
        } else {
            println("Список всех расходов:")
            for (expense in expenses) {
                expense.printExpense()
            }
        }
    }

    private fun getTotalExpensesByCategory(): Map<String, Double> {
        val categoryTotals = mutableMapOf<String, Double>()
        for (expense in expenses) {
            val total = categoryTotals.getOrDefault(expense.category, 0.0)
            categoryTotals[expense.category] = total + expense.amount
        }
        return categoryTotals
    }

    fun printTotalExpensesByCategory() {
        val categoryTotals = getTotalExpensesByCategory()
        if (categoryTotals.isEmpty()) {
            println("Нет расходов для подсчета.")
        } else {
            println("Сумма расходов по категориям:")
            for ((category, total) in categoryTotals) {
                println("$category: $total")
            }
        }
    }
}