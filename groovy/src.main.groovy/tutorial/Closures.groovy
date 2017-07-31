package tutorial

class Closures {
    static void main(String[] args) {

        def getFactorial = {num -> (num <= 1 ? 1 : num * call(num - 1))}
        println(getFactorial(4))

        def greeting = "Goodbye"
        def sayGoodbye = {theName -> println("$greeting $theName")}
        sayGoodbye("Ivan")

        def numList = [1..5]
        numList.each {println(it)}

        def employees = ['Paul' : 34, 'Sally' : 45, 'John' : 18]
        employees.each {println("$it.key : $it.value")}

        // Print only evens
        def randNums = [1, 2, 3, 4, 5, 6];
        randNums.each {num -> if(num % 2 == 0) println(num);}

        // find returns a match
        def nameList = ['Doug', 'Sally', 'Sue'];
        def matchEle = nameList.find {item -> item == 'Sue'}
        println(matchEle);

        // findAll finds all matches
        def randNumList = [1, 2, 3, 4, 5, 6];
        def numMatches = randNumList.findAll {item -> item > 4}
        println(numMatches);

        // any checks if any item matches
        println("> 5 : " + randNumList.any {item -> item > 5});

        // every checks that all items match
        println("> 1 : " + randNumList.every {item -> item > 1});

        // collect performs operations on every item
        println("Double : " + randNumList.collect { item -> item * 2});

        // pass closure to a method
        def getEven = {num -> return(num % 2 == 0)}
        def evenNums = listEdit(randNumList, getEven);
        println("Evens : " + evenNums);
    }
    
    
    static def listEdit(list, clo){
      return list.findAll(clo);
    }
}
