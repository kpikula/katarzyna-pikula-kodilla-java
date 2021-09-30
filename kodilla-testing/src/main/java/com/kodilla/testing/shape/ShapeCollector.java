package com.kodilla.testing.shape;

import com.kodilla.testing.forum.ForumPost;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeCollector {
    private Shape shape;
    private List<Shape> shapeList;

    public ShapeCollector() {
        shapeList = new ArrayList<>();
    }

    public void processGetName() {
        shape.getShapeName();
    }

    public void addFigure(Shape shape) {
        shapeList.add(this.shape);
    }

    public void removeFigure(Shape shape) {
        shapeList.remove(this.shape);
    }

    public void getFigure(int n) {
        shapeList.get(n);

    }


    public void showFigure () {
        System.out.println(shapeList);
        String str = "";
        for (Shape shapee : shapeList) {
            str+= shapee+",";
        }
        System.out.println("GGGGGG" + str);

    }

    public int shapeListSize () {
        return shapeList.size();
        }

        @Override
        public boolean equals (Object o){
            if (this == o) return true;
            if (!(o instanceof ShapeCollector)) return false;
            ShapeCollector that = (ShapeCollector) o;
            return shape.equals(that.shape) && shapeList.equals(that.shapeList);
        }

        @Override
        public int hashCode () {
            return shape.hashCode();
        }
    }







