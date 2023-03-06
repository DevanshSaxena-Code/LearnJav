package ContactBook;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;
class ContactBook implements ActionListener{

    private Container container;
    private JButton lightBackground;
    private JButton darkBackground;
    ContactBook(){
        this.initComponents();
    }
    private void initComponents(){
        lightBackground=new JButton("Light Background");
        darkBackground=new JButton("Dark Background");
        lightBackground.setBounds(10,10,150,20);
        lightBackground.setBackground(Color.RED);
        lightBackground.setForeground(Color.YELLOW);
        lightBackground.addActionListener(this);
        lightBackground.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        darkBackground.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        darkBackground.setBounds(10,50,150,20);
        darkBackground.setBackground(Color.DARK_GRAY);
        darkBackground.setForeground(Color.PINK);
        darkBackground.addActionListener(this);
        JFrame frame=new JFrame("Contact Book");
        container = frame.getContentPane();
        container.add(lightBackground);
        container.add(darkBackground);
        JButton showContactButton=new JButton("Show Contact");
        showContactButton.setBounds(100,150,200,20);
        showContactButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        showContactButton.addActionListener(e -> new ContactList().showContact());
        JButton addContactButton=new JButton("Add Contact");
        addContactButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        addContactButton.setForeground(Color.GREEN);
        addContactButton.setBackground(Color.BLACK);
        addContactButton.addActionListener(e -> new AddContact());
        showContactButton.setForeground(Color.cyan);
        showContactButton.setBackground(Color.black);
        addContactButton.setBounds(100,100,200,20);
        ImageIcon imageIcon=new ImageIcon("C:\\Users\\USER\\IdeaProjects\\LearnJava\\src\\ContactBook\\contactBook.png");
        Font font=new Font("cascade",Font.PLAIN,18);
        showContactButton.setFont(font);
        addContactButton.setFont(font);
        JLabel headingLabel=new JLabel("Contact Book");
        headingLabel.setBounds(150,75,120,20);
        headingLabel.setForeground(Color.BLUE);
        headingLabel.setFont(font);
        container.setLayout(null);
        container.add(headingLabel);
        container.add(addContactButton);
        container.add(showContactButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(imageIcon.getImage());
        frame.setBounds(100,50,400,250);
        frame.setResizable(false);
        frame.setFont(font);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==lightBackground)
            this.container.setBackground(Color.WHITE);
        else if(e.getSource()==darkBackground)
            this.container.setBackground(Color.BLACK);
    }
    public static  void main(String[] args){
        new ContactBook();
    }
}