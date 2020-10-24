# Bridge Design Pattern (Java)

**Bridge** connect two independent hierarchies, build a simple flexible hierarchy.
![](https://github.com/shamy1st/design-pattern-bridge/blob/main/bridge-uml.png)
### Problem: 
You have **RemoteControl** abstract class and **AdvancedRemoteControl** abstract class and you want to support any TV brand like (Sony, Samsung, ...).

The issue for any new brand like Samsung you need to create 2 classes **SamsungRemoteControl**, **SamsungAdvancedRemoteControl**, also some functions are redundant code.

    public abstract class RemoteControl {
        public abstract void turnOn();
        public abstract void turnOff();
    }

    public abstract class AdvancedRemoteControl extends RemoteControl {
        public abstract void setChannel(int number);
    }

    public class SonyRemoteControl extends RemoteControl {
        @Override
        public void turnOn() {
            System.out.println("Sony: turnOn");
        }

        @Override
        public void turnOff() {
            System.out.println("Sony: turnOff");
        }
    }

    public class SonyAdvancedRemoteControl extends AdvancedRemoteControl {
        @Override
        public void setChannel(int number) {
            System.out.println("Sony: setChannel "+number);
        }

        @Override
        public void turnOn() {
            System.out.println("Sony: turnOn");
        }

        @Override
        public void turnOff() {
            System.out.println("Sony: turnOff");
        }
    }
### Solution:
![](https://github.com/shamy1st/design-pattern-bridge/blob/main/bridge-solution-uml.png)
