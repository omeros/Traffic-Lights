package maman15targil1;

import java.awt.Color;

import java.awt.Graphics;

import javax.swing.JPanel;

	
	public class MyPanel2 extends JPanel implements Runnable
	{
		private boolean x=false;
		private final int  second=1000;
		private Controller _cont;
		private int y=0;
		
		/*********************************************************/  
		public MyPanel2 ( Controller cont)
		/*********************************************************/  
	    {
	    	_cont=cont;
	    }
		
		
		/*********************************************************/  
	    public void paintComponent(Graphics g)
	    /********************************************************/
			{
	    	    super.paintComponent(g);
	        	Color red = Color.RED;
	    	    Color green = Color.GREEN;
	    	    
	    	    g.setColor(red);
             	g.drawOval(80,0, 50, 50);         // left red  car
	    	    
	    	    g.setColor(green);
	    	    g.drawOval(80,50, 50, 50);       // left green  car
	    	    	    	               	
             	g.setColor(red);
	         	g.drawOval(370,0, 50, 50);          // right red  car
	         	
	         	g.setColor(green);
	         	g.drawOval(370,50, 50, 50);           // right green  car
	    	    
	    	    if(x == true)
		    	{
	    	    	
	             	g.setColor(green);
	             	g.fillOval(80,50, 50, 50);       // left green  car            // Turned On	             
		         	g.fillOval(370,50, 50, 50);           // right green  car        // Turned On
		         	
		         	g.setColor(red); 
		         	g.fillRect(380, 100, 25, 40);       // right red  men       // Turned On
		         	g.fillRect(90, 100, 25, 40);         // left red  men    // Turned On
		    	}
	    	    
	    	    
	    	    else
	    	    {
	    	    	g.setColor(red); 
	    	    	g.fillOval(370,0, 50, 50);          // right red  car         // Turned On
	    	    	g.fillOval(80,0, 50, 50);         // left red  car          // Turned On
	    	    	
	    	    	g.setColor(green);
	    	    	g.fillRect(380,140, 25, 40);           // right green  men
	    	    	g.fillRect(90,140, 25, 40);            // left green  men
	    	    }
	    
	         	
	         	g.setColor(red);
	    	    g.drawRect(90, 100, 25, 40);         // left red  men   
	    	    g.setColor(green);
	         	g.drawRect(90,140, 25, 40);            // left green  men
	         		         		         	
	         	
	         	g.setColor(red);
	         	g.drawRect(380, 100, 25, 40);       // right red  men  
	         	g.setColor(green);
	         	g.drawRect(380,140, 25, 40);           // right green  men
	         	   
	         	
			}
	    
	     /**********************************************************************************************/	  
		 public void setY()
		 /**********************************************************************************************/
		 {
	    	  y=1;
		  }
			  
			 
	   /**********************************************/ 
	    public void setX(boolean n)
	   /*******************************************/
	    {
	    	x=n;
	    }
	    /******************* Run the Thread **********************************/
	   	public  void run()
	   	/*******************************************************/
     	{
	   		while (true)
	   		{
		   		_cont.waitForThread();
		 			
		   		setX(true);
		   		repaint();
		   		try {
		   			Thread.sleep(second*5);
		   	   }catch( InterruptedException e) {	
		   		System.out.println(" interrupted");
		   	   }     
		   		setX(false);
		   		repaint();
		   		_cont.finished();
	   		}
     	}
}
