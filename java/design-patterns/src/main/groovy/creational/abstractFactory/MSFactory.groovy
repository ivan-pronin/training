package creational.abstractFactory

class MSFactory implements IGUIFactory {

    @Override
    public IButton createButton() {
        return new MSButton();
    }
}
