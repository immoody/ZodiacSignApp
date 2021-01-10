import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JList;

public class GUI {

	private JFrame frame;
	private JTextField Name;
	private JTextField Month;
	private JTextField Day;
	private JTextField Hour;
	private JTextField Minute;
	private JPanel CreatingProfile;
	private JPanel Start;
	private JPanel ChooseProfile;
	private JPanel MainMenu;
	private JComboBox ProfileList;
	Profile Choosen;
	private JPanel Cycle;
	private JPanel FortuneTellerPanel;
	private JLabel ZodiacFortunetext;
	MathCheck match;
	ZodiacSign[] ZodiacSignList = {ZodiacSign.ARIES,ZodiacSign.TAURUS, ZodiacSign.GEMINI, ZodiacSign.CANCER, ZodiacSign.LEO, ZodiacSign.VIRGO, ZodiacSign.LIBRA, ZodiacSign.SCORPIO, ZodiacSign.SAGITTARIUS, ZodiacSign.CAPRICORN, ZodiacSign.AQUARIUS ,ZodiacSign.PISCES};
	private JPanel MatchCheckingPanel;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		System.out.println(Main.Pool.toString());
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Object[] PoolArray = Main.Pool.toArray();
		frame = new JFrame();
		frame.setBounds(100, 100, 576, 387);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		Start = new JPanel();
		frame.getContentPane().add(Start, "name_24386841542500");
		Start.setVisible(true);
		
		CreatingProfile = new JPanel();
		frame.getContentPane().add(CreatingProfile, "name_24447352166800");
		CreatingProfile.setVisible(false);
		
		ChooseProfile = new JPanel();
		ChooseProfile.setVisible(false);
		frame.getContentPane().add(ChooseProfile, "name_24918711075700");
		
		MainMenu = new JPanel();
		frame.getContentPane().add(MainMenu, "name_24930928191300");
		MainMenu.setVisible(false);
		ZodiacFortunetext = new JLabel("");
		
