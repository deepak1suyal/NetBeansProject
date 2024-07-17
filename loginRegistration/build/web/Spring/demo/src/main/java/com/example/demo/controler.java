package com.example.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class controler {
   st p=new st();
    @GetMapping("/get")
    public ArrayList<String> doGet(){
        return p.w; 
    }
    
    @PostMapping("/post")
    public String doPost(@RequestBody String e){
       
    p.w.add(e);
    return "Data Has Been Inserted";
}
       
    
@PutMapping("/put")
public String doPut(@RequestParam(value ="i",defaultValue = "0") String t,@RequestBody String r) {
    //TODO: process PUT request
    int k=Integer.parseInt(t);
    if(k==0||p.w.size()==0)
    p.w.add(r);
    else
    p.w.set(k-1, r);
   return "Data Has Been Updated";
}

@DeleteMapping("/delete")
public String dodelete(@RequestParam(value ="i",defaultValue = "0") String t){
 
    int k=Integer.parseInt(t);
    if(k==0)
    p.w.remove(k);
    else
    p.w.remove(k-1);
    return "Data Has Been Deleated";  
}


}
