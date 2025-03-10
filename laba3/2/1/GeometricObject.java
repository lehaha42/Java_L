public class GeometricObject { //скопировано из лекции
  private String color = "белый";
  private boolean filled;
  private java.util.Date dateCreated;
  private double area, perimeter;

  /** Создает по умолчанию заданный геометрический объект */
  public GeometricObject() {
    dateCreated = new java.util.Date();
  }

  /** Создает геометрический объект с указанным цветом и заливкой */
  public GeometricObject(String color, boolean filled) {
    dateCreated = new java.util.Date();
    this.color = color;
    this.filled = filled;
  }

  /** Возвращает цвет */
  public String getColor() {
    return color;
  }

  /** Присваивает новый цвет */
  public void setColor(String color) {
    this.color = color;
  }

  /** Возвращает заливку. Поскольку filled типа boolean,
   *  getter-метод называется isFilled */
  public boolean isFilled() {
    return filled;
  }

  /** Присваивает новую заливку */
  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  /** Возвращает dateCreated */
  public java.util.Date getDateCreated() {
    return dateCreated;
  }

  /** Возвращает строковое представление этого объекта */
  public String toString() {
    return "создан " + dateCreated + ",\nцвет: " + color + ", заливка: " + filled;
  }
  
  /** Возвращает площадь */
  public double getArea() {
    return area;
  }

  /** Возвращает периметр */
  public double getPerimeter() {
    return perimeter;
  }
}