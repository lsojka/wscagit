package org.ponyman.caclient;
import java.awt.*;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

public class CaFrame extends Frame{

	/**
	 * 
	 */

	
	private static final long serialVersionUID = 1L;
	private int N;
	List<Integer> grid = new ArrayList<>();
	
	public CaFrame(int _N, List<Integer> _grid) {
		// TODO Auto-generated constructor stub
		N = _N;
		grid = _grid;
		
		setTitle("CaFrame display");
		setSize(N, N);
		this.setBounds(0, 0, N, N);
		setLayout(null);
		
		addWindowListener(new WindowAdapter(){
		  public void windowClosing(WindowEvent we)
		  {
			  System.exit(0);
		  }
		 });
	}
	
	public void paint(Graphics g)
	{
		//Color red = Color(136, 45, 23); 
		g.setColor(Color.black);
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				if(this.grid.get(i*N+j) == 1)
				g.fillRect(i, j, 1, 1);
			}
		}
		//g.fillRect(x, y, width, height);
	}
}
