import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keys {
    public void keys() {
        KeyListener listener = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {
                char key = keyEvent.getKeyChar();
                System.out.println("Нажата и отпущена клавиша - " + key);
            }

            @Override
            public void keyPressed(KeyEvent keyEvent) {
                char key = keyEvent.getKeyChar();
                System.out.println("Нажата клавиша - " + key);
            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {
                char key = keyEvent.getKeyChar();
                System.out.println("Отпущена клавиша - " + key);
            }
        };
    }
}
