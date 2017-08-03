package inaction.ch2glance

class Closures {

    static main(args) {
        [1, 2, 3].each { entry -> println entry }

        countGlassClinks(5)
    }

    private static countGlassClinks(int partyPeople) {
        def totalClinks = 0
        1.upto(partyPeople) { guestNumber ->
            totalClinks += guestNumber-1
        }
        println "Total is $totalClinks clinks per $partyPeople guests"
        assert totalClinks == (partyPeople * (partyPeople-1)) / 2
    }
}
