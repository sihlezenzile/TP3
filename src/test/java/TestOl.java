/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Config.Project2Config;
import Service.OlympInter;
import junit.framework.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Fifi
 */
public class TestOl {
    OlympInter omp;
    ApplicationContext ctx;
    public TestOl() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
        ctx = new AnnotationConfigApplicationContext(Project2Config.class);
        omp = (OlympInter)ctx.getBean("oly");
        //omp.register("");
    
    
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    @Test
    public void testSearch()
    {
        Assert.assertFalse(omp.searchCode("sihe"));
    }
    
    @Test
    public void testTrue()
    {
        Assert.assertTrue(omp.deleteAthlete("Grey"));
        
    }
    @Test
    public void testEqual(){
        Assert.assertEquals("", "sihle",omp.register("sihle") );
    }
    @Test
    public void testExtend()
    {
        Assert.assertEquals(3, omp.add(1));
    }
    
    @Test
    public void testNotNull()
    {
       Assert.assertNotNull(omp.nullArray());
    }
    
    @Test
    public void testNulls()
    {
       Assert.assertNull(omp.nullArray());
    }
    @Test
    public void testInter()
    {
        Assert.assertFalse(omp.searchCode("May"));
    }
    @Test
    public void testSame()
    {
        Assert.assertSame("hle", omp.register("hle"));
    }
    
    @Test
    public void testTime()
    {
        Assert.assertNotSame("hle", omp.register("khle"));
    }
    
    @Test
    public void testFalse()
    {
        Assert.assertFalse(omp.searchCode("hello"));
    }
}
