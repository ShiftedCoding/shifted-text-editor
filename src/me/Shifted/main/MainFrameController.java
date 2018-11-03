package me.Shifted.main;

import me.Shifted.EditorClass;

import javax.swing.*;

//Created on 2018-11-03 in package me.Shifted.main
public class MainFrameController {

  private EditorClass editorClass;
  private JTextArea editorTextField;
  private JTabbedPane tabbedPane1;

  public MainFrameController() {
    init();
  }

  private void init() {
    registerComponents();
    registerListeners();
    registerMenu();
  }

  private void registerMenu() {
    JMenu fileMenu = new JMenu("File");
    {
      fileMenu.add(new JMenuItem("New"));
      fileMenu.add(new JMenuItem("Open"));
      fileMenu.add(new JMenuItem("Save"));
      fileMenu.add(new JMenuItem("Save As"));
    }

    JMenuBar menuBar = new JMenuBar();
    menuBar.add(fileMenu);

    editorClass.setJMenuBar(menuBar);

  }

  private void registerListeners() {

  }

  private void registerComponents() {
    editorClass = new EditorClass();
    editorTextField = editorClass.getEditorTextField();
    tabbedPane1 = editorClass.getTabbedPane1();
  }

  public void showWindow() {
    editorClass.setVisible(true);
  }

}
