/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DAL;

import model.Combo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author phanh
 */
public class ComboDAOTest {
    
    public ComboDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class ComboDAO.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String tag = "";
        String nameEN = "";
        String nameVI = "";
        String note = "";
        boolean isActive = false;
        ComboDAO instance = new ComboDAO();
        instance.add(tag, nameEN, nameVI, note, isActive);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCombo method, of class ComboDAO.
     */
    @Test
    public void testUpdateCombo() {
        System.out.println("updateCombo");
        Combo combo = null;
        ComboDAO instance = new ComboDAO();
        instance.updateCombo(combo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addSubjectToCombo method, of class ComboDAO.
     */
    @Test
    public void testAddSubjectToCombo() {
        System.out.println("addSubjectToCombo");
        String[] subjectCode = null;
        int cid = 0;
        ComboDAO instance = new ComboDAO();
        instance.addSubjectToCombo(subjectCode, cid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class ComboDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int cid = 0;
        String subjectCode = "";
        String semester = "";
        ComboDAO instance = new ComboDAO();
        instance.delete(cid, subjectCode, semester);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getSemesterBySubjectCode method, of class ComboDAO.
     */
    @Test
    public void testGetSemesterBySubjectCode() {
        System.out.println("getSemesterBySubjectCode");
        String subjectCode = "PRJ301";
        ComboDAO instance = new ComboDAO();
        String expResult = "5";
        String result = instance.getSemesterBySubjectCode(subjectCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("khong lay duoc ");
    }

    /**
     * Test of checkTagExist method, of class ComboDAO.
     */
    @Test
    public void testCheckTagExist() {
        System.out.println("checkTagExist");
        String tag = "";
        String oldTag = "";
        ComboDAO instance = new ComboDAO();
        boolean expResult = false;
        boolean result = instance.checkTagExist(tag, oldTag);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
