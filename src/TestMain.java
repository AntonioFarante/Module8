public class TestMain {
    public static void main(String[] args) {
        MoveService moveService = new MoveService();
        Movable movableCircle = new Circle();
        Quad quad = new Quad();

        quad.setName("Quad");
        System.out.println(quad.getName());
        moveService.moveShape(movableCircle);

    }
}
