abstract class Shape {
    //final поле - не може бути змінене писля ініціалізації
    protected final String name;

    //лічильник для всіх фігур
    private static int count = 0;

    //конструктор базового класу
    protected Shape(String name){
        this.name = name;
        count++; //інкремент при створенні будь якої фігури
    }

    //абстрактні методи зумушують нащадків їх реализовувати
    public abstract double area();

    public abstract double perimeter();

    public String getName(){
        return name;
    }

    //static метод доступу до лічильника
    public static int getCount(){
        return count;
    }
}
