/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chronometer;

/**
 *
 * @author punis
 */
public class segundos implements Runnable {
    @Override
    public void run() {
       int i = Integer.parseInt(Screen.txtSeg.getText());
      for (;;) {
          Screen.txtSeg.setText(i+"");
          i++;
          if(i==59)
              i=0;
          try {
              Thread.sleep(1000);
          } catch (Exception e) {
          }
 
          
          
          
      }
    }
    

    
    
}
