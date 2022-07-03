package io.github.junny
enum class Operators(
    val operate: Char,
    val func : (s1 :Long, s2 : Long) -> Long
) {
    PLUS('+', {s1 , s2 -> s1.plus(s2)}),
    MINUS('-',  {s1 , s2 -> s1.minus(s2)}),
    DIVIDE('/',  {s1 , s2 -> s1.div(s2)}),
    MULTIPLY('*',  {s1 , s2 -> s1.times(s2)});

    companion object {
        fun findOperator(arg: Char): Operators {
            return values()
                .find { element -> element.operate == arg }
                ?: error("String 값 잘못 줌")
        }
    }

}
