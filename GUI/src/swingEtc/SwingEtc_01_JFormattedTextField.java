package swingEtc;

import java.awt.Container;
import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;

public class SwingEtc_01_JFormattedTextField extends JFrame {
	private Container root;

	private SwingEtc_01_JFormattedTextField() {
		setBounds(1000, 50, 300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		root = getContentPane();
		JPanel pane = new JPanel();

		// ������Ʈ ����, �߰�
		MaskFormatter format = null;
		try {
			//	format = new MaskFormatter("###.###.###.###"); // ����
			//	format = new MaskFormatter("192.168.20.###"); // ��Ʈ��ũ �ּ�
			//	format = new MaskFormatter("AAAAAAAA"); // 8�� ����, ����
			//	format = new MaskFormatter("UUUUU"); // 5�� �빮��
				format = new MaskFormatter("01#-####-####"); // ��ȭ��ȣ
		} catch (ParseException e) {
			e.printStackTrace();
		}

		JFormattedTextField txt;
		txt = new JFormattedTextField(format);
		txt.setColumns(20);
		pane.add(txt);

		root.add(pane);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SwingEtc_01_JFormattedTextField();
	}
}


