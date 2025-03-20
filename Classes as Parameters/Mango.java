class Mango {
    void enjoyFruit(Fruit fruit) {
        if (fruit == null) {
            System.out.println("No fruit available!");
            return;
        }
        fruit.eat();
    }
}