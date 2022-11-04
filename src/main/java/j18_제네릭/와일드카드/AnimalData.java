package j18_제네릭.와일드카드;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class AnimalData<T> {
    private T animal;

    public void printData() {
        ((Animal) animal).move();
        
        if(animal.getClass() == Human.class) {
            ((Human)animal).readBook(); // 다운캐스팅
        }else if(animal.getClass() == Tiger.class){
            ((Tiger)animal).hunting(); // 다운캐스팅
        }
        System.out.println();
    }
}
