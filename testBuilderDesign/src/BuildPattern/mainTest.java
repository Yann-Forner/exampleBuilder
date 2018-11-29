package BuildPattern;

public class mainTest {
    public static void main(String[] args) {
        Boat.BoatBuilder test= new Boat.BoatBuilder();
        Boat boat = test.withSize(15).build();
        boat =test.withName("lol").build();

        BoatElementVisitor printVisitor = new BoatElementPrintVisitor();
        BoatElementVisitor doVisitor = new BoatElementDoVisitor();

        printVisitor.visit(boat);
        doVisitor.visit(boat);
    }
}
