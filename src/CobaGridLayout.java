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

class GLayout extends JFrame{
   JButton tombolSave,tombolEdit,tombolDelete,tombolOpen;

   public GLayout(){
	setTitle("GRID LAYOUT");
	tombolOpen = new JButton("Open");
	tombolSave = new JButton ("Save");
	tombolEdit = new JButton ("Edit");
	tombolDelete = new JButton ("Delete");

	setLayout(new GridLayout(2,2));
	add(tombolOpen);
	add(tombolSave);
        add(tombolEdit);
        add(tombolDelete);

	pack();
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
}

public class CobaGridLayout {
   public static void main (String[] args){
	GLayout g = new GLayout();
	}
}
