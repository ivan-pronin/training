package structural.proxy.dynamic

class DynamicProxyDemo {

    static void main(String[] args) {
        PersonBean owner = createPerson("Joe", "male", "football")
        PersonBean ownerProxy = DynamicProxyFactory.getOwnerProxy(owner)
        println "Name is: ${ownerProxy.getName()}"
        ownerProxy.setInterests("hicker")
        try {
            ownerProxy.setHotOrNotRating(10)
        } catch (Exception e) {
            println 'Cant set rating from owner proxy'
        }
        PersonBean nonWwnerProxy = DynamicProxyFactory.getNonOwnerProxy(owner)
        try {
            println "Name is: ${nonWwnerProxy.getName()}"
            nonWwnerProxy.setGender("ssss")
        } catch (Exception e) {
            println 'Cant set gender from NONowner proxy'
        }
        nonWwnerProxy.setHotOrNotRating(5)
        println "Rating: ${nonWwnerProxy.getHotOrNotRating()}"
    }

    static PersonBean createPerson(String name, String gender, String interests) {
        return new PersonBeanImpl(name: name, gender: gender, interests: interests)
    }
}
