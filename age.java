import javax.swing.JFrame;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.time.LocalDate;
import java.time.Period;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class age{
public static int getAge(LocalDate dob){
	LocalDate curDate = LocalDate.now();
	return Period.between(dob, curDate).getYears();
}
public static void main(String args[]){
JFrame frame = new JFrame();
JFormattedTextField tff1 = new JFormattedTextField();
tff1.setFont(new Font("", Font.BOLD, 20));
JFormattedTextField tff2 = new JFormattedTextField();
tff2.setFont(new Font("", Font.BOLD, 20));
JButton button = new JButton("Show");
JLabel label1 = new JLabel("Birthday: ");
JLabel label2 = new JLabel("Age: ");
tff1.setBounds(70, 30, 310, 50);
tff2.setBounds(70, 110, 60, 30);
label1.setBounds(10, 50, 60, 30);
label2.setBounds(10, 112, 60, 30);
button.setBounds(70, 160, 100, 50);
frame.setVisible(true);
frame.setLocationRelativeTo(null);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(500, 500);
frame.setLayout(null);
frame.add(tff1);
frame.add(tff2);
frame.add(button);
frame.add(label1);
frame.add(label2);

button.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
	try{
	String x = tff1.getText();
	LocalDate dob = LocalDate.parse(x);
	tff2.setText(String.valueOf(getAge(dob)));
	}catch(Exception e1){
		tff1.setText("Enter date like this: 1999-07-18");
	}
}
});

}
}