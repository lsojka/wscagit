package org.ponyman.caclient;


import java.util.ArrayList;
import java.util.List;

import org.ponyman.ca.CaPublisher;
import org.ponyman.ca.CaPublisherService;


/**
 * Class connecting with CA WebService and handling received automata data.
 * <p>
 * @author Ponyman
 * @version 0.8
 * <p>
 * 
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
	/**
	 * Main method of client
	 * <p>
	 * Uses classes generated from WSDL to connect to WebService server:
	 * <p>
	 * {@link org.ponyman.ca.CaPublisherService ServiceClass } - WDSL-generated "Service" object providing "Port" instance
	 * <p>
	 * {@link  org.ponyman.ca.CaPublisher PortClass} - WDSL-generated "Port" object which allows direct calling of {@link org.ponyman.ca.CaPublisher#getCaData(int N, int rule) getCaData} webmethod executed on the server.	
	 * 
	 * @param args Size and rule of CA automata, passed as two application arguments.
	 *   
	 * 
	 */
	public static void main(String[] args) 
	{
		
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
