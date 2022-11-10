package leson3;

public class LightColorDetector {
    public String detect(int waveLenght) {
        String result = "";
        if ((waveLenght >= 380) && (waveLenght <= 449)) {
            System.out.println("Violet");
        } else if ((waveLenght >= 450) && (waveLenght <= 494)) {
            System.out.println("Blue");
        } else if ((waveLenght >= 495) && (waveLenght <= 569)) {
            System.out.println("Green");
        } else if ((waveLenght >= 570) && (waveLenght <= 589)) {
            System.out.println("Yellow");
        } else if ((waveLenght >= 590) && (waveLenght <= 619)) {
            System.out.println("Orange");
        } else if ((waveLenght >= 620) && (waveLenght <= 750)) {
            System.out.println("Red");
        } else {
            System.out.println("Invisible Light");
            return result;

        }


        return result;
    }
}