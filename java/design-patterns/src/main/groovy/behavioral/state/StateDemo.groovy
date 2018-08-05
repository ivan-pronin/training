package behavioral.state

class StateDemo {

    static final int GUMS_COUNT = 50

    static void main(String[] args) {
        StateMachine stateMachine = new StateMachine(GUMS_COUNT)
        stateMachine.pushButton()
        println stateMachine

        (0..GUMS_COUNT).each {
            stateMachine.insertCoin()
            stateMachine.pushButton()
            println stateMachine
        }
    }
}
