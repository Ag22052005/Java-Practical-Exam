import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Myframe extends Frame {
    public Myframe() {

        Panel header = new Panel();
        header.setBounds(0, 30, 450, 30);
        header.setBackground(Color.gray);
        add(header);

        Label headLabel = new Label("LOGIN FORM");
        headLabel.setBounds(200, 30, 100, 20);
        headLabel.setForeground(Color.black);
        header.add(headLabel);

        Label name = new Label("NAME          :");
        Label address = new Label("ADDRESS    :");
        Label birthday = new Label("BIRTHDAY   :");
        Label gender = new Label("GENDER     :");
        Label job = new Label("JOB          :");
        name.setBounds(20, 95, 150, 20);
        address.setBounds(20, 130, 150, 20);
        birthday.setBounds(20, 165, 150, 20);
        gender.setBounds(20, 200, 150, 20);
        job.setBounds(20, 235, 150, 20);
        add(name);
        add(address);
        add(birthday);
        add(gender);
        add(job);
        TextField nameInput = new TextField();
        nameInput.setBounds(200, 95, 200, 20);
        add(nameInput);
        TextArea addressInput = new TextArea();
        addressInput.setBounds(200, 130, 200, 20);
        add(addressInput);
        TextField birthdayInput = new TextField();
        birthdayInput.setBounds(200, 165, 200, 20);
        add(birthdayInput);

        Choice genderInput = new Choice();

        // genderInput.add("Select Your Gender");
        genderInput.add("MALE");
        genderInput.add("FEMALE");
        genderInput.add("OTHER");
        genderInput.setBounds(200, 200, 200, 20);
        add(genderInput);

        CheckboxGroup group = new CheckboxGroup();

        Checkbox job1 = new Checkbox("Student", group, false);
        Checkbox job2 = new Checkbox("Teacher", group, false);
        job1.setBounds(200, 235, 100, 20);
        job2.setBounds(300, 235, 100, 20);
        add(job1);
        add(job2);

        Button resisterButton = new Button("Register");
        resisterButton.setBounds(50, 280, 100, 20);
        add(resisterButton);

        Button exitButton = new Button("Exit");
        exitButton.setBounds(180, 280, 50, 20);
        add(exitButton);

        setSize(450, 500);
        setTitle("Login");
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
}

public class Q14 {
    public static void main(String[] args) {
        new Myframe();
    }
}
