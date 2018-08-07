package behavioral.state;

import java.io.Serializable;

public interface IState extends Serializable {
     void insertCoin();

     void ejectCoin();

     void pushButton();

     void dispense();
}
