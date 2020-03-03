/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Lab Informatika
 */

import java.awt.*;
import javax.swing.*;

class FLayout extends JFrame{
   JButton tombolSave,tombolEdit,tombolDelete,tombolOpen;

   public FLayout(){
	setTitle("FLOW LAYOUT");
	tombolOpen = new JButton("Open");
	tombolSave = new JButton ("Save");
	tombolEdit = new JButton ("Edit");
	tombolDelete = new JButton ("Delete");
      setLayout(new FlowLayout());
	add(tombolOpen);
	add(tombolSave);
      add(tombolEdit);
      add(tombolDelete);

	pack();
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
}

public class CobaFlowLayout {
   public static void main (String[] args){
	FLayout f = new FLayout();
	}
}
