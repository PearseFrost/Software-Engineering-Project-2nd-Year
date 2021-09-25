// 18439746
// Random2

import java.util.ArrayList;
import java.util.Random;


public class Random2 implements Bot {
	
	private BoardAPI board;
	private PlayerAPI player;

	
	Random2 (BoardAPI inBoard, PlayerAPI inPlayer) {
		board = inBoard;	
		player = inPlayer;
		return;
	}
	
	public String getName () {
		String command = "";
		command = "Random2Bot";
		return(command);
	}

	public String getReinforcement () {
		ArrayList<Integer> countries = new ArrayList<Integer>();
		ArrayList<Integer> randomNeutrals = new ArrayList<Integer>();
		int a;
		String attackf = "";
		
		int r = (int)(Math.random() * 2);
		if (r == 1){
		
		for (int i = 0; i < GameData.NUM_COUNTRIES; i++){
			if (board.getOccupier(i) == player.getId()){
				countries.add(i);
			}
		}
		
			int rnd = new Random().nextInt(countries.size());
			a = countries.get(rnd);
		
		attackf = GameData.COUNTRY_NAMES[a];
		attackf = attackf.replaceAll("\\s", ""); 
		}
		
		else {
			for (int x = 0; x < GameData.NUM_COUNTRIES; x++){
			if (board.getOccupier(x) != player.getId()){
			randomNeutrals.add(x);
			}
		}
		
		int rnd = new Random().nextInt(randomNeutrals.size());
		attackf = GameData.COUNTRY_NAMES[randomNeutrals.get(rnd)];
		attackf = attackf.replaceAll("\\s", "");
		}
		
		
		String command = attackf;
		command += " 1";
		return(command);
	}
	
	public String getPlacement (int forPlayer) {
		String command = "";
		command = GameData.COUNTRY_NAMES[(int)(Math.random() * GameData.NUM_COUNTRIES)];
		command = command.replaceAll("\\s", "");
		return(command);
	}
	
	public String getCardExchange () {
		String command = "";
		if (player.isForcedExchange()){
			ArrayList<Card> Playercards = player.getCards();
			
			int i = 0;
			int c = 0;
			int a = 0;
			int w = 0;
			for (Card card : Playercards){
			switch (card.getInsigniaId()){
					case 0 :  	i++;
								break;
					case 1 : 	c++;
								break;
					case 2 : 	a++;
								break;
					case 3 : 	w++;
								break;
				}
			}
			
			for (int x = 0; x < w; x++){
				command += "w";
			}
			while (command.length() < 3 && i < Playercards.size()){
				if (i + w > 2){
					command += "i";
				}
				else if (c + w > 2){
					command += "c";
				}
				else if (a + w > 2){
					command += "a";
				}
				else if ((i + c + a) > 2){
					command = "ica";
				}
			}
		}
		else {
			command = "skip";
		}
		return(command);
	}

