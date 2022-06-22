/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.net.*;
import java.util.Base64;
import java.io.*;

package userinterface;

/**
 *
 * @author USER
 */
public class no {
    public void sms(String username, String password, String to, String message){
      try{
          String myURI = "https://api.bulksms.com/v1/messages";
          
          String myUsername = ""+username+"";
          String myPassword = ""+password+"";  
          
          String myData = "{to:\""+to+"\",encoding: \"UNICODE\", body: \""+message+"\"}";
      }
      
      URL url = new URL (myURI);
      HttpURLConnection request = (HttpURLConnection) url.openConnection();
      request.setDoOutput(true);
      //Settings request
      
      String authStr = myUsername +":"+myPassword;
      String authEncoded = Base64.getEncoder().encodeToString(authStr.getBytes());
      request.setRequestProperty("Authorization", "Basic "+authEncoded);
      //Supply Credentials
      
      request.setRequestMethod("POST");
      request.setRequestProperty("Content-Type", "application/json");
      //HTTP Post
      
      OutputStreamWriter out = new OutputStreamWriter(request.getOutputStream());
      out.write(myData);
      out.close();
      //Write data to request
      
      try{
          
         InputStream response = request.getInputStream();
         BufferedReader in = new BufferedReader(new InputStreamReader(response));
         String replyText;
         while ((replyText = in.readLine()) != null){
             System.out.println(replyText);
         }
         in.close();
      }catch (IOException ex){
          System.out.println("An error occured:"+ex.getMessage());
          BufferedReader  in = new BufferedReader(new InputStreamReader(request.getErrorStream()));
          //Print details with error
          
          String replyText;
          while((replyText = in.readLine())!= null){
              System.out.println(replyText);
          }
          }
          in.close();
      }
      request.disconnect();
      
      }catch (Exception e){
          System.out.println(e);
      }
      
      
    }
    
}
