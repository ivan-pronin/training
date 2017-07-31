package tutorial

class MapsRangeOperations {
    static void main(String[] args) {
        // List of objects with keys versus indexes

        def paulMap = [
            'name' : 'Paul',
            'age' : 35,
            'address' : '123 Main St',
            'list' : [1, 2, 3]];

        // Access with key
        println("Name " + paulMap['name']);
        println("Age " + paulMap.get('age'));
        println("List Item " + paulMap['list'][1]);

        // Add key value
        paulMap.put('city', 'Pittsburgh');

        // Check for key
        println("Has City " + paulMap.containsKey('city'));

        // Size
        println("Size " + paulMap.size());

        // ---------- RANGE ----------
        // Ranges represent a range of values in shorthand notation

        def oneTo10 = 1..10;
        def aToZ = 'a'..'z';
        def zToA = 'z'..'a';

        println(oneTo10);
        println(aToZ);
        println(zToA);

        // Get size
        println("Size " + oneTo10.size());

        // get index
        println("2nd Item " + oneTo10.get(1));

        // Check if range contains
        println("Contains 11 " + oneTo10.contains(11));

        // Get last item
        println("Get Last " + oneTo10.getTo());

        println("Get First " + oneTo10.getFrom());
    }
}
