package in.laxmi.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
     @GetMapping("/welcome")
	public ResponseEntity<String> getWelcome() {
		String msg="welcome rest api";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
     
     @GetMapping("/greet")
 	public String greetMsg() {
 		String msg="good,evening";
 		return msg;
 	}
     @PostMapping("/msg")
     public ResponseEntity<String> saveMsg() {
    	 
    	String responsebody= "Msg saved successfully";
    	 return new ResponseEntity<String>(responsebody,HttpStatus.CREATED);
     }
}
