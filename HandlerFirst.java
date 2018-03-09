package maman15targil1;

import javax.swing.JPanel;


/******************* Class  **********************************************/	  
public class HandlerFirst implements Runnable
/*****************************************************************/	  
{
	
	private final int  second=1000;
	private boolean x=false;
	private MyPanel3 _panel;
	private Controller _cont;
	private int y;
	
	/******************* Constructor ***************************************/	  
	public HandlerFirst( MyPanel3 panel,Controller cont)
	/*****************************************************************/	  
	{
		_panel = panel;
		_cont = cont;
		 y=0;
	}
	
	
	 /******************* Change Variable y to 1 *********************************/	  
	 public void setY()
	 /***************************************************************************/
	 {
		 y=1;
	  }
	
	@Override
    /******************* Run the Thread **********************************/
   	public  void run()
   	/********************************************************************/
 	{   		  		
   		while (true)
   		{

		   		  _cont.waitForThread();		   		   		

	   		_panel.setX(true);
	   		_panel.repaint();
		   		try {
		   			Thread.sleep(second*_panel.seconds);
		   	   }catch( InterruptedException e) {	
		   		System.out.println(" interrupted");
		   	   }     
		   		_panel.setX(false);
		   		_panel.repaint();
		   		

		   		_cont.finished();
  		}
 	}

}
