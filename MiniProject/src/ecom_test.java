import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.CardLayout;
import java.awt.Panel;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Toolkit;

import javax.swing.JPanel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
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



public class ecom_test {

	private JFrame frame;
	private JTextField username_textField;
	private JPasswordField password_textField;
	private Panel HomeScreen,SignUp,Register,AdminScreen,WelcomeScreen,productDetails,Email;
	private JTextField name_textField;
	private JTextField contact_textField;
	private JTextField mail_textField;
	private JTextField select_username;
	private JPasswordField select_password;
	private JPasswordField repeat_password;
	private JTextField textField;
	String username,password;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ecom_test window = new ecom_test();
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
	public ecom_test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setResizable(false);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Krishna Chaitanya\\Downloads"));
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
			panel.setBounds(0, 0, 676, 91);
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
			panel_2.setBounds(0, 0, 676, 93);
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
			nextBtn.setBackground(SystemColor.desktop);
			nextBtn.setForeground(Color.WHITE);
			nextBtn.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
			nextBtn.setBounds(459, 396, 103, 39);
			SignUp.add(nextBtn);
			nextBtn.setFocusPainted(false);
			nextBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					String name=name_textField.getText();
					String contact=contact_textField.getText();
					String email=mail_textField.getText();
					String address=address_textField.getText();
					
