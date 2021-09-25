package panelExample;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RiskFrame extends javax.swing.JFrame implements ActionListener{

	// Use JSplitPane to split our window into two
    private final JSplitPane splitPane;  
    private final JSplitPane sp2;
    // Create our two panels
    private final JPanel myPanel = new JPanel();
    private final JPanel panel= new JPanel();
    private final JPanel rightPanel= new JPanel();
    // Declare our two player name labels
    private static JLabel label;
	private static JLabel label2;
	private static JLabel label3;
	private static JLabel label4;
	// Declare our two labels for users to choose there player names
	private static JTextField usertext1;
	private static JTextField usertext2;
	private static JTextField usertext3;
	private static JTextField usertext4;
	// Declare our button to select names and allocate territories
	private static JButton button1;
	private static JButton button2;

	// Declare multiple success label variables that print if player names are adequate
	private static JLabel success;
	private static JLabel success2;
	private static JLabel success3;
	private static JLabel success4;
	private static JLabel success5;
	private static JLabel success6;
	private static JLabel success7;
    	private static JLabel success8;
    	private static JLabel success9;
   	private static JLabel success10;
    	private static JLabel success11;
	//Declaring the dice for player 1 and player 2
	private static int die1;
	private static int die2;
    
    public RiskFrame(){
    	
    	
        splitPane = new JSplitPane();
        sp2 = new JSplitPane();
        
        // Declare your Main class to access its components
        Draw s = new Draw();

        // Declare your 42 Country name labels
        JLabel lbl1 = new JLabel("Ontario");
		JLabel lbl2 = new JLabel("Quebec");
		JLabel lbl3 = new JLabel("NW Territory");
		JLabel lbl4 = new JLabel("Alberta");
		JLabel lbl5 = new JLabel("Greenland");
		JLabel lbl6 = new JLabel("E United States");
		JLabel lbl7 = new JLabel("W United States");
		JLabel lbl8 = new JLabel("Central America");
		JLabel lbl9 = new JLabel("Alaska");
		JLabel lbl10 = new JLabel("Great Britain");
		JLabel lbl11 = new JLabel("W Europe");
		JLabel lbl12 = new JLabel("S Europe");
		JLabel lbl13 = new JLabel("Ukraine");
		JLabel lbl14 = new JLabel("N Europe");
		JLabel lbl15 = new JLabel("Iceland");
		JLabel lbl16 = new JLabel("Scandinavia");
		JLabel lbl17 = new JLabel("Afghanistan");
		JLabel lbl18 = new JLabel("India");
		JLabel lbl19 = new JLabel("Middle East");
		JLabel lbl20 = new JLabel("Japan");
		JLabel lbl21 = new JLabel("Ural");
		JLabel lbl22 = new JLabel("Yakutsk");
		JLabel lbl23 = new JLabel("Kamchatka");
		JLabel lbl24 = new JLabel("Siam");
		JLabel lbl25 = new JLabel("Irkutsk");
		JLabel lbl26 = new JLabel("Siberia");
		JLabel lbl27 = new JLabel("Mongolia");
		JLabel lbl28 = new JLabel("China");
		JLabel lbl29 = new JLabel("E Australia");
		JLabel lbl30 = new JLabel("New Guinea");
		JLabel lbl31 = new JLabel("W Australia");
		JLabel lbl32 = new JLabel("Indonesia");
		JLabel lbl33 = new JLabel("Venezuela");
		JLabel lbl34 = new JLabel("Peru");
		JLabel lbl35 = new JLabel("Brazil");
		JLabel lbl36 = new JLabel("Argentina");
		JLabel lbl37 = new JLabel("Congo");
		JLabel lbl38 = new JLabel("N Africa");
		JLabel lbl39 = new JLabel("S Africa");
		JLabel lbl40 = new JLabel("Egypt");
		JLabel lbl41 = new JLabel("E Africa");
		JLabel lbl42 = new JLabel("Madagascar");
		
		// Declare your 6 continent names
		JLabel continent1 = new JLabel("Asia (12)");
		JLabel continent2 = new JLabel("North America (9)");
		JLabel continent3 = new JLabel("Europe (7)");
		JLabel continent4 = new JLabel("Australia (4)");
		JLabel continent5 = new JLabel("Africa (6)");
		JLabel continent6 = new JLabel("South America (4)");
        
		// Declare Null layout and black background for the map panel
        myPanel.setLayout(null);
		myPanel.setBackground(Color.BLACK);

		// Add our country and continent labels
		myPanel.add(lbl1);
		myPanel.add(lbl2);
		myPanel.add(lbl3);
		myPanel.add(lbl4);
		myPanel.add(lbl5);
		myPanel.add(lbl6);
		myPanel.add(lbl7);
		myPanel.add(lbl8);
		myPanel.add(lbl9);
		myPanel.add(lbl10);
		myPanel.add(lbl11);
		myPanel.add(lbl12);
		myPanel.add(lbl13);
		myPanel.add(lbl14);
		myPanel.add(lbl15);
		myPanel.add(lbl16);
		myPanel.add(lbl17);
		myPanel.add(lbl18);
		myPanel.add(lbl19);
		myPanel.add(lbl20);
		myPanel.add(lbl21);
		myPanel.add(lbl22);
		myPanel.add(lbl23);
		myPanel.add(lbl24);
		myPanel.add(lbl25);
		myPanel.add(lbl26);
		myPanel.add(lbl27);
		myPanel.add(lbl28);
		myPanel.add(lbl29);
		myPanel.add(lbl30);
		myPanel.add(lbl31);
		myPanel.add(lbl32);
		myPanel.add(lbl33);
		myPanel.add(lbl34);
		myPanel.add(lbl35);
		myPanel.add(lbl36);
		myPanel.add(lbl37);
		myPanel.add(lbl38);
		myPanel.add(lbl39);
		myPanel.add(lbl40);
		myPanel.add(lbl41);
		myPanel.add(lbl42);
		myPanel.add(continent1);
		myPanel.add(continent2);
		myPanel.add(continent3);
		myPanel.add(continent4);
		myPanel.add(continent5);
		myPanel.add(continent6);
		
		// Add coordinates for your labels 
		lbl1.setLocation(191, 150);
		lbl2.setLocation(255, 161);
		lbl3.setLocation(146, 86);
		lbl4.setLocation(123, 144);
		lbl5.setLocation(314, 61);
		lbl6.setLocation(205, 235);
		lbl7.setLocation(135, 219);
		lbl8.setLocation(140, 299);
		lbl9.setLocation(45, 89);
		lbl10.setLocation(370, 199);
		lbl11.setLocation(398, 280);
		lbl12.setLocation(465, 270);
		lbl13.setLocation(547, 180);
		lbl14.setLocation(460, 200);
		lbl15.setLocation(393, 127);
		lbl16.setLocation(463, 122);
		lbl17.setLocation(628, 227);
		lbl18.setLocation(679, 332);
		lbl19.setLocation(572, 338);
		lbl20.setLocation(861, 213);
		lbl21.setLocation(645, 152);
		lbl22.setLocation(763, 70);
		lbl23.setLocation(827, 94);
		lbl24.setLocation(751, 360);
		lbl25.setLocation(750, 140);
		lbl26.setLocation(695, 108);
		lbl27.setLocation(760, 216);
		lbl28.setLocation(735, 277);
		lbl29.setLocation(889, 537);
		lbl30.setLocation(850, 429);
		lbl31.setLocation(813, 526);
		lbl32.setLocation(771, 454);
		lbl33.setLocation(213, 352);
		lbl34.setLocation(221, 426);
		lbl35.setLocation(289, 415);
		lbl36.setLocation(233, 523);
		lbl37.setLocation(496, 462);
		lbl38.setLocation(440,393);
		lbl39.setLocation(510, 532);
		lbl40.setLocation(499, 354);
		lbl41.setLocation(547, 432);
		lbl42.setLocation(586, 545);
		continent1.setLocation(35, 460);
		continent2.setLocation(35, 480);
		continent3.setLocation(35, 500);
		continent4.setLocation(35, 520);
		continent5.setLocation(35, 540);
		continent6.setLocation(35, 560);
		
		// Colour each of our country labels depending 
		// upon the continent they belong to
		lbl1.setForeground(Color.YELLOW);
		lbl2.setForeground(Color.YELLOW);
		lbl3.setForeground(Color.YELLOW);
		lbl4.setForeground(Color.YELLOW);
		lbl5.setForeground(Color.YELLOW);
		lbl6.setForeground(Color.YELLOW);
		lbl7.setForeground(Color.YELLOW);
		lbl8.setForeground(Color.YELLOW);
		lbl9.setForeground(Color.YELLOW);
		lbl10.setForeground(Color.BLUE);
		lbl11.setForeground(Color.BLUE);
		lbl12.setForeground(Color.BLUE);
		lbl13.setForeground(Color.BLUE);
		lbl14.setForeground(Color.BLUE);
		lbl15.setForeground(Color.BLUE);
		lbl16.setForeground(Color.BLUE);
		lbl17.setForeground(Color.GREEN);
		lbl18.setForeground(Color.GREEN);
		lbl19.setForeground(Color.GREEN);
		lbl20.setForeground(Color.GREEN);
		lbl21.setForeground(Color.GREEN);
		lbl22.setForeground(Color.GREEN);
		lbl23.setForeground(Color.GREEN);
		lbl24.setForeground(Color.GREEN);
		lbl25.setForeground(Color.GREEN);
		lbl26.setForeground(Color.GREEN);
		lbl27.setForeground(Color.GREEN);
		lbl28.setForeground(Color.GREEN);
		lbl29.setForeground(Color.PINK);
		lbl30.setForeground(Color.PINK);
		lbl31.setForeground(Color.PINK);
		lbl32.setForeground(Color.PINK);
		lbl33.setForeground(Color.RED);
		lbl34.setForeground(Color.RED);
		lbl35.setForeground(Color.RED);
		lbl36.setForeground(Color.RED);
		lbl37.setForeground(Color.ORANGE);
		lbl38.setForeground(Color.ORANGE);
		lbl39.setForeground(Color.ORANGE);
		lbl40.setForeground(Color.ORANGE);
		lbl41.setForeground(Color.ORANGE);
		lbl42.setForeground(Color.ORANGE);
		
		// Allocate our continent labels the colour they are assigned
		continent1.setForeground(Color.GREEN);
		continent2.setForeground(Color.YELLOW);
		continent3.setForeground(Color.BLUE);
		continent4.setForeground(Color.PINK);
		continent5.setForeground(Color.ORANGE);
		continent6.setForeground(Color.RED);
		
		// Set labels size so they actually appear on our map
		lbl1.setSize(150, 15);
		lbl2.setSize(150, 15);
		lbl3.setSize(150, 15);
		lbl4.setSize(150, 15);
		lbl5.setSize(150, 15); 
		lbl6.setSize(150, 15);
		lbl7.setSize(150, 15);
		lbl8.setSize(150, 15);
		lbl9.setSize(150, 15);
		lbl10.setSize(150, 15); 
		lbl11.setSize(150, 15);
		lbl12.setSize(150, 15);
		lbl13.setSize(150, 15);
		lbl14.setSize(150, 15);
		lbl15.setSize(150, 15); 
		lbl16.setSize(150, 15);
		lbl17.setSize(150, 15);
		lbl18.setSize(150, 15);
		lbl19.setSize(150, 15);
		lbl20.setSize(150, 15); 
		lbl21.setSize(150, 15);
		lbl22.setSize(150, 15);
		lbl23.setSize(150, 15);
		lbl24.setSize(150, 15);
		lbl25.setSize(150, 15); 
		lbl26.setSize(150, 15);
		lbl27.setSize(150, 15);
		lbl28.setSize(150, 15);
		lbl29.setSize(150, 15);
		lbl30.setSize(150, 15); 
		lbl31.setSize(150, 15);
		lbl32.setSize(150, 15);
		lbl33.setSize(150, 15);
		lbl34.setSize(150, 15);
		lbl35.setSize(150, 15); 
		lbl36.setSize(150, 15);
		lbl37.setSize(150, 15);
		lbl38.setSize(150, 15);
		lbl39.setSize(150, 15);
		lbl40.setSize(150, 15); 
		lbl41.setSize(150, 15);
		lbl42.setSize(150, 15);
		continent1.setSize(150, 15);
		continent2.setSize(150, 15);
		continent3.setSize(150, 15);
		continent4.setSize(150, 15); 
		continent5.setSize(150, 15);
		continent6.setSize(150, 15);
		
		// Add the Draw class components to our top panel
		myPanel.add(s);
        s.setSize(990,599);

        // Set the dimensions of our two panels and the layout of our panels 
        setPreferredSize(new Dimension(1250, 1600));     
        getContentPane().setLayout(new GridLayout());  
        getContentPane().add(splitPane); 
        getContentPane().add(sp2); 

        // Split our panels vertically and divide them at a certain location 
        // to allow for the required space in each
        splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);  
        splitPane.setDividerLocation(600);
        
        sp2.setOrientation(JSplitPane.HORIZONTAL_SPLIT);  
        sp2.setDividerLocation(1000);
        
        // Set myPanel as our top panel and panel as our bottom panel
        splitPane.setTopComponent(myPanel);                  
        splitPane.setBottomComponent(panel);
        
        sp2.setLeftComponent(splitPane);                  
        sp2.setRightComponent(rightPanel);

        // Set Null layout for our bottom panel
        panel.setLayout(null);
        
    	
        // Set player 1 name label/coordinates and add to lower panel
    	label = new JLabel("Player 1: ");
    	label.setBounds(11, 21, 81, 26);
    	panel.add(label);
    	
    	// Set player 2 name label/coordinates and add to lower panel
    	label2 = new JLabel("Player 2: ");
    	label2.setBounds(11, 51, 81, 26);
    	panel.add(label2);
    	
    	// Declare text field for player 1 user name
    	usertext1 = new JTextField();
    	usertext1.setBounds(101, 21, 166, 26);
    	panel.add(usertext1);
    	
    	// Declare text field for player 2 user name
    	usertext2 = new JTextField();
    	usertext2.setBounds(101, 51, 166, 26);
    	panel.add(usertext2);
    	
    	// Set button to select names and allocate territories and add action listener
    	button1 = new JButton("Allocate Territories");
    	button1.setBounds(11, 76, 151, 17);
    	button1.addActionListener(this);
    	panel.add(button1);
    	
    	// Add all our success labels which we will set later if player names are sufficient
    	success = new JLabel("");
    	success.setBounds(286, 21, 351, 26);
    	panel.add(success);
    	
    	success2 = new JLabel("");
    	success2.setBounds(286, 51, 351, 26);
    	panel.add(success2);
    	
    	success3 = new JLabel("");
    	success3.setBounds(485, 20, 550, 25);
    	panel.add(success3);
    	
    	success4 = new JLabel("");
    	success4.setBounds(485, 50, 550, 25);
    	panel.add(success4);
    	
    	success5 = new JLabel("");
    	success5.setBounds(685, 20, 750, 25);
    	panel.add(success5);
    	
    	success6 = new JLabel("");
    	success6.setBounds(685, 50, 750, 25);
    	panel.add(success6);
    	
    	
    	// RIGHT PANEL TEXT/LABELS/BUTTONS
    	
    	// Set player 1 name label/coordinates and add to lower panel
    	label3 = new JLabel("PICK YOUR TERRITORY");
    	label3.setBounds(1002, 20, 1042, 60);
    	rightPanel.add(label3);
        
        usertext3 = new JTextField();
      	usertext3.setBounds(1102, 20, 1192, 60);
        rightPanel.add(usertext3);
        
    	label4 = new JLabel("PICK NEUTRAL TERRITORY");
    	label4.setBounds(1002, 70, 1042, 76);
    	rightPanel.add(label4);
        
        usertext4 = new JTextField();
      	usertext4.setBounds(1102, 100, 1192, 76);
        rightPanel.add(usertext4);
	
	//Button to roll the two dies
        button2 = new JButton("Roll");
        button2.setBounds(1200, 78, 151, 17);
        button2.addActionListener(this);
        rightPanel.add(button2);
	
	 success7 = new JLabel("");
        success7.setBounds(1300,70 , 750, 25);
        rightPanel.add(success7);

        success8 = new JLabel("");
        success8.setBounds(1400,60 , 750, 25);
        rightPanel.add(success8);

        success9 = new JLabel("");
        success9.setBounds(1700,50 , 750, 25);
        rightPanel.add(success9);

        success10 = new JLabel("");
        success10.setBounds(1500,40 , 750, 25);
        rightPanel.add(success10);

        success11 = new JLabel("");
        success11.setBounds(1600,30 , 750, 25);
        rightPanel.add(success11);

    	// Pack makes sure all our components are implemented and our panels are visible
        pack();
    }

    public static void main(String args[]){
    	// Declare our frame 
    	RiskFrame s = new RiskFrame();
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
            // Make frame visible, resizable, exitable and give it a title
                s.setVisible(true);
                s.setTitle("Risk Game Map");
                s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                s.setResizable(true);
            }
        });
    }

    // Make our button useful using actionPerformed method
	@Override
	public void actionPerformed(ActionEvent e) {
		String player1 = usertext1.getText();
		String player2 = usertext2.getText();
		die1 = (int) (Math.random() * 6 + 1);
                die2 = (int) (Math.random() * 6 + 1);
		//If the Roll button is pressed player 1's die is rolled and so is player 2's
		if (e.getSource() == button2) {
            success7.setText("Player 1 rolled " + die1);
            success8.setText("Player 2 rolled " + die2);
        }
        if(die1>die2){
            success9.setText("Player 1 goes first");
        }else if(die1<die2){
            success10.setText("Player 2 goes first");
        }else {
            success11.setText("Draw roll again");
        }
		
		// Make sure player name length is not too big or too small 
		if(player1.length()<30 && player2.length()<30 && player1.length()>0 && player2.length()>0) {
		success.setText("Player 1: " + player1 + " (Magenta)");
		success2.setText("Player 2: " + player2 + " (Cyan)");
		success3.setText("Neutral 1: (Dark Grey)");
		success4.setText("Neutral 2: (Plain Grey)");
		success5.setText("Neutral 3: (White)");
		success6.setText("Neutral 4: (Light Grey)");
		
		
		// Allocate 9 territories to each player and 6 to each neutral
		
		// Player 1 - Magenta
		JLabel army1 = new JLabel("1 army");
		JLabel army2 = new JLabel("1 army");
		JLabel army3 = new JLabel("1 army");
		JLabel army4 = new JLabel("1 army");
		JLabel army5 = new JLabel("1 army");
		JLabel army6 = new JLabel("1 army");
		JLabel army7 = new JLabel("1 army");
		JLabel army8 = new JLabel("1 army");
		JLabel army9 = new JLabel("1 army");
		 
		// Player 2  - Brown
		JLabel army10 = new JLabel("1 army");
		JLabel army11 = new JLabel("1 army");
		JLabel army12 = new JLabel("1 army");
		JLabel army13 = new JLabel("1 army");
		JLabel army14 = new JLabel("1 army");
		JLabel army15 = new JLabel("1 army");
		JLabel army16 = new JLabel("1 army");
		JLabel army17 = new JLabel("1 army");
		JLabel army18 = new JLabel("1 army");
		
		// Neutral 1 - Dark Grey
		JLabel army19 = new JLabel("1 army");
		JLabel army20 = new JLabel("1 army");
		JLabel army21 = new JLabel("1 army");
		JLabel army22 = new JLabel("1 army");
		JLabel army23 = new JLabel("1 army");
		JLabel army24 = new JLabel("1 army");
		
		// Neutral 2 - Cyan
		JLabel army25 = new JLabel("1 army");
		JLabel army26 = new JLabel("1 army");
		JLabel army27 = new JLabel("1 army");
		JLabel army28 = new JLabel("1 army");
		JLabel army29 = new JLabel("1 army");
		JLabel army30 = new JLabel("1 army");
		
		// Neutral 3 - White
		JLabel army31 = new JLabel("1 army");
		JLabel army32 = new JLabel("1 army");
		JLabel army33 = new JLabel("1 army");
		JLabel army34 = new JLabel("1 army");
		JLabel army35 = new JLabel("1 army");
		JLabel army36 = new JLabel("1 army");
		
		// Neutral 4 - Light Grey
		JLabel army37 = new JLabel("1 army");
		JLabel army38 = new JLabel("1 army");
		JLabel army39 = new JLabel("1 army");
		JLabel army40 = new JLabel("1 army");
		JLabel army41 = new JLabel("1 army");
		JLabel army42 = new JLabel("1 army");
		
		
		// Place 1 army in each of the player/neutral's territories
		
		// Player 1 Armies 
		army1.setLocation(191, 162); // Country 1
		myPanel.add(army1);
		army1.setForeground(Color.MAGENTA);
		army1.setSize(150, 15);
		 
        army2.setLocation(338, 73);   // Country 5
		myPanel.add(army2);
		army2.setForeground(Color.MAGENTA);
		army2.setSize(150, 15);
		
        army3.setLocation(45, 101);  // Country 9
		myPanel.add(army3);
		army3.setForeground(Color.MAGENTA);
		army3.setSize(150, 15);
		
        army4.setLocation(547, 192); // Country 13
		myPanel.add(army4);
		army4.setForeground(Color.MAGENTA);
		army4.setSize(150, 15);
		
		army5.setLocation(628, 239); // Country 17
		myPanel.add(army5);
		army5.setForeground(Color.MAGENTA);
		army5.setSize(150,15);
		
		army6.setLocation(645, 164); // Country 21
		myPanel.add(army6);
		army6.setForeground(Color.MAGENTA);
		army6.setSize(150,15); 
		
        army7.setLocation(750, 152); // Country 25
		myPanel.add(army7);
		army7.setForeground(Color.MAGENTA);
		army7.setSize(150,15); 
		
        army8.setLocation(889, 549); // Country 29
		myPanel.add(army8);
		army8.setForeground(Color.MAGENTA);
		army8.setSize(150,15); 
		
        army9.setLocation(213, 364); // Country 33
		myPanel.add(army9);
		army9.setForeground(Color.MAGENTA);
		army9.setSize(150,15); 
		
		
		// Player 2 Armies
		army10.setLocation(255, 173); // Country 2
		myPanel.add(army10);
		army10.setForeground(Color.CYAN);
		army10.setSize(150, 15);
		 
        army11.setLocation(205, 247);   // Country 6
		myPanel.add(army11);
		army11.setForeground(Color.CYAN);
		army11.setSize(150, 15);
		
        army12.setLocation(370, 211 );  // Country 10
		myPanel.add(army12);
		army12.setForeground(Color.CYAN);
		army12.setSize(150, 15);
		
        army13.setLocation( 460, 212); // Country 14
		myPanel.add(army13);
		army13.setForeground(Color.CYAN);
		army13.setSize(150, 15);
		
		army14.setLocation(679, 344 ); // Country 18
		myPanel.add(army14);
		army14.setForeground(Color.CYAN);
		army14.setSize(150,15);
		
		army15.setLocation(763, 82 ); // Country 22
		myPanel.add(army15);
		army15.setForeground(Color.CYAN);
		army15.setSize(150,15); 
		
        army16.setLocation(695, 120 ); // Country 26
		myPanel.add(army16);
		army16.setForeground(Color.CYAN);
		army16.setSize(150,15); 
		
        army17.setLocation(850, 441); // Country 30
		myPanel.add(army17);
		army17.setForeground(Color.CYAN);
		army17.setSize(150,15); 
		
        army18.setLocation(221, 438 ); // Country 34
		myPanel.add(army18);
		army18.setForeground(Color.CYAN);
		army18.setSize(150,15);
		
		
		
		// Neutral 1 
        army19.setLocation(146, 98); // Country 3
		myPanel.add(army19);
		army19.setForeground(Color.DARK_GRAY);
		army19.setSize(150, 15);
		
		army20.setLocation(135, 231); // Country 7
		myPanel.add(army20);
		army20.setForeground(Color.DARK_GRAY);
		army20.setSize(150,15);
		
		army21.setLocation(398, 292); // Country 11
		myPanel.add(army21);
		army21.setForeground(Color.DARK_GRAY);
		army21.setSize(150,15); 
		
        army22.setLocation(393, 139); // Country 15
		myPanel.add(army22);
		army22.setForeground(Color.DARK_GRAY);
		army22.setSize(150,15); 
		
        army23.setLocation(572, 350); // Country 19
		myPanel.add(army23);
		army23.setForeground(Color.DARK_GRAY);
		army23.setSize(150,15); 
		
        army24.setLocation(827, 106); // Country 23
		myPanel.add(army24);
		army24.setForeground(Color.DARK_GRAY);
		army24.setSize(150,15);
		
		
		
		// Neutral 2 
        army25.setLocation(123, 156); // Country 4
		myPanel.add(army25);
		army25.setForeground(Color.GRAY);
		army25.setSize(150, 15);
		
		army26.setLocation(140, 311); // Country 8
		myPanel.add(army26);
		army26.setForeground(Color.GRAY);
		army26.setSize(150,15);
		
		army27.setLocation(465, 282); // Country 12
		myPanel.add(army27);
		army27.setForeground(Color.GRAY);
		army27.setSize(150,15); 
		
        army28.setLocation(463, 134); // Country 16
		myPanel.add(army28);
		army28.setForeground(Color.GRAY);
		army28.setSize(150,15); 
		
        army29.setLocation(861, 225); // Country 20
		myPanel.add(army29);
		army29.setForeground(Color.GRAY);
		army29.setSize(150,15); 
		
        army30.setLocation(751, 372); // Country 24
		myPanel.add(army30);
		army30.setForeground(Color.GRAY);
		army30.setSize(150,15);
		
		
		
		// Neutral 3 
        army31.setLocation(760, 228); // Country 27
		myPanel.add(army31);
		army31.setForeground(Color.WHITE);
		army31.setSize(150, 15);
		
		army32.setLocation(813, 538); // Country 31
		myPanel.add(army32);
		army32.setForeground(Color.WHITE);
		army32.setSize(150,15);
		
		army33.setLocation(289, 427); // Country 35
		myPanel.add(army33);
		army33.setForeground(Color.WHITE);
		army33.setSize(150,15); 
		
        army34.setLocation(496, 474); // Country 37
		myPanel.add(army34);
		army34.setForeground(Color.WHITE);
		army34.setSize(150,15); 
		
        army35.setLocation(510, 544); // Country 39
		myPanel.add(army35);
		army35.setForeground(Color.WHITE);
		army35.setSize(150,15); 
		
        army36.setLocation(547, 444); // Country 41
		myPanel.add(army36);
		army36.setForeground(Color.WHITE);
		army36.setSize(150,15);
		
		
		
		// Neutral 4 
        army37.setLocation(735, 289); // Country 28
		myPanel.add(army37);
		army37.setForeground(Color.LIGHT_GRAY);
		army37.setSize(150, 15);
		
		army38.setLocation(771, 466); // Country 32
		myPanel.add(army38);
		army38.setForeground(Color.LIGHT_GRAY);
		army38.setSize(150,15);
		
		army39.setLocation(233, 535); // Country 36
		myPanel.add(army39);
		army39.setForeground(Color.LIGHT_GRAY);
		army39.setSize(150,15); 
		
        army40.setLocation(440,405); // Country 38
		myPanel.add(army40);
		army40.setForeground(Color.LIGHT_GRAY);
		army40.setSize(150,15); 
		
        army41.setLocation(499, 366); // Country 40
		myPanel.add(army41);
		army41.setForeground(Color.LIGHT_GRAY);
		army41.setSize(150,15); 
		
        army42.setLocation(586, 557); // Country 42
		myPanel.add(army42);
		army42.setForeground(Color.LIGHT_GRAY);
		army42.setSize(150,15);
		}
		
	}
}
