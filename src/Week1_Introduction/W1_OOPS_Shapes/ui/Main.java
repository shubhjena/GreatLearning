package Week1_Introduction.W1_OOPS_Shapes.ui;

import Week1_Introduction.W1_OOPS_Shapes.beans.Circle;
import Week1_Introduction.W1_OOPS_Shapes.beans.Rectangle;
import Week1_Introduction.W1_OOPS_Shapes.beans.Square;
import Week1_Introduction.W1_OOPS_Shapes.dao.CircleDao;
import Week1_Introduction.W1_OOPS_Shapes.dao.RectangleDao;
import Week1_Introduction.W1_OOPS_Shapes.dao.SquareDao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Mensuration Assistant----");
        System.out.println("""
                               Please select a Shape from the Menu:
                               Rectangle ---> 1
                               Square    ---> 2
                               Circle    ---> 3
                               Exit      ---> 9""");

        switch (sc.nextInt()) {
            case 1:
                Rectangle rec = new Rectangle();
                RectangleDao.setDimensions(rec);
                RectangleDao.getDetails(rec);
                break;
            case 2:
                Square sq = new Square();
                SquareDao.setDimensions(sq);
                SquareDao.getDetails(sq);
                break;
            case 3:
                Circle cir = new Circle();
                CircleDao.setDimensions(cir);
                CircleDao.getDetails(cir);
                break;
            case 9: break;
        }
        System.out.println("\nThank you for using mensuration assistant.");
    }
}
