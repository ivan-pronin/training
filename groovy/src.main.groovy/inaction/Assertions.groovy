package inaction

class Assertions
{

    static void main(String[] args) {
        
        assert (true)
        def x = 2
        assert x == 1
        assert 1 == 1
        def y = 2; assert (y==2)
        
        def a = 3
        def b = 10
        assert b == a + a
        
        assert ('text' * 3 << 'hello').size() == 4 * 568
    }
}
