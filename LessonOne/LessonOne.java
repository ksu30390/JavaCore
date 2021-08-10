package ru.geekbrains.JavaCoreLesson1;

public class LessonOne {
    public static void main(String[] args) {

        Movable[] participantsArray = new Movable[6];
        participantsArray[0] = new Robot("Robot1", 1001, 4);
        participantsArray[1] = new Robot("Robot2", 2000, 2);
        participantsArray[2] = new Human("Human1", 3000, 3);
        participantsArray[3] = new Human("Human2", 900, 2);
        participantsArray[4] = new Cat("Cat1", 1001, 3);
        participantsArray[5] = new Cat("Cat2", 700, 5);

        Obstacles[] obstructionsArray = new Obstacles[4];
        obstructionsArray[0] = new RunningTrack(400);
        obstructionsArray[1] = new Wall(1);
        obstructionsArray[2] = new RunningTrack(1000);
        obstructionsArray[3] = new Wall(3);


        for (Movable participant : participantsArray) {
            for (Obstacles obstruction : obstructionsArray) {
                if (obstruction instanceof Wall) {
                    if (participant.jump(obstruction.getNumber()) == false) {
                        break;
                    }
                } else {
                    if (participant.run(obstruction.getNumber()) == false) {
                        break;
                    }
                    ;
                }
                ;
            }
        }
    }
}





