/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ten_sinh_vien;

/**
 *
 * @author langk
 */
//public class ImageViewerFrame {
//    
//}

import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class ImageViewerFrame extends JFrame{
    private JLabel label;
    private JFileChooser chooser;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 400;

        public ImageViewerFrame()
    {
       setTitle("ImageViewer");
       setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
       // use a label to display the images
       label = new JLabel();
       add(label);
       // set up the file chooser
       chooser = new JFileChooser();
       chooser.setCurrentDirectory(new File("."));

       // set up the menu bar
       JMenuBar menuBar = new JMenuBar();
       setJMenuBar(menuBar);

       JMenu menu = new JMenu("File");
       menuBar.add(menu);

       JMenuItem openItem = new JMenuItem("Open");
       menu.add(openItem);
       openItem.addActionListener((ActionEvent event) -> {
           // show file chooser dialog
           int result = chooser.showOpenDialog(null);
           // if file selected, set it as icon of the label
           if (result == JFileChooser.APPROVE_OPTION) {
               String name1 = chooser.getSelectedFile().getPath();
               label.setIcon(new ImageIcon(name1));
           }
       });

       JMenuItem exitItem = new JMenuItem("Exit");
       menu.add(exitItem);
       exitItem.addActionListener((ActionEvent event) -> {
           System.exit(0);
       });
    }
}

