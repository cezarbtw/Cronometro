/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chronometer;

/**
 *
 * @author punis
 */
public class milesimo implements Runnable{

    @Override
    public void run() {
       int i = Integer.parseInt(Screen.txtMili.getText());
      for (;;) {
          Screen.txtMili.setText(i+"");
          i++;
          if(i==1000)
              i=0;
          try {
              Thread.sleep(1);
          } catch (Exception e) {
          }
 
          
          
          
      }
    }
    
}
