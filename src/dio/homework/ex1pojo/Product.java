package dio.homework.ex1pojo;


public class Product {
    private final String name;
    private final double price;
    private final int height;
    private final int length;
    private final int width;
    private final int weight;
    private final Category category;

    public Product(String name, double price, int height, int length, int width, int weight, Category category) {
        this.name = name;
        this.price = price;
        this.height = height;
        this.length = length;
        this.width = width;
        this.weight = weight;
        this.category = category;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getHeight() {
        return this.height;
    }

    public int getLength() {
        return this.length;
    }

    public int getWidth() {
        return this.width;
    }

    public int getWeight() {
        return this.weight;
    }

    public Category getCategory() {
        return this.category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (height != product.height) return false;
        if (length != product.length) return false;
        if (Double.compare(product.price, price) != 0) return false;
        if (weight != product.weight) return false;
        if (width != product.width) return false;
        if (category != product.category) return false;
        if (!name.equals(product.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + height;
        result = 31 * result + length;
        result = 31 * result + width;
        result = 31 * result + weight;
        result = 31 * result + category.hashCode();
        return result;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append(", height=").append(height);
        sb.append(", length=").append(length);
        sb.append(", width=").append(width);
        sb.append(", weight=").append(weight);
        sb.append(", category=").append(category);
        sb.append('}');
        return sb.toString();
    }
}
