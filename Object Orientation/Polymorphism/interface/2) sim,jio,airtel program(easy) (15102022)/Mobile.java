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
    public static void main (String args[]){
        Sim s1 = new Airtel();
        s1.voiceCall();
        s1.textMessage();

        Sim s2 = new Jio();
        s2.voiceCall();
        s2.textMessage();

        Sim s3 = new Vodafone();
        s3.voiceCall();
        s3.textMessage();
    }
}