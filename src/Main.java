public class Main {
    public static void main(String[] args){
        GamePiece kirraGamePiece = new GamePiece("kirra", "yellow");

        kirraGamePiece.move(6,1);
        System.out.println(kirraGamePiece);
        kirraGamePiece.freeze();
        kirraGamePiece.unfreeze();
    }
}
