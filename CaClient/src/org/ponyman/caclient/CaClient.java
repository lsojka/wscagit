package org.ponyman.caclient;


import java.util.ArrayList;
import java.util.List;

import org.ponyman.ca.CaPublisher;
import org.ponyman.ca.CaPublisherService;


/*
 * @author lsojka
 * @version 0.8
 * 
 * Class connecting with CA WebService and handling received automata data.
 */

public class CaClient{

	/**
	 *  Stores the size of one-dimensional cellular automata
	 */
	private static int N;
	
	private static int rule;
	
	public CaClient() {
		// TODO Auto-generated constructor stub

	}
	/*
	 * Main method of client.
	 * 
	 * @param arg[0] Size of CA automata, received as first application argument.
	 * @param arg[1] Rule for CA automata transformations, received as second application argument.  
	 */
	public static void main(String[] args) {
		
		List<Integer> grid = new ArrayList<>();
		
		if(args.length != 2 || Integer.parseInt(args[0]) > 2000 || Integer.parseInt(args[1]) > 255)
		{
			System.out.println("Bad input. Proper invocation: <program> [size N <0, 2000>] [CA automata rule <0, 255>]");
		}
		else
		{
			N = Integer.parseInt(args[0]);
			rule = Integer.parseInt(args[1]);
			
			CaPublisherService capubservice = new CaPublisherService();
			CaPublisher capubport = capubservice.getCaPublisherPort();
			grid = capubport.getCaData(N, rule);
			//System.out.println(grid);
			CaFrame caframe = new CaFrame(N, grid);
			caframe.setVisible(true);
			//System.out.println("Grid size = " + grid.size());
		}
	}
}
