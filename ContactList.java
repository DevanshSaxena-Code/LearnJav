package ContactBook;
import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
public class ContactList{
    private static final LinkedList<String>linkedList=new LinkedList<>();
    public boolean addContact(String contact){
        linkedList.add(contact);
        return true;
    }

    public void showContact(){
        JFrame frame=new JFrame("Contact Book");
        Container container=frame.getContentPane();
        container.setLayout(null);
        ImageIcon imageIcon=new ImageIcon("C:\\Users\\USER\\IdeaProjects\\LearnJava\\src\\ContactBook\\contactBook.png");
        frame.setIconImage(imageIcon.getImage());
        JTextArea textArea=new JTextArea();
        textArea.setBounds(0,0,5000,5000);
        StringBuilder details= new StringBuilder();
        for(String string:linkedList)
            details.append(string).append("\n");
        textArea.setText(details.toString());
        container.add(textArea);
        frame.setBounds(100,50,400,250);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        textArea.setEditable(false);
        textArea.setWrapStyleWord(true);
        textArea.setLineWrap(true);
        frame.setVisible(true);
    }
}
