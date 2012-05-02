
package org.koushik.javabrains.model;

public class Circle {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Circle(int circleId, String circleName){
        setId(circleId);
        setName(circleName);
    }
}
