package zad16;
//Zadanie 16.
//
//Stwórz klasę enum Runner ze stałymi BEGINNER, INTERMEDIATE, ADVANCED. Enum powinien posiadać dwa parametry:
//• minimalny czas przebiegnięcia maratonu w minutach
//• maksymalny czas przebiegnięcia maratonu w minutach
//Dodatkowo enum Runner powinien zawierać metodę statyczną getFitnessLevel(),
// która przyjmuje na wejściu dowolny czas przebiegnięcia maratonu,
// a jako rezultat powinna zwracać konkretny obiekt Runner na podstawie przekazanego czasu.
import java.time.LocalTime;

public enum Runner {
    BEGINNER(LocalTime.of(4,1),LocalTime.MAX),
    INTERMEDIATE(LocalTime.of(3,16),LocalTime.of(4,0)),
    ADVANCED(LocalTime.MIN,LocalTime.of(3,15));
    private LocalTime minTime;
    private LocalTime maxTime;

    Runner(LocalTime minTime, LocalTime maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }
    public static Runner getFitnessLevel(LocalTime time){
        if(time==null){
            System.out.println("time can't be null");
            return null;
        }
        for (Runner advanceLevel : Runner.values()) {
            if(advanceLevel.minTime.compareTo(time)<=0 && advanceLevel.maxTime.compareTo(time)>=0){
                return advanceLevel;
            }
        }
        return BEGINNER;
    }
}
