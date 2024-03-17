public class Main {
    public static void main(String[] args) {
        // Exercise 1
        var personAge = 17;
        if (personAge >= 18) {
            System.out.println("Если возраст человека " + personAge + " то она достигла совершеннолетия");
        } else {
            System.out.println("Eсли возраст человека " + personAge + " то она не достигла совершеннолетия, нужно немного подождать");
        }
        var personAge2 = 38;
        if (personAge2 >= 18) {
            System.out.println("Если возраст человека " + personAge2 + " то она достигла совершеннолетия");
        } else {
            System.out.println("Eсли возраст человека " + personAge2 + " то она не достигла совершеннолетия, нужно немного подождать");
        }
        // Exercise 2
        var outsideTemperature = 3;
        if (outsideTemperature <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("На улицу сегодня тепло, можно идти без шапки.");
        }
        var outsideTemperature2 = 320;
        if (outsideTemperature2 <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("На улицу сегодня тепло, можно идти без шапки.");
        }
        // Exercise 3
        var speedLimit = 60;
        var actualSpeed = 55;
        var actualSpeed2 = 80;
        if (actualSpeed <= speedLimit) {
            System.out.println("Если скорость " + actualSpeed + " то можно ездить спокойно");
        } if (actualSpeed2 > speedLimit) {
            System.out.println("Если скорость " + actualSpeed2 + " то придется заплатить штраф");
        }
        // Exercise 4
        var ageOfaMan = 18;
        if (ageOfaMan >= 2 && ageOfaMan <= 6) {
            System.out.println("Если возраст человека равен " + ageOfaMan + "то ей нужно ходить в детский сад");
        } if (ageOfaMan >= 7 && ageOfaMan <= 17) {
            System.out.println("Если возраст человека равен" + ageOfaMan + " то ей нужно ходить в школу");
        } if (ageOfaMan >= 18 && ageOfaMan <= 24) {
            System.out.println("Если возраст человеа равен " + ageOfaMan + " то ему нужно ходить в университет");
        } if (ageOfaMan > 24) {
            System.out.println("Если возраст человека равен " + ageOfaMan + " то ему нужно работать");
        }
        // Exercise 5
        var kidsAge = 10;
        if (kidsAge < 5) {
            System.out.println("Если возраст ребенка равен " + kidsAge + ", то ему нельзя кататься на аттракционе");
        } if (kidsAge > 5 && kidsAge < 14) {
            System.out.println("Если возраст ребенка равен " + kidsAge + ", то ему можно кататься на аттракцмоне в сопровождении взрослого");
        } if (kidsAge > 14 ) {
            System.out.println("Если возраст ребенка равен " + kidsAge + ", то ему можно кататься на аттракционе без сопровождения");
        }
        // Exercise 6
        var carriageCapacity = 102;
        var carriageSeatedCapacity = 60;
        var carriageStandingCapacity = carriageCapacity - carriageSeatedCapacity;
        var numberOfPeople = 80;
        if (numberOfPeople < 60) {
            System.out.println("В вагоне есть сидячее место");
        } if (numberOfPeople >= 60 && numberOfPeople < 102) {
            System.out.println("В вагоне есть стоячее место");
        } else {
            System.out.println("В вагоне нет мест");
        }
        // Exercise 7
        int one;
        int two;
        int three;
        if (one > two && one > three && one != two && one != three) {
            System.out.println("one is bigger");
        } if (two > one && two > three && two != one && two != three) {
            System.out.println("two is bigger");
        } else {
            System.out.println("three is bigger");
        }
    }
    }