					SignUp.setVisible(false);
					Register.setVisible(true);
					try
					{
						Class.forName("com.mysql.jdbc.Driver");
						System.out.println("Success 1");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","");
						
						String query="insert into customer(name,email,contact,address)"+"values(?,?,?,?)";
						PreparedStatement pst=con.prepareStatement(query);
						pst.setString(1,name);
						pst.setString(2,email);
						pst.setString(3, contact);
						pst.setString(4, address);
						pst.execute();
						System.out.println("Data inserted succesfully");
						//JOptionPane.showMessageDialog(null,"insertion successfull");
					}						
					catch(Exception e1)
					{
						JOptionPane.showMessageDialog(null,"Cannot update contents to database!");
					}
				}
			});
			
		
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
			lblPurchasedThrough.setBounds(80, 180, 185, 31);
			WelcomeScreen.add(lblPurchasedThrough);
			
			final String[] sellers= {"Amazon", "Flipkart", "Snapdeal"};
			
			JComboBox select_seller = new JComboBox(sellers);
			select_seller.setMaximumRowCount(20);
			select_seller.setLightWeightPopupEnabled(false);
			select_seller.setBounds(315, 180, 139, 31);
			WelcomeScreen.add(select_seller);
			select_seller.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
					String seller=select_seller.getSelectedItem().toString();
					
				}
			});
			
			
			JLabel lblChooseYourProduct = new JLabel("Choose your product     :");
			lblChooseYourProduct.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
			lblChooseYourProduct.setBounds(80, 237, 185, 31);
			WelcomeScreen.add(lblChooseYourProduct);
			
			final String[] products= {"Smartphones", "Laptops", "Accessories", "Shirts", "Pants", "Beds"};
			JComboBox select_product = new JComboBox(products);
			select_product.setLightWeightPopupEnabled(false);
			select_product.setBounds(315, 237, 139, 31);
			WelcomeScreen.add(select_product);
			select_product.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
					String seller=select_seller.getSelectedItem().toString();
					System.out.println(seller);
				}
			});
			
			JLabel lblProductDetails = new JLabel("Product type                   :");
			lblProductDetails.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
			lblProductDetails.setBounds(80, 342, 185, 32);
			WelcomeScreen.add(lblProductDetails);
			
			JComboBox product_type = new JComboBox();
			product_type.setEnabled(false);
			product_type.setBounds(315, 345, 139, 32);
			WelcomeScreen.add(product_type);
			
			JLabel lblProductCompany = new JLabel("Product Company          :");
			lblProductCompany.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
			lblProductCompany.setBounds(80, 286, 185, 31);
			WelcomeScreen.add(lblProductCompany);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setBounds(315, 286, 139, 31);
			WelcomeScreen.add(comboBox);
			
			
			
			
			
			
			JPanel AdminScreen = new JPanel();
			frame.getContentPane().add(AdminScreen, "name_10530618256050");
			AdminScreen.setLayout(null);
			AdminScreen.setVisible(false);
				
				JPanel panel_5 = new JPanel();
				panel_5.setBackground(new Color(106, 90, 205));
				panel_5.setBounds(0, 0, 686, 129);
				AdminScreen.add(panel_5);
				panel_5.setLayout(null);
				
				JLabel lblWelcomeAdmin = new JLabel("Welcome Admin!");
				lblWelcomeAdmin.setForeground(new Color(255, 255, 255));
				lblWelcomeAdmin.setFont(new Font("Yu Gothic UI", Font.BOLD, 26));
				lblWelcomeAdmin.setHorizontalAlignment(SwingConstants.CENTER);
				lblWelcomeAdmin.setBounds(0, 0, 686, 129);
				panel_5.add(lblWelcomeAdmin);
				
				JLabel lblDatabase = new JLabel("Database");
				lblDatabase.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
				lblDatabase.setBounds(22, 140, 92, 41);
				AdminScreen.add(lblDatabase);
				
				table = new JTable();
				table.setBounds(22, 357, 600, -152);
				AdminScreen.add(table);
		
			Panel productDetails = new Panel();
			frame.getContentPane().add(productDetails, "name_524029363787170");
			productDetails.setLayout(null);
			productDetails.setVisible(false);
				
				JLabel lblProblemDescription = new JLabel("Problem description");
				lblProblemDescription.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
				lblProblemDescription.setBounds(38, 68, 176, 36);
				productDetails.add(lblProblemDescription);
					
				TextArea textArea = new TextArea();
				textArea.setBounds(247, 27, 360, 138);
				productDetails.add(textArea);
					
				JLabel lblManufactureDate = new JLabel("Manufacture date:");
				lblManufactureDate.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
				lblManufactureDate.setBounds(38, 206, 143, 36);
				productDetails.add(lblManufactureDate);
					
				JLabel lblDoYouHave = new JLabel("Do you have a warranty?");
				lblDoYouHave.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
				lblDoYouHave.setBounds(38, 274, 203, 27);
				productDetails.add(lblDoYouHave);
					
				JRadioButton rdbtnYes = new JRadioButton("YES");
				rdbtnYes.setBounds(247, 279, 65, 23);
				productDetails.add(rdbtnYes);
					
				JRadioButton rdbtnNo = new JRadioButton("NO");
				rdbtnNo.setBounds(324, 279, 65, 23);
				productDetails.add(rdbtnNo);
					
				ButtonGroup b=new ButtonGroup();
				b.add(rdbtnYes);
				b.add(rdbtnNo);
					
				textField = new JTextField();
				textField.setBounds(245, 215, 218, 25);
				productDetails.add(textField);
				textField.setColumns(10);
					
			JPanel Email = new JPanel();
			frame.getContentPane().add(Email, "name_534329488130798");
			Email.setLayout(null);
			Email.setVisible(false);
					
				JPanel panel_3 = new JPanel();
				panel_3.setBackground(new Color(106, 90, 205));
				panel_3.setBounds(0, 0, 676, 446);
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
					
				JButton btnNewButton_1 = new JButton("OK");
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						frame.dispose();
					}
				});
				btnNewButton_1.setBackground(Color.BLACK);
				btnNewButton_1.setForeground(Color.WHITE);
				btnNewButton_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 25));
				btnNewButton_1.setBounds(276, 348, 156, 61);
				panel_3.add(btnNewButton_1);		
				
		Panel HomeScreen = new Panel();
		frame.getContentPane().add(HomeScreen, "name_508416487677679");
		HomeScreen.setLayout(null);
		HomeScreen.setVisible(true);
		
			JLabel logo = new JLabel("");
			logo.setBounds(25, 126, 281, 270);
			logo.setIcon(new ImageIcon("C:\\Users\\Krishna Chaitanya\\Downloads"));
			HomeScreen.add(logo);
			
			JPanel SidePanel = new JPanel();
			SidePanel.setBackground(Color.BLACK);
			SidePanel.setBounds(0, 0, 201, 456);
			HomeScreen.add(SidePanel);
			
			JLabel EcommerceServices_label = new JLabel("E-Commerce Services");
			EcommerceServices_label.setHorizontalAlignment(SwingConstants.CENTER);
			EcommerceServices_label.setFont(new Font("Yu Gothic UI", Font.PLAIN, 35));
			EcommerceServices_label.setBounds(309, 47, 338, 80);
			HomeScreen.add(EcommerceServices_label);
			
			username_textField = new JTextField();
			
			Font font=new Font("Yu Gothic UI",Font.BOLD,18);
			username_textField.setFont(font);
			username_textField.setHorizontalAlignment(JTextField.CENTER);
			username_textField.setBounds(338, 157, 281, 47);
			HomeScreen.add(username_textField);
			username_textField.setColumns(10);
			
			password_textField = new JPasswordField();
			
			password_textField.setHorizontalAlignment(JTextField.CENTER);
			password_textField.setBounds(338, 215, 281, 47);
			HomeScreen.add(password_textField);
			
			JButton LoginBtn = new JButton("LOGIN");
			LoginBtn.setFocusPainted(false);
			LoginBtn.setBackground(Color.BLACK);
			LoginBtn.setForeground(Color.WHITE);
			LoginBtn.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
			LoginBtn.setBounds(338, 277, 281, 47);
			HomeScreen.add(LoginBtn);
			LoginBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					String username=username_textField.getText();
					String username1=username_textField.getText();
					@SuppressWarnings("deprecation")
					String password=password_textField.getText();
					String password1=password_textField.getText();
					try
					{
						Class.forName("com.mysql.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","");
						Statement stmt=con.createStatement();
						String query="select * from adminlogin where username=? and password=?";
						String query2="select * from userlogin where username=? and password=?";
						PreparedStatement pst=con.prepareStatement(query);
						PreparedStatement pst1=con.prepareStatement(query2);
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
								System.out.println("Admin Login Successfull");
								AdminScreen.setVisible(true);
							}
								
							else if(rs1.next())
							{
								System.out.println("Login Successfull");
								WelcomeScreen.setVisible(true);
							}
							else
							{
								JOptionPane.showMessageDialog(null,"    username incorrect\nplease sign up for a new account");
								
							}
							
						}
						catch(Exception e1)
						{
							System.out.println("cannot connect");
						}
							
						
				}
						
	
					
					catch(Exception e1)
					{
						System.out.println("cannot connect");
					}
				}
					
			});
			
			
			
			JButton doneBtn = new JButton("DONE");
			doneBtn.setBackground(SystemColor.desktop);
			doneBtn.setForeground(Color.WHITE);
			doneBtn.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
			doneBtn.setBounds(158, 356, 354, 45);
			Register.add(doneBtn);
			doneBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					Register.setVisible(false);
					HomeScreen.setVisible(true);
					
				}
			});
			
			JButton SignUpBtn = new JButton("SIGN UP FOR FREE");
			SignUpBtn.setFocusPainted(false);
			SignUpBtn.setBackground(Color.BLUE);
			SignUpBtn.setForeground(Color.WHITE);
			SignUpBtn.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
			SignUpBtn.setBounds(338, 363, 281, 47);
			HomeScreen.add(SignUpBtn);
			SignUpBtn.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent arg0) 
				{
					HomeScreen.setVisible(false);
					SignUp.setVisible(true);
					
				}
			});
			
		
		
			
			JButton btnNewButton = new JButton("DONE");
			btnNewButton.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
			btnNewButton.setBounds(247, 360, 149, 44);
			productDetails.add(btnNewButton);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) 
				{
					productDetails.setVisible(false);
					Email.setVisible(true);
					
				}
			});
			
				
		
			JButton btnNext = new JButton("NEXT");
			btnNext.setBackground(Color.BLUE);
			btnNext.setForeground(Color.WHITE);
			btnNext.setBounds(537, 388, 89, 31);
			WelcomeScreen.add(btnNext);
			btnNext.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) 
				{
					WelcomeScreen.setVisible(false);
					productDetails.setVisible(true);
				}
			});
				
				
			JLabel lblWelcome = new JLabel("WELCOME ");
			lblWelcome.setForeground(Color.WHITE);
			lblWelcome.setFont(new Font("Yu Gothic UI", Font.BOLD, 30));
			lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
			lblWelcome.setBounds(0, 0, 676, 111);
			panel_1.add(lblWelcome);	
			
			
			
			
			

       
	}
}