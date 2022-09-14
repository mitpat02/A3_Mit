import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainController {

    //attributes
    @FXML
    private Button btnadd;

    @FXML
    private Button btnexit;

    @FXML
    private Button btnreset;

    @FXML
    private CheckBox chkcharger;

    @FXML
    private CheckBox chkmouse;

    @FXML
    private CheckBox chkusb;

    @FXML
    private TextField lblcharger;

    @FXML
    private TextField lbldiscount;

    @FXML
    private TextField lblmouse;

    @FXML
    private TextField lblusb;

    @FXML
    private TextArea txtresult;

    @FXML
    void chk1(ActionEvent event)    //checkbox for mouse 
    {
        if(chkmouse.isSelected()==true)
        {
            lblmouse.setDisable(false);
           
        } 
        else
        {
            lblmouse.setDisable(true);
        }   
    }

    @FXML
    void chk2(ActionEvent event) //checkbox for usb
    {
        
        if(chkusb.isSelected()==true)
        {
            lblusb.setDisable(false);
            
        }
        else
        {
            lblusb.setDisable(true);
        }
    }


    @FXML
    void chk3(ActionEvent event) //checkbox for charger
    {
        if(chkcharger.isSelected()==true)
        {
            lblcharger.setDisable(false);
           
        }
        else
        {
            lblcharger.setDisable(true);
        }
    }

    @FXML
    void mexit(ActionEvent event) 
    {
       
        Alert a=new Alert(Alert.AlertType.CONFIRMATION); // new instance of alert to show when user click on exit button.
      a.setTitle("Confirmation Message ");  //to set title of exit page
      a.setContentText("Click Ok to exit! "); 
      a.showAndWait().ifPresent(response -> {
          if(response==ButtonType.OK)
          {
              System.exit(0);
          }
      });

    }

    @FXML
    void mreset(ActionEvent event) //clear() method to erase data after click
    {
        lblmouse.clear();
        lblusb.clear();
        lblcharger.clear();
        lbldiscount.clear();
        chkusb.setSelected(false);
        chkmouse.setSelected(false);
        chkcharger.setSelected(false);
        txtresult.clear();
        lblcharger.setDisable(true);
        lblusb.setDisable(true);
        lblmouse.setDisable(true);
      
    }

    @FXML
    void mtotal(ActionEvent event) 
    {
        //initializing total and discounttotal =0
        double total =0.0;
        double discountTotal =0.0;

        if((chkmouse.isSelected()==true && chkusb.isSelected()==true) && (chkusb.isSelected()==true) )
        {
            //taking value of mouse usb charger and calculating price
            double val1 = Double.parseDouble(lblmouse.getText());
            double mouse = val1 * 10;
            double val2 =Double.parseDouble(lblusb.getText());
            double usb = val2 * 20;
            double val3 =Double.parseDouble(lblcharger.getText());
            double charger = val3 * 15;
            
            
            if(lbldiscount.getText().isEmpty()==true)
            {
                total = mouse + usb + charger;
                txtresult.setText("TOTAL : " +total);

            }
            else
            {
                double discount = Double.parseDouble(lbldiscount.getText());
                discountTotal = (mouse + usb + charger) - discount;
                txtresult.setText("TOTAL(with discount) : " +discountTotal);
            }
        }   
              
        
        
         //for 2 pairs
         
         else if(chkusb.isSelected()==true && chkcharger.isSelected()==true )
         {
             double val2 = Double.parseDouble(lblusb.getText());
             double usb = val2 * 20;
             double val3 = Double.parseDouble(lblcharger.getText());
             double charger = val3 * 15;
             
         
             if(lbldiscount.getText().isEmpty())
             {
                 total = charger + usb ;
                 txtresult.setText("TOTAL : " +total);
 
             }
             else
             {
                 
                double discount = Double.parseDouble(lbldiscount.getText());
                 discountTotal = charger + usb  - discount;
                 txtresult.setText("TOTAL(with discount) : " +discountTotal);
             }

             
         }
         else if((chkusb.isSelected()==true) && (chkmouse.isSelected()==true ))
        {
            double val1 = Double.parseDouble(lblmouse.getText());
            double mouse = val1 * 10;
            double val2 = Double.parseDouble(lblusb.getText());
            double usb = val2 * 20;
            
            
        
            if(lbldiscount.getText().isEmpty())
            {
                total =  mouse  + usb ;
                txtresult.setText("TOTAL : " +total);

            }
            else
            {
                
               double discount = Double.parseDouble(lbldiscount.getText());
                discountTotal = mouse + usb  - discount;
                txtresult.setText("TOTAL(with discount) : " +discountTotal);
            }

            
        }
         else if(chkcharger.isSelected()==true && chkmouse.isSelected()==true  )
         {
             double val3 = Double.parseDouble(lblcharger.getText());
             double charger = val3 * 15;
             double val1 = Double.parseDouble(lblmouse.getText());
             double mouse = val1 * 10;
             
         
             if(lbldiscount.getText().isEmpty())
             {
                 total = charger + mouse ;
                 txtresult.setText("TOTAL : " +total);
 
             }
             else
             {
                 
                double discount = Double.parseDouble(lbldiscount.getText());
                 discountTotal = charger + mouse  - discount;
                 txtresult.setText("TOTAL(with discount) : " +discountTotal);
             }
            }
       
        else if(chkmouse.isSelected()==true)
        {
            double val1 = Double.parseDouble(lblmouse.getText());
            double mouse = val1 * 10;
           
            if(lbldiscount.getText().isEmpty())
            {
                total =mouse;
                txtresult.setText("TOTAL : " +total);

            }
            else
            {
                
               double discount = Double.parseDouble(lbldiscount.getText());
                discountTotal = mouse - discount;
                txtresult.setText("TOTAL(with discount) : " +discountTotal);
            }
        }
        

        else if(chkusb.isSelected()==true)
        {
            double val2 = Double.parseDouble(lblusb.getText());
            double usb = val2 * 20;
            
        
            if(lbldiscount.getText().isEmpty())
            {
                 total = usb ;
                txtresult.setText("TOTAL : " +total);

            }
            else
            {
                double discount = Double.parseDouble(lbldiscount.getText());
                 discountTotal = usb - discount;
                txtresult.setText("TOTAL(with discount) : " +discountTotal);
            }
           
            
        }
        else
        {
            double val3 = Double.parseDouble(lblcharger.getText());
            double charger = val3 * 15;
            if(lbldiscount.getText().isEmpty())
            {
                total = charger;
                txtresult.setText("TOTAL : " +total);

            }
            else
            {
                
               double discount = Double.parseDouble(lbldiscount.getText());
                discountTotal = charger - discount;
                txtresult.setText("TOTAL(with discount) : " +discountTotal);
            }
        }
       
        }
        
           
        
        
        
    }


