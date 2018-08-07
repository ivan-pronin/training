package structural.proxy.dynamic

class PersonBeanImpl implements PersonBean {

    String name
    String gender
    String interests
    int rating
    int ratingCount

    @Override
    String getName() {
        return name
    }

    @Override
    void setName(String name) {
        this.name = name
    }

    @Override
    String getGender() {
        return gender
    }

    @Override
    void setGender(String gender) {
        this.gender = gender
    }

    @Override
    String getInterests() {
        return interests
    }

    @Override
    void setInterests(String interests) {
        this.interests = interests
    }

    @Override
    int getHotOrNotRating() {
        return rating == 0 ? 0 : rating / ratingCount
    }

    @Override
    void setHotOrNotRating(int rating) {
        this.rating += rating
        ratingCount++
    }
}
