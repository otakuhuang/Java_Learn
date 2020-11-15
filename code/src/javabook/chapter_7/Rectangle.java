package chapter_7;

public class Rectangle {


    private Long width;
    private Long height;

    public Rectangle(Long width, Long height) {
        this.width = width;
        this.height = height;
    }

    public Long getWidth() {
        return width;
    }

    public void setWidth(Long width) {
        this.width = width;
    }

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public long area() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2L, 3L);
        System.out.println(rectangle.area());
    }
}
