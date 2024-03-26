public class Main {
    public static void main(String[] args) {
        // Exercise 1
        var personAge = 17;
        if (personAge >= 18) {
            System.out.println("Если возраст человека " + personAge + " лет, то она достигла совершеннолетия");
        } else {
            System.out.println("Eсли возраст человека " + personAge + " лет, то она не достигла совершеннолетия, нужно немного подождать");
        }
        var personAge2 = 38;
        if (personAge2 >= 18) {
            System.out.println("Если возраст человека " + personAge2 + " лет то она достигла совершеннолетия");
        } else {
            System.out.println("Eсли возраст человека " + personAge2 + " лет то она не достигла совершеннолетия, нужно немного подождать");
        }
        // Exercise 2
        var outsideTemperature = 3;
        if (outsideTemperature <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("На улицу сегодня тепло, можно идти без шапки.");
        }
        // Exercise 3
        var speedLimit = 60;
        var actualSpeed = 55;
        if (actualSpeed <= speedLimit) {
            System.out.println("Если скорость " + actualSpeed + " то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + actualSpeed + " то придется заплатить штраф");
        }
        // Exercise 4
        var ageOfaMan = 18;
        if (ageOfaMan >= 2 && ageOfaMan <= 6) {
            System.out.println("Если возраст человека равен " + ageOfaMan + " то ей нужно ходить в детский сад");
        } else if (ageOfaMan >= 7 && ageOfaMan <= 17) {
            System.out.println("Если возраст человека равен " + ageOfaMan + " то ей нужно ходить в школу");
        } else if (ageOfaMan >= 18 && ageOfaMan <= 24) {
            System.out.println("Если возраст человеа равен " + ageOfaMan + " то ему нужно ходить в университет");
        } else if (ageOfaMan > 24) {
            System.out.println("Если возраст человека равен " + ageOfaMan + " то ему нужно работать");
        }
        // Exercise 5
        var kidsAge = 10;
        if (kidsAge < 5) {
            System.out.println("Если возраст ребенка равен " + kidsAge + ", то ему нельзя кататься на аттракционе");
        } else if (kidsAge > 5 && kidsAge < 14) {
            System.out.println("Если возраст ребенка равен " + kidsAge + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (kidsAge > 14 ) {
            System.out.println("Если возраст ребенка равен " + kidsAge + ", то ему можно кататься на аттракционе без сопровождения");
        }
        // Exercise 6
        var carriageCapacity = 102;
        var carriageSeatedCapacity = 60;
        var carriageStandingCapacity = carriageCapacity - carriageSeatedCapacity;
        var numberOfPeople = 80;
        if (numberOfPeople < 60) {
            System.out.println("В вагоне есть сидячее место");
        } else if (numberOfPeople >= 60 && numberOfPeople < 102) {
            System.out.println("В вагоне есть стоячее место");
        } else {
            System.out.println("В вагоне нет мест");
        }
        // Exercise 7
        int one = 10;
        int two = 20;
        int three = 3;
        if (one > two && one > three && one != two && one != three) {
            System.out.println("one is bigger");
        } else if (two > one && two > three && two != one && two != three) {
            System.out.println("two is bigger");
        } else if (three > one || three > two) {
            System.out.println("three is bigger");
        }
    }
    }
