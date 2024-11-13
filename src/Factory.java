public class Factory {
    //made a varbiable of type string
    //made variable of type int ank whole numbers = boolean
    String nameOFfactory;
    int yearfactoryfounded;
    boolean inUse;

    //made a var of type boolean aka true/false
    public static void main(String[] args) {
        //bc factory is a constructer we need new in front of factory when we call the method
        new Factory();
    }
    public Factory() {
        System.out.println("" +
                "");
        nameOFfactory = "Pumpkin Factory!";
        yearfactoryfounded = 1923;
        System.out.println("Welcome to the" + " " + nameOFfactory + "  " + "est." + yearfactoryfounded);


        System.out.println("");
        System.out.println("We have five pumpkins left: Spookly, Boo, Ghost, Casper, and Jinx");


        Pumpkin spookly = new Pumpkin("oval", "pink", false, 15);
        System.out.println("" + "");
        System.out.println("SPOOKLY THE PUMPKIN");

        spookly.printInfo();

        System.out.println("" +
                "");
        System.out.println("BOO THE PUMPKIN");
        Pumpkin boo = new Pumpkin("circular", "orange", true, 12);
        boo.printInfo();

        System.out.println("" +
                "");
        System.out.println("GHOST THE PUMPKIN");
        Pumpkin ghost = new Pumpkin("square", "blue", false, 21);
        ghost.printInfo();

        System.out.println("" +
                "");
        System.out.println("CASPER THE PUMPKIN");
        Pumpkin casper = new Pumpkin();
        casper.printInfo();


//        for (int y =0; y < 2; y = y + 1) {
//            for (int x = 0; x < 10; x = x + 1) {
        //        if (jinx.size>50){
//            jinx.isSeasonal=true;
        //}
        System.out.println("" +
                "");
        System.out.println("JINX THE PUMPKIN");
        Pumpkin jinx = new Pumpkin("oval", "orange", true, 10);
        jinx.printInfo();

        System.out.println("" +
                "");
        System.out.println("We now sell carving kits too!");
        System.out.println("" +
                "");

        System.out.println("SMALL CARVING KIT");
        Carving_Kits smallcarvingkit = new Carving_Kits();
        smallcarvingkit.printInfotwo();

        System.out.println("" +
                "");
        System.out.println("LARGE CARVING KIT");
        Carving_Kits largecarvingkit = new Carving_Kits();
        largecarvingkit.printInfotwo();




//
//            }
//        }


//        System.out.println(spookly.color);
//        System.out.println(spookly.shape);
//        System.out.println(spookly.size);
//        System.out.println(spookly.isSeasonal);


//       boolean inUse=false;
//       if(inUse){
//            System.out.println("Pumpkin Factory! Founded in 1923");
//        }
//        else {
//            System.out.println("Pumkin factory shut down. 1923-2024");
        }



}




