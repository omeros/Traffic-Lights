
	package maman15targil1;

	import javax.swing.JPanel;


	/******************* Class  **********************************************/	  
	public class HandlerSecond implements Runnable
	/*****************************************************************/	  
	{
		
		private final int  second=1000;
		private boolean x=false;
		private MyPanel3 _panel;
		private Controller _cont;
		private int y;
		
		/******************* Constructor ***************************************/	  
		public HandlerSecond( MyPanel3 panel,Controller cont)
		/*****************************************************************/	  
		{
			_panel = panel;
			_cont = cont;
			 y=0;
		}
		
		
		 /********************* Change Variable Y to 1*****************************/	  
		 public void setY()
		 /***********************************************************************/
		 {
			 y=1;
		  }
		
		@Override
	    /******************* Run the Thread **********************************/
	   	public  void run()
	   	/****************************************************************/
	 	{
	   		
			while (true)
	   		{
		   		if( y==1)
		   		{
		   			setY();
			   		  _cont.waitForThread();		   		   		
		 		}		   	
		   		_panel.setX(false);
		   		_panel.repaint();
			   		try {
			   			Thread.sleep(second*_panel.seconds);
			   	   }catch( InterruptedException e) {	
			   		System.out.println(" interrupted");
			   	   }     
			   		_panel.setX(true);
			   		_panel.repaint();
			   		
			   		_cont.finished();
	   		}
			 	}
	 	

	}
