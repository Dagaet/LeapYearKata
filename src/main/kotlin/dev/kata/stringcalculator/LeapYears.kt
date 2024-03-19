package dev.kata.stringcalculator

class LeapYears {
    private fun isDivisibleBy400(year: Int) = year % 400 == 0
    private fun isNotDivisibleBy100(year: Int) = year % 100 != 0
    private fun isDivisibleBy4(year: Int) = year % 4 == 0

    fun isLeapYear(year: Int): Boolean
    {
        if (isDivisibleBy4(year) && isNotDivisibleBy100(year)){
            return true
        }
        return isDivisibleBy400(year)
    }
}
