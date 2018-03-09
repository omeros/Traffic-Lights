package maman15targil1;
import javax.swing.Timer;


//import maman15targil1.MyPanel.LightsHandler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Main 
{

    
	public static void main(String[] args) throws Exception
	{
		TrafficLights ramzor = new TrafficLights();
		ramzor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ramzor.setSize(500, 700); 
		ramzor.setVisible(true); 		
										
	}

}
