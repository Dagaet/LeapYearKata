package dev.kata.stringcalculator

class LeapYears {
    fun isLeapYear(year: Int): Boolean
    {
        if (year % 4 == 0 && year % 100 != 0){
            return true
        }
        if (year % 400 == 0 && year % 100 != 0){
            return false
        }
        return year % 400 == 0
    }
}
