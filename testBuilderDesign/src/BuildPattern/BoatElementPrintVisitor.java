package BuildPattern;

public class BoatElementPrintVisitor implements BoatElementVisitor {
    public void visit(Boat boat) {
        System.out.println("le bateau "+boat.getName() +" de taille "+boat.getSize());
    }
}