	public String getBattle () {
		int a=0;
        int numunits;
        int adj[] = new int[100];
		String command = "";
		String attackf = "";
		String attackt = "";
		// ArrayLists to store our players countries and the bots countries adjacent to ours
		ArrayList<Integer> opposition = new ArrayList<Integer>();
		ArrayList<Integer> countries = new ArrayList<Integer>();
		int r = (int)(Math.random() * 15); // Eventually we want to skip 
		// Different scenarios to try out so that each opposing country is attacked
		if (r > 11){
			for (int x = 0; x < GameData.NUM_COUNTRIES; x++){
				if (board.getOccupier(x) == player.getId()){
					countries.add(x);
				}
			}
			
			do { 
				int rnd = new Random().nextInt(countries.size());
				a = countries.get(rnd);
			} while (board.getNumUnits(a) < 2);   
			
			adj = GameData.ADJACENT[a]; // Let our integer array adj store all countries adjacent to ours
			for (int i = 0; i < adj.length; i++){
			if (board.getOccupier(adj[i]) != player.getId()){
				opposition.add(adj[i]);
			}
			}
			
					attackf = GameData.COUNTRY_NAMES[a];
					attackf = attackf.replaceAll("\\s", "");
			
			
			
			if (opposition.size() > 0){
				int k = (int) (Math.random() * adj.length);
				attackt = GameData.COUNTRY_NAMES[adj[k]]; 
				attackt = attackt.replaceAll("\\s", ""); 
			
				if (board.getNumUnits(a) == 2){
					numunits = 1;
				}
				else if (board.getNumUnits(a) == 3){
					numunits = 2;
				}
				else {
					numunits = 3;
				}
				command = attackf + " " + attackt + " " + numunits;
			} 
		
			else command = "skip";
		}
		
		else if (r > 7){
			for (int x = 0; x < GameData.NUM_COUNTRIES; x++){
				if (board.getOccupier(x) == player.getId()){
					countries.add(x);
				}
			}
			
			for(int x = 0; x < countries.size(); x++){
			
			adj = GameData.ADJACENT[countries.get(x)];
			for (int i = 0; i < adj.length; i++){
			if (board.getOccupier(adj[i]) != player.getId()){
				opposition.add(adj[i]);
			}
			}
			if(opposition.size()==1) {
				    int rnd = (int)(Math.random()* countries.size());
				    attackf = GameData.COUNTRY_NAMES[countries.get(rnd)];
					attackf = attackf.replaceAll("\\s", "");
					a = countries.get(rnd);
					break;
				}
				}
			adj = GameData.ADJACENT[a];
			
			
			if (opposition.size() > 0){
				int k = (int) (Math.random() * adj.length);
				attackt = GameData.COUNTRY_NAMES[adj[k]]; 
				attackt = attackt.replaceAll("\\s", ""); 
			
				if (board.getNumUnits(a) == 2){
					numunits = 1;
				}
				else if (board.getNumUnits(a) == 3){
					numunits = 2;
				}
				else {
					numunits = 3;
				}
				command = attackf + " " + attackt + " " + numunits;
			} 
		
			else command = "skip";
		}
		
		else if (r > 4){
			for (int x = 0; x < GameData.NUM_COUNTRIES; x++){
				if (board.getOccupier(x) == player.getId()){
					countries.add(x);
				}
			}
			
			for(int x = 0; x < countries.size(); x++){
			
			adj = GameData.ADJACENT[countries.get(x)];
			for (int i = 0; i < adj.length; i++){
			if (board.getOccupier(adj[i]) != player.getId()){
				opposition.add(adj[i]);
			}
			}
			if(opposition.size()>=2) {
				    int rnd = (int)(Math.random()* countries.size());
				    attackf = GameData.COUNTRY_NAMES[countries.get(rnd)];
					System.out.println(rnd);
					attackf = attackf.replaceAll("\\s", "");
					a = countries.get(rnd);
					break;
				}
				}
			adj = GameData.ADJACENT[a];
			
			
			if (opposition.size() > 0){
				int k = (int) (Math.random() * adj.length);
				attackt = GameData.COUNTRY_NAMES[adj[k]]; 
				attackt = attackt.replaceAll("\\s", ""); 
			
				if (board.getNumUnits(a) == 2){
					numunits = 1;
				}
				else if (board.getNumUnits(a) == 3){
					numunits = 2;
				}
				else {
					numunits = 3;
				}
				command = attackf + " " + attackt + " " + numunits;
			} 
		
			else command = "skip";
		}
		
		else if (r >= 2){
			for (int x = 0; x < GameData.NUM_COUNTRIES; x++){
				if (board.getOccupier(x) == player.getId()){
					countries.add(x);
				}
			}
			
			for(int x = 0; x < countries.size(); x++){
			
			adj = GameData.ADJACENT[countries.get(x)];
			for (int i = 0; i < adj.length; i++){
			if (board.getOccupier(adj[i]) != player.getId()){
				opposition.add(adj[i]);
			}
			}
			if(opposition.size()>=3) {
				int rnd = (int)(Math.random()* countries.size());
				attackf = GameData.COUNTRY_NAMES[countries.get(rnd)];
				System.out.println(rnd);
				attackf = attackf.replaceAll("\\s", "");
				a = countries.get(rnd);
				break;
				}
				}
			adj = GameData.ADJACENT[a];
			
			
			
			if (opposition.size() > 0){
				int k = (int) (Math.random() * adj.length);
				attackt = GameData.COUNTRY_NAMES[adj[k]]; 
				attackt = attackt.replaceAll("\\s", ""); 
			
				if (board.getNumUnits(a) == 2){
					numunits = 1;
				}
				else if (board.getNumUnits(a) == 3){
					numunits = 2;
				}
				else {
					numunits = 3;
				}
				command = attackf + " " + attackt + " " + numunits;
				System.out.println(command);
			} 
		
			else command = "skip";
		}
		
		else command = "skip";	
		return(command);
		
	}	

