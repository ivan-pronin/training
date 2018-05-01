package creational.abstractFactory

class OSXFactory implements IGUIFactory {

    @Override
    public IButton createButton() {
        return new OSXButton();
    }
}
