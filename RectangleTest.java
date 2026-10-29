class Rectangle {
    private double length = 1.0;
    private double width = 1.0;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            System.out.println("Error: Length must be greater than 0.0 and less than 20.0. Keeping previous value: " + this.length);
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            System.out.println("Error: Width must be greater than 0.0 and less than 20.0. Keeping previous value: " + this.width);
        }
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public double calculateArea() {
        return length * width;
    }
}

public class RectangleTest {
    public static void main(String[] args) {
        System.out.println("--- Rectangle Class Test ---");

        Rectangle myRect = new Rectangle();

        System.out.println("\n[Test 1: Default Values]");
        System.out.println("Length: " + myRect.getLength());
        System.out.println("Width: " + myRect.getWidth());
        System.out.println("Perimeter: " + myRect.calculatePerimeter());
        System.out.println("Area: " + myRect.calculateArea());

        System.out.println("\n[Test 2: Setting Valid Values (Length = 5.5, Width = 4.0)]");
        myRect.setLength(5.5);
        myRect.setWidth(4.0);
        System.out.println("New Length: " + myRect.getLength());
        System.out.println("New Width: " + myRect.getWidth());
        System.out.println("New Perimeter: " + myRect.calculatePerimeter());
        System.out.println("New Area: " + myRect.calculateArea());

        System.out.println("\n[Test 3: Setting Invalid Values]");
        System.out.println("Attempting to set Length to 25.0...");
        myRect.setLength(25.0);
        
        System.out.println("Attempting to set Width to -2.0...");
        myRect.setWidth(-2.0);
        
        System.out.println("\nFinal Dimensions after invalid attempts:");
        System.out.println("Length: " + myRect.getLength());
        System.out.println("Width: " + myRect.getWidth());
    }
}
// Feature branch change for GitHub lab task