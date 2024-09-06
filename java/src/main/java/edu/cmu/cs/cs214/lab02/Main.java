package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);  // 使用 Shape 接口
        
        Renderer renderer = new Renderer(rectangle);
        
        renderer.draw();
    }
}