	public String getDefence (int countryId) {
		// If our country has less than or exactly 2 units we only defend with 1
		String command = "";
		if (board.getNumUnits(countryId) <= 2){
			command = "1";
		}
		else command = "2";
		
		return(command);
	}

	public String getMoveIn (int attackCountryId) {
		// Each time we only move in 1 
		String command = "";
		command = "1";
		return(command);
	}

	public String getFortify () {
		String command = "";
		ArrayList<Integer> countries = new ArrayList<Integer>();
		int a=0;
		int b=0; 
		int numunits;
		String attackf = "";
		String attackf1 = "";
		
		for (int x = 0; x < GameData.NUM_COUNTRIES; x++){
			if (board.getOccupier(x) == player.getId()){
				countries.add(x);
			}
		}
		
		int rnd1 = new Random().nextInt(countries.size());
		int rnd2 = new Random().nextInt(countries.size());
		a = countries.get(rnd1);
		//b = countries.get(rnd2);
		
		int[] adj = GameData.ADJACENT[a];
		for (int i = 0; i < adj.length; i++){
			if (board.getOccupier(adj[i]) == player.getId()){
				b = adj[i];
			}
		}
			
		if (board.getNumUnits(a) > 2 || board.getNumUnits(b) > 2) {
			
		if (board.getNumUnits(a)>board.getNumUnits(b)){
		attackf = GameData.COUNTRY_NAMES[a];
		attackf1 = GameData.COUNTRY_NAMES[b];
		attackf = attackf.replaceAll("\\s", ""); 
		attackf1 = attackf1.replaceAll("\\s", ""); 
		
		// We fortify countries only when needs be and not by more than necessary
		if (board.getNumUnits(a) <= 4 || ((board.getNumUnits(a) - board.getNumUnits(b)) >= 2)){
			numunits = 1;
		}
		else if (((board.getNumUnits(a) - board.getNumUnits(b)) > 2 && ((board.getNumUnits(a) - board.getNumUnits(b)) <= 4))){
			numunits = 2;
		}
		else {
			numunits = 3;
		}
		command = attackf + " " + attackf1 + " " + numunits;
		}
		
		else if (board.getNumUnits(b)>board.getNumUnits(a)){
			attackf = GameData.COUNTRY_NAMES[b];
			attackf1 = GameData.COUNTRY_NAMES[a];
			attackf = attackf.replaceAll("\\s", ""); 
			attackf1 = attackf1.replaceAll("\\s", "");
			if (board.getNumUnits(b) <= 4 || ((board.getNumUnits(b) - board.getNumUnits(a)) >= 2)){
				numunits = 1;
			}
			else if (((board.getNumUnits(b) - board.getNumUnits(a)) > 2 && ((board.getNumUnits(b) - board.getNumUnits(a)) <= 4))){
				numunits = 2;
			}
			else {
				numunits = 3;
			}
			command = attackf + " " + attackf1 + " " + numunits;
			}
		else {
		command = "skip";
	}
		}
		else command = "skip";
		return(command);
}
}
