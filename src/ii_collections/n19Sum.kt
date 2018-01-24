package ii_collections

import i_introduction._5_String_Templates.getPattern
import v_builders.data.getProducts

fun example6() {
    listOf(1, 3).sum() == 4
    listOf("a", "b", "cc").sumBy { it.length } == 4
}

fun Customer.getTotalOrderPrice(): Double {
    // Return the sum of prices of all products that a customer has ordered.
    // Note: a customer may order the same product for several times.
    return orders.flatMap { it.products }.sumByDouble { it.price }
}
