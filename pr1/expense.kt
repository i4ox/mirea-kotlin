class Expense(val amount: Double, val category: String, val date: String) {
    fun printExpense() {
        println("Расход: $amount | Категория: $category | Дата: $date")
    }
}