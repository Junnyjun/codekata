package io.github.junny

import java.util.function.BiFunction


enum class Operator(
    val operate: String,
    val result: BiFunction<Long,Long,Long>,
) {
    PLUS("+", BiFunction {s1 , s2 -> s1.plus(s2)}),
    MINUS("-", BiFunction {s1 , s2 -> s1.minus(s2)}),
    DIVIDE("/", BiFunction {s1 , s2 -> s1.div(s2)}),
    MULTIPLY("/", BiFunction {s1 , s2 -> s1.times(s2)});
}
