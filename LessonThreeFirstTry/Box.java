package ru.geekbrains.JavaCoreLesson3;

public class Box<T extends Fruit> {
private T[] fruit;

public Box(){};

public Box(T[] fruit) {
    this.fruit = fruit;
}

    public float getWeight() {
        float weight = 0;
        for (T fruits: fruit) {
            weight = weight + fruits.getWeight();
        }
        return weight;
    }

        public boolean compare(Box<?> another) {
            return Math.abs(this.getWeight() - another.getWeight()) < 0.0001;

        }


// Еще один способ подсчета, который я сначала сделала, но с ним сравнение не получалось)
// public float getWeightOfBox(float weight, int quantity) {
//    float weightOfBox = weight * quantity;
//    System.out.println("Вес коробки составляет: " + weightOfBox);
//    return weightOfBox;

}


