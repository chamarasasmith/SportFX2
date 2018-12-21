/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.ScaleTransitionBuilder;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Point3D;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Path;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author User
 */
public class Main2Controller implements Initializable {

    @FXML
    private ImageView ivsup;
    @FXML
    private ImageView ivemp;
    @FXML
    private ImageView ivpro;
    @FXML
    private ImageView ivinvo;
    @FXML
    private ImageView ivgrn;
    @FXML
    private ImageView ivpay;
    @FXML
    private ImageView ivatt;
    @FXML
    private ImageView ivsett;
    private ScaleTransition scaleTransition;
    @FXML
    private AnchorPane ap1;

    TranslateTransition tt1; 
    TranslateTransition tt2; 
    TranslateTransition tt3; 
    TranslateTransition tt4; 
    TranslateTransition tt5; 
    TranslateTransition tt6; 
    TranslateTransition tt7; 
    TranslateTransition tt8; 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        setHome2();
    }

    private void setHome() {

         
        
        double i=0.5;

        tt1 = new TranslateTransition(Duration.seconds(i), ivsup);
        //translateTransition.setFromX(20);
        tt1.setToX(-280);
        tt1.setToY(-180);
        
        tt2 = new TranslateTransition(Duration.seconds(i), ivemp);
        //translateTransition.setFromX(20);
        tt2.setToX(-270);
        tt2.setToY(-280);
        
        tt3 = new TranslateTransition(Duration.seconds(i), ivpro);
        //translateTransition.setFromX(20);
        tt3.setToX(-260);
        tt3.setToY(-180);
        
        tt4 = new TranslateTransition(Duration.seconds(i), ivinvo);
        //translateTransition.setFromX(20);
        tt4.setToX(-250);
        tt4.setToY(-280);
        
        tt5 = new TranslateTransition(Duration.seconds(i), ivgrn);
        //translateTransition.setFromX(20);
        tt5.setToX(165);
        tt5.setToY(-280);
        
        tt6 = new TranslateTransition(Duration.seconds(i), ivpay);
        //translateTransition.setFromX(20);
        tt6.setToX(175);
        tt6.setToY(-180);
        
        tt7 = new TranslateTransition(Duration.seconds(i), ivatt);
        //translateTransition.setFromX(20);
        tt7.setToX(185);
        tt7.setToY(-280);
        
        tt8 = new TranslateTransition(Duration.seconds(i), ivsett);
        //translateTransition.setFromX(20);
        tt8.setToX(195);
        tt8.setToY(-180);
        

//        tt1.play();
//        tt2.play();
//        tt3.play();
//        tt4.play();
//        tt5.play();
//        tt6.play();
//        tt7.play();
//        tt8.play();

//        PathTransition pathTransition = PathTransitionBuilder.create()
//                .duration(Duration.seconds(4))
//                .path(path1)
//                .node(ivsup)
//                //.orientation(OrientationType.ORTHOGONAL_TO_TANGENT)
//                 
//                .build();
//        pathTransition.play();
    }

    private void setHome2() {

        
        AnchorPane ap = new AnchorPane();
        ap1.setTopAnchor(ap, 0.0);
            ap1.setBottomAnchor(ap, 0.0);
            ap1.setLeftAnchor(ap, 0.0);
            ap1.setRightAnchor(ap, 0.0);
            ap1.getChildren().clear();
            ap1.getChildren().add(ap);
        
        
        double i=0.5;
        
        
        TranslateTransition tt1 = new TranslateTransition(Duration.seconds(i), ivsup);
        //translateTransition.setFromX(20);
        tt1.setToX(0);
        tt1.setToY(0);
        
        TranslateTransition tt2 = new TranslateTransition(Duration.seconds(i), ivemp);
        //translateTransition.setFromX(20);
        tt2.setToX(0);
        tt2.setToY(0);
        
        TranslateTransition tt3 = new TranslateTransition(Duration.seconds(i), ivpro);
        //translateTransition.setFromX(20);
        tt3.setToX(0);
        tt3.setToY(0);
        
        TranslateTransition tt4 = new TranslateTransition(Duration.seconds(i), ivinvo);
        //translateTransition.setFromX(20);
        tt4.setToX(0);
        tt4.setToY(0);
        
        TranslateTransition tt5 = new TranslateTransition(Duration.seconds(i), ivgrn);
        //translateTransition.setFromX(20);
        tt5.setToX(0);
        tt5.setToY(0);
        
        TranslateTransition tt6 = new TranslateTransition(Duration.seconds(i), ivpay);
        //translateTransition.setFromX(20);
        tt6.setToX(0);
        tt6.setToY(0);
        
        TranslateTransition tt7 = new TranslateTransition(Duration.seconds(i), ivatt);
        //translateTransition.setFromX(20);
        tt7.setToX(0);
        tt7.setToY(0);
        
        TranslateTransition tt8 = new TranslateTransition(Duration.seconds(i), ivsett);
        //translateTransition.setFromX(20);
        tt8.setToX(0);
        tt8.setToY(0);
        

        tt1.play();
        tt2.play();
        tt3.play();
        tt4.play();
        tt5.play();
        tt6.play();
        tt7.play();
        tt8.play();

    }

    @FXML
    private void setSup(MouseEvent event) {
        
        setHome();
        try {

            FXMLLoader loader = new FXMLLoader(sportfx.class.getResource("Supplier.fxml"));
            AnchorPane ap = loader.load();
            ap1.setTopAnchor(ap, 0.0);
            ap1.setBottomAnchor(ap, 0.0);
            ap1.setLeftAnchor(ap, 0.0);
            ap1.setRightAnchor(ap, 0.0);
            ap1.getChildren().clear();
            ap1.getChildren().add(ap);

            
            
            ParallelTransition pt=new ParallelTransition();
           
            ScaleTransition st=new ScaleTransition(Duration.millis(1000));
            st.setNode(ap);
            st.setFromX(0);
            st.setFromY(0);
            st.setToX(1);
            st.setToY(1);
            
            FadeTransition ft=new FadeTransition(Duration.millis(1000));
            ft.setNode(ap);
            ft.setFromValue(0);
            ft.setToValue(1);

 
            

           
            pt.getChildren().addAll(ft,tt1,tt2,tt3,tt4,tt5,tt6,tt7,tt8);
            pt.play();
            
 

        } catch (Exception ex) {
            Logger.getLogger(Main1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }

    @FXML
    private void setHome1(MouseEvent event) {
        setHome2();
    }

    @FXML
    private void setExit(MouseEvent event) {
        System.exit(0);
    }



    private void setSettingEn(MouseEvent event) {
        scaleTransition = ScaleTransitionBuilder.create()
                .node(ivsett)
                .duration(Duration.seconds(1))
                .toX(1.4)
                .toY(1.4)
                .build();
        scaleTransition.play();

//        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1));
//        fadeTransition.setNode(tseti);
//        fadeTransition.setToValue(0);
//
//        fadeTransition.play();

    }

    private void setSettingEx(MouseEvent event) {
        scaleTransition = ScaleTransitionBuilder.create()
                .node(ivsett)
                .duration(Duration.seconds(1))
                .toX(1)
                .toY(1)
                .build();
        scaleTransition.play();

//        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1));
//        fadeTransition.setNode(tseti);
//        fadeTransition.setToValue(1);
//
//        fadeTransition.play();

    }

    private void setSupEx(MouseEvent event) {
        scaleTransition = ScaleTransitionBuilder.create()
                .node(ivsup)
                .duration(Duration.seconds(1))
                 
                .toX(1)
                .toY(1)
                .build();
        scaleTransition.play();
//
//        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1));
//        fadeTransition.setNode(tsup);
//        fadeTransition.setToValue(1);
//
//        fadeTransition.play();


//        RotateTransition rt=new RotateTransition(Duration.millis(1000));
//        
//        rt.setNode(ivsup);
//        rt.setFromAngle(0);
//        rt.setToAngle(360);
//        rt.play();


    }

    private void setSupEn(MouseEvent event) {
        scaleTransition = ScaleTransitionBuilder.create()
                .node(ivsup)
                .duration(Duration.seconds(1))
                .toX(1.4)
                .toY(1.4)
                .build();
        scaleTransition.play();

//        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1));
//        fadeTransition.setNode(tsup);
//        fadeTransition.setToValue(0);
//
//        fadeTransition.play();

    }

    private void setEmpEx(MouseEvent event) {
        scaleTransition = ScaleTransitionBuilder.create()
                .node(ivemp)
                .duration(Duration.seconds(1))
                .toX(1)
                .toY(1)
                .build();
        scaleTransition.play();

//        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1));
//        fadeTransition.setNode(temp);
//        fadeTransition.setToValue(1);
//
//        fadeTransition.play();

    }

    private void setEmpEn(MouseEvent event) {
        scaleTransition = ScaleTransitionBuilder.create()
                .node(ivemp)
                .duration(Duration.seconds(1))
                .toX(1.4)
                .toY(1.4)
                .build();
        scaleTransition.play();

//        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1));
//        fadeTransition.setNode(temp);
//        fadeTransition.setToValue(0);
//
//        fadeTransition.play();

    }

    private void setProEx(MouseEvent event) {
        scaleTransition = ScaleTransitionBuilder.create()
                .node(ivpro)
                .duration(Duration.seconds(1))
                .toX(1)
                .toY(1)
                .build();
        scaleTransition.play();

//        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1));
//        fadeTransition.setNode(tpro);
//        fadeTransition.setToValue(1);
//
//        fadeTransition.play();

    }

    private void setProEn(MouseEvent event) {
        scaleTransition = ScaleTransitionBuilder.create()
                .node(ivpro)
                .duration(Duration.seconds(1))
                .toX(1.4)
                .toY(1.4)
                .build();
        scaleTransition.play();

//        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1));
//        fadeTransition.setNode(tpro);
//        fadeTransition.setToValue(0);
//
//        fadeTransition.play();
    }

    private void setInvEx(MouseEvent event) {
        scaleTransition = ScaleTransitionBuilder.create()
                .node(ivinvo)
                .duration(Duration.seconds(1))
                .toX(1)
                .toY(1)
                .build();
        scaleTransition.play();

//        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1));
//        fadeTransition.setNode(tinvo);
//        fadeTransition.setToValue(1);
//
//        fadeTransition.play();

    }

    private void setInvEn(MouseEvent event) {
        scaleTransition = ScaleTransitionBuilder.create()
                .node(ivinvo)
                .duration(Duration.seconds(1))
                .toX(1.4)
                .toY(1.4)
                .build();
        scaleTransition.play();

//        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1));
//        fadeTransition.setNode(tinvo);
//        fadeTransition.setToValue(0);
//
//        fadeTransition.play();

    }

    private void setPayEx(MouseEvent event) {
        scaleTransition = ScaleTransitionBuilder.create()
                .node(ivpay)
                .duration(Duration.seconds(1))
                .toX(1)
                .toY(1)
                .build();
        scaleTransition.play();

//        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1));
//        fadeTransition.setNode(tpay);
//        fadeTransition.setToValue(1);
//
//        fadeTransition.play();
    }

    private void setPayEn(MouseEvent event) {
        scaleTransition = ScaleTransitionBuilder.create()
                .node(ivpay)
                .duration(Duration.seconds(1))
                .toX(1.4)
                .toY(1.4)
                .build();
        scaleTransition.play();

//        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1));
//        fadeTransition.setNode(tpay);
//        fadeTransition.setToValue(0);
//
//        fadeTransition.play();
    }

    private void setAttendEx(MouseEvent event) {
        scaleTransition = ScaleTransitionBuilder.create()
                .node(ivatt)
                .duration(Duration.seconds(1))
                .toX(1)
                .toY(1)
                .build();
        scaleTransition.play();

//        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1));
//        fadeTransition.setNode(tatt);
//        fadeTransition.setToValue(1);
//
//        fadeTransition.play();
    }

    private void setAttendEn(MouseEvent event) {
        scaleTransition = ScaleTransitionBuilder.create()
                .node(ivatt)
                .duration(Duration.seconds(1))
                .toX(1.4)
                .toY(1.4)
                .build();
        scaleTransition.play();

//        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1));
//        fadeTransition.setNode(tatt);
//        fadeTransition.setToValue(0);
//
//        fadeTransition.play();
    }
    
    
    
    private void setGrnEx(MouseEvent event) {

        scaleTransition = ScaleTransitionBuilder.create()
                .node(ivgrn)
                .duration(Duration.seconds(1))
                .toX(1)
                .toY(1)
                .build();
        scaleTransition.play();

//        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1));
//        fadeTransition.setNode(tgrn);
//        fadeTransition.setToValue(1);
//
//        fadeTransition.play();

    }

    private void setGrnEn(MouseEvent event) {

        scaleTransition = ScaleTransitionBuilder.create()
                .node(ivgrn)
                .duration(Duration.seconds(1))
                .toX(1.4)
                .toY(1.4)
                .build();
        scaleTransition.play();

//        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1));
//        fadeTransition.setNode(tgrn);
//        fadeTransition.setToValue(0);
//
//        fadeTransition.play();
    }

    @FXML
    private void setPay(MouseEvent event) {
 
     setHome();
        try {

            FXMLLoader loader = new FXMLLoader(sportfx.class.getResource("Payroll.fxml"));
            AnchorPane ap = loader.load();
            ap1.setTopAnchor(ap, 0.0);
            ap1.setBottomAnchor(ap, 0.0);
            ap1.setLeftAnchor(ap, 0.0);
            ap1.setRightAnchor(ap, 0.0);
            ap1.getChildren().clear();
            ap1.getChildren().add(ap);

            
            
            ParallelTransition pt=new ParallelTransition();
           
            ScaleTransition st=new ScaleTransition(Duration.millis(1000));
            st.setNode(ap);
            st.setFromX(0);
            st.setFromY(0);
            st.setToX(1);
            st.setToY(1);
            
            FadeTransition ft=new FadeTransition(Duration.millis(1000));
            ft.setNode(ap);
            ft.setFromValue(0);
            ft.setToValue(1);

 
            

           
            pt.getChildren().addAll(ft,tt1,tt2,tt3,tt4,tt5,tt6,tt7,tt8);
            pt.play();
            
 

        } catch (Exception ex) {
            Logger.getLogger(Main1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }

    @FXML
    private void setPro(MouseEvent event) {
        setHome();
        try {

            FXMLLoader loader = new FXMLLoader(sportfx.class.getResource("Product.fxml"));
            AnchorPane ap = loader.load();
            ap1.setTopAnchor(ap, 0.0);
            ap1.setBottomAnchor(ap, 0.0);
            ap1.setLeftAnchor(ap, 0.0);
            ap1.setRightAnchor(ap, 0.0);
            ap1.getChildren().clear();
            ap1.getChildren().add(ap);

            
            
            ParallelTransition pt=new ParallelTransition();
           
            ScaleTransition st=new ScaleTransition(Duration.millis(1000));
            st.setNode(ap);
            st.setFromX(0);
            st.setFromY(0);
            st.setToX(1);
            st.setToY(1);
            
            FadeTransition ft=new FadeTransition(Duration.millis(1000));
            ft.setNode(ap);
            ft.setFromValue(0);
            ft.setToValue(1);

 
            

           
            pt.getChildren().addAll(ft,tt1,tt2,tt3,tt4,tt5,tt6,tt7,tt8);
            pt.play();
            
 

        } catch (Exception ex) {
            Logger.getLogger(Main1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }

    @FXML
    private void setEmp(MouseEvent event) {
    }

    @FXML
    private void setInv(MouseEvent event) {
    }

    @FXML
    private void setGrn(MouseEvent event) {
    }

    @FXML
    private void setAttend(MouseEvent event) {
    }

    @FXML
    private void setSetting(MouseEvent event) {
    }
    
    
    
    
    

    
}
