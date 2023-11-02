package LSP;

public class ElectronicDuck extends Duck {
	
	private boolean _on = false;

    @Override
    public void quack() {
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            System.out.println("Electronic duck is turned off, can't quack");
        }
    }

    @Override
    public void swim() {
        if (_on) {
            System.out.println("Electronic duck swim");
        } else {
            System.out.println("Electronic duck is turned off, can't swim");
        }
    }

    public void turnOn() {
        _on = true;
    }

    public void turnOff() {
        _on = false;
    }

}
