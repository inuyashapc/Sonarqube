/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DAL;

import java.util.ArrayList;
import java.util.List;
import model.Assessment;
import model.AssessmentDetail;
import model.Combo;
import model.Curriculum;
import model.Decision;
import model.Elective;
import model.LO;
import model.Major;
import model.Material;
import model.PLO;
import model.PO;
import model.PO_Mapping_PLO;
import model.PreRequisite;
import model.Question;
import model.Session;
import model.Subject;
import model.Subject_Mapping_PLO;
import model.Syllabus;
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
public class DAOTest {
    
    public DAOTest() {
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
     * Test of getSubjectByCurriculumID method, of class DAO.
     */
    @Test
    public void testGetSubjectByCurriculumID() {
        System.out.println("getSubjectByCurriculumID");
        int id = 0;
        DAO instance = new DAO();
        List<Subject> expResult = null;
        List<Subject> result = instance.getSubjectByCurriculumID(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubjectNameENBySubjectCode method, of class DAO.
     */
    @Test
    public void testGetSubjectNameENBySubjectCode() {
        System.out.println("getSubjectNameENBySubjectCode");
        String subjectCode = "";
        DAO instance = new DAO();
        String expResult = "";
        String result = instance.getSubjectNameENBySubjectCode(subjectCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSyllabusBySlbID method, of class DAO.
     */
    @Test
    public void testGetSyllabusBySlbID() {
        System.out.println("getSyllabusBySlbID");
        int slbid = 0;
        DAO instance = new DAO();
        Syllabus expResult = null;
        Syllabus result = instance.getSyllabusBySlbID(slbid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLoBySlbid method, of class DAO.
     */
    @Test
    public void testGetLoBySlbid() {
        System.out.println("getLoBySlbid");
        int slbid = 0;
        DAO instance = new DAO();
        List<LO> expResult = null;
        List<LO> result = instance.getLoBySlbid(slbid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubjectCodeBySlbid method, of class DAO.
     */
    @Test
    public void testGetSubjectCodeBySlbid() {
        System.out.println("getSubjectCodeBySlbid");
        int slbid = 0;
        DAO instance = new DAO();
        String expResult = "";
        String result = instance.getSubjectCodeBySlbid(slbid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSyllabusBySubjectCode method, of class DAO.
     */
    @Test
    public void testGetUnSyllabusBySubjectCode() {
        System.out.println("getSyllabusBySubjectCode");
        String subjectCode = "PRO192";
        DAO instance = new DAO();
        List<Syllabus> unexpResult = new ArrayList<>();
        List<Syllabus> result = instance.getSyllabusBySubjectCode(subjectCode);
        assertNotEquals(unexpResult, result);
        if (result!=unexpResult) {
            System.out.println("success");
        }
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getSyllabusByKey method, of class DAO.
     */
    @Test
    public void testGetSyllabusByKey() {
        System.out.println("getSyllabusByKey");
        String key = "";
        DAO instance = new DAO();
        List<Syllabus> unExpResult = new ArrayList<>();
        List<Syllabus> result = instance.getSyllabusByKey(key);
        System.out.println("Key: " + key);
        System.out.println(unExpResult);
        assertNotEquals(unExpResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllPreRequisite method, of class DAO.
     */
    @Test
    public void testGetAllPreRequisite() {
        System.out.println("getAllPreRequisite");
        DAO instance = new DAO();
        List<PreRequisite> expResult = null;
        List<PreRequisite> result = instance.getAllPreRequisite();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllSyllabus method, of class DAO.
     */
    @Test
    public void testGetAllSyllabus() {
        System.out.println("getAllSyllabus");
        DAO instance = new DAO();
        List<Syllabus> unExpResult = new ArrayList<>();
        List<Syllabus> result = instance.getAllSyllabus();
        System.out.println(result);
        assertNotEquals(unExpResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getPreRequisiteBySlbid method, of class DAO.
     */
    @Test
    public void testGetPreRequisiteBySlbid() {
        System.out.println("getPreRequisiteBySlbid");
        int slbid = 0;
        DAO instance = new DAO();
        List<PreRequisite> expResult = null;
        List<PreRequisite> result = instance.getPreRequisiteBySlbid(slbid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDecisionByDecisionNo method, of class DAO.
     */
    @Test
    public void testGetDecisionByDecisionNo() {
        System.out.println("getDecisionByDecisionNo");
        String decisionNo = "";
        DAO instance = new DAO();
        Decision expResult = null;
        Decision result = instance.getDecisionByDecisionNo(decisionNo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaterialBySlbID method, of class DAO.
     */
    @Test
    public void testGetMaterialBySlbID() {
        System.out.println("getMaterialBySlbID");
        int slbid = 1;
        DAO instance = new DAO();
        List<Material> expResult = new ArrayList<>();
        List<Material> result = instance.getMaterialBySlbID(slbid);
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getSessionBySlbID method, of class DAO.
     */
    @Test
    public void testGetSessionBySlbID() {
        System.out.println("getSessionBySlbID");
        int slbid = 1;
        DAO instance = new DAO();
        List<Session> expResult = new ArrayList<>();
        List<Session> result = instance.getSessionBySlbID(slbid);System.out.println(result);
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getQuestionBySesID method, of class DAO.
     */
    @Test
        public void testGetQuestionBySesID() {
        System.out.println("getQuestionBySesID");
        int sesid = 2;
        DAO instance = new DAO();
        List<Question> expResult = null;
        List<Question> result = instance.getQuestionBySesID(sesid);
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getAssessmentBySlbID method, of class DAO.
     */
    @Test
    public void testGetAssessmentBySlbID() {
        System.out.println("getAssessmentBySlbID");
        int slbid = 0;
        DAO instance = new DAO();
        List<Assessment> expResult = null;
        List<Assessment> result = instance.getAssessmentBySlbID(slbid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAssessmentDetailByAssid method, of class DAO.
     */
    @Test
    public void testGetAssessmentDetailByAssid() {
        System.out.println("getAssessmentDetailByAssid");
        int assid = 0;
        DAO instance = new DAO();
        List<AssessmentDetail> expResult =  new ArrayList<>();
        List<AssessmentDetail> result = instance.getAssessmentDetailByAssid(assid);
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurriculumByMajorID method, of class DAO.
     */
    @Test
    public void testGetCurriculumByMajorID() {
        System.out.println("getCurriculumByMajorID");
        int id = 0;
        DAO instance = new DAO();
        List<Curriculum> expResult = new ArrayList<>();
        List<Curriculum> result = instance.getCurriculumByMajorID(id);
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCurriculumByCurid method, of class DAO.
     */
    @Test
    public void testGetCurriculumByCurid() {
        System.out.println("getCurriculumByCurid");
        int curid = 0;
        DAO instance = new DAO();
        Curriculum expResult = null;
        Curriculum result = instance.getCurriculumByCurid(curid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMappingByCurriculumID method, of class DAO.
     */
    @Test
    public void testGetMappingByCurriculumID() {
        System.out.println("getMappingByCurriculumID");
        int id = 0;
        DAO instance = new DAO();
        List<PO_Mapping_PLO> expResult = null;
        List<PO_Mapping_PLO> result = instance.getMappingByCurriculumID(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMappingSubject_PLOByCurriculumID method, of class DAO.
     */
    @Test
    public void testGetMappingSubject_PLOByCurriculumID() {
        System.out.println("getMappingSubject_PLOByCurriculumID");
        int id = 0;
        DAO instance = new DAO();
        List<Subject_Mapping_PLO> expResult = null;
        List<Subject_Mapping_PLO> result = instance.getMappingSubject_PLOByCurriculumID(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllCurriculum method, of class DAO.
     */
    @Test
    public void testGetAllCurriculum() {
        System.out.println("getAllCurriculum");
        DAO instance = new DAO();
        List<Curriculum> expResult = null;
        List<Curriculum> result = instance.getAllCurriculum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurriculumBySearch method, of class DAO.
     */
    @Test
    public void testGetCurriculumBySearch() {
        System.out.println("getCurriculumBySearch");
        String key = "";
        DAO instance = new DAO();
        List<Curriculum> expResult = null;
        List<Curriculum> result = instance.getCurriculumBySearch(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMajorByMajorID method, of class DAO.
     */
    @Test
    public void testGetMajorByMajorID() {
        System.out.println("getMajorByMajorID");
        int majorID = 0;
        DAO instance = new DAO();
        Major expResult = null;
        Major result = instance.getMajorByMajorID(majorID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPLOByCurriculumID method, of class DAO.
     */
    @Test
    public void testGetPLOByCurriculumID() {
        System.out.println("getPLOByCurriculumID");
        int curid = 0;
        DAO instance = new DAO();
        List<PLO> expResult = null;
        List<PLO> result = instance.getPLOByCurriculumID(curid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPLOByID method, of class DAO.
     */
    @Test
    public void testGetPLOByID() {
        System.out.println("getPLOByID");
        int ploid = 0;
        DAO instance = new DAO();
        PLO expResult = null;
        PLO result = instance.getPLOByID(ploid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPOByID method, of class DAO.
     */
    @Test
    public void testGetPOByID() {
        System.out.println("getPOByID");
        int poid = 0;
        DAO instance = new DAO();
        PO expResult = null;
        PO result = instance.getPOByID(poid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPOByKey method, of class DAO.
     */
    @Test
    public void testGetPOByKey() {
        System.out.println("getPOByKey");
        String key = "";
        DAO instance = new DAO();
        List<PO> expResult = null;
        List<PO> result = instance.getPOByKey(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPloByKey method, of class DAO.
     */
    @Test
    public void testGetPloByKey() {
        System.out.println("getPloByKey");
        String key = "";
        DAO instance = new DAO();
        List<PLO> expResult = null;
        List<PLO> result = instance.getPloByKey(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllPLO method, of class DAO.
     */
    @Test
    public void testGetAllPLO() {
        System.out.println("getAllPLO");
        DAO instance = new DAO();
        List<PLO> expResult = null;
        List<PLO> result = instance.getAllPLO();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPOByCurriculumID method, of class DAO.
     */
    @Test
    public void testGetPOByCurriculumID() {
        System.out.println("getPOByCurriculumID");
        int curid = 0;
        DAO instance = new DAO();
        List<PO> expResult = null;
        List<PO> result = instance.getPOByCurriculumID(curid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllPO method, of class DAO.
     */
    @Test
    public void testGetAllPO() {
        System.out.println("getAllPO");
        DAO instance = new DAO();
        List<PO> expResult = null;
        List<PO> result = instance.getAllPO();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComboByKey method, of class DAO.
     */
    @Test
    public void testGetComboByKey() {
        System.out.println("getComboByKey");
        String key = "";
        DAO instance = new DAO();
        List<Combo> expResult = null;
        List<Combo> result = instance.getComboByKey(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllCombo method, of class DAO.
     */
    @Test
    public void testGetAllCombo() {
        System.out.println("getAllCombo");
        DAO instance = new DAO();
        List<Combo> expResult = null;
        List<Combo> result = instance.getAllCombo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComboByCurriculumID method, of class DAO.
     */
    @Test
    public void testGetComboByCurriculumID() {
        System.out.println("getComboByCurriculumID");
        int curid = 0;
        DAO instance = new DAO();
        List<Combo> expResult = null;
        List<Combo> result = instance.getComboByCurriculumID(curid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComboByCID method, of class DAO.
     */
    @Test
    public void testGetComboByCID() {
        System.out.println("getComboByCID");
        int cid = 0;
        DAO instance = new DAO();
        Combo expResult = null;
        Combo result = instance.getComboByCID(cid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubjectBySubjectCode method, of class DAO.
     */
    @Test
    public void testGetSubjectBySubjectCode() {
        System.out.println("getSubjectBySubjectCode");
        String subjectCode = "";
        DAO instance = new DAO();
        Subject expResult = null;
        Subject result = instance.getSubjectBySubjectCode(subjectCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComboByClick method, of class DAO.
     */
    @Test
    public void testGetComboByClick() {
        System.out.println("getComboByClick");
        int curid = 0;
        String semester = "";
        DAO instance = new DAO();
        List<Combo> expResult = null;
        List<Combo> result = instance.getComboByClick(curid, semester);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubjectByCidAndSemester method, of class DAO.
     */
    @Test
    public void testGetSubjectByCidAndSemester() {
        System.out.println("getSubjectByCidAndSemester");
        int curid = 0;
        int cid = 0;
        String semester = "";
        DAO instance = new DAO();
        List<Subject> expResult = null;
        List<Subject> result = instance.getSubjectByCidAndSemester(curid, cid, semester);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getElectiveByCurriculumID method, of class DAO.
     */
    @Test
    public void testGetElectiveByCurriculumID() {
        System.out.println("getElectiveByCurriculumID");
        int curid = 0;
        DAO instance = new DAO();
        List<Elective> expResult = null;
        List<Elective> result = instance.getElectiveByCurriculumID(curid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllElective method, of class DAO.
     */
    @Test
    public void testGetAllElective() {
        System.out.println("getAllElective");
        DAO instance = new DAO();
        List<Elective> expResult = null;
        List<Elective> result = instance.getAllElective();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getElectiveByKey method, of class DAO.
     */
    @Test
    public void testGetElectiveByKey() {
        System.out.println("getElectiveByKey");
        String key = "";
        DAO instance = new DAO();
        List<Elective> expResult = null;
        List<Elective> result = instance.getElectiveByKey(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubjectByCid method, of class DAO.
     */
    @Test
    public void testGetSubjectByCid() {
        System.out.println("getSubjectByCid");
        int cid = 0;
        DAO instance = new DAO();
        List<Subject> expResult = null;
        List<Subject> result = instance.getSubjectByCid(cid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubjectNotInCombo method, of class DAO.
     */
    @Test
    public void testGetSubjectNotInCombo() {
        System.out.println("getSubjectNotInCombo");
        int cid = 0;
        DAO instance = new DAO();
        List<Subject> expResult = null;
        List<Subject> result = instance.getSubjectNotInCombo(cid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubjectNotInElective method, of class DAO.
     */
    @Test
    public void testGetSubjectNotInElective() {
        System.out.println("getSubjectNotInElective");
        int eid = 0;
        DAO instance = new DAO();
        List<Subject> expResult = null;
        List<Subject> result = instance.getSubjectNotInElective(eid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllSubject method, of class DAO.
     */
    @Test
    public void testGetAllSubject() {
        System.out.println("getAllSubject");
        DAO instance = new DAO();
        List<Subject> expResult = null;
        List<Subject> result = instance.getAllSubject();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getElectiveByTag method, of class DAO.
     */
    @Test
    public void testGetElectiveByTag() {
        System.out.println("getElectiveByTag");
        String tag = "";
        DAO instance = new DAO();
        Elective expResult = null;
        Elective result = instance.getElectiveByTag(tag);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getElectiveByEid method, of class DAO.
     */
    @Test
    public void testGetElectiveByEid() {
        System.out.println("getElectiveByEid");
        int eid = 0;
        DAO instance = new DAO();
        Elective expResult = null;
        Elective result = instance.getElectiveByEid(eid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetAllMajor() {
        System.out.println("getAllMajor");
        DAO instance = new DAO();
        List<Major> expResult = null;
        List<Major> result = instance.getAllMajor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listByPage method, of class DAO.
     */
    @Test
    public void testListByPage() {
        System.out.println("listByPage");
        List list = null;
        int start = 0;
        int end = 0;
        DAO instance = new DAO();
        List expResult = null;
        List result = instance.listByPage(list, start, end);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMappingPOToPLO method, of class DAO.
     */
    @Test
    public void testGetMappingPOToPLO() {
        System.out.println("getMappingPOToPLO");
        Curriculum cur = null;
        DAO instance = new DAO();
        PO_Mapping_PLO[][] expResult = null;
        PO_Mapping_PLO[][] result = instance.getMappingPOToPLO(cur);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMappingSubjectToPLO method, of class DAO.
     */
    @Test
    public void testGetMappingSubjectToPLO() {
        System.out.println("getMappingSubjectToPLO");
        Curriculum cur = null;
        DAO instance = new DAO();
        Subject_Mapping_PLO[][] expResult = null;
        Subject_Mapping_PLO[][] result = instance.getMappingSubjectToPLO(cur);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertCodeMail method, of class DAO.
     */
    @Test
    public void testInsertCodeMail() {
        System.out.println("insertCodeMail");
        String type = "";
        String code = "";
        int accountID = 0;
        DAO instance = new DAO();
        instance.insertCodeMail(type, code, accountID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastAccountID method, of class DAO.
     */
    @Test
    public void testGetLastAccountID() {
        System.out.println("getLastAccountID");
        DAO instance = new DAO();
        int expResult = 0;
        int result = instance.getLastAccountID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodeMailLast method, of class DAO.
     */
    @Test
    public void testGetCodeMailLast() {
        System.out.println("getCodeMailLast");
        int accountID = 0;
        DAO instance = new DAO();
        String expResult = "";
        String result = instance.getCodeMailLast(accountID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
