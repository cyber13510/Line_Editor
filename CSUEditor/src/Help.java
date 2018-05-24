import java.io.*;

public class Help
/****************************************************************************
*  AUTH:  Truly, Yours                    DATE:  Oct. 1999                  *
*  DEPT:  Computer Science, CS-200        ORG.:  Colorado State University  *
*****************************************************************************
*                                                                           *
*  FILE:  Help.java                                                         *
*                                                                           *
*  DESC:  Contains the member functions for the Help Class.        .        *
*                                                                           *
****************************************************************************/
{

  //***************************************************************************
  public static void General()
  {
  }

  //***************************************************************************
  public static void Command(char cmd)
  {
	  
	  switch (cmd) 
      {

        //========= TERMINATE EDITOR COMMANDS =================================
       
          case 'Q': // QUIT (& Update File) Command
                    System.out.println("Q : QUIT (& Update File)");
                    break;

          case 'X': // EXIT (& DO NOT Update File) Command
        	  		System.out.println("X : EXIT (& DO NOT Update File)");
                    break;

        //========= TERMINATE EDITOR COMMANDS =================================

          case 'H': // HELP (with optional command argument) Command
        	  		System.out.println("H : HELP (with optional command argument)");
                    break;
       
        //========= MOVE/SHOW CURRENT-LINE-NUMBER/CLN EDITOR COMMANDS =========

          case 'T': // TOP (Move CLN to Top of File) Command
        	  		System.out.println("T : TOP (Move CLN to Top of File)");
                    break;

          case 'E': // END (Move CLN to End of File) Command
        	  		System.out.println("E : END (Move CLN to End of File)");
                    break;

          case 'N': // NEXT Lines (Move CLN forward) Command
        	  		System.out.println("N : NEXT Lines (Move CLN forward)");
                    break;

          case 'B': // BACK Lines (Move CLN backward) Command
        	  		System.out.println("B : BACK Lines (Move CLN backward)");
                    break;

          case 'W': // WHERE (Print CLN) Command
        	  		System.out.println("W :  WHERE (Print CLN)");
                    break;

          case 'C': // COUNT (Print Total File Lines) Command
        	  		System.out.println("C : COUNT (Print Total File Lines)");
                    break;

        //========= PRINT LINES EDITOR COMMANDS ===============================

          case 'L': // LIST (Move CLN) Lines Command
        	  		System.out.println("L : LIST (Move CLN) Lines");
                    break;

          case 'S': // SHOW (DO NOT Move CLN) Lines Command
        	  		System.out.println("S : SHOW (DO NOT Move CLN) Lines");
                    break;

        //========= DELETE/ADD LINES EDITOR COMMANDS ==========================

          case 'D': // DELETE Lines Command
        	  		System.out.println("D : DELETE Lines");
                    break;

          case 'A': // ADD Lines Command
        	  		System.out.println("A : ADD Lines");
                    break;

        //========= STRING FIND/REPLACE LINES EDITOR COMMANDS =================

          case 'F': // FIND String In Lines Command
        	  		System.out.println("F : FIND String In Lines");
                    break;

          case 'R': // REPLACE String In Lines Command
        	  		System.out.println("R : REPLACE String In Lines");
                    break;

        //========= COPY/CUT & PASTE LINES EDITOR COMMANDS ====================

          case 'Y': // YANK (to Yank Buffer) Lines Command
        	  		System.out.println("Y : YANK (to Yank Buffer) Lines");
                    break;

          case 'Z': // YANK DELETE (to Yank Buffer) Lines Command
        	  		System.out.println("Z : YANK DELETE (to Yank Buffer) Lines");
                    break;

          case 'P': // PUT (Yank Buffer) Lines Command
        	  		System.out.println("P : PUT (Yank Buffer) Lines");
                    break;

        //========= INDEX/KEYWORD EDITOR COMMANDS =============================

          case 'I': // INDEX Keywords Command
        	  		System.out.println("I : INDEX Keywords");
                    break;

          case 'K': // Print KEYWORD In Which Lines Command
        	  		System.out.println("K : Print KEYWORD In Which Lines");
                    break;

        //========= SPECIAL EDITOR COMMANDS ===================================

          case 'O': // ORDER (Sort L-H) Lines Command
        	  		System.out.println("O : ORDER (Sort L-H) Lines");
                    break;

          case 'M': // MARGIN (Set Margins/Window) Command
        	  		System.out.println("M : MARGIN (Set Margins/Window)");
                    break;

        //========= INTERNAL PROGRAM ERROR CASE ===============================
   
          default : Msg.wMsg("INTERNAL SYSTEM ERROR:");
                    Msg.wLMsg("    Cmd_Driver: Illegal edit cmd name");
      }
  }

} // EndClass Help
