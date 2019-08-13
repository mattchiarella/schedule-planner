/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduleplanner;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import scheduleplanner.Authentication.course;
/**
 *
 * @author Matthew_PC
 */
public class CourseTakenBIOM extends javax.swing.JPanel {

        static ArrayList<Authentication.course> core, mathRequirement, bioElectives, singleClassElectives, 
            biodiversityDiscipline, molecularBiologyDiscipline, organismalBiologyDiscipline,
            ecologyDiscipline, capstone, chemistry, 
            languagesElectives, theoElectives, philoElectives, 
            humElectives, fineArtsElectives, scienceElectives;

    static double totalCredits = 120.00;
    Operations op = new Operations();
    
    public CourseTakenBIOM() {
        initComponents();
        //calls the transcript from the Authentication class
        ArrayList<course> transcript = (ArrayList<course>) Authentication.transcript.clone();
        
        /*Anything with a .createWhatever creates an ArrayList<course> of the Whatever*/
        core = CourseRequirementsBIOM.createCore();
        op.printList(op.courseTaken(corelbl, 39.00, core, transcript), coretxt);
        
        mathRequirement = CourseRequirementsBIOM.createMathRequirements();
        op.printList(op.courseTaken(mathlbl, 4.00, mathRequirement, transcript), mathtxt);
        
        bioElectives = CourseRequirementsBIOM.createBioElectives();
        op.printList(op.courseTaken(eleclbl, 40.00, bioElectives, transcript), electxt);
        
        capstone = CourseRequirementsBIOM.createCapstone();        
        op.printList(op.courseTaken(capslbl, 3.00, capstone, transcript), capstxt);
        
        chemistry = CourseRequirementsBIOM.createChemistry();        
        op.printList(op.courseTaken(chemlbl, 16.00, chemistry, transcript), chemtxt);
        
        philoElectives = CourseRequirementsBIOM.createPhiloElectives();        
        op.printList(op.courseTaken(phillbl, 3.00, philoElectives, transcript), philtxt);
        
        languagesElectives = CourseRequirementsBIOM.createLanguagesElectives();        
        op.printList(op.courseTaken(forelbl, 3.00, languagesElectives, transcript), foretxt);
        
        singleClassElectives = CourseRequirementsBIOM.createSingleClassElectives();        
        op.printList(op.courseTaken(genelbl, 27.00, singleClassElectives, transcript), genetxt);
        
        fineArtsElectives = CourseRequirementsBIOM.createFineArtsElectives();
        op.printList(op.courseTaken(finelbl, 3.00, fineArtsElectives, transcript), finetxt);
        
        humElectives = CourseRequirementsBIOM.createHumLitElectives();        
        op.printList(op.courseTaken(humalbl, 3.00, humElectives, transcript), humatxt);
        
        theoElectives = CourseRequirementsBIOM.createTheoElectives();        
        op.printList(op.courseTaken(theolbl, 3.00, theoElectives, transcript), theotxt);
        
        scienceElectives = CourseRequirementsBIOM.createScienceElectives();
        op.printList(op.courseTaken(physlbl, 4.00, scienceElectives, transcript), phystxt);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        corelbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        coretxt = new javax.swing.JTextArea();
        eleclbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        electxt = new javax.swing.JTextArea();
        mathlbl = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        mathtxt = new javax.swing.JTextArea();
        physlbl = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        phystxt = new javax.swing.JTextArea();
        forelbl = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        foretxt = new javax.swing.JTextArea();
        finelbl = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        finetxt = new javax.swing.JTextArea();
        theolbl = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        theotxt = new javax.swing.JTextArea();
        phillbl = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        philtxt = new javax.swing.JTextArea();
        humalbl = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        humatxt = new javax.swing.JTextArea();
        genelbl = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        genetxt = new javax.swing.JTextArea();
        capslbl = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        capstxt = new javax.swing.JTextArea();
        chemlbl = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        chemtxt = new javax.swing.JTextArea();
        CreateDoc = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Courses Taken Per Major Subsection");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        corelbl.setText("Major Core Courses");
        add(corelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 48, -1, -1));

