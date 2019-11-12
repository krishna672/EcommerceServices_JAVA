import java.awt.EventQueue;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import javax.swing.JFrame;
import java.awt.CardLayout;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.TextArea;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTable;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JScrollPane;
import net.proteanit.sql.DbUtils;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import org.omg.CORBA.Request;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ScrollPaneConstants;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JCalendar;
import com.toedter.components.JSpinField;
import com.toedter.components.JLocaleChooser;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.BoxLayout;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JYearChooser;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class ecommerce_services
{
	private JFrame frame;
	private JTextField username_textField;
	private JPasswordField password_textField;
	private JTextField name_textField;
	private JTextField contact_textField;
	private JTextField mail_textField;
	private JTextField select_username;
	private JPasswordField select_password;
	private JPasswordField repeat_password;
	String username,password,chosen_seller,chosen_product,warranty,email,entered_mail;
	private Panel HomeScreen,SignUp,Register,AdminScreen,WelcomeScreen,productDetails,Email,loading_panel;
	DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
	Date dateobj = new Date();
	private JTextField product_name_textField;
	private JTextField username_tf;
	private JTable table;
	private JTable table_1;
	private JTextField edit_name_tf;
	private JTextField edit_contact_tf;
	private JTextField edit_mail_tf;
	private JTextField otp_textField;
	public int otp=0;
	private JPasswordField change_pass_tf;
	private JPasswordField confirm_change_pass_tf;
	private JTextField reset_pass_username;
	private JTextField reset_pass_mail;
	private JPasswordField entered_reset_pass;
	private JPasswordField entered_rest_pass_confirm;
	private JTextField search_tf;
	private JTable table_pro;
	private JTextField feedback_textField;
	public JLabel star1,star2,star3,star4,star5,lblNewLabel_1;
	public String rating;
	private JComboBox products_combobox;
	private JTable review_table;
	private JTextField search_textfield;
	private JDateChooser p_date;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ecommerce_services window = new ecommerce_services();
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
	public ecommerce_services() {
		initialize();
		frame.setFocusable(true);


	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setResizable(false);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\bin\\ecommerce-website-design.png"));
		frame.setBounds(100, 100, 692, 485);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));


		Panel SignUp = new Panel();
		SignUp.setBackground(SystemColor.menu);
		frame.getContentPane().add(SignUp, "name_508479547158726");
		SignUp.setLayout(null);
		SignUp.setVisible(false);

		JLabel lblName = new JLabel("NAME");
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lblName.setBounds(99, 116, 103, 32);
		SignUp.add(lblName);

		name_textField = new JTextField();
		name_textField.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		name_textField.setHorizontalAlignment(JTextField.CENTER);
		name_textField.setBounds(241, 116, 321, 35);
		SignUp.add(name_textField);
		name_textField.setColumns(10);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.desktop);
		panel.setBounds(0, 0, 698, 91);
		SignUp.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Please enter your details and sign up");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.BOLD, 30));
		lblNewLabel.setBounds(0, 5, 666, 75);
		panel.add(lblNewLabel);

		JLabel lblContactNo = new JLabel("CONTACT NO");
		lblContactNo.setHorizontalAlignment(SwingConstants.LEFT);
		lblContactNo.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lblContactNo.setBounds(99, 159, 115, 41);
		SignUp.add(lblContactNo);

		contact_textField = new JTextField();
		contact_textField.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		contact_textField.setHorizontalAlignment(JTextField.CENTER);
		contact_textField.setBounds(241, 162, 321, 38);
		SignUp.add(contact_textField);
		contact_textField.setColumns(10);

		JLabel lblmail_id = new JLabel("MAIL ID");
		lblmail_id.setHorizontalAlignment(SwingConstants.LEFT);
		lblmail_id.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lblmail_id.setBounds(99, 211, 104, 35);
		SignUp.add(lblmail_id);

		mail_textField = new JTextField();
		mail_textField.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		mail_textField.setHorizontalAlignment(JTextField.CENTER);
		mail_textField.setBounds(241, 211, 321, 36);
		SignUp.add(mail_textField);
		mail_textField.setColumns(10);

		JLabel lbladdress = new JLabel("ADDRESS");
		lbladdress.setHorizontalAlignment(SwingConstants.LEFT);
		lbladdress.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lbladdress.setBounds(99, 292, 103, 23);
		SignUp.add(lbladdress);

		TextArea address_textField = new TextArea();
		address_textField.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		address_textField.setBounds(240, 263, 322, 108);


		SignUp.add(address_textField);

		Panel Register = new Panel();
		frame.getContentPane().add(Register, "name_508482113598051");
		Register.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.desktop);
		panel_2.setBounds(0, 0, 686, 93);
		Register.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblCreateAccount = new JLabel("CREATE ACCOUNT");
		lblCreateAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreateAccount.setFont(new Font("Yu Gothic UI", Font.BOLD, 30));
		lblCreateAccount.setForeground(Color.WHITE);
		lblCreateAccount.setBounds(0, 11, 676, 71);
		panel_2.add(lblCreateAccount);

		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
		lblUsername.setBounds(158, 130, 113, 45);
		Register.add(lblUsername);

		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
		lblPassword.setBounds(158, 199, 113, 45);
		Register.add(lblPassword);

		JLabel lblConfirm = new JLabel("CONFIRM");
		lblConfirm.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
		lblConfirm.setBounds(158, 272, 113, 27);
		Register.add(lblConfirm);

		JLabel lblPassword_1 = new JLabel("PASSWORD");
		lblPassword_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
		lblPassword_1.setBounds(158, 294, 113, 27);
		Register.add(lblPassword_1);

		select_username = new JTextField();
		select_username.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		select_username.setHorizontalAlignment(JTextField.CENTER);
		select_username.setBounds(304, 130, 208, 47);
		Register.add(select_username);
		select_username.setColumns(10);

		select_password = new JPasswordField();
		select_password.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		select_password.setHorizontalAlignment(JTextField.CENTER);
		select_password.setBounds(304, 199, 208, 45);
		Register.add(select_password);

		repeat_password = new JPasswordField();
		repeat_password.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		repeat_password.setHorizontalAlignment(JTextField.CENTER);
		repeat_password.setBounds(304, 276, 208, 45);
		Register.add(repeat_password);



		JButton nextBtn = new JButton("NEXT");
		nextBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name=name_textField.getText();
				String contact=contact_textField.getText();
				email=mail_textField.getText();
				String address=address_textField.getText();

				while(true)
				{
					if(name.equals("")||contact.equals("")||email.equals("")||address.equals(""))
					{
						JOptionPane.showMessageDialog(null, "Please enter all the given details!","Incomplete Details",JOptionPane.ERROR_MESSAGE);
						break;
					}

					if (! contact.matches("\\d{10}"))
					{
						JOptionPane.showMessageDialog(null, "Please enter a valid Contact Number!","Invalid contact",JOptionPane.ERROR_MESSAGE);
						break;
					}

					if(! email.matches("^[A-Za-z0-9_.]+[@][A-Za-z.]+$")) 
					{
						JOptionPane.showMessageDialog(null, "Please enter a valid email id!","Invalid mail id",JOptionPane.ERROR_MESSAGE);
						break;
					}


					else
					{	
						SignUp.setVisible(false);
						Register.setVisible(true);
						break;
					}
				}

			}
		});
		nextBtn.setBackground(SystemColor.desktop);
		nextBtn.setForeground(Color.WHITE);
		nextBtn.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		nextBtn.setBounds(459, 396, 103, 39);
		SignUp.add(nextBtn);
		nextBtn.setFocusPainted(false);

		Panel HomeScreen = new Panel();

		frame.getContentPane().add(HomeScreen, "name_508416487677679");
		HomeScreen.setLayout(null);
		HomeScreen.setVisible(true);

		JButton btnCancel_1 = new JButton("CANCEL");
		btnCancel_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SignUp.setVisible(false);
				HomeScreen.setVisible(true);
			}
		});
		btnCancel_1.setForeground(Color.WHITE);
		btnCancel_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		btnCancel_1.setFocusPainted(false);
		btnCancel_1.setBackground(Color.BLACK);
		btnCancel_1.setBounds(99, 396, 103, 39);
		SignUp.add(btnCancel_1);



		Panel WelcomeScreen = new Panel();
		frame.getContentPane().add(WelcomeScreen, "name_521752850977597");
		WelcomeScreen.setLayout(null);

		Panel panel_1 = new Panel();
		panel_1.setBackground(new Color(123, 104, 238));
		panel_1.setBounds(0, 0, 686, 111);
		WelcomeScreen.add(panel_1);
		panel_1.setLayout(null);



		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(0, 111, 686, 45);
		WelcomeScreen.add(panel_4);
		panel_4.setLayout(null);

		JLabel lblPleaseGiveThe_1 = new JLabel("Please give the details of your faulty product");
		lblPleaseGiveThe_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseGiveThe_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		lblPleaseGiveThe_1.setBounds(0, 0, 676, 45);
		panel_4.add(lblPleaseGiveThe_1);


		//Combo boxes


		JLabel lblPurchasedThrough = new JLabel("Purchased through        :");
		lblPurchasedThrough.setHorizontalAlignment(SwingConstants.LEFT);
		lblPurchasedThrough.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		lblPurchasedThrough.setBounds(80, 237, 185, 31);
		WelcomeScreen.add(lblPurchasedThrough);

		final String[] sellers= {"Amazon", "Flipkart", "Snapdeal","Ebay","Mythra","YepMe","AliExpress"};

		JComboBox select_seller = new JComboBox(sellers);
		select_seller.setMaximumRowCount(20);
		select_seller.setLightWeightPopupEnabled(false);
		select_seller.setBounds(315, 240, 139, 31);

		select_seller.setSelectedItem("Amazon");
		chosen_seller="Amazon";

		WelcomeScreen.add(select_seller);
		select_seller.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				chosen_seller=select_seller.getSelectedItem().toString();
				System.out.println("selected-->"+chosen_seller);
			}
		});


		JLabel lblChooseYourProduct = new JLabel("Choose your product     :");
		lblChooseYourProduct.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		lblChooseYourProduct.setBounds(80, 279, 185, 31);
		WelcomeScreen.add(lblChooseYourProduct);

		final String[] products= {"Smartphones", "Laptops", "Accessories", "Shirts", "Pants", "Beds"};
		String[] company = null;
		chosen_product="Smartphones";

		JComboBox select_product = new JComboBox(products);
		select_product.setLightWeightPopupEnabled(false);
		select_product.setBounds(315, 282, 139, 31);
		WelcomeScreen.add(select_product);
		select_product.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				chosen_product=select_product.getSelectedItem().toString();
				System.out.println("selected-->"+chosen_product);
				if(chosen_product.equals("Smartphone"))
				{
					//String[] company=new String[] {"Samsung","Apple","OnePlus","Oppo","Vivo","Sony"};

				}
			}
		});

		JLabel lblProductCompany = new JLabel("Product name                 :");
		lblProductCompany.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		lblProductCompany.setBounds(80, 331, 185, 31);
		WelcomeScreen.add(lblProductCompany);






		JPanel AdminScreen = new JPanel();
		AdminScreen.setBackground(Color.WHITE);
		frame.getContentPane().add(AdminScreen, "name_10530618256050");
		AdminScreen.setLayout(null);
		AdminScreen.setVisible(false);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.BLACK);
		panel_5.setBounds(0, 0, 686, 129);
		AdminScreen.add(panel_5);
		panel_5.setLayout(null);

		JLabel lblWelcomeAdmin = new JLabel("Welcome Admin!");
		lblWelcomeAdmin.setForeground(new Color(255, 255, 255));
		lblWelcomeAdmin.setFont(new Font("Yu Gothic UI", Font.BOLD, 26));
		lblWelcomeAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeAdmin.setBounds(0, 0, 686, 129);
		panel_5.add(lblWelcomeAdmin);

		Panel productDetails = new Panel();
		frame.getContentPane().add(productDetails, "name_524029363787170");
		productDetails.setLayout(null);
		productDetails.setVisible(false);

		JLabel lblProblemDescription = new JLabel("problem description");
		lblProblemDescription.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lblProblemDescription.setBounds(70, 95, 150, 22);
		productDetails.add(lblProblemDescription);

		TextArea prbDesc = new TextArea();
		prbDesc.setBounds(289, 45, 265, 100);
		productDetails.add(prbDesc);

		JLabel lblManufactureDate = new JLabel("Manufacture date ");
		lblManufactureDate.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lblManufactureDate.setBounds(70, 192, 143, 36);
		productDetails.add(lblManufactureDate);

		JLabel lblDoYouHave = new JLabel("Do you have a warranty?");
		lblDoYouHave.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lblDoYouHave.setBounds(70, 274, 203, 27);
		productDetails.add(lblDoYouHave);

		JRadioButton rdbtnNo = new JRadioButton("NO");
		rdbtnNo.setFont(new Font("Yu Gothic UI", Font.BOLD, 11));
		rdbtnNo.setSelected(true);
		rdbtnNo.setBounds(393, 278, 65, 23);
		rdbtnNo.setFocusPainted(false);
		productDetails.add(rdbtnNo);

		JRadioButton rdbtnYes = new JRadioButton("YES");
		rdbtnYes.setFont(new Font("Yu Gothic UI", Font.BOLD, 11));
		rdbtnYes.setSelected(true);
		rdbtnYes.setBounds(307, 278, 65, 23);
		rdbtnYes.setFocusPainted(false);
		productDetails.add(rdbtnYes);



		ButtonGroup b=new ButtonGroup();
		b.add(rdbtnNo);
		b.add(rdbtnYes);

		JPanel userlog = new JPanel();
		frame.getContentPane().add(userlog, "name_285188375025473");
		userlog.setLayout(null);

		JButton button = new JButton("REFRESH");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","");
					String query="select * from login";
					Statement stmt=con.createStatement();
					stmt.execute(query);

					ResultSet rs=stmt.executeQuery(query);
					table_1.setModel(DbUtils.resultSetToTableModel(rs));
					table_1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
					TableColumnModel col=table_1.getColumnModel();
					col.getColumn(0).setPreferredWidth(170);
					col.getColumn(1).setPreferredWidth(200);
					System.out.println("success");

				}
				catch(Exception e6)
				{
					JOptionPane.showMessageDialog(null, e6.getMessage(), "error!", JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		button.setBounds(236, 393, 132, 35);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		button.setFocusPainted(false);
		button.setBackground(Color.BLACK);
		userlog.add(button);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_1.setBounds(236, 28, 362, 342);
		userlog.add(scrollPane_1);

		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);

		JPanel AdminPage_1 = new JPanel();
		frame.getContentPane().add(AdminPage_1, "name_283704598302475");
		AdminPage_1.setLayout(null);

		JButton btnBack_1 = new JButton("BACK");
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userlog.setVisible(false);
				AdminPage_1.setVisible(true);


			}
		});
		btnBack_1.setForeground(Color.WHITE);
		btnBack_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		btnBack_1.setFocusPainted(false);
		btnBack_1.setBackground(Color.BLACK);
		btnBack_1.setBounds(466, 393, 132, 35);
		userlog.add(btnBack_1);

		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(0, 51, 102));
		panel_12.setForeground(Color.BLACK);
		panel_12.setBounds(0, 0, 171, 456);
		userlog.add(panel_12);
		panel_12.setLayout(null);

		JLabel lblUser = new JLabel("USER");
		lblUser.setForeground(new Color(255, 255, 255));
		lblUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblUser.setFont(new Font("Yu Gothic UI", Font.BOLD, 24));
		lblUser.setBounds(0, 224, 171, 32);
		panel_12.add(lblUser);

		JLabel lblLogs = new JLabel("LOGS");
		lblLogs.setForeground(new Color(255, 255, 255));
		lblLogs.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogs.setFont(new Font("Yu Gothic UI", Font.BOLD, 24));
		lblLogs.setBounds(0, 267, 171, 32);
		panel_12.add(lblLogs);

		JPanel Email = new JPanel();
		frame.getContentPane().add(Email, "name_534329488130798");
		Email.setLayout(null);
		Email.setVisible(false);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 51, 102));
		panel_3.setBounds(0, 0, 686, 456);
		Email.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblThankYou = new JLabel("Thank you!");
		lblThankYou.setHorizontalAlignment(SwingConstants.CENTER);
		lblThankYou.setForeground(new Color(255, 255, 224));
		lblThankYou.setFont(new Font("Yu Gothic UI", Font.BOLD, 40));
		lblThankYou.setBounds(0, 31, 676, 81);
		panel_3.add(lblThankYou);

		JLabel lblAMailHas = new JLabel("A mail has been sent to you regarding your query thanks for contacting us!");
		lblAMailHas.setHorizontalAlignment(SwingConstants.CENTER);
		lblAMailHas.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		lblAMailHas.setForeground(new Color(255, 255, 224));
		lblAMailHas.setBounds(0, 123, 676, 105);
		panel_3.add(lblAMailHas);

		JPanel userPage = new JPanel();
		userPage.setBackground(SystemColor.window);
		frame.getContentPane().add(userPage, "name_166724475319893");
		userPage.setLayout(null);

		JButton btnNewButton_1 = new JButton("OK");
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				product_name_textField.setText("");
				prbDesc.setText(null);

				Email.setVisible(false);
				userPage.setVisible(true);

			}
		});
		btnNewButton_1.setBackground(new Color(0, 51, 102));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 25));
		btnNewButton_1.setBounds(276, 348, 156, 61);
		panel_3.add(btnNewButton_1);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.BLACK);
		panel_6.setBounds(0, 0, 686, 160);
		AdminPage_1.add(panel_6);
		panel_6.setLayout(null);

		JLabel lblWelcomeAdmin_1 = new JLabel("Hi, Admin");
		lblWelcomeAdmin_1.setBounds(52, 48, 452, 62);
		panel_6.add(lblWelcomeAdmin_1);
		lblWelcomeAdmin_1.setForeground(Color.WHITE);
		lblWelcomeAdmin_1.setFont(new Font("Verdana", Font.PLAIN, 30));
		lblWelcomeAdmin_1.setHorizontalAlignment(SwingConstants.LEFT);

		JLabel label_17 = new JLabel("");
		label_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				username_textField.setText(null);
				password_textField.setText(null);
				AdminPage_1.setVisible(false);
				HomeScreen.setVisible(true);
			}
		});
		label_17.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\icons8-exit-filled-50.png"));
		label_17.setBounds(589, 46, 64, 64);
		panel_6.add(label_17);

		JLabel label_18 = new JLabel("Logout");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setForeground(Color.WHITE);
		label_18.setFont(new Font("Verdana", Font.PLAIN, 14));
		label_18.setBounds(579, 120, 64, 18);
		panel_6.add(label_18);

		JPanel user_review = new JPanel();
		frame.getContentPane().add(user_review, "name_155879215964928");
		user_review.setLayout(null);

		JLabel average = new JLabel("");
		average.setFont(new Font("Yu Gothic", Font.BOLD, 50));
		average.setHorizontalAlignment(SwingConstants.CENTER);
		average.setBounds(520, 157, 135, 88);
		user_review.add(average);

		JPanel panel_18 = new JPanel();
		panel_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","");
					String query="select c.username,c.name,c.contact,c.email,c.address,p.seller,p.prod_name,p.problem,p.mdate,p.warranty from customer as c inner join products as p on c.username=p.username";
					Statement stmt=con.createStatement();
					stmt.execute(query);

					ResultSet rs=stmt.executeQuery(query);
					table.setModel(DbUtils.resultSetToTableModel(rs));
					table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
					AdminPage_1.setVisible(false);
					AdminScreen.setVisible(true);
				}
				catch(Exception er)
				{
					JOptionPane.showMessageDialog(null, er.getMessage(), "error!", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		panel_18.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_18.setBounds(38, 202, 183, 211);
		AdminPage_1.add(panel_18);
		panel_18.setLayout(null);

		JLabel label_9 = new JLabel("");
		label_9.setBounds(41, 24, 96, 96);
		panel_18.add(label_9);
		
		label_9.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\customer_details.png"));

		JLabel lblViewCustomerDetails = new JLabel("View Customer");
		lblViewCustomerDetails.setBounds(24, 130, 137, 23);
		panel_18.add(lblViewCustomerDetails);
		lblViewCustomerDetails.setFont(new Font("Verdana", Font.PLAIN, 18));

		JLabel lblNewLabel_2 = new JLabel(" details");
		lblNewLabel_2.setBounds(55, 161, 65, 23);
		panel_18.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 18));

		JPanel panel_19 = new JPanel();
		panel_19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","");
					String query="select * from login";
					Statement stmt=con.createStatement();
					stmt.execute(query);

					ResultSet rs=stmt.executeQuery(query);
					table_1.setModel(DbUtils.resultSetToTableModel(rs));
					table_1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
					TableColumnModel col=table_1.getColumnModel();
					col.getColumn(0).setPreferredWidth(170);
					col.getColumn(1).setPreferredWidth(200);
					System.out.println("success");
					AdminPage_1.setVisible(false);
					userlog.setVisible(true);
				}
				catch(Exception e2)
				{
					JOptionPane.showMessageDialog(null, "No Data!", "Data not found",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		panel_19.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_19.setBounds(254, 202, 183, 211);
		AdminPage_1.add(panel_19);
		panel_19.setLayout(null);

		JLabel label_10 = new JLabel("");
		label_10.setBounds(42, 27, 96, 96);
		panel_19.add(label_10);
		
		
		label_10.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\user_logs.png"));

		JLabel lblViewUserLogs = new JLabel("View user logs");
		lblViewUserLogs.setBounds(26, 154, 130, 23);
		panel_19.add(lblViewUserLogs);
		lblViewUserLogs.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblViewUserLogs.setHorizontalAlignment(SwingConstants.CENTER);


		JLabel countlabel = new JLabel("");
		countlabel.setHorizontalAlignment(SwingConstants.CENTER);
		countlabel.setFont(new Font("Yu Gothic", Font.BOLD, 50));
		countlabel.setBounds(520, 289, 135, 88);
		user_review.add(countlabel);
		
		JPanel panel_20 = new JPanel();
		panel_20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","");
					String query="select * from feedback";
					String query1="select count(username) from customer";
					PreparedStatement pst=con.prepareStatement(query1);
					Statement stmt=con.createStatement();

					ResultSet rs=stmt.executeQuery(query);
					ResultSet rs1=pst.executeQuery(query1);


					review_table.setModel(DbUtils.resultSetToTableModel(rs));
					review_table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
					TableColumnModel col=review_table.getColumnModel();
					col.getColumn(0).setPreferredWidth(120);
					col.getColumn(1).setPreferredWidth(120);
					col.getColumn(2).setPreferredWidth(120);
					col.getColumn(3).setPreferredWidth(120);




					int rowcount=review_table.getRowCount();
					float sum=0;
					for(int i=0;i<rowcount;i++)
					{
						sum=sum+Integer.parseInt(review_table.getValueAt(i, 3).toString());
					}
					float avg=sum/rowcount;

					average.setText(Float.toString(avg));

					if(rs1.next())
					{
						String count=rs1.getString("count(username)");
						countlabel.setText(count);
					}
					AdminPage_1.setVisible(false);
					user_review.setVisible(true);
				}
				catch(Exception e6)
				{
					JOptionPane.showMessageDialog(null, e6.getMessage(), "error!", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		panel_20.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_20.setBounds(469, 202, 183, 211);
		AdminPage_1.add(panel_20);
		panel_20.setLayout(null);

		

		JLabel label_19 = new JLabel("");
		label_19.setBounds(48, 29, 96, 96);
		panel_20.add(label_19);
		
		label_19.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\admin_ratings.png"));

		JLabel lblViewReviews = new JLabel("View Reviews");
		lblViewReviews.setBounds(28, 159, 124, 23);
		panel_20.add(lblViewReviews);
		lblViewReviews.setFont(new Font("Verdana", Font.PLAIN, 18));

		JPanel edit_profile = new JPanel();
		frame.getContentPane().add(edit_profile, "name_254883099984213");
		edit_profile.setLayout(null);

		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBackground(Color.BLACK);
		panel_8.setBounds(0, 0, 698, 91);
		edit_profile.add(panel_8);

		JLabel lblEditProfile_1 = new JLabel("Edit your profile");
		lblEditProfile_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEditProfile_1.setForeground(Color.WHITE);
		lblEditProfile_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 30));
		lblEditProfile_1.setBounds(0, 5, 666, 75);
		panel_8.add(lblEditProfile_1);

		JLabel label_2 = new JLabel("NAME");
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		label_2.setBounds(111, 120, 103, 32);
		edit_profile.add(label_2);

		edit_name_tf = new JTextField();

		edit_name_tf.setHorizontalAlignment(SwingConstants.CENTER);
		edit_name_tf.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		edit_name_tf.setColumns(10);
		edit_name_tf.setBounds(253, 120, 321, 35);
		edit_profile.add(edit_name_tf);

		JLabel label_3 = new JLabel("CONTACT NO");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		label_3.setBounds(111, 163, 115, 41);
		edit_profile.add(label_3);

		edit_contact_tf = new JTextField();
		edit_contact_tf.setHorizontalAlignment(SwingConstants.CENTER);
		edit_contact_tf.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		edit_contact_tf.setColumns(10);
		edit_contact_tf.setBounds(253, 166, 321, 38);
		edit_profile.add(edit_contact_tf);

		JLabel label_4 = new JLabel("MAIL ID");
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		label_4.setBounds(111, 215, 104, 35);
		edit_profile.add(label_4);

		edit_mail_tf = new JTextField();
		edit_mail_tf.setHorizontalAlignment(SwingConstants.CENTER);
		edit_mail_tf.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		edit_mail_tf.setColumns(10);
		edit_mail_tf.setBounds(253, 215, 321, 36);
		edit_profile.add(edit_mail_tf);

		JLabel label_5 = new JLabel("ADDRESS");
		label_5.setHorizontalAlignment(SwingConstants.LEFT);
		label_5.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		label_5.setBounds(111, 296, 103, 23);
		edit_profile.add(label_5);

		TextArea edit_address_tf = new TextArea();
		edit_address_tf.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		edit_address_tf.setBounds(252, 267, 321, 91);
		edit_profile.add(edit_address_tf);

		JPanel pass_change = new JPanel();
		frame.getContentPane().add(pass_change, "name_351421106786560");
		pass_change.setLayout(null);

		JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.BLACK);
		panel_11.setBounds(0, 0, 686, 101);
		pass_change.add(panel_11);
		panel_11.setLayout(null);

		JLabel lblChangeYourPassword = new JLabel("Change your password");
		lblChangeYourPassword.setFont(new Font("Yu Gothic UI", Font.PLAIN, 24));
		lblChangeYourPassword.setForeground(Color.WHITE);
		lblChangeYourPassword.setBounds(119, 31, 253, 38);
		panel_11.add(lblChangeYourPassword);

		change_pass_tf = new JPasswordField();
		change_pass_tf.setHorizontalAlignment(SwingConstants.CENTER);
		change_pass_tf.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		change_pass_tf.setBounds(301, 173, 208, 45);
		pass_change.add(change_pass_tf);

		JLabel label_6 = new JLabel("PASSWORD");
		label_6.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
		label_6.setBounds(155, 173, 113, 45);
		pass_change.add(label_6);

		JLabel label_7 = new JLabel("PASSWORD");
		label_7.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
		label_7.setBounds(155, 268, 113, 27);
		pass_change.add(label_7);

		JLabel label_8 = new JLabel("CONFIRM");
		label_8.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
		label_8.setBounds(155, 246, 113, 27);
		pass_change.add(label_8);

		confirm_change_pass_tf = new JPasswordField();
		confirm_change_pass_tf.setHorizontalAlignment(SwingConstants.CENTER);
		confirm_change_pass_tf.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		confirm_change_pass_tf.setBounds(301, 250, 208, 45);
		pass_change.add(confirm_change_pass_tf);




		JButton btnChangePassword = new JButton("Change Password");
		btnChangePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String changed_pass=change_pass_tf.getText();
				String con_changed_pass=confirm_change_pass_tf.getText();

				if(changed_pass.equals(con_changed_pass))
				{
					try
					{

						pass_change.setVisible(false);
						HomeScreen.setVisible(true);

						Class.forName("com.mysql.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","");

						String query1= "UPDATE userlogin SET password='"+changed_pass+"' WHERE username='"+reset_pass_username.getText()+"'";

						Statement stmt=con.createStatement();
						stmt.executeUpdate(query1);

						System.out.println("password changed -> "+changed_pass);

						JOptionPane.showMessageDialog(null, "Your password has successfully been changed!", "Success", JOptionPane.INFORMATION_MESSAGE);

					}

					catch(Exception e)
					{
						JOptionPane.showMessageDialog(null, e.getMessage(), "error!", JOptionPane.ERROR_MESSAGE);
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Please confirm your password!","Password doesnt match",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnChangePassword.setForeground(Color.WHITE);
		btnChangePassword.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
		btnChangePassword.setFocusPainted(false);
		btnChangePassword.setBackground(SystemColor.desktop);
		btnChangePassword.setBounds(155, 341, 354, 45);
		pass_change.add(btnChangePassword);

		JPanel otp_panel = new JPanel();
		frame.getContentPane().add(otp_panel, "name_350838988707840");
		otp_panel.setLayout(null);



		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.BLACK);
		panel_10.setBounds(0, 0, 686, 100);
		otp_panel.add(panel_10);
		panel_10.setLayout(null);

		JLabel lblOtpGenerated = new JLabel("One Time Password Sent");
		lblOtpGenerated.setFont(new Font("Yu Gothic UI", Font.PLAIN, 30));
		lblOtpGenerated.setHorizontalAlignment(SwingConstants.CENTER);
		lblOtpGenerated.setForeground(Color.WHITE);
		lblOtpGenerated.setBounds(66, 11, 500, 78);
		panel_10.add(lblOtpGenerated);

		otp_textField = new JTextField();
		otp_textField.setHorizontalAlignment(SwingConstants.CENTER);
		otp_textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		otp_textField.setBounds(311, 173, 134, 46);
		otp_panel.add(otp_textField);
		otp_textField.setColumns(10);

		JLabel lblEnterOtp = new JLabel("Enter OTP");
		lblEnterOtp.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
		lblEnterOtp.setBounds(179, 172, 134, 46);
		otp_panel.add(lblEnterOtp);

		JLabel lblAOtpHas = new JLabel("An OTP has been sent to your registered email id ");
		lblAOtpHas.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblAOtpHas.setHorizontalAlignment(SwingConstants.CENTER);
		lblAOtpHas.setBounds(73, 259, 495, 31);
		otp_panel.add(lblAOtpHas);

		JLabel lblPleaseEnterIt = new JLabel("Please enter it, to confirm its you");
		lblPleaseEnterIt.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblPleaseEnterIt.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseEnterIt.setBounds(73, 295, 495, 22);
		otp_panel.add(lblPleaseEnterIt);

		JButton btnNewButton_6 = new JButton("Submit OTP");
		btnNewButton_6.setFocusPainted(false);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if(otp_textField.equals(""))
					JOptionPane.showMessageDialog(null, "Please enter the OTP!", "OTP error", JOptionPane.ERROR_MESSAGE);
				else
				{
					int entered_otp=Integer.parseInt(otp_textField.getText());
					if(entered_otp == otp)
					{
						otp_panel.setVisible(false);
						pass_change.setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "The OTP you have entered is wrong!", "Invalid OTP",JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		btnNewButton_6.setBackground(new Color(102, 102, 204));
		btnNewButton_6.setForeground(Color.WHITE);
		btnNewButton_6.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		btnNewButton_6.setBounds(179, 376, 278, 46);
		otp_panel.add(btnNewButton_6);

		JPanel password_reset = new JPanel();
		frame.getContentPane().add(password_reset, "name_323064079842986");
		password_reset.setLayout(null);

		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.BLACK);
		panel_9.setBounds(0, 0, 686, 99);
		password_reset.add(panel_9);
		panel_9.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("Reset password");
		lblNewLabel_3.setFont(new Font("Yu Gothic UI", Font.BOLD, 25));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(212, 24, 238, 43);
		panel_9.add(lblNewLabel_3);

		JButton btnNewButton_5 = new JButton("DONE");
		btnNewButton_5.setBackground(Color.BLACK);
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setFocusPainted(false);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String entered_username=reset_pass_username.getText();
				entered_mail=reset_pass_mail.getText();



				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","");
					Statement stmt=con.createStatement();

					String query="select username,email from customer where username='"+entered_username+"'";

					ResultSet rs3=stmt.executeQuery(query);
					rs3.next();

					String rp_username=rs3.getString(1);
					String rp_email=rs3.getString(2);

					if(entered_username.equals(rp_username)&&entered_mail.equals(rp_email))
					{
						password_reset.setVisible(false);
						otp_panel.setVisible(true);

						Random rnd = new Random();
						otp = 100000 + rnd.nextInt(900000);

						System.out.println("Sending mail...");
						System.out.println("please wait..\n");

						mail(otp);

						System.out.println(otp+" -> otp generated");
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Details dont match!","Invalid request", JOptionPane.ERROR_MESSAGE);
					}

				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, "Error fetching data!", "Database Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton_5.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
		btnNewButton_5.setBounds(442, 376, 91, 43);
		password_reset.add(btnNewButton_5);

		JLabel lblUsername_3 = new JLabel("USERNAME");
		lblUsername_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblUsername_3.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lblUsername_3.setBounds(137, 228, 103, 32);
		password_reset.add(lblUsername_3);

		reset_pass_username = new JTextField();
		reset_pass_username.setHorizontalAlignment(SwingConstants.CENTER);
		reset_pass_username.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		reset_pass_username.setColumns(10);
		reset_pass_username.setBounds(250, 226, 283, 35);
		password_reset.add(reset_pass_username);

		JLabel lblEmailId = new JLabel("EMAIL ID");
		lblEmailId.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmailId.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lblEmailId.setBounds(137, 295, 103, 32);
		password_reset.add(lblEmailId);

		reset_pass_mail = new JTextField();
		reset_pass_mail.setHorizontalAlignment(SwingConstants.CENTER);
		reset_pass_mail.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		reset_pass_mail.setColumns(10);
		reset_pass_mail.setBounds(250, 293, 283, 35);
		password_reset.add(reset_pass_mail);

		JLabel lblPleaseEnterYour = new JLabel("Please enter your registered username and email id ,");
		lblPleaseEnterYour.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblPleaseEnterYour.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseEnterYour.setBounds(50, 127, 598, 26);
		password_reset.add(lblPleaseEnterYour);

		JLabel lblToChangeYour = new JLabel("to change your password");
		lblToChangeYour.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblToChangeYour.setHorizontalAlignment(SwingConstants.CENTER);
		lblToChangeYour.setBounds(242, 152, 214, 26);
		password_reset.add(lblToChangeYour);

		JButton btnBack_3 = new JButton("BACK");
		btnBack_3.setBounds(137, 376, 91, 43);
		password_reset.add(btnBack_3);
		btnBack_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				password_reset.setVisible(false);
				HomeScreen.setVisible(true);
			}
		});
		btnBack_3.setForeground(Color.WHITE);
		btnBack_3.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
		btnBack_3.setFocusPainted(false);
		btnBack_3.setBackground(Color.BLACK);

		JPanel profile_panel = new JPanel();
		frame.getContentPane().add(profile_panel, "name_420181698923946");
		profile_panel.setLayout(null);

		JPanel panel_13 = new JPanel();
		panel_13.setBackground(new Color(0, 0, 0));
		panel_13.setBounds(0, 0, 686, 118);
		profile_panel.add(panel_13);
		panel_13.setLayout(null);

		JLabel lblYourProfile = new JLabel("Your profile");
		lblYourProfile.setHorizontalAlignment(SwingConstants.CENTER);
		lblYourProfile.setForeground(new Color(255, 255, 255));
		lblYourProfile.setFont(new Font("Yu Gothic UI", Font.BOLD, 30));
		lblYourProfile.setBounds(0, 22, 666, 71);
		panel_13.add(lblYourProfile);

		JLabel lblName_1 = new JLabel("NAME:");
		lblName_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lblName_1.setBounds(178, 204, 103, 32);
		profile_panel.add(lblName_1);

		JLabel lblContactNo_1 = new JLabel("CONTACT NO:");
		lblContactNo_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblContactNo_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lblContactNo_1.setBounds(166, 247, 115, 41);
		profile_panel.add(lblContactNo_1);

		JLabel lblMailId = new JLabel("MAIL ID:");
		lblMailId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMailId.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lblMailId.setBounds(177, 299, 104, 35);
		profile_panel.add(lblMailId);

		JLabel lblUsername_2 = new JLabel("USERNAME:");
		lblUsername_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsername_2.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lblUsername_2.setBounds(177, 149, 103, 32);
		profile_panel.add(lblUsername_2);

		JLabel display_username = new JLabel("");
		display_username.setHorizontalAlignment(SwingConstants.LEFT);
		display_username.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		display_username.setBounds(323, 149, 255, 32);
		profile_panel.add(display_username);

		JLabel display_name = new JLabel("");
		display_name.setHorizontalAlignment(SwingConstants.LEFT);
		display_name.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		display_name.setBounds(323, 204, 255, 32);
		profile_panel.add(display_name);

		JLabel display_contact = new JLabel("");
		display_contact.setHorizontalAlignment(SwingConstants.LEFT);
		display_contact.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		display_contact.setBounds(323, 256, 255, 32);
		profile_panel.add(display_contact);

		JLabel display_mail = new JLabel("");
		display_mail.setHorizontalAlignment(SwingConstants.LEFT);
		display_mail.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		display_mail.setBounds(323, 302, 255, 32);
		profile_panel.add(display_mail);

		JPanel reset_pass = new JPanel();
		frame.getContentPane().add(reset_pass, "name_424168015421013");
		reset_pass.setLayout(null);


		JButton button_1 = new JButton("Change Password");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				profile_panel.setVisible(false);
				reset_pass.setVisible(true);
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
		button_1.setFocusPainted(false);
		button_1.setBackground(new Color(51, 0, 204));
		button_1.setBounds(451, 388, 193, 45);
		profile_panel.add(button_1);

		JPanel user_products = new JPanel();
		frame.getContentPane().add(user_products, "name_607691148474853");
		user_products.setLayout(null);

		JPanel panel_15 = new JPanel();
		panel_15.setBackground(new Color(0, 0, 0));
		panel_15.setBounds(0, 0, 686, 102);
		user_products.add(panel_15);
		panel_15.setLayout(null);

		JLabel lblMyProducts_1 = new JLabel("My Products");
		lblMyProducts_1.setFont(new Font("Yu Gothic", Font.BOLD, 34));
		lblMyProducts_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMyProducts_1.setForeground(new Color(255, 255, 255));
		lblMyProducts_1.setBounds(0, 0, 686, 91);
		panel_15.add(lblMyProducts_1);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(27, 119, 628, 261);
		user_products.add(scrollPane_2);

		table_pro = new JTable();
		scrollPane_2.setViewportView(table_pro);

		JButton button_4 = new JButton("REFRESH");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","");
					String query="SELECT * FROM `products` WHERE username='"+username_textField.getText()+"'";
					Statement stmt=con.createStatement();
					stmt.execute(query);

					ResultSet rs=stmt.executeQuery(query);
					table_pro.setModel(DbUtils.resultSetToTableModel(rs));
					table_pro.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
					TableColumnModel col=table_pro.getColumnModel();
					col.getColumn(0).setPreferredWidth(110);
					col.getColumn(1).setPreferredWidth(110);
					col.getColumn(2).setPreferredWidth(110);
					col.getColumn(3).setPreferredWidth(110);
					col.getColumn(4).setPreferredWidth(110);
					col.getColumn(5).setPreferredWidth(100);
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, e.getMessage(), "error!", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		button_4.setForeground(Color.WHITE);
		button_4.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		button_4.setFocusPainted(false);
		button_4.setBackground(Color.BLACK);
		button_4.setBounds(27, 398, 116, 35);
		user_products.add(button_4);

		JPanel feedback_panel = new JPanel();
		frame.getContentPane().add(feedback_panel, "name_654811600487253");
		feedback_panel.setLayout(null);

		JPanel panel_16 = new JPanel();
		panel_16.setBackground(Color.BLACK);
		panel_16.setBounds(0, 0, 686, 93);
		feedback_panel.add(panel_16);
		panel_16.setLayout(null);

		JLabel lblFeedback = new JLabel("FEEDBACK");
		lblFeedback.setFont(new Font("Yu Gothic UI", Font.BOLD, 26));
		lblFeedback.setHorizontalAlignment(SwingConstants.CENTER);
		lblFeedback.setForeground(Color.WHITE);
		lblFeedback.setBounds(192, 11, 282, 80);
		panel_16.add(lblFeedback);

		JLabel lblHasYourProblem = new JLabel("Has your problem been solved?");
		lblHasYourProblem.setHorizontalAlignment(SwingConstants.CENTER);
		lblHasYourProblem.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblHasYourProblem.setBounds(198, 157, 285, 46);
		feedback_panel.add(lblHasYourProblem);

		JLabel lblPleaseGiveYour = new JLabel("Please give your valuable feedback, this makes us work better!\r\n");
		lblPleaseGiveYour.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseGiveYour.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblPleaseGiveYour.setBounds(69, 191, 538, 47);
		feedback_panel.add(lblPleaseGiveYour);

		feedback_textField = new JTextField();
		feedback_textField.setHorizontalAlignment(SwingConstants.CENTER);
		feedback_textField.setFont(new Font("Verdana", Font.PLAIN, 14));
		feedback_textField.setBounds(115, 249, 456, 53);
		feedback_panel.add(feedback_textField);
		feedback_textField.setColumns(10);

		JLabel star1 = new JLabel("");
		JLabel star2 = new JLabel("");
		JLabel star3 = new JLabel("");
		JLabel star4 = new JLabel("");
		JLabel star5 = new JLabel("");


		star1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0)
			{
				rating="1";
				star1.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\star-icon.png"));
				star2.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\star-empty-icon.png"));
				star3.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\star-empty-icon.png"));
				star4.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\star-empty-icon.png"));
				star5.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\star-empty-icon.png"));

			}
		});
		star1.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\star-empty-icon.png"));
		star1.setBounds(161, 313, 64, 64);
		feedback_panel.add(star1);


		star2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				rating="2";
				star1.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\star-icon.png"));
				star2.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\star-icon.png"));
				star3.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\star-empty-icon.png"));
				star4.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\star-empty-icon.png"));
				star5.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\star-empty-icon.png"));

			}
		});
		star2.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\star-empty-icon.png"));
		star2.setBounds(235, 313, 64, 64);
		feedback_panel.add(star2);


		star3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				rating="3";
				star1.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\star-icon.png"));
				star2.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\star-icon.png"));
				star3.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\star-icon.png"));
				star4.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\star-empty-icon.png"));
				star5.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\star-empty-icon.png"));

			}
		});
		star3.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\star-empty-icon.png"));
		star3.setBounds(309, 313, 64, 64);
		feedback_panel.add(star3);



		star4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				rating="4";
				star1.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\star-icon.png"));
				star2.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\star-icon.png"));
				star3.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\star-icon.png"));
				star4.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\star-icon.png"));
				star5.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\star-empty-icon.png"));

			}
		});
		star4.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\star-empty-icon.png"));
		star4.setBounds(383, 313, 64, 64);
		feedback_panel.add(star4);

		star5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				rating="5";
				star1.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\star-icon.png"));
				star2.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\star-icon.png"));
				star3.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\star-icon.png"));
				star4.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\star-icon.png"));
				star5.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\star-icon.png"));

			}
		});
		star5.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\star-empty-icon.png"));
		star5.setBounds(457, 313, 64, 64);
		feedback_panel.add(star5);




		JComboBox products_combobox = new JComboBox();
		products_combobox.setBounds(340, 115, 160, 31);
		feedback_panel.add(products_combobox);

		JButton btnNewButton_7 = new JButton("Submit");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String prod=products_combobox.getSelectedItem().toString();
				String username_r=username_textField.getText();
				String feedback=feedback_textField.getText();
				System.out.println(username_r);
				System.out.println("Feedback :  "+feedback);
				System.out.println("Rating -->"+rating);


				try
				{

					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","");
					String query="insert into feedback(username,prod_name,feed_back,rating)"+"values(?,?,?,?)";
					PreparedStatement pst=con.prepareStatement(query);

					pst.setString(1,username_r);
					pst.setString(2, prod);
					pst.setString(3,feedback);
					pst.setString(4, rating);

					pst.execute();
					JOptionPane.showMessageDialog(null, "Thank you for your feedback", "Thank you", JOptionPane.INFORMATION_MESSAGE);
					feedback_panel.setVisible(false);
					userPage.setVisible(true);


				}

				catch(Exception e5)
				{
					System.out.println(e5.getMessage());
					JOptionPane.showMessageDialog(null, "Couldnt update feedback", "Feedback error", JOptionPane.ERROR_MESSAGE);
				}

				feedback_textField.setText(null);
				star1.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\bin\\star-empty-icon.png"));
				star2.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\bin\\star-empty-icon.png"));
				star3.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\bin\\star-empty-icon.png"));
				star4.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\bin\\star-empty-icon.png"));
				star5.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\bin\\star-empty-icon.png"));

			}
		});
		btnNewButton_7.setBackground(Color.DARK_GRAY);
		btnNewButton_7.setForeground(Color.WHITE);
		btnNewButton_7.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		btnNewButton_7.setBounds(431, 399, 176, 46);
		feedback_panel.add(btnNewButton_7);

		JButton btnBack_4 = new JButton("Back");
		btnBack_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				feedback_panel.setVisible(false);
				userPage.setVisible(true);
			}
		});
		btnBack_4.setForeground(Color.WHITE);
		btnBack_4.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		btnBack_4.setBackground(Color.DARK_GRAY);
		btnBack_4.setBounds(89, 399, 176, 46);
		feedback_panel.add(btnBack_4);

		JLabel lblChooseYourProduct_1 = new JLabel("Choose your product:");
		lblChooseYourProduct_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblChooseYourProduct_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblChooseYourProduct_1.setBounds(163, 119, 156, 18);
		feedback_panel.add(lblChooseYourProduct_1);





		JButton button_5 = new JButton("BACK");
		button_5.setFocusPainted(false);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				user_products.setVisible(false);
				userPage.setVisible(true);
			}
		});
		button_5.setForeground(Color.WHITE);
		button_5.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		button_5.setBackground(Color.BLACK);
		button_5.setBounds(565, 398, 90, 35);
		user_products.add(button_5);



		JButton btnBack_2 = new JButton("BACK");
		btnBack_2.setFocusPainted(false);
		btnBack_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				profile_panel.setVisible(false);
				userPage.setVisible(true);
			}
		});
		btnBack_2.setForeground(Color.WHITE);
		btnBack_2.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		btnBack_2.setBackground(new Color(0, 0, 0));
		btnBack_2.setBounds(96, 389, 161, 41);
		profile_panel.add(btnBack_2);






		JButton btnNewButton_4 = new JButton("EDIT");
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setFocusPainted(false);
		btnNewButton_4.setBackground(new Color(220, 20, 60));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String name=edit_name_tf.getText();
				String contact=edit_contact_tf.getText();
				email=edit_mail_tf.getText();
				String address=edit_address_tf.getText();

				while(true)
				{
					if(name.equals("")||contact.equals("")||email.equals("")||address.equals(""))
					{
						JOptionPane.showMessageDialog(null, "Please enter all the given details!","Incomplete Details",JOptionPane.ERROR_MESSAGE);
						break;
					}

					if (! contact.matches("\\d{10}"))
					{
						JOptionPane.showMessageDialog(null, "Please enter a valid Contact Number!","Invalid contact",JOptionPane.ERROR_MESSAGE);
						break;
					}

					if(! email.matches("^[A-Za-z0-9_.]+[@][A-Za-z.]+$")) 
					{
						JOptionPane.showMessageDialog(null, "Please enter a valid email id!","Invalid mail id",JOptionPane.ERROR_MESSAGE);
						break;
					}


					else
					{	

						try
						{


							Class.forName("com.mysql.jdbc.Driver");
							Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","");
							String query1="update customer set name='"+name+"' ,contact='"+contact+"',email='"+email+"',address='"+address+"' WHERE username='"+username_textField.getText()+"'";


							Statement stmt=con.createStatement();
							stmt.executeUpdate(query1);

							System.out.println("Account details edited ->"+name+"  "+contact+"  "+email+"  "+address);

							edit_profile.setVisible(false);
							userPage.setVisible(true);
							break;

						}
						catch(Exception e2)
						{
							JOptionPane.showMessageDialog(null,e2.getMessage(),"Error editing account!",JOptionPane.ERROR_MESSAGE);
							break;
						}

					}








				}

			}
		});



		btnNewButton_4.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		btnNewButton_4.setBounds(442, 391, 130, 41);
		edit_profile.add(btnNewButton_4);

		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setFocusPainted(false);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				edit_profile.setVisible(false);
				userPage.setVisible(true);
			}
		});
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		btnCancel.setBackground(Color.DARK_GRAY);
		btnCancel.setBounds(111, 391, 124, 41);
		edit_profile.add(btnCancel);

		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.BLACK);
		panel_7.setBounds(0, 0, 686, 121);
		userPage.add(panel_7);
		panel_7.setLayout(null);

		JLabel label_11 = new JLabel("");
		label_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{

				username_textField.setText(null);
				password_textField.setText(null);
				name_textField.setText(null);
				address_textField.setText(null);
				contact_textField.setText(null);
				mail_textField.setText(null);
				select_username.setText(null);
				select_password.setText(null);
				repeat_password.setText(null);


				userPage.setVisible(false);
				HomeScreen.setVisible(true);
			}
		});
		label_11.setBounds(595, 30, 64, 64);
		panel_7.add(label_11);
		label_11.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\icons8-exit-filled-50.png"));

		JLabel lblLogout = new JLabel("Logout");
		lblLogout.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogout.setForeground(Color.WHITE);
		lblLogout.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblLogout.setBounds(583, 92, 64, 18);
		panel_7.add(lblLogout);



		JLabel logo = new JLabel("");
		logo.setFont(new Font("Verdana", Font.PLAIN, 11));
		logo.setBounds(10, 126, 281, 270);
		logo.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\ecommerce-website-design.png"));
		HomeScreen.add(logo);

		JPanel SidePanel = new JPanel();
		SidePanel.setBackground(Color.BLACK);
		SidePanel.setBounds(0, 0, 201, 456);
		HomeScreen.add(SidePanel);

		JLabel EcommerceServices_label = new JLabel("E-Commerce Services");
		EcommerceServices_label.setHorizontalAlignment(SwingConstants.CENTER);
		EcommerceServices_label.setFont(new Font("Yu Gothic UI", Font.PLAIN, 38));
		EcommerceServices_label.setBounds(263, 49, 396, 51);
		HomeScreen.add(EcommerceServices_label);




		username_textField = new JTextField();
		username_textField.setForeground(Color.LIGHT_GRAY);
		username_textField.setText("username");
		username_textField.setFont(new Font("Verdana", Font.PLAIN, 18));
		username_textField.setHorizontalAlignment(JTextField.CENTER);
		username_textField.addFocusListener(new FocusAdapter() {

			@Override
			public void focusGained(FocusEvent e) 
			{
				if(username_textField.getText().equals("username"))
				{
					username_textField.setText("");
					username_textField.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
					username_textField.setForeground(Color.BLACK);
				}
			}

			@Override
			public void focusLost(FocusEvent arg0) 
			{
				if(username_textField.getText().equals(""))
				{
					username_textField.setText("username");
					username_textField.setForeground(Color.LIGHT_GRAY);
					username_textField.setFont(new Font("Verdana", Font.PLAIN, 18));
				}
			}	
		});

		username_textField.setBounds(338, 147, 281, 47);
		HomeScreen.add(username_textField);
		username_textField.setColumns(10);



		password_textField = new JPasswordField();
		password_textField.setText("xxxxxx");
		password_textField.setForeground(Color.LIGHT_GRAY);
		password_textField.setFont(new Font("Verdana", Font.PLAIN, 12));
		password_textField.setHorizontalAlignment(JTextField.CENTER);

		password_textField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) 
			{
				if(password_textField.getText().equals("xxxxxx"))
				{
					password_textField.setText("");
					password_textField.setFont(new Font("Verdana", Font.PLAIN, 12));
					password_textField.setForeground(Color.BLACK);
				}
			}

			@Override
			public void focusLost(FocusEvent e) 
			{
				if(password_textField.getText().equals(""))
				{
					password_textField.setText("xxxxxx");
					password_textField.setForeground(Color.LIGHT_GRAY);
					password_textField.setFont(new Font("Verdana", Font.PLAIN, 12));
				}
			}
		});

		password_textField.setBounds(338, 205, 281, 47);
		HomeScreen.add(password_textField);

		JButton LoginBtn = new JButton("LOGIN");
		LoginBtn.setFocusPainted(false);
		LoginBtn.setBackground(Color.BLACK);
		LoginBtn.setForeground(Color.WHITE);
		LoginBtn.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		LoginBtn.setBounds(338, 266, 281, 47);
		HomeScreen.add(LoginBtn);

		JLabel user_label = new JLabel("");
		user_label.setBounds(29, 44, 293, 50);
		panel_7.add(user_label);

		JPanel panel_21 = new JPanel();
		panel_21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","");
					String query="SELECT * FROM `products` WHERE username='"+username_textField.getText()+"'";
					Statement stmt=con.createStatement();
					stmt.execute(query);

					ResultSet rs=stmt.executeQuery(query);
					table_pro.setModel(DbUtils.resultSetToTableModel(rs));
					table_pro.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
					TableColumnModel col=table_pro.getColumnModel();
					col.getColumn(0).setPreferredWidth(110);
					col.getColumn(1).setPreferredWidth(110);
					col.getColumn(2).setPreferredWidth(110);
					col.getColumn(3).setPreferredWidth(110);
					col.getColumn(4).setPreferredWidth(110);
					col.getColumn(5).setPreferredWidth(100);

					System.out.println("success");

					userPage.setVisible(false);
					user_products.setVisible(true);
				}
				catch(Exception oe)
				{
					JOptionPane.showMessageDialog(null, oe.getMessage(), "error!", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		panel_21.setBackground(Color.WHITE);
		panel_21.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_21.setBounds(20, 308, 141, 137);
		userPage.add(panel_21);
		panel_21.setLayout(null);

		JLabel label_1 = new JLabel("");
		label_1.setBounds(22, 0, 98, 104);
		panel_21.add(label_1);

		label_1.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\products.gif"));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblMyProducts = new JLabel("MY PRODUCTS");
		lblMyProducts.setBounds(0 , 104, 141, 22);
		panel_21.add(lblMyProducts);
		lblMyProducts.setHorizontalAlignment(SwingConstants.CENTER);
		lblMyProducts.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));

		JPanel panel_22 = new JPanel();
		panel_22.setBackground(Color.WHITE);
		panel_22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","");
					Statement stmt=con.createStatement();


					String query="select name,contact,email from customer where username='"+username_textField.getText()+"'";
					ResultSet rs3=stmt.executeQuery(query);
					rs3.next();

					display_username.setText(username_textField.getText());
					display_name.setText(rs3.getString(1));
					display_contact.setText(rs3.getString(2));
					display_mail.setText(rs3.getString(3));

					userPage.setVisible(false);
					profile_panel.setVisible(true);

				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, "Cannot connect to db", "db error", JOptionPane.ERROR_MESSAGE);
				}


			}
		});
		panel_22.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_22.setBounds(20, 140, 141, 146);
		userPage.add(panel_22);

		JLabel label_20 = new JLabel("");
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setBounds(23, 11, 96, 92);
		label_20.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\profile.gif"));

		JLabel lblMyProfile = new JLabel("MY PROFILE\r\n");
		lblMyProfile.setBounds(10, 108, 121, 22);
		lblMyProfile.setHorizontalAlignment(SwingConstants.CENTER);
		lblMyProfile.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		panel_22.setLayout(null);
		panel_22.add(label_20);
		panel_22.add(lblMyProfile);

		JPanel panel_23 = new JPanel();
		panel_23.setBackground(Color.WHITE);
		panel_23.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try
				{
					products_combobox.removeAllItems();

					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","");
					String query="select prod_name from products where username='"+username_textField.getText()+"'";
					Statement stmt=con.createStatement();
					stmt.execute(query);

					ResultSet rs=stmt.executeQuery(query);
					while(rs.next())
					{
						products_combobox.addItem(rs.getString(1));
					}
					userPage.setVisible(false);
					feedback_panel.setVisible(true);
				}
				catch(Exception e6)
				{
					JOptionPane.showMessageDialog(null, e6.getMessage(), "error!", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		panel_23.setBounds(456, 140, 150, 146);
		userPage.add(panel_23);
		panel_23.setLayout(null);

		JLabel lblFeedback_2 = new JLabel("FEEDBACK");
		lblFeedback_2.setBounds(10, 113, 130, 22);
		panel_23.add(lblFeedback_2);
		lblFeedback_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblFeedback_2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));

		JLabel label_21 = new JLabel("");
		label_21.setHorizontalAlignment(SwingConstants.CENTER);
		label_21.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\feedback1.gif"));
		label_21.setBounds(28, 6, 96, 96);
		panel_23.add(label_21);

		JPanel panel_24 = new JPanel();
		panel_24.setBackground(Color.WHITE);
		panel_24.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				userPage.setVisible(false);
				WelcomeScreen.setVisible(true);
			}
		});
		panel_24.setBounds(239, 140, 150, 146);
		userPage.add(panel_24);
		panel_24.setLayout(null);

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\gears final.gif"));
		lblNewLabel_4.setBounds(15, 11, 118, 96);
		panel_24.add(lblNewLabel_4);

		JLabel lblServices = new JLabel("CLAIM SERVICES");
		lblServices.setHorizontalAlignment(SwingConstants.CENTER);
		lblServices.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		lblServices.setBounds(0, 113, 150, 22);
		panel_24.add(lblServices);

		JPanel panel_26 = new JPanel();
		panel_26.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","");
					Statement stmt=con.createStatement();

					ResultSet rs3=stmt.executeQuery("select name,contact,email,address from customer where username='"+username_textField.getText()+"'");
					rs3.next();

					edit_name_tf.setText(rs3.getString(1));
					edit_contact_tf.setText(rs3.getString(2));
					edit_mail_tf.setText(rs3.getString(3));
					edit_address_tf.setText(rs3.getString(4));


					userPage.setVisible(false);
					edit_profile.setVisible(true);

				}
				catch(Exception eq)
				{
					JOptionPane.showMessageDialog(null, "Couldnt fetch user details!","Database Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		panel_26.setBackground(Color.WHITE);
		panel_26.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_26.setBounds(239, 309, 150, 136);
		userPage.add(panel_26);
		panel_26.setLayout(null);





		JLabel label = new JLabel("");
		label.setBounds(43, 28, 64, 64);
		panel_26.add(label);
		label.setHorizontalAlignment(SwingConstants.CENTER);

		label.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\contact-editor-icon_64px.png"));

		JLabel lblEditProfile = new JLabel("EDIT PROFILE");
		lblEditProfile.setBounds(10, 103, 130, 22);
		panel_26.add(lblEditProfile);
		lblEditProfile.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		lblEditProfile.setHorizontalAlignment(SwingConstants.CENTER);

		JPanel panel_25 = new JPanel();
		panel_25.setBounds(456, 308, 150, 137);
		userPage.add(panel_25);
		panel_25.setBackground(Color.WHITE);
		panel_25.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				username=username_textField.getText();
				username_textField.setText(null);
				password_textField.setText(null);

				if(JOptionPane.showConfirmDialog(
						null,
						"Are you sure you want to delete your account?","Delete Account",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)

				{
					JOptionPane.showMessageDialog(null, "Your Account has been successfully deleted!");

					try 
					{
						System.out.println(username +"--> account deleted");

						Class.forName("com.mysql.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","");
						Statement stmt=con.createStatement();

						System.out.println(username);

						String query="delete from customer where username='"+username+"'";
						stmt.executeUpdate(query);
					}

					catch(Exception eL)
					{
						JOptionPane.showMessageDialog(null,eL.getMessage());
					}

					userPage.setVisible(false);
					HomeScreen.setVisible(true);
				}
				else
				{

				}

				//JOptionPane.showMessageDialog(null, "Your Account has been successfully deleted!");


			}
		});
		panel_25.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_25.setLayout(null);

		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Bharath VS\\eclipse-workspace\\Services\\mail_images\\delete.gif"));
		lblNewLabel_5.setBounds(21, 0, 106, 102);
		panel_25.add(lblNewLabel_5);

		JLabel lblAccount = new JLabel("DELETE ACCOUNT");
		lblAccount.setHorizontalAlignment(SwingConstants.LEFT);
		lblAccount.setForeground(Color.BLACK);
		lblAccount.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		lblAccount.setBounds(10, 103, 150, 23);
		panel_25.add(lblAccount);

		LoginBtn.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) 
			{
				String username=username_textField.getText();
				String username1=username_textField.getText();

				String password=password_textField.getText();
				String password1=password_textField.getText();



				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","");
					String query="select * from adminlogin where username=? and password=?";
					String query2="select * from userlogin where username=? and password=?";

					PreparedStatement pst=con.prepareStatement(query);
					PreparedStatement pst1=con.prepareStatement(query2);
					Statement st=con.createStatement();

					pst.setString(1, username);
					pst.setString(2, password);
					pst1.setString(1, username1);
					pst1.setString(2, password1);


					ResultSet rs=pst.executeQuery();
					ResultSet rs1=pst1.executeQuery();

					try
					{
						if(rs.next())
						{
							System.out.println("Login Successful-->ADMIN");
							System.out.println(df.format(dateobj));
							AdminPage_1.setVisible(true);
							HomeScreen.setVisible(false);

						}

						else if(rs1.next())
						{
							System.out.println("Login Successful\nUser: "+username_textField.getText());
							System.out.println(df.format(dateobj));
							username_tf.setText(username);

							user_label.setText("Hi, "+username);

							user_label.setFont(new Font("Yu Gothic", Font.BOLD, 30));
							user_label.setHorizontalAlignment(SwingConstants.CENTER);
							user_label.setForeground(Color.WHITE);
							user_label.setBounds(30, 51, 286, 50);


							HomeScreen.setVisible(false);
							userPage.setVisible(true);

						}
						else
						{
							username_textField.setText(null);
							password_textField.setText(null);
							JOptionPane.showMessageDialog(null,"Invalid login credentials!","Login Error",JOptionPane.ERROR_MESSAGE);

						}
						ResultSet rs3=st.executeQuery("call user_logs('"+username+"')");
					}
					catch(Exception e1)
					{
						JOptionPane.showMessageDialog(null, e1.getMessage(), "error!", JOptionPane.ERROR_MESSAGE);

					}

				}

				catch(Exception e1)
				{
					username_textField.setText(null);
					password_textField.setText(null);
					JOptionPane.showMessageDialog(null, "Cannot connect to the Database!", "Database error", JOptionPane.ERROR_MESSAGE);
				}
			}

		});




		JButton doneBtn = new JButton("DONE");
		doneBtn.setBackground(SystemColor.desktop);
		doneBtn.setForeground(Color.WHITE);
		doneBtn.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
		doneBtn.setBounds(158, 356, 354, 45);
		doneBtn.setFocusPainted(false);
		Register.add(doneBtn);
		doneBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{

				String create_username=select_username.getText();
				String create_password1=select_password.getText();
				String create_password2=repeat_password.getText();
				String name=name_textField.getText();
				String contact=contact_textField.getText();
				String email=mail_textField.getText();
				String address=address_textField.getText();

				while(true)
				{
					if(create_username.equals("")||create_password1.equals("")||create_password2.equals(""))
					{
						JOptionPane.showMessageDialog(null, "Please enter all the details!","Incomplete Details",JOptionPane.ERROR_MESSAGE);
						break;
					}

					if(create_password1.equals(create_password2))
					{
						try
						{



							Class.forName("com.mysql.jdbc.Driver");
							Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","");
							String query1="insert into customer(username,name,contact,email,address)"+"values(?,?,?,?,?)";
							String query="insert into userlogin(username,password)"+"values(?,?)";


							PreparedStatement pst1=con.prepareStatement(query1);
							PreparedStatement pst=con.prepareStatement(query);

							pst1.setString(1,create_username);
							pst1.setString(2, name);
							pst1.setString(3, contact);
							pst1.setString(4, email);   
							pst1.setString(5, address);

							pst.setString(1,create_username);
							pst.setString(2,create_password1);

							pst1.execute();
							pst.execute();


							System.out.println("Account created");
							JOptionPane.showMessageDialog(null, "Account created!","Success",JOptionPane.INFORMATION_MESSAGE);
							Register.setVisible(false);
							HomeScreen.setVisible(true);
							break;

						}
						catch(Exception e2)
						{
							JOptionPane.showMessageDialog(null,"Username already exists!","Error creating account",JOptionPane.ERROR_MESSAGE);
							break;
						}

					}
					else
					{
						JOptionPane.showMessageDialog(null, "The passwords do not match","Confirm Password",JOptionPane.ERROR_MESSAGE);
						break;
					}
				}


			}
		});

		JButton SignUpBtn = new JButton("SIGN UP FOR FREE");
		SignUpBtn.setFocusPainted(false);
		SignUpBtn.setBackground(Color.BLUE);
		SignUpBtn.setForeground(Color.WHITE);
		SignUpBtn.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		SignUpBtn.setBounds(338, 387, 281, 47);
		HomeScreen.add(SignUpBtn);

		JLabel lblForgotPassword = new JLabel("Forgot password?");
		lblForgotPassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				HomeScreen.setVisible(false);
				password_reset.setVisible(true);
			}
		});
		lblForgotPassword.setForeground(new Color(0, 0, 204));
		lblForgotPassword.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblForgotPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblForgotPassword.setBounds(386, 324, 185, 27);
		HomeScreen.add(lblForgotPassword);
		SignUpBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				HomeScreen.setVisible(false);
				SignUp.setVisible(true);

			}
		});






		JButton btnNext = new JButton("NEXT");
		btnNext.setBackground(Color.BLUE);
		btnNext.setForeground(Color.WHITE);
		btnNext.setBounds(483, 392, 89, 31);
		btnNext.setFocusPainted(false);
		WelcomeScreen.add(btnNext);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{

				while(true)
				{

					String prod_name=product_name_textField.getText();
					if(prod_name.equals(""))
					{
						JOptionPane.showMessageDialog(null, "Please enter the product name");
						break;
					}
					else
					{
						WelcomeScreen.setVisible(false);
						productDetails.setVisible(true);
						break;
					}
				}
			}
		});


		JButton btnNewButton = new JButton("DONE");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
		btnNewButton.setBounds(225, 354, 278, 44);
		btnNewButton.setFocusPainted(false);
		productDetails.add(btnNewButton);

		JLabel lblGiveThe = new JLabel("Give the");
		lblGiveThe.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lblGiveThe.setBounds(70, 72, 60, 22);
		productDetails.add(lblGiveThe);

		JFormattedTextField formattedTextField = new JFormattedTextField(new SimpleDateFormat("dd/MM/yyyy"));
		formattedTextField.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
		formattedTextField.setValue(new java.util.Date());

		formattedTextField.setBounds(289, 192, 214, 36);
		productDetails.add(formattedTextField);


		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String username1=username_textField.getText(); 
				String prb=prbDesc.getText();

				java.util.Date date=(java.util.Date)formattedTextField.getValue();
				String username=username_tf.getText();
				String chosen_seller=select_seller.getSelectedItem().toString();
				String choosen_product=select_product.getSelectedItem().toString();
				String warranty;
				if(rdbtnNo.isSelected())
					warranty="no";
				else
					warranty="yes";

				String prod_type= select_product.getSelectedItem().toString();
				String prod_name=product_name_textField.getText();


				if(prb.equals("")||formattedTextField.equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please enter all the details");
				}

				else
				{

					try
					{
						Class.forName("com.mysql.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","");
						Statement stmt=con.createStatement();

						String query="insert into products(username,seller,prod_type,prod_name,problem,mdate,warranty)"+"values(?,?,?,?,?,?,?)";

						ResultSet rs3=stmt.executeQuery("select email from customer where username='"+username+"'");
						rs3.next();
						email=rs3.getString(1);

						PreparedStatement pst=con.prepareStatement(query);

						pst.setString(1,username);
						pst.setString(2,chosen_seller);
						pst.setString(3, prod_type);
						pst.setString(4,prod_name);
						pst.setString(5,prb);
						pst.setDate(6,new java.sql.Date(date.getTime()));
						pst.setString(7,warranty);

						pst.execute();

						System.out.println(email+"->");

						JOptionPane.showMessageDialog(null,"Thanks, a mail has been sent regarding your claim!!","Email sent", JOptionPane.INFORMATION_MESSAGE);
						try
						{
							if(rdbtnNo.isSelected())
								mail1();
							else
								mail();
							productDetails.setVisible(false);
							Email.setVisible(true);
						}
						catch(Exception e5)
						{
							JOptionPane.showMessageDialog(null,"Check internet connection.","Mail not sent", JOptionPane.ERROR_MESSAGE);
							productDetails.setVisible(false);
							userPage.setVisible(true);

						}

					}
					catch(Exception e4)
					{

						System.out.println(e4);
						JOptionPane.showMessageDialog(null, e4.getMessage(),"erroe!",JOptionPane.ERROR_MESSAGE);

					}
				}
			}
		});

		JLabel lblWelcome = new JLabel("WELCOME");
		lblWelcome.setForeground(Color.WHITE);
		lblWelcome.setFont(new Font("Yu Gothic UI", Font.BOLD, 30));
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setBounds(0, 0, 676, 111);
		panel_1.add(lblWelcome);	

		product_name_textField = new JTextField();
		product_name_textField.setBounds(315, 334, 139, 31);
		WelcomeScreen.add(product_name_textField);
		product_name_textField.setColumns(10);

		JLabel lblUsername_1 = new JLabel("username                        :");
		lblUsername_1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		lblUsername_1.setBounds(80, 195, 185, 31);
		WelcomeScreen.add(lblUsername_1);


		username_tf = new JTextField();
		username_tf.setEditable(false);
		username_tf.setColumns(10);
		username_tf.setBounds(315, 195, 139, 31);
		WelcomeScreen.add(username_tf);

		JButton btnCancel_2 = new JButton("CANCEL");
		btnCancel_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				WelcomeScreen.setVisible(false);
				userPage.setVisible(true);
			}
		});
		btnCancel_2.setForeground(Color.WHITE);
		btnCancel_2.setFocusPainted(false);
		btnCancel_2.setBackground(Color.BLUE);
		btnCancel_2.setBounds(80, 392, 89, 31);
		WelcomeScreen.add(btnCancel_2);

		JButton btnBack = new JButton("BACK");
		btnBack.setForeground(Color.WHITE);
		btnBack.setBackground(Color.BLACK);
		btnBack.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				username_textField.setText(null);
				password_textField.setText(null);
				AdminPage_1.setVisible(true);
				AdminScreen.setVisible(false);
			}
		});
		btnBack.setBounds(570, 407, 90, 35);
		AdminScreen.add(btnBack);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 179, 666, 217);
		AdminScreen.add(scrollPane);

		table =  new JTable();
		scrollPane.setViewportView(table);

		JButton btnRefresh = new JButton("REFRESH");
		btnRefresh.setFocusPainted(false);
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","");
					String query="select c.username,c.name,c.contact,c.email,c.address,p.seller,p.prod_name,p.problem,p.p_date,p.warranty from customer as c inner join products as p on c.username=p.username";
					Statement stmt=con.createStatement();
					stmt.execute(query);

					ResultSet rs=stmt.executeQuery(query);
					table.setModel(DbUtils.resultSetToTableModel(rs));
					table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

					/*TableRowSorter<TableModel> tr=new TableRowSorter<TableModel>();
					table.setRowSorter(tr);*/

					//tr.sort();

					System.out.println("success");
					//AdminScreen.setVisible(true);
				}
				catch(Exception e6)
				{
					JOptionPane.showMessageDialog(null, e6.getMessage(), "error!", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		btnRefresh.setForeground(Color.WHITE);
		btnRefresh.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		btnRefresh.setFocusPainted(false);
		btnRefresh.setBackground(Color.BLACK);
		btnRefresh.setBounds(32, 407, 116, 35);
		AdminScreen.add(btnRefresh);

		search_tf = new JTextField();
		search_tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				DefaultTableModel tb=(DefaultTableModel)table.getModel();
				String search=search_tf.getText().toLowerCase();
				TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(tb);
				table.setRowSorter(tr);
				tr.setRowFilter(RowFilter.regexFilter(search));
			}
		});
		search_tf.setBounds(141, 140, 187, 28);
		AdminScreen.add(search_tf);
		search_tf.setColumns(10);



		JLabel lblSearch = new JLabel("SEARCH:");
		lblSearch.setFont(new Font("Yu Gothic", Font.BOLD, 16));
		lblSearch.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearch.setBounds(32, 140, 99, 28);
		AdminScreen.add(lblSearch);



		JPanel panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBackground(Color.BLACK);
		panel_14.setBounds(0, 0, 686, 101);
		reset_pass.add(panel_14);

		JLabel label_12 = new JLabel("Change your password");
		label_12.setForeground(Color.WHITE);
		label_12.setFont(new Font("Yu Gothic UI", Font.PLAIN, 24));
		label_12.setBounds(119, 31, 253, 38);
		panel_14.add(label_12);

		JLabel label_13 = new JLabel("PASSWORD");
		label_13.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
		label_13.setBounds(155, 173, 113, 45);
		reset_pass.add(label_13);

		entered_reset_pass = new JPasswordField();
		entered_reset_pass.setHorizontalAlignment(SwingConstants.CENTER);
		entered_reset_pass.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		entered_reset_pass.setBounds(301, 173, 208, 45);
		reset_pass.add(entered_reset_pass);

		JLabel label_14 = new JLabel("PASSWORD");
		label_14.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
		label_14.setBounds(155, 268, 113, 27);
		reset_pass.add(label_14);

		entered_rest_pass_confirm = new JPasswordField();
		entered_rest_pass_confirm.setHorizontalAlignment(SwingConstants.CENTER);
		entered_rest_pass_confirm.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		entered_rest_pass_confirm.setBounds(301, 250, 208, 45);
		reset_pass.add(entered_rest_pass_confirm);

		JLabel label_15 = new JLabel("CONFIRM");
		label_15.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
		label_15.setBounds(155, 246, 113, 27);
		reset_pass.add(label_15);

		JButton button_2 = new JButton("Change Password");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String pass1=entered_reset_pass.getText();
				String pass2=entered_rest_pass_confirm.getText();

				while(true)
				{


					if(pass1.equals("")||pass2.equals(""))
					{
						JOptionPane.showMessageDialog(null, "Please enter your password!", "Incomplete details", JOptionPane.ERROR_MESSAGE);
						break;
					}

					if(! pass1.equals(pass2))
					{
						JOptionPane.showMessageDialog(null, "The password doesnt match!", "Invalid password", JOptionPane.ERROR_MESSAGE);
						break;
					}
					if(pass1.equals(pass2))
					{

						try
						{



							Class.forName("com.mysql.jdbc.Driver");
							Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","");

							String query1= "UPDATE userlogin SET password='"+pass1+"' WHERE username='"+username_textField.getText()+"'";

							Statement stmt=con.createStatement();
							stmt.executeUpdate(query1);

							System.out.println("password changed -> "+pass1);

							entered_reset_pass.setText(null);
							entered_rest_pass_confirm.setText(null);

							username_textField.setText(null);
							password_textField.setText(null);

							JOptionPane.showMessageDialog(null, "Your password has successfully been changed!", "Success", JOptionPane.INFORMATION_MESSAGE);
							reset_pass.setVisible(false);
							HomeScreen.setVisible(true);
							break;
						}

						catch(Exception e1)
						{
							JOptionPane.showMessageDialog(null, e1.getMessage(), "error!", JOptionPane.ERROR_MESSAGE);
							break;
						}

					}
				}
			}
		});
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
		button_2.setFocusPainted(false);
		button_2.setBackground(SystemColor.desktop);
		button_2.setBounds(155, 341, 354, 45);
		reset_pass.add(button_2);



		JPanel panel_17 = new JPanel();
		panel_17.setBackground(Color.BLACK);
		panel_17.setBounds(0, 0, 686, 103);
		user_review.add(panel_17);
		panel_17.setLayout(null);

		JLabel lblUserReviews = new JLabel("USER REVIEWS");
		lblUserReviews.setFont(new Font("Yu Gothic UI", Font.BOLD, 28));
		lblUserReviews.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserReviews.setForeground(Color.WHITE);
		lblUserReviews.setBounds(10, 11, 666, 70);
		panel_17.add(lblUserReviews);

		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(22, 177, 452, 213);
		user_review.add(scrollPane_3);

		review_table = new JTable();
		scrollPane_3.setViewportView(review_table);

		JLabel label_16 = new JLabel("SEARCH:");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		label_16.setBounds(22, 126, 83, 33);
		user_review.add(label_16);

		search_textfield = new JTextField();
		search_textfield.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				DefaultTableModel tb=(DefaultTableModel)review_table.getModel();
				String search=search_textfield.getText().toLowerCase();
				TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(tb);
				review_table.setRowSorter(tr);
				tr.setRowFilter(RowFilter.regexFilter(search));
			}
		});
		search_textfield.setColumns(10);
		search_textfield.setBounds(115, 124, 359, 35);
		user_review.add(search_textfield);

		JButton button_6 = new JButton("BACK");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				user_review.setVisible(false);
				AdminPage_1.setVisible(true);
			}
		});
		button_6.setForeground(Color.WHITE);
		button_6.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		button_6.setBackground(Color.BLACK);
		button_6.setBounds(542, 410, 90, 35);
		user_review.add(button_6);

		JButton button_7 = new JButton("REFRESH");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","");
					String query="select * from feedback";
					Statement stmt=con.createStatement();
					stmt.execute(query);

					ResultSet rs=stmt.executeQuery(query);
					review_table.setModel(DbUtils.resultSetToTableModel(rs));
					review_table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
					TableColumnModel col=review_table.getColumnModel();
					col.getColumn(0).setPreferredWidth(120);
					col.getColumn(1).setPreferredWidth(120);
					col.getColumn(2).setPreferredWidth(120);
					col.getColumn(3).setPreferredWidth(120);
				}
				catch(Exception e4)
				{
					JOptionPane.showMessageDialog(null, e4.getMessage(), "error!", JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		button_7.setForeground(Color.WHITE);
		button_7.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		button_7.setFocusPainted(false);
		button_7.setBackground(Color.BLACK);
		button_7.setBounds(22, 410, 116, 35);
		user_review.add(button_7);

		JLabel lblTotalReview = new JLabel("AVG RATING:");
		lblTotalReview.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalReview.setFont(new Font("Yu Gothic", Font.PLAIN, 15));
		lblTotalReview.setBounds(520, 130, 135, 28);
		user_review.add(lblTotalReview);



		JLabel lblUserCount = new JLabel("USER COUNT:");
		lblUserCount.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserCount.setFont(new Font("Yu Gothic", Font.PLAIN, 15));
		lblUserCount.setBounds(520, 263, 135, 28);
		user_review.add(lblUserCount);




	}

	public void mail()
	{



		final String username = "EcommerceServicesOfficial@gmail.com";
		final String password = "ecommerce123";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try 
		{

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("EcommerceServicesOfficial@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(email));
			message.setSubject("Ecommerce service");
			message.setText("Hi,\n\nWe have received your request.\nplease wait for 7 days our executive will contact you. If, you want a replacement for your product please tell the contact person about it when he arrives.\n\nRegards,\nEcommerce Services Team.");

			Transport.send(message);

			System.out.println("Mail sent Successfully!");

		} 
		catch (MessagingException e) 
		{
			throw new RuntimeException(e);
		}

	}public void mail1()
	{



		final String username = "EcommerceServicesOfficial@gmail.com";
		final String password = "ecommerce123";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try 
		{

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("EcommerceServicesOfficial@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(email));
			message.setSubject("Ecommerce service");
			message.setText("Hi,\n\nWe have received your request.\nplease wait for 7 days our executive will contact you. Since, your product's warranty period is over a service charge of Rs.300/- must be paid.\n\nRegards,\nEcommerce Services Team.");

			Transport.send(message);

			System.out.println("Mail sent Successfully!");

		} 
		catch (MessagingException e) 
		{
			throw new RuntimeException(e);
		}

	}



	//mail() for otp

	public void mail(int otp)
	{



		final String username = "EcommerceServicesOfficial@gmail.com";
		final String password = "ecommerce123";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try 
		{

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("EcommerceServicesOfficial@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(entered_mail));
			message.setSubject("Ecommerce services - OTP");
			message.setText("Hi,\n\nYou have requested for a password change.\nThe OTP is: "+otp+".\n\nPlease do not share the otp.\n\nRegards,\nEcommerce Services Team.");

			Transport.send(message);

			System.out.println("OTP mailed successfully!");




		} 
		catch (MessagingException e) 
		{
			throw new RuntimeException(e);
		}
	}
}
