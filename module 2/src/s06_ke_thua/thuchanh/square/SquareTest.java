package s06_ke_thua.thuchanh.square;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(2.3);

        square=new Square(5.8,"yellow",true);
        System.out.println(square);
    }
}
