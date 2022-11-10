package leson3;

public class LightDetectorLauncher {
    public static void main(String[] args) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLenght = 1788;
        String result = lightColorDetector.detect(waveLenght);
        System.out.println(result);


    }
}
