/*
interface bicycle {
    void speedUp(int increment);

    void applyBrakes(int decrement);
}
interface horn_of_bicycle{
    void blowHorn();
}

class avon_cycles implements bicycle , horn_of_bicycle{
    int speed = 10;// Properties can also be added in Interfaces and are non appendable

    @Override
    public void speedUp(int increment) {// it is necessary to make this method public - reason is in default method
                                        // explanation.....baad me mil jaega explanation
        // TODO Auto-generated method stub
        speed = speed + increment;
        System.out.println(speed);
    }

    @Override
    public void applyBrakes(int decrement) {// it is necessary to make this method public - reason is in default method
                                            // explanation.....baad me mil jaega explanation
        // TODO Auto-generated method stub
        speed = speed - decrement;
        System.out.println(speed);
    }

    @Override
    public void blowHorn() {
        // TODO Auto-generated method stub
        System.out.println("Trin Trin Trin Trin");
    }

}
*/

interface camera {
    void clickPhoto();

    void recordVideo();
}

interface mediaPlayer {
    void play();

    void pause();
}

interface gps {
    void location();
}

interface wifi {
    String[] getNetworks();

    void connect(String RealmeGTmasterEdition);
}

class dabbaPhone implements camera, mediaPlayer, gps, wifi {

    @Override
    public void location() {
        // TODO Auto-generated method stub
        System.out.println("Location - Bhopal, Madhya Pradesh");
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        System.out.println("Playing - Despacito");
    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub
        System.out.println("Paused - Despacito");
    }

    @Override
    public void clickPhoto() {
        // TODO Auto-generated method stub
        System.out.println("See your photo in gallery");
    }

    @Override
    public void recordVideo() {
        // TODO Auto-generated method stub
        System.out.println("See your video in gallery");
    }

    @Override
    public String[] getNetworks() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void connect(String network) {
        // TODO Auto-generated method stub
        System.out.println("Your pc is connected to :- " + network);
    }

}

public class page18_Interfaces_in_JAVA {
    public static void main(String[] args) {
        /*
         * avon_cycles acs = new avon_cycles();// object creation is allowed in
         * Interfaces
         * acs.speedUp(5);
         * acs.applyBrakes(10);
         * acs.blowHorn();
         * 
         * /*
         * // properties cant be appended in any Interface but VSCODE holds this
         * function
         * // and can append also like the next example ->
         * acs.speed = 50;
         * System.out.println(acs.speed);
         *
         */

        dabbaPhone dabba = new dabbaPhone();
        dabba.clickPhoto();
        dabba.play();
        dabba.location();
        dabba.connect("RealmeGTmasterEdition");
        ;
    }
}
