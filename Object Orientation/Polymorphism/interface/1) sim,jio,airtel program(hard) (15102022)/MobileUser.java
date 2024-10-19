interface Sim {
    public abstract void voiceCall();
    public abstract void textMessage();
}

class Airtel implements Sim {
    public void voiceCall() {
        System.out.println("voice call through airtel");
    }
    public void textMessage() {
        System.out.println("text message through airtel");
    }
}

class Jio implements Sim {
    public void voiceCall() {
        System.out.println("voice call through jio");
    }
    public void textMessage() {
        System.out.println("text message through jio");
    }
}

class Vodafone implements Sim {
    public void voiceCall() {
        System.out.println("voice call through vodafone");
    }
    public void textMessage() {
        System.out.println("text message through vodafone");
    }
}

class Mobile {
    Mobile(Sim s) {
        s.voiceCall();
        s.textMessage();
    }
}

class MobileUser {
    public static void main (String args[]){
        Mobile obj1 = new Mobile(new Airtel());
        Mobile obj2 = new Mobile(new Jio());
        Mobile obj3 = new Mobile(new Vodafone());
    }
}