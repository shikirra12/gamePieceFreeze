public class Main {
    public static void main(String[] args){

        GamePiece kirraGamePiece = new GamePiece("kirra", "yellow");



//        Test that we can move the kirraGamePiece
        System.out.println("Before Moving X: " + kirraGamePiece.getPositionX() + ", Y: " + kirraGamePiece.getPositionY());
        kirraGamePiece.move(5,8);
        if(kirraGamePiece.getPositionX() == 5 && kirraGamePiece.getPositionY() == 8){
            System.out.println("Successful: The gamepiece was moved to " + kirraGamePiece.getPositionX() + ", " + kirraGamePiece.getPositionY() + ".");
        } else {
            System.out.println("Failure: The gamepiece was NOT moved.");
        }

//        Test that we can unfreeze/freeze kirraGamePiece
        System.out.println("Before freeze: " + kirraGamePiece.isFrozen());
        kirraGamePiece.freeze();
        if (kirraGamePiece.isFrozen() != true){
            System.out.println("Failure: The gamepiece is Not frozen.");
        } else {
            System.out.println("Success: The gamepiece is frozen.");
        }


//        Test that game is frozen
        kirraGamePiece.move(7,1);
        if (kirraGamePiece.isFrozen() != true){
            System.out.println("Failure: The gamepiece is Not frozen.");
        } else{
            System.out.println("Success: It's still frozen.");
        }

//        Test that gamePiece has a name
        if (kirraGamePiece.getName() != null){
            System.out.println("Success: Your gamepiece has a name.");
        } else {
            System.out.println("Failure: Your gamepiece is nameless.");
        }

//        Test that gamePiece has a color
        if( kirraGamePiece.getColor() != null){
            System.out.println("Sucess: The default color is NOT null");
        } else {
            System.out.println("Failure: The default color is null");
        }

        // Test that we can change the color to something else
        kirraGamePiece.setColor("Orange");
        if( kirraGamePiece.getColor() == "Orange"){
            System.out.println("Sucess: The color can be set properly");
        } else {
            System.out.println("Failure: The color is not black");
        }
    }
}
