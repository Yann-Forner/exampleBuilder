package BuildPattern;

public class BoatElementDoVisitor implements BoatElementVisitor {
    public void visit(Boat boat) {
        System.out.println("le bateau "+boat.getName()+" sors du port");
    }
}
