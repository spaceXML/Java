package Java;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Customer_App {

	private JFrame frame;
	private JTextField id;
	private JPasswordField password;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer_App window = new Customer_App();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Customer_App() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		//�����ν� �г��� ����Ҽ��ִ�.
		JPanel mainPanel = new JPanel();
		mainPanel.setBounds(0, 0, 1008, 667);
		frame.getContentPane().add(mainPanel);
		mainPanel.setLayout(null);
		mainPanel.setVisible(false);
		//mainPanel.setVisible ó��ȭ�鿡�� ����â ���������ʰ� ����� ��ɾ�
		
		JLabel lblNewLabel_3 = new JLabel("MainPanel wellcome to join us .");
		lblNewLabel_3.setFont(new Font("�޸տ�����", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(244, 32, 532, 65);
		mainPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("name");
		lblNewLabel_4.setFont(new Font("�޸տ�����", Font.PLAIN, 22));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(178, 107, 173, 71);
		mainPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("age");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("�޸տ�����", Font.PLAIN, 22));
		lblNewLabel_4_1.setBounds(178, 200, 173, 71);
		mainPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("gender");
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2.setFont(new Font("�޸տ�����", Font.PLAIN, 22));
		lblNewLabel_4_2.setBounds(178, 313, 173, 71);
		mainPanel.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("birthday");
		lblNewLabel_4_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_3.setFont(new Font("�޸տ�����", Font.PLAIN, 22));
		lblNewLabel_4_3.setBounds(527, 107, 173, 71);
		mainPanel.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("phone\r\n");
		lblNewLabel_4_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_4.setFont(new Font("�޸տ�����", Font.PLAIN, 22));
		lblNewLabel_4_4.setBounds(527, 200, 173, 71);
		mainPanel.add(lblNewLabel_4_4);
		
		JLabel lblNewLabel_4_5 = new JLabel("note");
		lblNewLabel_4_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_5.setFont(new Font("�޸տ�����", Font.PLAIN, 22));
		lblNewLabel_4_5.setBounds(527, 313, 173, 71);
		mainPanel.add(lblNewLabel_4_5);
		
		textField = new JTextField();
		textField.setBounds(332, 126, 183, 38);
		mainPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(332, 227, 183, 38);
		mainPanel.add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(692, 126, 183, 38);
		mainPanel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(692, 227, 183, 38);
		mainPanel.add(textField_4);
		
		JComboBox gender = new JComboBox(new String[] {"Male","Female"});
		gender.setBounds(332, 327, 183, 46);
		mainPanel.add(gender);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(692, 338, 243, 266);
		mainPanel.add(textArea);
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
									//getText�� �۾��Ⱑ ����������.
			  String nameTxt = name.getText();
			  String ageTxt = age.getText();
			  String phoneTxt = phone.getText();
			  String bTxt = birthday.getText();
			  String genderTxt = gender.getSelectedItem().toString();
			  String notetxt = note.getText();
			  
//			  Customer customer = new Customer(nameTxt,ageTxt);
			}
		});
		
		btnNewButton_1.setBounds(336, 517, 310, 64);
		mainPanel.add(btnNewButton_1);
		
		
		
		btnNewButton_1.setBounds(332, 530, 261, 71);
		mainPanel.add(btnNewButton_1);
		
		ImagePanel welcomPanel = new ImagePanel(new ImageIcon("C:/Java_study/workspace/Javasolak/image/welcome1.jpg").getImage());
		welcomPanel.setBounds(0, 0, 1008, 729);
		
		//=-----------------------------------------------
		//�����г����� ��ġ�����ϰ� mainPanel.setVisible(false); ����
		frame.getContentPane().add(welcomPanel);
		welcomPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Log In");
		lblNewLabel.setFont(new Font("�޸տ�����", Font.BOLD, 40));
		lblNewLabel.setBounds(77, 164, 171, 142);
		welcomPanel.add(lblNewLabel);
		
		id = new JTextField();
		
		
		id.setHorizontalAlignment(SwingConstants.RIGHT);
		//Variable ���� id �� �Ἥ ���밪 ����
		id.setText("ENTER ID");
		id.setToolTipText("ENTER ID");
		id.setBounds(226, 302, 134, 54);
		welcomPanel.add(id);
		id.setColumns(10);
		
		password = new JPasswordField();
		//Variable ���� password �� �Ἥ ���밪 ����
		password.setColumns(10);
		password.setToolTipText("******");
		password.setHorizontalAlignment(SwingConstants.TRAILING);
		password.setBounds(226, 363, 134, 45);
		welcomPanel.add(password);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("�޸տ�����", Font.BOLD, 40));
		lblNewLabel_1.setBounds(12, 363, 217, 65);
		welcomPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ID ");
		lblNewLabel_2.setFont(new Font("�޸տ�����", Font.PLAIN, 40));
		lblNewLabel_2.setBounds(12, 288, 184, 65);
		welcomPanel.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\java_study\\workspace\\Javasolak\\image\\button11.PNG"));
		//�α��ι�ư ������
		btnNewButton.setPressedIcon(new ImageIcon("C:\\java_study\\workspace\\Javasolak\\image\\button11_clicked.jpg"));
		btnNewButton.setBounds(370, 241, 288, 242);
		welcomPanel.add(btnNewButton);
		
		
		
		// �̹��� �ּҸ� �����ؾ����� Design ���������� ���������Ҽ��ְ� ������ �ڷḦ �۰� �������� �ٲٸ� �����ϴ�.
		
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			if(id.getText(). equals("51Area")&&Arrays.equals(password.getPassword(),"dr.kim".toCharArray())) {
				System.out.println("Wellcome to Dr.KIM in 51Area");
				JOptionPane.showMessageDialog(null, "Wellcome to Dr.KIM in 51Area");
				welcomPanel.setVisible(false);
				// �α��� �����ÿ� â�ݱ�
				mainPanel.setVisible(true);
				//�α��� ������ ����â���γѾ��
				
				
				}else{
					JOptionPane.showMessageDialog(null, "You are not right about input in password");
					
				}
