package ContactBook;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AddContact implements ActionListener{
    private JFrame frame;
    private JTextField nameTextField;
    private JTextField phoneTextField;
    private static final ContactList contactList=new ContactList();
    AddContact(){
        this.initComponents();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(!(nameTextField.getText().equals(""))&&!(phoneTextField.getText().equals("")))
            if(phoneTextField.getText().length()==10)
                if(contactList.addContact("Name: "+nameTextField.getText()+" Phone: "+phoneTextField.getText())) {
                    Toolkit.getDefaultToolkit().beep();
                    frame.dispose();
                }
    }
    public void initComponents(){
        JButton submitButton=new JButton("Submit");
        submitButton.setBounds(200,150,100,20);
        submitButton.addActionListener(this);
        frame=new JFrame("Contact Add");
        nameTextField=new JTextField();
        nameTextField.setBounds(200,60,180,20);
        phoneTextField=new JTextField();
        phoneTextField.setBounds(200,90,180,20);
        Container container=frame.getContentPane();
        container.setLayout(null);
        JLabel nameLabel=new JLabel("Name");
        JLabel phoneLabel=new JLabel("Phone Number");
        nameLabel.setBounds(100,60,100,20);
        phoneLabel.setBounds(100,90,100,20);
        container.add(nameLabel);
        container.add(phoneLabel);
        container.add(nameTextField);
        container.add(phoneTextField);
        container.add(submitButton);
        ImageIcon imageIcon=new ImageIcon("C:\\Users\\USER\\IdeaProjects\\LearnJava\\src\\ContactBook\\contactBook.png");
        frame.setBounds(100,50,400,250);
        frame.setIconImage(imageIcon.getImage());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