		JButton StartButton = new JButton("Press to Start");
		StartButton.setBounds(0, 0, 560, 289);
		StartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Profile.count == 0) {
					Start.setVisible(false);
					CreatingProfile.setVisible(true);
				}
				else {
					Start.setVisible(false);
					ChooseProfile.setVisible(true);
				
				}
					
			}
		});
		Start.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Press the button to start");
		lblNewLabel_1.setBounds(222, 300, 276, 14);
		Start.add(lblNewLabel_1);
		Start.add(StartButton);
		
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(0, 1, 81, 37);
		
		Name = new JTextField();
		Name.setBounds(85, 0, 239, 39);
		Name.setColumns(10);
		
		JLabel lblMonthOfBirth = new JLabel("Month of Birth");
		lblMonthOfBirth.setBounds(0, 46, 81, 37);
		
		Month = new JTextField();
		Month.setBounds(85, 45, 239, 39);
		Month.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Day of Birth");
		lblNewLabel_2_1.setBounds(0, 91, 81, 37);
		
		JLabel lblNewLabel_2_2 = new JLabel("Hour of Birth");
		lblNewLabel_2_2.setBounds(0, 136, 81, 37);
		
		JLabel lblNewLabel_2_3 = new JLabel("Minute of Birth");
		lblNewLabel_2_3.setBounds(0, 181, 81, 37);
		
		Day = new JTextField();
		Day.setBounds(85, 90, 239, 39);
		Day.setColumns(10);
		
		Hour = new JTextField();
		Hour.setBounds(85, 135, 239, 39);
		Hour.setColumns(10);
		
		Minute = new JTextField();
		Minute.setBounds(85, 180, 239, 39);
		Minute.setColumns(10);
		
		JButton CreateProfileButton = new JButton("Create a Profile");
		CreateProfileButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int valid = 0;
				Profile x = new Profile();
				x.setName(Name.getText());
				 int month = Integer.parseInt(Month.getText());
	                if(month>0 && month<13){
	                	x.setBornMonth(Integer.parseInt(Month.getText()));
	                	valid += 1;
	                }
	                else {
	                    JOptionPane.showInputDialog(this,"Unvalid Month. Please insert a valid number.");
	                    
	                }
	                int day = Integer.parseInt(Day.getText());
	                if(day>0 && 31>day){
	                    x.setBornDay(day);
	                    valid +=1;
	                }
	                else {
	                	 JOptionPane.showInputDialog(this,"Unvalid Day. Please insert a valid number.");
	                	 
	                }
	                int hour = Integer.parseInt(Hour.getText());
	                if(hour>0 && 25>hour){
	                    x.setBornHour(hour);
	                    valid +=1;
	                }
	                else {
	                	JOptionPane.showInputDialog(this,"Unvalid Hour. Please insert a valid number.");
	                	
	                }
	                int minute = Integer.parseInt(Minute.getText());
	                if(minute>0 && 61>minute){
	                    x.setBornMinute(minute);
	                    valid +=1;
	                }
	                else {
	                	JOptionPane.showInputDialog(this,"Unvalid minute. Please insert a valid number.");
	                	
	                }
	                
	                if(valid == 4) {
			x.signZodiac();
			Main.Pool.add(x);
			System.out.println(x.getMoonSign());
			CreatingProfile.setVisible(false);
			MainMenu.setVisible(true);
	ProfileList.addItem(x);
	Choosen = x;
			
	                }
	                else
	                	JOptionPane.showInputDialog(this,"Unvalid input. Please insert a valid number.");
	                
			}
		});
		CreateProfileButton.setBounds(359, 237, 191, 100);
		CreatingProfile.setLayout(null);
		CreatingProfile.add(lblMonthOfBirth);
		CreatingProfile.add(Month);
		CreatingProfile.add(lblNewLabel_2_1);
		CreatingProfile.add(lblNewLabel_2_2);
		CreatingProfile.add(lblNewLabel_2_3);
		CreatingProfile.add(Hour);
		CreatingProfile.add(Day);
		CreatingProfile.add(Minute);
		CreatingProfile.add(CreateProfileButton);
		CreatingProfile.add(lblNewLabel);
		CreatingProfile.add(Name);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Choose a profile");
		lblNewLabel_2.setBounds(10, 37, 138, 49);
		
		JButton ProfileChooseButton = new JButton("Choose Profile");
		ProfileChooseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Choosen = (Profile) ProfileList.getSelectedItem();
				System.out.println(Choosen.toString());
				ChooseProfile.setVisible(false);
				MainMenu.setVisible(true);
			}
		});
		ProfileChooseButton.setBounds(152, 97, 101, 35);
		
		ProfileList = new JComboBox();
		ProfileList.setBounds(152, 39, 241, 45);
		ChooseProfile.setLayout(null);
		ChooseProfile.add(lblNewLabel_2);
		ChooseProfile.add(ProfileChooseButton);
		ChooseProfile.add(ProfileList);
		
		JLabel lblNewLabel_4 = new JLabel("Create New Profile");
		lblNewLabel_4.setBounds(10, 306, 114, 31);
		ChooseProfile.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("New Profile");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChooseProfile.setVisible(false);
				CreatingProfile.setVisible(true);
			}
		});
		btnNewButton.setBounds(152, 302, 101, 38);
		ChooseProfile.add(btnNewButton);
		
		
		JButton btnNewButton_3 = new JButton("Zodiac Sign");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu.setVisible(false);
				FortuneTellerPanel.setVisible(true);
				ZodiacFortunetext.setText(Choosen.SignZodiacSignFortune());
				
			}
		});
		btnNewButton_3.setBounds(0, 0, 560, 88);
		
		JButton btnNewButton_3_1 = new JButton("Match Checking");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu.setVisible(false);
				MatchCheckingPanel.setVisible(true);
			}
		});
		btnNewButton_3_1.setBounds(0, 94, 560, 93);
		
		JButton btnNewButton_3_1_1 = new JButton("Cycles");
		btnNewButton_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu.setVisible(false);
				Cycle.setVisible(true);
			}
		});
		btnNewButton_3_1_1.setBounds(0, 193, 560, 103);
		
		JLabel lblNewLabel_3 = new JLabel("Go back to choose a profile");
		lblNewLabel_3.setBounds(192, 302, 135, 39);
		
		JButton btnNewButton_4 = new JButton("Go back");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu.setVisible(false);
				ChooseProfile.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(438, 306, 112, 31);
		MainMenu.setLayout(null);
		MainMenu.add(btnNewButton_3);
		MainMenu.add(lblNewLabel_3);
		MainMenu.add(btnNewButton_4);
		MainMenu.add(btnNewButton_3_1);
		MainMenu.add(btnNewButton_3_1_1);
		
		Cycle Ecplise = new Cycle(07,27,"Eclipse");
		Cycle NewMoon = new Cycle(05,17,"New Moon");
		Cycle = new JPanel();
		frame.getContentPane().add(Cycle, "name_133034917826299");
		
		JLabel labelCyle1 = new JLabel(Ecplise.getName());
		
		JLabel labelCyle1_Month = new JLabel("Remaning Month :" +Ecplise.getRemainigMonth());
		
		JLabel labelCyle1_Day = new JLabel("Remaning Day"+ Ecplise.getRemainigDay());
		
		
		
		JButton btnNewButton_1 = new JButton("See Details");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, Ecplise.CycleFortune(Choosen));
			}
		});
		
		JLabel labelCyle1_1 = new JLabel(NewMoon.getName());
		
		JLabel labelCyle1_Month_1 = new JLabel("Remaning Month :"+ NewMoon.getRemainigMonth());
		
		JLabel labelCyle1_Month_2 = new JLabel("Remaning Day :"+ NewMoon.getRemainigDay());
		
		JButton btnNewButton_1_1 = new JButton("See Details");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, NewMoon.CycleFortune(Choosen));
			}
		});
		
		JButton btnNewButton_2 = new JButton("Main Menu");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cycle.setVisible(false);
				MainMenu.setVisible(true);
			}
		});
		GroupLayout gl_Cycle = new GroupLayout(Cycle);
		gl_Cycle.setHorizontalGroup(
			gl_Cycle.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_Cycle.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_Cycle.createParallelGroup(Alignment.LEADING)
						.addComponent(labelCyle1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
						.addComponent(labelCyle1_1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_Cycle.createParallelGroup(Alignment.LEADING, false)
						.addComponent(labelCyle1_Month_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(labelCyle1_Month, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_Cycle.createParallelGroup(Alignment.LEADING)
						.addComponent(labelCyle1_Month_2, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
						.addComponent(labelCyle1_Day, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED, 18, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_Cycle.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
				.addGroup(gl_Cycle.createSequentialGroup()
					.addContainerGap(425, Short.MAX_VALUE)
					.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addGap(21))
		);
		gl_Cycle.setVerticalGroup(
			gl_Cycle.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Cycle.createSequentialGroup()
					.addGap(34)
					.addGroup(gl_Cycle.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Cycle.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
							.addComponent(labelCyle1_Day, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
						.addComponent(labelCyle1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addComponent(labelCyle1_Month, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(gl_Cycle.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Cycle.createParallelGroup(Alignment.BASELINE)
							.addComponent(labelCyle1_1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
							.addComponent(labelCyle1_Month_1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Cycle.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
							.addComponent(labelCyle1_Month_2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
					.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		Cycle.setLayout(gl_Cycle);
		
		FortuneTellerPanel = new JPanel();
		frame.getContentPane().add(FortuneTellerPanel, "name_1542855809100");
		
		JLabel lblNewLabel_5 = new JLabel("Zodiac Sign Fortune");
		
		
		 
		
		JButton FortuneButton = new JButton("Main Menu");
		FortuneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FortuneTellerPanel.setVisible(false);
				MainMenu.setVisible(true);
			}
		});
		
	
		GroupLayout gl_FortuneTellerPanel = new GroupLayout(FortuneTellerPanel);
		gl_FortuneTellerPanel.setHorizontalGroup(
			gl_FortuneTellerPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_FortuneTellerPanel.createSequentialGroup()
					.addContainerGap(213, Short.MAX_VALUE)
					.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
					.addGap(193))
				.addGroup(gl_FortuneTellerPanel.createSequentialGroup()
					.addGap(34)
					.addComponent(ZodiacFortunetext, GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
					.addGap(47))
				.addGroup(Alignment.TRAILING, gl_FortuneTellerPanel.createSequentialGroup()
					.addContainerGap(431, Short.MAX_VALUE)
					.addComponent(FortuneButton, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addGap(29))
		);
		gl_FortuneTellerPanel.setVerticalGroup(
			gl_FortuneTellerPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_FortuneTellerPanel.createSequentialGroup()
					.addGap(60)
					.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(ZodiacFortunetext, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
					.addGap(33)
					.addComponent(FortuneButton, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		FortuneTellerPanel.setLayout(gl_FortuneTellerPanel);
		
		MatchCheckingPanel = new JPanel();
		frame.getContentPane().add(MatchCheckingPanel, "name_19798088544300");
		
		JList list = new JList(ZodiacSignList);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		
		
		JLabel lblNewLabel_6 = new JLabel("Overall ");
		
		JLabel lblNewLabel_6_1 = new JLabel("Love&Mariddge");
		
		JLabel lblNewLabel_6_2 = new JLabel("Communication");
		
		JLabel Overall = new JLabel("");
		
		JLabel Loveand = new JLabel("");
		
		JLabel commu = new JLabel("");
		
		JLabel Fortune = new JLabel("");
		
		JButton btnNewButton_5 = new JButton("Main Menu");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MatchCheckingPanel.setVisible(false);
				MainMenu.setVisible(true);
			}
		});
		
		JButton CheckButton = new JButton("Check Match");
		CheckButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				match = new MathCheck(Choosen,(ZodiacSign)list.getSelectedValue());
				Overall.setText(match.getOverall()+"/100");
				Loveand.setText(match.getLoveAndMarridge()+"/100");
				commu.setText(match.getCommucation()+"/100");
				//Fortune.setText(match.getOverallFortune()+"\n"+match.getLoveAndMarridgeFortune()+"\n"+match.getCommucationFortune());
				String writing = match.getOverallFortune()+"\n"+match.getLoveAndMarridgeFortune()+"\n"+match.getCommucationFortune();
				Fortune.setText(writing);
				
			}
		});
		GroupLayout gl_MatchCheckingPanel = new GroupLayout(MatchCheckingPanel);
		gl_MatchCheckingPanel.setHorizontalGroup(
			gl_MatchCheckingPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_MatchCheckingPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_MatchCheckingPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(list, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
						.addComponent(CheckButton, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_MatchCheckingPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_MatchCheckingPanel.createSequentialGroup()
							.addGap(39)
							.addGroup(gl_MatchCheckingPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_MatchCheckingPanel.createSequentialGroup()
									.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(Overall, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_MatchCheckingPanel.createSequentialGroup()
									.addComponent(lblNewLabel_6_1, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(Loveand, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_MatchCheckingPanel.createSequentialGroup()
									.addComponent(lblNewLabel_6_2, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(commu, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_MatchCheckingPanel.createSequentialGroup()
							.addGap(18)
							.addComponent(Fortune, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnNewButton_5, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_MatchCheckingPanel.setVerticalGroup(
			gl_MatchCheckingPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_MatchCheckingPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_MatchCheckingPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton_5, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addGroup(Alignment.LEADING, gl_MatchCheckingPanel.createSequentialGroup()
							.addGroup(gl_MatchCheckingPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
								.addComponent(Overall, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_MatchCheckingPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_6_1, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
								.addComponent(Loveand, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_MatchCheckingPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(commu, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_6_2, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(Fortune, GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, gl_MatchCheckingPanel.createSequentialGroup()
							.addComponent(list)
							.addPreferredGap(ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
							.addComponent(CheckButton, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		MatchCheckingPanel.setLayout(gl_MatchCheckingPanel);
	}
}
