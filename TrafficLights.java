package maman15targil1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import maman15targil1.MyPanel.LightsHandler;

public class TrafficLights extends JFrame
{
   JPanel panel1;
   GridLayout layout;
   Controller cont;
   HandlerFirst h1;
   HandlerSecond h2;
	
	public TrafficLights() 
	{
	     super( " Traffic Lights");
	     Controller cont = new Controller();  	    
		 MyPanel3  panel3= new MyPanel3(cont);		
	     add(panel3);
				  		 			  		  
		  h1 = new HandlerFirst(panel3,cont);
		  h2 = new HandlerSecond(panel3,cont);
		  Thread thread1 = new Thread(h1);
		  Thread thread2 = new Thread(h2);
		  thread1.start();
		  thread2.start();
								
	
	}
}
