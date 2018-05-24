import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import org.junit.Before;

import org.junit.After;

import junit.framework.TestCase;



import org.junit.Test;

public class CSUEditorTest extends TestCase{

	File_Buffer FILE       = new File_Buffer();
    Cmd_Driver Run_Command = new Cmd_Driver();
    UserCmd commandLineTokens;
    boolean done = false, open_failed;
    UserCmd uc = new UserCmd();
    
    External_File editFile = new External_File();
	
	@Before protected void setUp() throws Exception {
		int line_count=0;
		String args = "test1.txt";
		open_failed = editFile.openR(args);
	       if(!open_failed) 
	       {
	           while(!editFile.havehitEOF()) 
	               FILE.AddLine(line_count++,editFile.getLine());
	           editFile.close();
	       }
	       else 
	           Msg.ERROR(1);
		
	}
	
	@Test
	public void test_T() throws IOException{
		Run_Command.Cmd_T(FILE);
		assertEquals(1, FILE.GetCLN());
		
	}
	
	@Test
	public void test_E() throws IOException{
		Run_Command.Cmd_E(FILE);
		assertEquals(10, FILE.GetCLN());
	}
	
	@Test
	public void test_N() throws IOException{
		Run_Command.Cmd_T(FILE);
		int args = 2;
		Run_Command.Cmd_N(FILE, args);
		assertEquals(3, FILE.GetCLN());
	}
	
	@Test
	public void test_B() throws IOException{
		Run_Command.Cmd_E(FILE);
		int args = 2;
		Run_Command.Cmd_B(FILE, args);
		assertEquals(8, FILE.GetCLN());
	}

	@Test
	public void test_W() throws IOException{
		Run_Command.Cmd_T(FILE);
		Run_Command.Cmd_W(FILE);
		assertEquals(1, FILE.GetCLN());
	}
	
	@Test
	public void test_C() throws IOException{
		Run_Command.Cmd_T(FILE);
		Run_Command.Cmd_C(FILE);
		assertEquals(10, FILE.NumLins());
	}
	
	@Test
	public void test_L() throws IOException{
		Run_Command.Cmd_T(FILE);
		Run_Command.Cmd_L(FILE, 2);
		assertEquals(2, FILE.GetCLN());
	}
	
	@Test
	public void test_S() throws IOException{
		Run_Command.Cmd_T(FILE);
		Run_Command.Cmd_S(FILE, 2);
		assertEquals(1, FILE.GetCLN());
	}
	
	@Test
	public void test_D() throws IOException{
		Run_Command.Cmd_T(FILE);
		Run_Command.Cmd_D(FILE, 2);
		assertEquals(8, FILE.NumLins());
		//Run_Command.Cmd_S(FILE, 10);
	}
	
	/*
	@Test
	public void test_A() throws IOException{
		Run_Command.Cmd_T(FILE);
		Run_Command.Cmd_A(FILE);
		assertEquals(11, FILE.NumLins());
		//Run_Command.Cmd_S(FILE, 10);
	}*/
	
	@Test
	public void test_F() throws IOException{
		Run_Command.Cmd_T(FILE);
		Run_Command.Cmd_F(FILE, 1, "1");
		//assertEquals(1, FILE.NumLins());
	}
	
	@Test
	public void test_F_fail() throws IOException{
		Run_Command.Cmd_T(FILE);
		Run_Command.Cmd_F(FILE, 1, "2");
		//assertEquals(1, FILE.NumLins());
	}
	
	@Test
	public void test_R() throws IOException{
		Run_Command.Cmd_T(FILE);
		Run_Command.Cmd_R(FILE, 1, "1", "2");
		//assertEquals(1, FILE.NumLins());
	}
	
	@Test
	public void test_R_fail() throws IOException{
		Run_Command.Cmd_T(FILE);
		Run_Command.Cmd_R(FILE, 1, "5", "5");
		//assertEquals(1, FILE.NumLins());
	}

	@Test // test Yank Buffer
	public void test_Yank_Buffer() throws IOException{
		Run_Command.Cmd_T(FILE);
		Run_Command.Cmd_Y(FILE, 3);
		Run_Command.Cmd_P(FILE);
		
		Run_Command.Cmd_T(FILE);
		System.out.println("----");
		Run_Command.Cmd_S(FILE, 20);
		System.out.println("----");
		assertEquals(13, FILE.NumLins());
		Run_Command.Cmd_Z(FILE, 3);
		assertEquals(10, FILE.NumLins());
	}
	
	@Test
	public void test_O() throws IOException{
		Run_Command.Cmd_T(FILE);
		Run_Command.Cmd_R(FILE, 1, "1", "2");
		Run_Command.Cmd_T(FILE);
		Run_Command.Cmd_O(FILE, 2);
		//assertEquals(10, FILE.NumLins());
	}
	
}
