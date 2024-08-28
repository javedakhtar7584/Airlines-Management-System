
package airlinemanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

   public class Home extends JFrame implements ActionListener{
   
    public Home(){
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airlinemanagementsystem/icons/frre.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,2000,1200);
        add(image);
        
        JLabel heading = new JLabel("AIR INDIA WELCOME YOR");
        heading.setBounds(600,40,1000,40);
        heading.setForeground(Color.BLACK);
        heading.setFont(new Font("Tahome",Font.PLAIN,36));
        image.add(heading);
        
        JMenuBar menubar = new JMenuBar();
        setJMenuBar(menubar);
        
        JMenu details = new JMenu("Details");
        menubar.add(details);
        
        JMenuItem flightDetails = new JMenuItem("Flight Details");
        flightDetails.addActionListener(this);
        details.add(flightDetails);
        
        JMenuItem customerDetails = new JMenuItem("Add Customer Details");
        customerDetails.addActionListener(this);
        details.add(customerDetails);
        
        JMenuItem bookFlight = new JMenuItem("Book Flight ");
        details.add(bookFlight);
        
        JMenuItem journeyDetails = new JMenuItem("Journey Details ");
        details.add(journeyDetails);
        
        JMenuItem ticketCancellation = new JMenuItem("Cnacel Ticket ");
        details.add(ticketCancellation);
        
        JMenu ticket = new JMenu("Ticket");
        menubar.add(ticket);
        
        JMenuItem boardingPass = new JMenuItem("Bording Pass");
        ticket.add(boardingPass);
        
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        setLocation(600,250);
        setVisible(true);
        
    }
     
    public void actionPerformed(ActionEvent ae){
        String text = ae.getActionCommand();
        if(text.equals("Add Customer Details")){
            new AddCustomer();
                
        }else if(text.equals("Flight Details")){
           new FlightInfo();
       
    }
 }       
    
    public static void main (String args []){
        new Home();
    }
    
}
