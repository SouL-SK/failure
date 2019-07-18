package michel_RPG;

import javax.sound.sampled.AudioInputStream;
        import javax.sound.sampled.AudioSystem;
        import javax.sound.sampled.SourceDataLine;
        import javax.sound.sampled.UnsupportedAudioFileException;
        import java.io.File;
        import java.io.IOException;

public class bgm {
    public void bgm() {
        File file = new File("C:\\Users\\SouL Kim\\Desktop\\cartoon092.mp3");
        AudioInputStream audioInputStream = null;
        SourceDataLine auline = null;
        try {
            audioInputStream = AudioSystem.getAudioInputStream(file);
        } catch (UnsupportedAudioFileException e1) {
            e1.printStackTrace();
            return;
        } catch (IOException e1) {
            e1.printStackTrace();
            return;
        }
    }
}