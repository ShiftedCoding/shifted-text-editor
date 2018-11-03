package me.Shifted.main;

import me.Shifted.EditorClass;

import javax.swing.*;

//Created on 2018-11-03 in package me.Shifted.main
public class MainFrameController {

  private EditorClass editorClass;
  private JTextArea editorTextField;
  private JTabbedPane tabbedPane1;

  public MainFrameController() {
    editorClass = new EditorClass();
    editorTextField = editorClass.getEditorTextField();
    tabbedPane1 = editorClass.getTabbedPane1();
  }
}
