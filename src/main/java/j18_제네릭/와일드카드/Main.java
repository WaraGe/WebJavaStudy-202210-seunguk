package j18_제네릭.와일드카드;

public class Main {
//    ? extends Animal은 Animal을 상속받지 않으면 사용할 수 없게 함
//
    public AnimalData<? extends Animal> getAnimal(int flag) {
        if(flag == 1) {
            AnimalData<Human> animalData = new AnimalData<Human>(new Human());
            return animalData;
        }else if(flag == 2) {
            AnimalData<Tiger> animalData = new AnimalData<Tiger>(new Tiger());
            return animalData;
//        }else if (flag == 3) {
//            AnimalData<Car> animalData = new AnimalData<Car>(new Car("K7"));
//            return animalData;
        }else {
            return null;
        }
    }


    public static void main(String[] args) {
        Main main = new Main();

        main.getAnimal(1).printData();
        main.getAnimal(2).printData();

        System.out.println(main.getAnimal(1));
        System.out.println(main.getAnimal(2));


//        AnimalData<Human> animalData1 = new AnimalData<Human>(new Human());
//        animalData1.printData();
//
//        AnimalData<Tiger> animalData2 = new AnimalData<Tiger>(new Tiger());
//        animalData2.printData();
    }
}
