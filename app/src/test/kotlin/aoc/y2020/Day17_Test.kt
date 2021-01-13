package aoc.y2020

import org.junit.Test
import kotlin.test.assertEquals

class Day17Test {

    val input = """
        .#.
        ..#
        ###
    """.trimIndent()
    @Test
    fun ex1() {
        val solver = Day172020(input)
        assertEquals(112, solver.partOne())
    }
}
