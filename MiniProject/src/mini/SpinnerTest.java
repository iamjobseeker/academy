package mini;
import java.awt.*;
import java.util.*;
import java.text.*;
import javax.swing.*;
import javax.swing.event.*;

public class SpinnerTest {
	public static void main(String[] args) {
		Date now = new Date(); // 현재의 날짜 및 시간 변수 
		final SpinnerDateModel model = new SpinnerDateModel(now, null, now,Calendar.DAY_OF_WEEK); // 스피너 날짜 설정 
		JSpinner spinner = new JSpinner(model);
		final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		JSpinner.DateEditor editor = new JSpinner.DateEditor(spinner,"yyyy-MM-dd");
		JFormattedTextField ftf = editor.getTextField();
		ftf.setEditable(false); // 날짜 직접수정 불가  
		ftf.setHorizontalAlignment(JTextField.CENTER);
		
		ftf.setBackground(new Color(255, 255, 255)); 
		spinner.setEditor(editor); 
		spinner.addChangeListener(new ChangeListener() { // 변화이벤트 리스너
			public void stateChanged(ChangeEvent e) {
				Date value = (Date) model.getValue();
				Date next = (Date) model.getNextValue();
				if (value != null && next != null)
					System.out.println("value = " + df.format(value) + "\t" 
							+ "next = " + df.format(next));
			}
		});
		JPanel panel = new JPanel();
		panel.add(spinner);
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().add(panel);
		f.setSize(250, 100);
		f.setLocation(200, 200);
		f.setVisible(true);
	}
}