        coretxt.setColumns(20);
        coretxt.setRows(5);
        jScrollPane1.setViewportView(coretxt);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 68, 416, 82));

        eleclbl.setText("Major Electives");
        add(eleclbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 182, -1, -1));

        electxt.setColumns(20);
        electxt.setRows(5);
        jScrollPane2.setViewportView(electxt);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 202, 416, 79));

        mathlbl.setText("Mathematics Requirement");
        add(mathlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 299, -1, -1));

        mathtxt.setColumns(20);
        mathtxt.setRows(5);
        jScrollPane3.setViewportView(mathtxt);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 319, 416, 73));

        physlbl.setText("Physics Requirement");
        add(physlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        phystxt.setColumns(20);
        phystxt.setRows(5);
        jScrollPane4.setViewportView(phystxt);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 416, 67));

        forelbl.setText("Foreign Language Requirement");
        add(forelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 515, -1, -1));

        foretxt.setColumns(20);
        foretxt.setRows(5);
        jScrollPane5.setViewportView(foretxt);

        add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 535, 416, 78));

        finelbl.setText("Fine Art Requirement");
        add(finelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 48, -1, -1));

        finetxt.setColumns(20);
        finetxt.setRows(5);
        jScrollPane7.setViewportView(finetxt);

        add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 68, 416, 78));

        theolbl.setText("Theology Requirement");
        add(theolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 164, -1, -1));

        theotxt.setColumns(20);
        theotxt.setRows(5);
        jScrollPane8.setViewportView(theotxt);

        add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 184, 416, 78));

        phillbl.setText("Philosophy Requirement");
        add(phillbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 280, -1, -1));

        philtxt.setColumns(20);
        philtxt.setRows(5);
        jScrollPane9.setViewportView(philtxt);

        add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 300, 416, 78));

        humalbl.setText("Humanities Requirement");
        add(humalbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 396, -1, -1));

        humatxt.setColumns(20);
        humatxt.setRows(5);
        jScrollPane10.setViewportView(humatxt);

        add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 416, 416, 78));

        genelbl.setText("General Ed Requirements");
        add(genelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 512, 138, -1));

        genetxt.setColumns(20);
        genetxt.setRows(5);
        jScrollPane11.setViewportView(genetxt);

        add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 532, 416, 81));

        capslbl.setText("Capstone");
        add(capslbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, -1, -1));

        capstxt.setColumns(20);
        capstxt.setRows(5);
        jScrollPane14.setViewportView(capstxt);

        add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 416, 78));

        chemlbl.setText("Chemistry Requirement");
        add(chemlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 630, -1, -1));

        chemtxt.setColumns(20);
        chemtxt.setRows(5);
        jScrollPane16.setViewportView(chemtxt);

        add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 650, 416, 78));

        CreateDoc.setText("Create Document");
        CreateDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateDocActionPerformed(evt);
            }
        });
        add(CreateDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void CreateDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateDocActionPerformed
        // TODO add your handling code here:
        ArrayList<Authentication.course> transcript = (ArrayList<Authentication.course>) Authentication.transcript.clone();
        XWPFDocument doc;
        try{
            
            /*Please do not mess with this either! Ff you have to, make sure that you call 
            the FileTypeFilter class correctly*/
            
            //creates a file
            File fe = null;
            //allows you to choose a file
            JFileChooser fs = new JFileChooser((new File("c:\\Users")));
            //a filter for the kinds of file you can see and make(See FileTypeFilter class documentation)
            fs.setFileFilter(new FileTypeFilter(".docx","Word Document"));
            int result = fs.showSaveDialog(null);
            //if nothing goes wrong you can give the file a cool name, like Sprinkles
            //and create the file
            if(result == JFileChooser.APPROVE_OPTION){
                String temp = fs.getSelectedFile().toString();
                fe = new File(temp + ".docx");
            }
            
            //creates the actual Word document
            doc = new XWPFDocument();
            FileOutputStream out = new FileOutputStream(fe);
            
            //Creates the Core subsection in the document
            //See the Operations Class Documentation for Operation method calls
            core = CourseRequirementsBIOM.createCore();
            op.createDocumentAudit("Core", core, transcript, doc);

            //Creates the Chemistry subsection in the document
            //See the Operations Class Documentation for Operation method calls
            chemistry = CourseRequirementsBIOM.createChemistry();
            op.createDocumentAudit("Chemistry", chemistry, transcript, doc);

            //Creates the Math Requirement subsection in the document
            //See the Operations Class Documentation for Operation method calls
            mathRequirement = CourseRequirementsBIOM.createMathRequirements();
            op.createDocumentAudit("Math Requirement", mathRequirement, transcript, doc);

            //Creates the Physics Requirement subsection in the document
            //See the Operations Class Documentation for Operation method calls
            scienceElectives = CourseRequirementsBIOM.createScienceElectives();
            op.createDocumentAudit("Physics Requirement", scienceElectives, transcript, doc);
            
            /* ***DO NOT FORGET THIS*** THIS CLOSES THE DOCUMENT AFTER YOU ARE DONE
            IF YOU FORGET THIS THE DOCUMENT WILL STAY OPEN AND PROBABLY DO A LOOP FOREVER
            THIS ***WILL*** CRASH YOUR PC, TRUST ME, YOUR PC WILL NOT HANDLE IT*/
            doc.write(out);
            out.close();
            doc.close();
            
        }catch(IOException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_CreateDocActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateDoc;
    private javax.swing.JLabel capslbl;
    private javax.swing.JTextArea capstxt;
    private javax.swing.JLabel chemlbl;
    private javax.swing.JTextArea chemtxt;
    private javax.swing.JLabel corelbl;
    private javax.swing.JTextArea coretxt;
    private javax.swing.JLabel eleclbl;
    private javax.swing.JTextArea electxt;
    private javax.swing.JLabel finelbl;
    private javax.swing.JTextArea finetxt;
    private javax.swing.JLabel forelbl;
    private javax.swing.JTextArea foretxt;
    private javax.swing.JLabel genelbl;
    private javax.swing.JTextArea genetxt;
    private javax.swing.JLabel humalbl;
    private javax.swing.JTextArea humatxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel mathlbl;
    private javax.swing.JTextArea mathtxt;
    private javax.swing.JLabel phillbl;
    private javax.swing.JTextArea philtxt;
    private javax.swing.JLabel physlbl;
    private javax.swing.JTextArea phystxt;
    private javax.swing.JLabel theolbl;
    private javax.swing.JTextArea theotxt;
    // End of variables declaration//GEN-END:variables
}