//				if()
			{
				
				}
			}
		});
		
		frame.setLocationRelativeTo(null);
		//ȭ�� ��� ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(welcomPanel.getWidth(),welcomPanel.getHeight());
		frame.setResizable(false);
		////âũ�� ���� 2��
		frame.setLocationRelativeTo(null); 
		// â �߾Ӱ��� ��ɾ�
		frame.setJMenuBar(menuBar());
//		1.âx ǥ�� ������� �����ӿ� �޴���()�� ���� 
		
//		�ؿ� {} �� 
//		2.public JMenuBar menuBar() {
//			JMenuBar bar = new JMenuBar();
//			
//			return bar; 
	
	}
	
	public JMenuBar menuBar() {
		JMenuBar bar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		//file ��â���
		JMenu aboutJMenu = new JMenu("About");
		//about ��â���
		bar.add(fileMenu);
		bar.add(aboutJMenu);
		
		JMenuItem openfile = new JMenuItem("Open"); 
		JMenuItem exit = new JMenuItem("Exit");
		fileMenu.add(openfile);
		fileMenu.addSeparator();
		fileMenu.add(exit);
		//file ��â���
		//open exit 
		
		exit.addActionListener(new ActionListener() {
					//addActionListener (Ÿ��ActionListener)������
//									�ڵ����� �������̵���.
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				// exit���� 0���� ���� Ŭ���� â�� ������.
			}
		});
		
		return bar;
		
	}
}

class ImagePanel extends JPanel {
	private Image img;
	
	public ImagePanel(Image img) {
		this.img = img;
		setSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setLayout(null);
	}
	
	public int getWidth() {
		return img.getWidth(null);
					//âũ�� ���� 1��
	}
	
	
	
	public void paintComponent(Graphics g) {
		//�г��� �������� �ڵ����� �������� ���
		g.drawImage(img, 0,0,null);
						//x,y ������ 
	}
				
			
			
}

