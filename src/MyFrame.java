package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener{
    JLabel label;
    ImageIcon icon = new ImageIcon("rocket.png");

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);//allows to manually move components with keystrokes
        this.addKeyListener(this);

        icon = new ImageIcon("rocket.png");

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setIcon(icon);
        this.getContentPane().setBackground(Color.black);
        this.add(label);
        this.setVisible(true);
    }
    @Override
    public void keyTyped(KeyEvent e) {
        //Invoked when a key is typed
        switch (e.getKeyChar()){
            case 'a': label.setLocation(label.getX()-10, label.getY());//move left
                break;
            case 'w': label.setLocation(label.getX(), label.getY()-10);//move up
                break;
            case 's': label.setLocation(label.getX(), label.getY()+10);//move down
                break;
            case 'd': label.setLocation(label.getX()+10,label.getY());//move right
                break;
        }
    }
    @Override
    public void keyPressed(KeyEvent e) {
        //Invoked when a physical key is pressed down
        switch (e.getKeyCode()){
            case 37: label.setLocation(label.getX()-10, label.getY());//move arrow left
                break;
            case 38: label.setLocation(label.getX(), label.getY()-10);//move arrow up
                break;
            case 39: label.setLocation(label.getX()+10, label.getY());//move arrow right
                break;
            case 40: label.setLocation(label.getX(),label.getY()+10);//move arrow down
                break;
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
        //called whenever key is removed
        System.out.println("You released key char: " + e.getKeyChar());
        System.out.println("You released key code: " + e.getKeyCode());
    }
}
