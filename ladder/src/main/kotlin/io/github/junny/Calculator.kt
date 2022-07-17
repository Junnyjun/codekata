package io.github.junny

class Calculators(private val expression : String) {
    fun compute(): Long {
        return reduceResult(expression)
    }

    private fun reduceResult(expression: String): Long {
        return when(expression.length >= 3){
            true ->  {

                val result = Operators.findOperator(expression[1])
                    .let { it -> it.func(charToLong(expression[0]), charToLong(expression[2])) }
                reduceResult(converter(expression,result))
            }
            false -> expression.toLong()
        }
    }

    private fun converter(expression: String, result: Long): String {
        return result.toString().plus(expression.substring(3))
    }
    private fun charToLong(char: Char): Long {
        return char.code.toLong().minus(48);
    }
}
