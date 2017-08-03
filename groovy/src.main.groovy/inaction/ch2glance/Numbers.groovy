package inaction.ch2glance

class Numbers {

    static main(args) {
        def x = 1.0
        def y = 2
        assert x + y == 3
        assert x.plus(y) == 3
        println x.class
        assert x instanceof BigDecimal
    }
}
