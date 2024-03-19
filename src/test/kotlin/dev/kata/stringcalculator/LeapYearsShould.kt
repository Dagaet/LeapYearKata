package dev.kata.stringcalculator

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

internal class LeapYearsShould {
    // todos los divisibles por 400 son bisiestos
    // los años divisibles por 100 pero no por 400 no son bisiestos
    // los años divisibles por 4 pero no por 100 son años bisiestos
    // los años no divisibles por 4 no son años bisiestos
    @Test
    fun `Be leap year if is divisible by 400`() {
        val isLeapYears = LeapYears().isLeapYear(2000)
        assertThat(isLeapYears).isEqualTo(true)
    }

    @Test
    fun `Not be leap year if divisible by 100 but not 400`(){
        val isLeapYears = LeapYears().isLeapYear(2100)
        assertThat(isLeapYears).isEqualTo(false)
    }

    @Test
    fun `Be leap year if divisible by 4 but not 100`(){
        val isLeapYears = LeapYears().isLeapYear(2008)
        assertThat(isLeapYears).isEqualTo(true)
    }

}
