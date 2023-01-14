package Visitor;

import Shapes.Circle;
import Shapes.CompoundShape;
import Shapes.Dot;
import Shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}